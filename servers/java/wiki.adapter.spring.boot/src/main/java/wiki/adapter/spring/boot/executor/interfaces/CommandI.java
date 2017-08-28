package wiki.adapter.spring.boot.executor.interfaces;

import java.util.Map;

public interface CommandI<T> {
	T exe(Map<String, Object> args);
}
