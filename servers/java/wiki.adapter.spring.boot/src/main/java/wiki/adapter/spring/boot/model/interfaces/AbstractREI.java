package wiki.adapter.spring.boot.model.interfaces;

import io.swagger.annotations.ApiModelProperty;

public interface AbstractREI {
	@ApiModelProperty(required=true, example="123456", notes="entity id in server")
	public String getId();
	public void setId(String Id);
}
