package wiki.adapter.spring.boot.controllers.interfaces;

import wiki.adapter.spring.boot.model.interfaces.WikiREI;

public interface WikiControllerI extends CrudControllerI<WikiREI> {
	public static final String Entities_NAME = "Wikis";
}
