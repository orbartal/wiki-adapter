package wiki.adapter.spring.boot.executor.classes.command;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import wiki.adapter.spring.boot.executor.interfaces.CommandI;
import wiki.adapter.spring.boot.model.classes.UserREC;
import wiki.adapter.spring.boot.model.interfaces.UserREI;

@Component
@Qualifier("GetAll")
public class GetUsersCommandC implements CommandI<Page<UserREI>> {

	@Override
	public Page<UserREI> exe(Map<String, Object> args) {
		Pageable pageable = (Pageable) args.get("pageable");
		List<UserREI> lstUsers = getUsers();
		long total = 100;
		Page<UserREI> result = new PageImpl<UserREI>(lstUsers, pageable, total);
		return result;
	}

	private List<UserREI> getUsers() {
		UserREI user = new UserREC ();
		user.setId("1");
		List<UserREI> lstUsers = Arrays.asList(user);
		return lstUsers;
	}

}
