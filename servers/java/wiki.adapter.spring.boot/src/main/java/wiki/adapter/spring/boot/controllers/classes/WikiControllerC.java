package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import wiki.adapter.spring.boot.controllers.interfaces.WikisControllerI;
import wiki.adapter.spring.boot.model.interfaces.WikiCEI;

@RestController
@RequestMapping(WikisControllerI.URL_REST_API+"/"+WikisControllerI.LAST_API_VERSION+"/"+WikisControllerI.Entities_NAME)
@Api(value = "wikis", description = "Rest for wiki entities")
public class WikiControllerC extends AbstractCrudControllerC <WikiCEI> implements WikisControllerI {
	
	@ApiOperation(value = "get sub wikis of a wiki")
	@RequestMapping(method = RequestMethod.GET, value ="/{id}/"+WikisControllerI.Entities_NAME, produces = "application/json")
	public Page<WikiCEI> get(Long id, Pageable pageable) throws Exception {
		return null;
	}
}