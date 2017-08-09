package wiki.adapter.spring.boot.controllers.interfaces;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


public interface CrudControllerI <T> {
	
	@ApiOperation(value = "crud: get all")
	@RequestMapping(method = RequestMethod.GET)
	public List<T> get () throws Exception;
	
	@ApiOperation(value = "crud: get entity by id")
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public T get (
					@ApiParam(value = "The entity id", required = true) @PathVariable("id") Long id
				 ) throws Exception;
	
	
	@ApiOperation(value = "crud: create new entitiy")
	@RequestMapping(method=RequestMethod.POST)
	public T create (
					@ApiParam(value = "The entity data", required = true) @RequestBody T newT
					) throws Exception;
	
	@ApiOperation(value = "crud: update existing entitiy by id")
	@RequestMapping(method=RequestMethod.PUT)
	public T update (
						@ApiParam(value = "The entity id", required = true) @PathVariable Long id, 
						@ApiParam(value = "The entity new data", required = true) @RequestBody T newT
					) throws Exception;
	
	@ApiOperation(value = "crud: delete existing entitiy by id")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void delete (
							@ApiParam(value = "The entity id", required = true) @PathVariable  Long id
						) throws Exception;
}
