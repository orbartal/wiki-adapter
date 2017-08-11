package wiki.adapter.spring.boot.controllers.interfaces;

import wiki.adapter.spring.boot.model.interfaces.WikiREI;

public interface WikiControllerI extends CrudController1I<WikiREI> {
	public static final String Entities_NAME = "Wikis";
}
