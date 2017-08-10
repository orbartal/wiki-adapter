package wiki.adapter.spring.boot.controllers.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrudControllerI <T> extends RestControllerI {
	
	public Page<T> get (Pageable pageable) throws Exception;
	
	public T get (String id) throws Exception;
	
	public T create (T data) throws Exception;
	
	public T update (String id, T data) throws Exception;
	
	public void delete (String id) throws Exception;
}
