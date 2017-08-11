package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.CommentREC;

@JsonDeserialize(as = CommentREC.class)
@ApiModel(value = "Comment", description =
		"Users can add comments under articles to discuss about it.")
public interface CommentREI extends AbstractREI {}
