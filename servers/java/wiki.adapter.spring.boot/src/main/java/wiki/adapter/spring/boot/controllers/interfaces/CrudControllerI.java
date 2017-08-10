package wiki.adapter.spring.boot.controllers.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrudControllerI <T> extends RestControllerI {
	
	public Page<T> get (Pageable pageable) throws Exception;
	
	public T get (Long id) throws Exception;
	
	public T create (T newT) throws Exception;
	
	public T update (Long id, T newT) throws Exception;
	
	public void delete (Long id) throws Exception;
}
