package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.ArticleREC;

@JsonDeserialize(as = ArticleREC.class)
@ApiModel(value = "Article", description =
		"Articles (e.g. wiki pages and blog posts) are the centeral idea that wikis are built on. "
		+ "Each Article belong to a single space and wiki, but contain by many other articles.")
public interface ArticleREI extends AbstractREI {}
