package wiki.adapter.spring.boot.controllers.classes.abstracts;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import wiki.adapter.spring.boot.controllers.interfaces.CrudController3I;

public 	abstract class AbstractCrudController3C <T> 
extends AbstractRestController<T>
implements CrudController3I<T> {

	@ApiOperation(value = "crud: get entities by page")
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Page<T> get(
			@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
			@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId, 
			Pageable pageable) throws Exception {
		return exeGetPage("GetAll", toMap ("wikiId", wikiId, "spaceId", spaceId, "pageable", pageable));
	}

	@ApiOperation(value = "crud: get entity by id")
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces = "application/json")
	public T get(
			@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
			@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId,
			@ApiParam(value = "The entity id", required = true) @PathVariable("id") String id
				) throws Exception {
		return exeGetOne("GetById", toMap ("wikiId", wikiId, "spaceId", spaceId, "id", id));
	}

	@ApiOperation(value = "crud: create new entitiy")
	@RequestMapping(method=RequestMethod.POST, produces = "application/json")
	public T create(
				@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
				@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId, 
				@ApiParam(value = "The entity data", required = true) @RequestBody T data
			) throws Exception {
		exeSet("Create", toMap ("wikiId", wikiId, "spaceId", spaceId, "data", data));
		return data;
	}
	
	@ApiOperation(value = "crud: update existing entitiy by id")
	@RequestMapping(method=RequestMethod.PUT, produces = "application/json")
	public T update (
				@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
				@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId, 
				@ApiParam(value = "The entity id", required = true) @PathVariable ("id")  String id, 
				@ApiParam(value = "The entity data", required = true) @RequestBody T data
			) throws Exception {
		exeSet("Update", toMap ("wikiId", wikiId, "spaceId", spaceId, "id", id, "data", data));
		return data;
	}

	@ApiOperation(value = "crud: delete existing entitiy by id")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE, produces = "application/json")
	public void delete (
				@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
				@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId, 
				@ApiParam(value = "The entity id", required = true) @PathVariable("id") String id
			) throws Exception
	{
		exeSet("Delete", toMap ("wikiId", wikiId, "spaceId", spaceId, "id", id));
	}
}