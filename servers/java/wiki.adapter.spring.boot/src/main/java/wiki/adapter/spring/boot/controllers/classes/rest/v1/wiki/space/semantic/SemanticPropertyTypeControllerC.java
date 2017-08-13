package wiki.adapter.spring.boot.controllers.classes.rest.v1.wiki.space.semantic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.model.interfaces.SemanticPropertyTypeREI;
import wiki.adapter.spring.boot.controllers.classes.abstracts.AbstractCrudController3C;
import wiki.adapter.spring.boot.controllers.interfaces.SemanticPropertyTypeControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(SemanticPropertyTypeControllerI.URL_REST_API+"/"+SemanticPropertyTypeControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		SpaceControllerI.Entities_NAME + "/{spaceId}/"+
		SemanticPropertyTypeControllerI.Entities_NAME)
@Api(value = SemanticPropertyTypeControllerI.Entities_NAME, description = "Rest for wiki Articles (e.g. pages)")
public class SemanticPropertyTypeControllerC 
	extends AbstractCrudController3C <SemanticPropertyTypeREI> 
	implements SemanticPropertyTypeControllerI 
{}