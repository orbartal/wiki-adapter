package wiki.adapter.spring.boot.controllers.interfaces;

import java.util.List;

import wiki.adapter.spring.boot.model.interfaces.SearchResultREI;

public interface SearchControllerI {
	public static final String Entities_NAME = "search";
	public List<SearchResultREI> search (String wikiID, String query) throws Exception;
}
