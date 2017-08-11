package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.SemanticPropertyTypeREC;

@JsonDeserialize(as = SemanticPropertyTypeREC.class)
@ApiModel(value = "SemanticPropertyType", description =
		"Type (class) of semantic data: number, text, date, array, object ... "
		+ "Each semantic property as a semantic type.")
public interface SemanticPropertyTypeREI extends AbstractREI {}
