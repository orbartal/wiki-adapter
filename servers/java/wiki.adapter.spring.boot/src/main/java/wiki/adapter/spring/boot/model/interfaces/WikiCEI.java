package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import wiki.adapter.spring.boot.model.classes.WikiCEC;

@JsonDeserialize(as = WikiCEC.class)
@ApiModel(value = "Wiki", description = "The wiki is the top level entity in the hierarchy. It can contain other sub wikis, spaces, users, extensions ...")
public interface WikiCEI {

	@ApiModelProperty(required=true, example="123456", notes="entity id in server")
	public long getId();

	@ApiModelProperty(required=true, example="Wikipedia", notes="wiki name")
	public String getName();

}