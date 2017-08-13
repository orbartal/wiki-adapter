package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.model.interfaces.ArticleREI;
import wiki.adapter.spring.boot.controllers.interfaces.ArticleControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;

@RestController
@RequestMapping(ArticleControllerI.URL_REST_API+"/"+ArticleControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		SpaceControllerI.Entities_NAME + "/{spaceId}/"+
		ArticleControllerI.Entities_NAME)
@Api(value = ArticleControllerI.Entities_NAME, description = "Rest for wiki Articles (e.g. pages)")
public class ArticleControllerC 
	extends AbstractCrudController3C <ArticleREI> 
	implements ArticleControllerI 
{}