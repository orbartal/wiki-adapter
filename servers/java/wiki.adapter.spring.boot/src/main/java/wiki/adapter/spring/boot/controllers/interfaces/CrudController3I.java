package wiki.adapter.spring.boot.controllers.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrudController3I <T> extends RestControllerI {
	
	public Page<T> get (String parent1, String parent2, Pageable pageable) throws Exception;
	
	public T get (String parent1, String parent2, String id) throws Exception;
	
	public T create (String parent1, String parent2, T data) throws Exception;
	
	public T update (String parent1, String parent2, String id, T data) throws Exception;
	
	public void delete (String parent1, String parent2, String id) throws Exception;
}
