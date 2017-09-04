package wiki.adapter.spring.boot.executor.classes.factory;

import java.lang.reflect.Type;
import java.util.List;
import javax.annotation.PostConstruct;
import org.apache.commons.collections.map.MultiKeyMap;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import wiki.adapter.spring.boot.executor.interfaces.CommandI;
import wiki.adapter.spring.boot.executor.interfaces.CommandsFactoryI;
import wiki.adapter.spring.boot.utils.classes.ReflectionUtilsWikiC;

@Primary
@SuppressWarnings({"rawtypes", "unchecked"})
@Component
public class CommandsFactoryC implements CommandsFactoryI {
	
	protected List<CommandI> m_lstCommands = null;
	protected MultiKeyMap m_mapCommands = null;
	protected ReflectionUtilsWikiC m_reflectionUtils;
	
	public CommandsFactoryC (ReflectionUtilsWikiC reflectionUtils,
			List<CommandI> lstCommands) {
		m_reflectionUtils = reflectionUtils; 
		m_lstCommands = lstCommands;
	}
	
	///////////////
	//Create map//
	/////////////
	@PostConstruct
	public void init () throws Exception {
		m_mapCommands = new MultiKeyMap();
		for (CommandI command : m_lstCommands) {
			String action = getQualifier (command);
			String type = getGenericEntityName(command);
			m_mapCommands.put(type, action, command);
		}
	}
	protected String getGenericEntityName (CommandI command) throws Exception {
		Type type = m_reflectionUtils.getGenericType(command, CommandI.class, 0);
		return getEntityFromType(type);
	}

	private String getEntityFromType(Type type) {
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

	////////////////
	//Use map.get//
	//////////////
	@Override
	public <T> CommandI<T> get(Class<T> resultType, Class entityType, String action) {
		String type = entityType.getName();
		Object value = m_mapCommands.get(type, action);
		CommandI<T> command = (CommandI<T>) value;
		return command;
	}

}
