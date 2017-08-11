package wiki.adapter.spring.boot.controllers.classes;

import java.util.List;
import wiki.adapter.spring.boot.controllers.interfaces.SearchControllerI;
import wiki.adapter.spring.boot.model.interfaces.SearchResultREI;

public class SearchControllerC implements SearchControllerI{

	public List<SearchResultREI> search(String wikiID, String query) throws Exception {
		return null;
	}

}
