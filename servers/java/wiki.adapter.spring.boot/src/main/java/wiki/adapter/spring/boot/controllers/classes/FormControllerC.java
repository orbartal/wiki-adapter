package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.model.interfaces.FormREI;
import wiki.adapter.spring.boot.controllers.interfaces.FormControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(FormControllerI.URL_REST_API+"/"+FormControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		SpaceControllerI.Entities_NAME + "/{spaceId}/"+
		FormControllerI.Entities_NAME)
@Api(value = FormControllerI.Entities_NAME, description = "Rest for wiki forms")
public class FormControllerC 
	extends AbstractCrudController3C <FormREI> 
	implements FormControllerI 
{}