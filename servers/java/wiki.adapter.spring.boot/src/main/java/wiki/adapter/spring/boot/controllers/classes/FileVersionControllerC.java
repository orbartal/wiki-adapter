package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.FileVersionREI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.FileControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.FileVersionControllerI;
import wiki.adapter.spring.boot.controllers.classes.AbstractCrudController4C;


@RestController
@RequestMapping(FileVersionControllerI.URL_REST_API+"/"+FileVersionControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{parentId3}/"+ 
		SpaceControllerI.Entities_NAME + "/{parentId2}/"+
		FileControllerI.Entities_NAME + "/{parentId}/"+
		FileVersionControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki Files (e.g. images, attachments, docs ..)")
public class FileVersionControllerC 
	extends AbstractCrudController4C <FileVersionREI> 
	implements FileVersionControllerI 
{}