package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;
import wiki.adapter.spring.boot.model.interfaces.SpaceREI;

@RestController
@RequestMapping(SpaceControllerI.URL_REST_API+"/"+SpaceControllerI.LAST_API_VERSION+"/"+ 
		SpaceControllerI.Entities_NAME + "/{parentId}/"+ SpaceControllerI.Entities_NAME)
@Api(value = SpaceControllerI.Entities_NAME, description = "Rest for wiki spaces (e.g. name space)")
public class SpaceControllerC extends AbstractCrudController2C <SpaceREI> implements SpaceControllerI {}