package wiki.adapter.spring.boot.controllers.classes;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import wiki.adapter.spring.boot.controllers.interfaces.CrudControllerI;

public abstract class AbstractCrudControllerC <T> implements CrudControllerI<T> {

	@ApiOperation(value = "crud: get all")
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public List<T> get() throws Exception {
		return null;
	}

	@ApiOperation(value = "crud: get entity by id")
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces = "application/json")
	public T get(
				@ApiParam(value = "The entity id", required = true) @PathVariable("id") Long id
				) throws Exception {
		return null;
	}

	@ApiOperation(value = "crud: create new entitiy")
	@RequestMapping(method=RequestMethod.POST, produces = "application/json")
	public T create(
				@ApiParam(value = "The entity data", required = true) @RequestBody T data
			) throws Exception {
		return data;
	}
	
	@ApiOperation(value = "crud: update existing entitiy by id")
	@RequestMapping(method=RequestMethod.PUT, produces = "application/json")
	public T update (
				@ApiParam(value = "The entity id", required = true) @PathVariable Long id, 
				@ApiParam(value = "The entity data", required = true) @RequestBody T data
			) throws Exception {
		return data;
	}

	@ApiOperation(value = "crud: delete existing entitiy by id")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE, produces = "application/json")
	public void delete (
				@ApiParam(value = "The entity id", required = true) @PathVariable  Long id
			) throws Exception
	{}
}