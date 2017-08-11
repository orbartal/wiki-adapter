package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.ArticleTranslationREC;

@JsonDeserialize(as = ArticleTranslationREC.class)
@ApiModel(value = "ArticleVersion", description =
		"Wiki Article (e.g. wiki pages and blog posts) can have translations "
		+ "(e.g. reflactions, mirroes). Each reflaction is a text, without any semantic data "
		+ "Or versions, that present the same data as the article, but in a different language.")
public interface ArticleTranslationREI extends AbstractREI {}
