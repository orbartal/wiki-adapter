package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.ArticleVersionREC;

@JsonDeserialize(as = ArticleVersionREC.class)
@ApiModel(value = "ArticleVersion", description =
		"Wiki Articles (e.g. wiki pages and blog posts) have version. "
		+ "Each time an Article is edit and change a new version of it is created.")
public interface ArticleVersionREI extends AbstractREI {}
