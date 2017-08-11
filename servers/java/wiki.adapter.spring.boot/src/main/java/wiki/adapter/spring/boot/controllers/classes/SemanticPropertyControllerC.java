package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.SemanticPropertyREI;
import wiki.adapter.spring.boot.controllers.interfaces.SemanticPropertyControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(SemanticPropertyControllerI.URL_REST_API+"/"+SemanticPropertyControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{parentId2}/"+ 
		SpaceControllerI.Entities_NAME + "/{parentId1}/"+
		SemanticPropertyControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki semantic properties (e.g. structured data)")
public class SemanticPropertyControllerC 
	extends AbstractCrudController3C <SemanticPropertyREI> 
	implements SemanticPropertyControllerI 
{}