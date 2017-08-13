package wiki.adapter.spring.boot.controllers.classes.abstracts;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import wiki.adapter.spring.boot.executor.interfaces.CommandExecutorI;
import wiki.adapter.spring.boot.utils.interfaces.ReflectionUtilsWikiI;

@SuppressWarnings({"rawtypes", "hiding", "unchecked"})
public class AbstractRestController <T> {
	
	@Autowired
	protected CommandExecutorI m_commandExecutor;
	@Autowired
	protected ReflectionUtilsWikiI m_reflectionUtilsWiki;
	protected Class m_entityClass = null;

	@PostConstruct
	protected void getEntityClassOrDie (){
		try {
			m_entityClass =  m_reflectionUtilsWiki.getEntityClass(this);
		}catch(Exception e){
			//Kill the spring server if a controller is an invalid state!
			throw new RuntimeException(e.getMessage());
		}
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