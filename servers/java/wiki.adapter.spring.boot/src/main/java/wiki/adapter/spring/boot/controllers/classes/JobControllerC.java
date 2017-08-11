package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.JobControllerI;
import wiki.adapter.spring.boot.model.interfaces.JobREI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;

@RestController
@RequestMapping(JobControllerI.URL_REST_API+"/"+JobControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{parentId}/"+ JobControllerI.Entities_NAME)
@Api(value = JobControllerI.Entities_NAME, description = "Rest for wiki jobs (e.g. tasks)")
public class JobControllerC extends AbstractCrudController2C <JobREI> implements JobControllerI {}