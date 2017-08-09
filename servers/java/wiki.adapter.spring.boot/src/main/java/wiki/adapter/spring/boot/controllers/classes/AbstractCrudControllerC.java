package wiki.adapter.spring.boot.controllers.classes;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wiki.adapter.spring.boot.controllers.interfaces.CrudControllerI;

public abstract class AbstractCrudControllerC <T> implements CrudControllerI<T> {

	@RequestMapping(method = RequestMethod.GET)
	public List<T> get() throws Exception {
		return null;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public T get(@PathVariable("id") Long id) throws Exception {
		return null;
	}

	@RequestMapping(method=RequestMethod.PUT)
	public T update (@PathVariable Long id, @RequestBody T newT) throws Exception {
		return null;
	}

	@RequestMapping(method=RequestMethod.POST)
	public T create(@RequestBody T newT) throws Exception {
		return null;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void delete (@PathVariable  Long id) throws Exception
	{}
}