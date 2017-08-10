package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import wiki.adapter.spring.boot.model.classes.WikiREC;

@JsonDeserialize(as = WikiREC.class)
@ApiModel(value = "Wiki", description = "The wiki is the top level entity in the hierarchy. It can contain other sub wikis, spaces, users, extensions ...")
public interface WikiREI extends AbstractREI {

	@ApiModelProperty(required=true, example="Wikipedia", notes="wiki name")
	public String getName();

}