package wiki.adapter.spring.boot.executor.classes;

import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonObject;

import wiki.adapter.spring.boot.executor.interfaces.CommandExecutorI;

@SuppressWarnings("rawtypes")
public class Logexecutor implements CommandExecutorI {
	
	protected Logger m_logger = LoggerFactory.getLogger(Logexecutor.class.getSimpleName());
	
	@Override
	public <T> T run (Class<T> entityType, String action, Map<String, Object> args) {
		String text = commandToString(entityType, action, args);
		m_logger.info(text);
	    return null;
	}
	
	protected String commandToString (Class entityType, String action, Map<String, Object> args) {
		JsonObject jsonArgs = new JsonObject();
		for (Entry<String, Object> pair : args.entrySet()) {
			jsonArgs.addProperty(pair.getKey(),  pair.getValue()+"");
		}
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("action", action);
		jsonObject.addProperty("entity type", entityType.getSimpleName());
		jsonObject.add("args", jsonArgs);
		return jsonObject.toString();
	}
}
