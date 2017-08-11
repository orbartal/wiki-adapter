package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.SpaceREC;

@JsonDeserialize(as = SpaceREC.class)
@ApiModel(value = "Space", description =
		"The next entity in the hierarchy after wiki is a space. "
		+ "Each Article belong to a single space. A space can sonatin sub spaces.")
public interface SpaceREI extends AbstractREI {}
