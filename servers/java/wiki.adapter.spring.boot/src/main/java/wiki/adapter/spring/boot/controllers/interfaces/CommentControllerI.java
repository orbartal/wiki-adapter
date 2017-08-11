package wiki.adapter.spring.boot.controllers.interfaces;

import wiki.adapter.spring.boot.model.interfaces.CommentREI;

public interface CommentControllerI extends CrudController4I<CommentREI> {
	public static final String Entities_NAME = "Comments";
}
