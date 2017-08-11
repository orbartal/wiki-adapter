package wiki.adapter.spring.boot.controllers.interfaces;

import java.util.List;
import java.util.Map;

public interface SemanticDataControllerI extends RestControllerI {
	public static final String Entities_NAME = "SemanticData";
	
	public Object query (String wikiId, String query) throws Exception; 
	public void edit (String wikiId, List<Map<String, Object>> data) throws Exception; 
}
