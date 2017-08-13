package wiki.adapter.spring.boot.controllers.classes.rest.v1.wiki.space.article;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.UserRoleControllerI;
import wiki.adapter.spring.boot.model.interfaces.CommentREI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.SpaceControllerI;
import wiki.adapter.spring.boot.controllers.classes.abstracts.AbstractCrudController4C;
import wiki.adapter.spring.boot.controllers.interfaces.ArticleControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.CommentControllerI;


@RestController
@RequestMapping(CommentControllerI.URL_REST_API+"/"+CommentControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		SpaceControllerI.Entities_NAME + "/{spaceId}/"+
		ArticleControllerI.Entities_NAME + "/{articleId}/"+
		CommentControllerI.Entities_NAME)
@Api(value = UserRoleControllerI.Entities_NAME, description = "Rest for wiki comment (e.g. notes)")
public class CommentControllerC 
	extends AbstractCrudController4C <CommentREI> 
	implements CommentControllerI 
{}