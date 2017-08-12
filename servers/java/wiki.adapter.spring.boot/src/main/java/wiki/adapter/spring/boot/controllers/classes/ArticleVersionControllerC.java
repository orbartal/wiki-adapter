package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.ArticleVersionREI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.ArticleControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.ArticleVersionControllerI;
import wiki.adapter.spring.boot.controllers.classes.AbstractVersionControllerC;


@RestController
@RequestMapping(ArticleVersionControllerI.URL_REST_API+"/"+ArticleVersionControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		SpaceControllerI.Entities_NAME + "/{spaceId}/"+
		ArticleControllerI.Entities_NAME + "/{articleId}/"+
		ArticleVersionControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki Articles (e.g. pages) versions")
public class ArticleVersionControllerC 
	extends AbstractVersionControllerC <ArticleVersionREI> 
	implements ArticleVersionControllerI 
{}