package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.TemplateREI;
import wiki.adapter.spring.boot.controllers.interfaces.TemplateControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(TemplateControllerI.URL_REST_API+"/"+TemplateControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{parentId2}/"+ 
		SpaceControllerI.Entities_NAME + "/{parentId1}/"+
		TemplateControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki template (e.g. functions, widget or apps)")
public class TemplateControllerC 
	extends AbstractCrudController3C <TemplateREI> 
	implements TemplateControllerI 
{}