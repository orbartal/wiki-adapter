package wiki.adapter.spring.boot.executor.interfaces;

import java.util.Map;

@SuppressWarnings("rawtypes") 
public interface CommandExecutorI {
	<T> T run (Class<T> result, Class entityType, String action, Map<String, Object> args);
}