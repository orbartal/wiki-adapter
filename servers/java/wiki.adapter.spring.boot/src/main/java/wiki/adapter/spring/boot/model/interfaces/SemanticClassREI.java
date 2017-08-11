package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.SemanticClassREC;

@JsonDeserialize(as = SemanticClassREC.class)
@ApiModel(value = "SemanticClass", description =
		"Similar to object oriented programing a SemanticClass define the properties of a SemanticObject.")
public interface SemanticClassREI extends AbstractREI {}
