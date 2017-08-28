package wiki.adapter.spring.boot.executor.classes.factory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.annotation.PostConstruct;
import org.apache.commons.collections.map.MultiKeyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import wiki.adapter.spring.boot.executor.interfaces.CommandI;
import wiki.adapter.spring.boot.executor.interfaces.CommandsFactoryI;

@Primary
@SuppressWarnings("rawtypes")
@Component
public class CommandsFactoryC implements CommandsFactoryI {
	
	protected MultiKeyMap m_mapCommands = null;
	
	@Autowired
	protected List<CommandI> lstCommands;
	
	public CommandsFactoryC () {}
	
	@PostConstruct
	public void init () {
		m_mapCommands = new MultiKeyMap();
		for (CommandI command : lstCommands) {
			String action = getQualifier (command);
			String type = getEntity(command);
			m_mapCommands.put(type, action, command);
		}
	}
	
	protected String getEntity (CommandI command) {
		Type[] genericInterfaces = command.getClass().getGenericInterfaces();
		for (Type genericInterface : genericInterfaces) {
		    if (!(genericInterface instanceof ParameterizedType)) {
		    	continue;
		    }
	    	String strGenericInterface = genericInterface.getTypeName();
	    	if (!strGenericInterface.startsWith(CommandI.class.getName())) {
	    		continue;
	    	}
	        Type[] genericTypes = ((ParameterizedType) genericInterface).getActualTypeArguments();
	        return getEntity(genericTypes[0]);
		}
		return "";
	}
	
	private String getEntity(Type type) {
		String strPageClass = Page.class.getName();
		String typeName = type.getTypeName();
    	if (!typeName.startsWith(strPageClass)) {
    		return typeName;
    	}
    	String result = typeName.substring(strPageClass.length()+1, typeName.length()-1);
		return result;
	}

	protected String getQualifier (CommandI command) {
		Class<? extends CommandI> c = command.getClass();
		if (c.isAnnotationPresent(Qualifier.class)) {
		     Qualifier q = (Qualifier) c.getAnnotation(Qualifier.class);
		    return q.value();
		}
		return null;
	}

	@Override
	public <T> CommandI<T> get(Class<T> resultType, Class entityType, String action) {
		String type = entityType.getName();
		Object value = m_mapCommands.get(type, action);
		CommandI<T> command = (CommandI<T>) value;
		return command;
	}

}
