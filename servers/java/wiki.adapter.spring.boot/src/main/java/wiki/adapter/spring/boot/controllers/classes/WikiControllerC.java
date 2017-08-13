package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.model.interfaces.WikiREI;

@RestController
@RequestMapping(WikiControllerI.URL_REST_API+"/"+WikiControllerI.LAST_API_VERSION+"/"+WikiControllerI.Entities_NAME)
@Api(value = WikiControllerI.Entities_NAME, description = "Rest for wikis (a wiki can contain sub wikis)")
public class WikiControllerC implements WikiControllerI {
	
	@ApiOperation(value = "crud: get all wikis in the site")
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Page<WikiREI> get(Pageable pageable) throws Exception {
		return null;
	}

	@ApiOperation(value = "crud: get wiki by id")
	@RequestMapping(value="/{wikiId}", method=RequestMethod.GET, produces = "application/json")
	public WikiREI get(
				@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId
				) throws Exception {
		return null;
	}

	@ApiOperation(value = "crud: create a new wiki")
	@RequestMapping(method=RequestMethod.POST, produces = "application/json")
	public WikiREI create(
				@ApiParam(value = "The wiki data", required = true) @RequestBody WikiREI data
			) throws Exception {
		return data;
	}
	
	@ApiOperation(value = "crud: update existing wiki by id")
	@RequestMapping(method=RequestMethod.PUT, produces = "application/json")
	public WikiREI update (
				@ApiParam(value = "The wiki id", required = true) @PathVariable String wikiId, 
				@ApiParam(value = "The wiki data", required = true) @RequestBody WikiREI data
			) throws Exception {
		return data;
	}

	@ApiOperation(value = "crud: delete existing wiki by id")
	@RequestMapping(value="/{wikiId}", method=RequestMethod.DELETE, produces = "application/json")
	public void delete (
				@ApiParam(value = "The wiki id", required = true) @PathVariable  String wikiId
			) throws Exception
	{}
	
	@ApiOperation(value = "get sub wikis of a wiki")
	@RequestMapping(method = RequestMethod.GET, value ="/{wikiId}/sub"+WikiControllerI.Entities_NAME, produces = "application/json")
	public Page<WikiREI> get(
			@ApiParam(value = "The wiki id", required = true) @PathVariable  String wikiId, 
			Pageable pageable) throws Exception {
		return null;
	}
}