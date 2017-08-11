package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.SemanticPropertyREC;

@JsonDeserialize(as = SemanticPropertyREC.class)
@ApiModel(value = "SemanticProperty", description =
		"SemanticProperty enable to store structured data in the wiki."
		+ "SemanticClass is madw of SemanticProperties. "
		+ "And SemanticObject is made of SemanticProperty and there values.")
public interface SemanticPropertyREI extends AbstractREI {}
