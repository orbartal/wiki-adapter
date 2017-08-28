package wiki.adapter.spring.boot.executor.classes.exeuter;

import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.google.gson.JsonObject;
import wiki.adapter.spring.boot.executor.interfaces.CommandExecutorI;

@Component
@SuppressWarnings("rawtypes")
public class LogExecutorC implements CommandExecutorI {
	
	protected Logger m_logger = LoggerFactory.getLogger(LogExecutorC.class.getSimpleName());

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

	@Override
	public <T> T run (Class<T> result, Class entityType, String action, Map<String, Object> args) {
		String text = commandToString(entityType, action, args);
		m_logger.info(text);
	    return null;
	}
}
