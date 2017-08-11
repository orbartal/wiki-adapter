package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.FileInfoVersionREI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.FileInfoControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.FileInfoVersionControllerI;
import wiki.adapter.spring.boot.controllers.classes.AbstractCrudController4C;


@RestController
@RequestMapping(FileInfoVersionControllerI.URL_REST_API+"/"+FileInfoVersionControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{parentId3}/"+ 
		SpaceControllerI.Entities_NAME + "/{parentId2}/"+
		FileInfoControllerI.Entities_NAME + "/{parentId}/"+
		FileInfoVersionControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki Files (e.g. images, attachments, docs ..)")
public class FileInfoVersionControllerC 
	extends AbstractCrudController4C <FileInfoVersionREI> 
	implements FileInfoVersionControllerI 
{}