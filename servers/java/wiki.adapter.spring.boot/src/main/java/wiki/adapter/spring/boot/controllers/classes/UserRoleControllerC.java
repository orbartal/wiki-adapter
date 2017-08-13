package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.UserRoleREI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;

@RestController
@RequestMapping(UserRoleControllerI.URL_REST_API+"/"+UserRoleControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ UserRoleControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki users roles (e.g. users group)")
public class UserRoleControllerC 
	extends AbstractCrudController2C <UserRoleREI> 
	implements UserRoleControllerI 
{}