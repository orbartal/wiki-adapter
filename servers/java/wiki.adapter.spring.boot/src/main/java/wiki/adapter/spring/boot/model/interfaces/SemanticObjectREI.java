package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.ArticleVersionREC;

@JsonDeserialize(as = ArticleVersionREC.class)
@ApiModel(value = "ArticleVersion", description =
		"Semantic object store semantic (structed) data. "
		+ "It can contain properties, collections, and other objects. "
		+ "Similler to a json object. An article can contain objects. "
		+ "The object is define in the article source text, but can also be edited "
		+ "using form. It can be define by a class or as a unique collection of key-values.")
public interface SemanticObjectREI extends AbstractREI {}
