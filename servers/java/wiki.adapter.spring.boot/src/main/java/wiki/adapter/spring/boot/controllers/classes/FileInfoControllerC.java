package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.FileInfoREI;
import wiki.adapter.spring.boot.controllers.interfaces.FileInfoControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(FileInfoControllerI.URL_REST_API+"/"+FileInfoControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{parentId2}/"+ 
		SpaceControllerI.Entities_NAME + "/{parentId1}/"+
		FileInfoControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki data about a file (e.g. e.g. image, attachment, doc)")
public class FileInfoControllerC 
	extends AbstractCrudController3C <FileInfoREI> 
	implements FileInfoControllerI 
{}