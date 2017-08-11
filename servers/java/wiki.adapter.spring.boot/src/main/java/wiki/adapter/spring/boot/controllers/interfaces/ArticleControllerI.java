package wiki.adapter.spring.boot.controllers.interfaces;

import wiki.adapter.spring.boot.model.interfaces.ArticleREI;

public interface ArticleControllerI extends CrudController3I<ArticleREI> {
	public static final String Entities_NAME = "Articles";
}
