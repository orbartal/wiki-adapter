package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.model.interfaces.WikiREI;

@RestController
@RequestMapping(WikiControllerI.URL_REST_API+"/"+WikiControllerI.LAST_API_VERSION+"/"+WikiControllerI.Entities_NAME)
@Api(value = WikiControllerI.Entities_NAME, description = "Rest for wikis (a wiki can contain sub wikis)")
public class WikiControllerC extends AbstractCrudController1C <WikiREI> implements WikiControllerI {
	
	@ApiOperation(value = "get sub wikis of a wiki")
	@RequestMapping(method = RequestMethod.GET, value ="/{entityId}"+WikiControllerI.Entities_NAME, produces = "application/json")
	public Page<WikiREI> get(String id, Pageable pageable) throws Exception {
		return null;
	}
}