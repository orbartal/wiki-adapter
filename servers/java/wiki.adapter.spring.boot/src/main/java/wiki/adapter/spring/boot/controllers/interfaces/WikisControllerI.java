package wiki.adapter.spring.boot.controllers.interfaces;

import wiki.adapter.spring.boot.model.interfaces.WikiCEI;

public interface WikisControllerI extends CrudControllerI<WikiCEI> {
	public static final String Entities_NAME = "Wikis";
}
