package wiki.adapter.spring.boot.controllers.classes.rest.v1.wiki;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.classes.abstracts.AbstractCrudController2C;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;
import wiki.adapter.spring.boot.model.interfaces.SpaceREI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;

@RestController
@RequestMapping(SpaceControllerI.URL_REST_API+"/"+SpaceControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ SpaceControllerI.Entities_NAME)
@Api(value = SpaceControllerI.Entities_NAME, description = "Rest for wiki spaces (e.g. name space)")
public class SpaceControllerC 
		extends AbstractCrudController2C <SpaceREI> 
		implements SpaceControllerI {}