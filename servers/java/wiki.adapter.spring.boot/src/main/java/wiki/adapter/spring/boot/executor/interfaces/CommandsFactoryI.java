package wiki.adapter.spring.boot.executor.interfaces;

public interface CommandsFactoryI {

	@SuppressWarnings("rawtypes")
	public <T> CommandI<T> get(Class<T> resultType, Class entityType, String action);
}
