package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import wiki.adapter.spring.boot.controllers.GenericWithEntity;
import wiki.adapter.spring.boot.controllers.interfaces.CrudController4I;

public 	abstract class AbstractCrudController4C <T> 
extends GenericWithEntity<T>
implements CrudController4I<T> {
	
	@SuppressWarnings("unused")
	@ApiOperation(value = "crud: get entities by page")
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Page<T> get(
			@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
			@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId,
			@ApiParam(value = "The article id", required = true) @PathVariable("articleId") String articleId, 
			Pageable pageable) throws Exception {
		String entityName = this.getEntityClass().toString();
		return null;
	}

	@SuppressWarnings("unused")
	@ApiOperation(value = "crud: get entity by id")
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces = "application/json")
	public T get(
			@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
			@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId,
			@ApiParam(value = "The article id", required = true) @PathVariable("articleId") String articleId, 
			@ApiParam(value = "The entity id", required = true) @PathVariable("id") String id
				) throws Exception {
		String entityName = this.getEntityClass().toString();
		return null;
	}

	@ApiOperation(value = "crud: create new entitiy")
	@RequestMapping(method=RequestMethod.POST, produces = "application/json")
	public T create(
			@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
			@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId,
			@ApiParam(value = "The article id", required = true) @PathVariable("articleId") String articleId, 
			@ApiParam(value = "The entity data", required = true) @RequestBody T data
			) throws Exception {
		String entityName = this.getEntityClass().toString();
		return data;
	}
	
	@ApiOperation(value = "crud: update existing entitiy by id")
	@RequestMapping(method=RequestMethod.PUT, produces = "application/json")
	public T update (
			@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
			@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId,
			@ApiParam(value = "The article id", required = true) @PathVariable("articleId") String articleId, 
			@ApiParam(value = "The entity id", required = true) @PathVariable ("id")  String id, 
			@ApiParam(value = "The entity data", required = true) @RequestBody T data
			) throws Exception {
		String entityName = this.getEntityClass().toString();
		return data;
	}

	@ApiOperation(value = "crud: delete existing entitiy by id")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE, produces = "application/json")
	public void delete (
			@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId,
			@ApiParam(value = "The space id", required = true) @PathVariable("spaceId") String spaceId,
			@ApiParam(value = "The article id", required = true) @PathVariable("articleId") String articleId, 
			@ApiParam(value = "The entity id", required = true) @PathVariable ("id")  String id
			) throws Exception
	{}
}