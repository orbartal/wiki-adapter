package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.RedirectREC;

@JsonDeserialize(as = RedirectREC.class)
@ApiModel(value = "Redirect", description =
		"Redircet to another article. Enable to rename article and to have more then one name per article")
public interface RedirectREI extends AbstractREI {}
