package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.model.interfaces.UserREI;

@RestController
@RequestMapping(UserControllerI.URL_REST_API+"/"+UserControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{parentID}/"+ UserControllerI.Entities_NAME)
@Api(value = UserControllerI.Entities_NAME, description = "Rest for wiki users")
public class UserControllerC extends AbstractCrudController2C <UserREI> implements UserControllerI {}