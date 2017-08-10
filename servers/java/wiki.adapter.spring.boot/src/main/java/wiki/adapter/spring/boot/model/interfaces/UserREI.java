package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.UserRoleREC;

@JsonDeserialize(as = UserRoleREC.class)
@ApiModel(value = "User", description =
		"Any action (internal or throgh a rest requst) in the wiki belong to exacly one user. "
		+ "A user can be a client human or software that interacts with the wiki api. "
		+ "Or an internal identity under which a wiki service is running")
public interface UserREI extends AbstractREI {}
