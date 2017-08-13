package wiki.adapter.spring.boot.controllers.classes.rest.v1.wiki.space.semantic;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import wiki.adapter.spring.boot.controllers.interfaces.SemanticDataControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;

@RestController
@RequestMapping(SemanticDataControllerI.URL_REST_API+"/"+SemanticDataControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ SemanticDataControllerI.Entities_NAME)
@Api(value = SemanticDataControllerI.Entities_NAME, description = "Rest for semantic queries and batch edits")
public class SemanticDataControllerC implements SemanticDataControllerI {

	@RequestMapping(value = "/{query}", method=RequestMethod.GET, produces = "application/json")
	public Object query(
			@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId, 
			@ApiParam(value = "The semantic query", required = true) @PathVariable String query) throws Exception {
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST, produces = "application/json")
	public void edit (
			@ApiParam(value = "The wiki id", required = true) @PathVariable("wikiId") String wikiId, 
			@ApiParam(value = "The new semantic data", required = true) @RequestBody List<Map<String, Object>> data) throws Exception {		
	}
}