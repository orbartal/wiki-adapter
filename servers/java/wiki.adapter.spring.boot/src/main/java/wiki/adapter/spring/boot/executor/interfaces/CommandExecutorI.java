package wiki.adapter.spring.boot.executor.interfaces;

import java.util.Map;

public interface CommandExecutorI {
	<T> T run(Class<T> entityType, String action, Map<String, Object> args);
}