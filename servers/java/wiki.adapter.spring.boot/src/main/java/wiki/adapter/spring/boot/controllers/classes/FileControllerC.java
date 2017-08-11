package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.FileREI;
import wiki.adapter.spring.boot.controllers.interfaces.FileControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(FileControllerI.URL_REST_API+"/"+FileControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{parentId2}/"+ 
		SpaceControllerI.Entities_NAME + "/{parentId1}/"+
		FileControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki file (e.g. e.g. image, attachment, doc)")
public class FileControllerC 
	extends AbstractCrudController3C <FileREI> 
	implements FileControllerI 
{}