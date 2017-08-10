package wiki.adapter.spring.boot.controllers.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrudController2I <T> extends RestControllerI {
	
	public Page<T> get (String parent, Pageable pageable) throws Exception;
	
	public T get (String parent, String id) throws Exception;
	
	public T create (String parent, T data) throws Exception;
	
	public T update (String parent, String id, T data) throws Exception;
	
	public void delete (String parent, String id) throws Exception;
}
