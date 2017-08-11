package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.TemplateREC;

@JsonDeserialize(as = TemplateREC.class)
@ApiModel(value = "Template", description =
		"Template (e.g. function, widget or app) can be embedded inside article using wiki code, "
		+ "get parameters, and generate a static or dynamic componenet in the article page.")
public interface TemplateREI extends AbstractREI {}
