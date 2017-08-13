package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.ArticleTranslationREI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.ArticleControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.ArticleTranslationControllerI;
import wiki.adapter.spring.boot.controllers.classes.AbstractCrudController4C;


@RestController
@RequestMapping(ArticleTranslationControllerI.URL_REST_API+"/"+ArticleTranslationControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		SpaceControllerI.Entities_NAME + "/{spaceId}/"+
		ArticleControllerI.Entities_NAME + "/{articleId}/"+
		ArticleTranslationControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki Articles (e.g. pages)")
public class ArticleTranslationControllerC 
	extends AbstractCrudController4C <ArticleTranslationREI> 
	implements ArticleTranslationControllerI 
{}