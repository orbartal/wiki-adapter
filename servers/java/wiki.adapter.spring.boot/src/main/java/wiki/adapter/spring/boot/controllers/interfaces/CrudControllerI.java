package wiki.adapter.spring.boot.controllers.interfaces;

import java.util.List;

public interface CrudControllerI <T> {
	
	public List<T> get () throws Exception;
	
	public T get (Long id) throws Exception;
	
	public T create (T newT) throws Exception;
	
	public T update (Long id, T newT) throws Exception;
	
	public void delete (Long id) throws Exception;
}
