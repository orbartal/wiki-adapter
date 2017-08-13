package wiki.adapter.spring.boot.controllers.classes.abstracts;

import java.util.Map;

import org.springframework.data.domain.Page;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import wiki.adapter.spring.boot.executor.classes.Logexecutor;
import wiki.adapter.spring.boot.executor.interfaces.CommandExecutorI;
import wiki.adapter.spring.boot.utils.ReflectionUtilsWikiC;

@SuppressWarnings({"rawtypes", "hiding", "unchecked"})
public class AbstractRestController <T> {
	
	protected Class m_entityClass = null;
	protected CommandExecutorI m_commandExecutor;
	
	public AbstractRestController() {
		m_entityClass = ReflectionUtilsWikiC.getEntityClass(this);
		m_commandExecutor = new Logexecutor ();
	}
	
	public  <T> T exeGetOne (String action, Map <String, Object> args) {
		return (T) exeGet(m_entityClass, action, args);
	}
	public  Page<T> exeGetPage (String action, Map <String, Object> args) {
		return (Page<T>)exeGet(m_entityClass, action, args);
	}
	public  Object exeGet (Class cEntity, String action, Map <String, Object> args) {
		return m_commandExecutor.run(cEntity, action, args);
	}
	public  void exeSet (String action, Map <String, Object> args) {
		m_commandExecutor.run(m_entityClass, action, args);
	}
	
	//////////////////
	public static Map <String, Object> toMap (Object ...args){
		Builder<String, Object> builder = ImmutableMap.<String, Object> builder();
		for (int i=0; i<args.length; i=i+2) {
			builder.put((String) args[i], args[i+1]);
		}
		Map<String, Object> result =builder.build();
		return result;
	}
}
