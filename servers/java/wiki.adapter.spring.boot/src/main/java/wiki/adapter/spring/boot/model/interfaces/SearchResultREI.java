package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.ArticleREC;

@JsonDeserialize(as = ArticleREC.class)
@ApiModel(value = "SearchResult", description =
		"Most wikis have a built in search. "
		+ "The search should return a list of results, e.g. a list of this entity.")
public interface SearchResultREI extends AbstractREI {
	/*
	@ApiModelProperty(required=true, example="3", notes="position in the order results list of a search")
	public Long getIndex();
	@ApiModelProperty(required=true, example="0.75", notes="The match score from the search query to this result.")
	public float getScore();
	@ApiModelProperty(required=true, example="Adapter pattern", notes="Result title. Should be disply above this result in the search.")
	public String getTitle();
	@ApiModelProperty(required=true, example="In software engineering, the adapter pattern is a software design pattern...", notes="Result text that match the search query.")
	public String getHighlighText();
	*/
}
