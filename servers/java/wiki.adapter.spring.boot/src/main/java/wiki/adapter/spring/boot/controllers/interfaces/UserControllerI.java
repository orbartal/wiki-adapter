package wiki.adapter.spring.boot.controllers.interfaces;

import wiki.adapter.spring.boot.model.interfaces.UserREI;

public interface UserControllerI extends CrudController2I<UserREI> {
	public static final String Entities_NAME = "Users";
}
