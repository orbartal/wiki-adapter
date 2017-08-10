package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.UserRoleREC;

@JsonDeserialize(as = UserRoleREC.class)
@ApiModel(value = "UserRole", description = 
									"Permission (and restrictions) can be given to a specific user, "
									+ "or to a group of users, e..g users roles.")
public interface UserRoleREI extends AbstractREI {

}
