package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import wiki.adapter.spring.boot.controllers.interfaces.versionControllerI;

public abstract class AbstractVersionControllerC <T> implements versionControllerI<T> {

	@ApiOperation(value = "versions: get all versions (e.g. history) of an entity")
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Page<T> getHistory(
			@ApiParam(value = "The wiki that contain the entity that the version belong to", required = true) @PathVariable("wikiId") String wikiId,
			@ApiParam(value = "The space that contain the entity that the version belong to", required = true) @PathVariable("spaceId") String spaceId, 
			@ApiParam(value = "The entity (article, file, ...) that the version belong to", required = true) @PathVariable("entityId") String entityId, 
			Pageable pageable) throws Exception {
		return null;
	}

	@ApiOperation(value = "versions: get version by id")
	@RequestMapping(value="/{versionId}", method=RequestMethod.GET, produces = "application/json")
	public T getVersion(
			@ApiParam(value = "The wiki that contain the entity that the version belong to", required = true) @PathVariable("wikiId") String wikiId,
			@ApiParam(value = "The space that contain the entity that the version belong to", required = true) @PathVariable("spaceId") String spaceId, 
			@ApiParam(value = "The entity (article, file, ...) that the version belong to", required = true) @PathVariable("entityId") String entityId, 
			@ApiParam(value = "The version id", required = true) @PathVariable("versionId") String versionId
			) throws Exception {
		return null;
	}
}