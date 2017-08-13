package wiki.adapter.spring.boot.controllers.classes.rest.v1.wiki.space.semantic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.model.interfaces.FormREI;
import wiki.adapter.spring.boot.controllers.classes.abstracts.AbstractCrudController3C;
import wiki.adapter.spring.boot.controllers.interfaces.SemanticFormControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(SemanticFormControllerI.URL_REST_API+"/"+SemanticFormControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		SpaceControllerI.Entities_NAME + "/{spaceId}/"+
		SemanticFormControllerI.Entities_NAME)
@Api(value = SemanticFormControllerI.Entities_NAME, description = "Rest for wiki forms")
public class SemanticFormControllerC 
	extends AbstractCrudController3C <FormREI> 
	implements SemanticFormControllerI 
{}