package wiki.adapter.spring.boot.controllers.classes.rest.v1.wiki.space.semantic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.model.interfaces.SemanticClassREI;
import wiki.adapter.spring.boot.controllers.classes.abstracts.AbstractCrudController3C;
import wiki.adapter.spring.boot.controllers.interfaces.SemanticClassControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(SemanticClassControllerI.URL_REST_API+"/"+SemanticClassControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		SpaceControllerI.Entities_NAME + "/{spaceId}/"+
		SemanticClassControllerI.Entities_NAME)
@Api(value = SemanticClassControllerI.Entities_NAME, description = "Rest for wiki Articles (e.g. pages)")
public class SemanticClassControllerC 
	extends AbstractCrudController3C <SemanticClassREI> 
	implements SemanticClassControllerI 
{}