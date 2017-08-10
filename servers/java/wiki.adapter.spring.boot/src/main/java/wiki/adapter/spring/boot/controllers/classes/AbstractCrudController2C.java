package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import wiki.adapter.spring.boot.controllers.interfaces.CrudController2I;

public abstract class AbstractCrudController2C <T> implements CrudController2I<T> {

	@ApiOperation(value = "crud: get entities by page")
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Page<T> get(String parent, Pageable pageable) throws Exception {
		return null;
	}

	@ApiOperation(value = "crud: get entity by id")
	@RequestMapping(value="/{entityId}", method=RequestMethod.GET, produces = "application/json")
	public T get(
				@ApiParam(value = "The entity parent id", required = true) @PathVariable("parentId") String parentId,
				@ApiParam(value = "The entity id", required = true) @PathVariable("entityId") String entityId
				) throws Exception {
		return null;
	}

	@ApiOperation(value = "crud: create new entitiy")
	@RequestMapping(method=RequestMethod.POST, produces = "application/json")
	public T create(
				@ApiParam(value = "The entity parent id", required = true) @PathVariable("parentId") String parentId,
				@ApiParam(value = "The entity data", required = true) @RequestBody T data
			) throws Exception {
		return data;
	}
	
	@ApiOperation(value = "crud: update existing entitiy by id")
	@RequestMapping(method=RequestMethod.PUT, produces = "application/json")
	public T update (
				@ApiParam(value = "The entity parent id", required = true) @PathVariable("parentId") String parentId,
				@ApiParam(value = "The entity id", required = true) @PathVariable String entityId, 
				@ApiParam(value = "The entity data", required = true) @RequestBody T data
			) throws Exception {
		return data;
	}

	@ApiOperation(value = "crud: delete existing entitiy by id")
	@RequestMapping(value="/{entityId}", method=RequestMethod.DELETE, produces = "application/json")
	public void delete (
				@ApiParam(value = "The entity parent id", required = true) @PathVariable("parentId") String parentId,
				@ApiParam(value = "The entity id", required = true) @PathVariable  String entityId
			) throws Exception
	{}
}