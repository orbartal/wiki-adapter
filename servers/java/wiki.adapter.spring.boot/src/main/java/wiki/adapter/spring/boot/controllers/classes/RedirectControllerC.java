package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.model.interfaces.RedirectREI;
import wiki.adapter.spring.boot.controllers.interfaces.RedirectControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(RedirectControllerI.URL_REST_API+"/"+RedirectControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		SpaceControllerI.Entities_NAME + "/{spaceId}/"+
		RedirectControllerI.Entities_NAME)
@Api(value = RedirectControllerI.Entities_NAME, description = "Rest for wiki redirect (e.g. article names alias)")
public class RedirectControllerC 
	extends AbstractCrudController3C <RedirectREI> 
	implements RedirectControllerI 
{}