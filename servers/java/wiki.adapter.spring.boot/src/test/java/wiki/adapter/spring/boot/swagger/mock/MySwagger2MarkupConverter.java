package wiki.adapter.spring.boot.swagger.mock;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.springframework.util.ReflectionUtils;
import io.github.robwin.swagger2markup.OrderBy;
import io.github.robwin.swagger2markup.Swagger2MarkupConverter;
import io.github.robwin.swagger2markup.builder.document.DefinitionsDocument;
import io.github.robwin.swagger2markup.builder.document.OverviewDocument;
import io.github.robwin.swagger2markup.builder.document.PathsDocument;
import io.github.robwin.swagger2markup.config.Swagger2MarkupConfig;
import io.swagger.models.Model;
import io.swagger.models.Swagger;

public class MySwagger2MarkupConverter  {
	
    private static final String OVERVIEW_DOCUMENT = "overview";
    private static final String PATHS_DOCUMENT = "paths";
    private static final String DEFINITIONS_DOCUMENT = "definitions";
	
	protected Swagger2MarkupConfig m_config;
	OverviewDocument m_overviewDoc;
	PathsDocument m_pathsDoc;
	DefinitionsDocument m_definitionsDoc;
	
	public MySwagger2MarkupConverter (Swagger2MarkupConverter smc) throws Exception{
		this(getSwaggerConfig(smc));
	}
	public MySwagger2MarkupConverter (Swagger2MarkupConfig config){
		m_config = config;
	}

	private static Swagger2MarkupConfig getSwaggerConfig(Swagger2MarkupConverter smc) throws Exception {
		Field f = smc.getClass().getDeclaredField("swagger2MarkupConfig");
		f.setAccessible(true);
		return (Swagger2MarkupConfig) f.get(smc); 
	}

	public void intoFolder(String directory) throws IOException {
		
			//OverviewDocument
			m_overviewDoc = new OverviewDocument(m_config);
			m_overviewDoc.build();
			m_overviewDoc.writeToFile(directory, OVERVIEW_DOCUMENT, StandardCharsets.UTF_8);
			
			//DefinitionsDocument
			reorderDefinitions();
			m_definitionsDoc = new DefinitionsDocument(m_config, directory);
			m_definitionsDoc.build();
			m_definitionsDoc.writeToFile(directory, DEFINITIONS_DOCUMENT, StandardCharsets.UTF_8);
			
			//PathsDocument: MyPathsDocument
			m_pathsDoc =  new MyPathsDocument(m_config);
			m_pathsDoc.build();
			m_pathsDoc.writeToFile(directory, PATHS_DOCUMENT, StandardCharsets.UTF_8);
	}
	
	private Set<String> reorderDefinitions() {
		Swagger swagger =  m_config.getSwagger();
		Map<String, Model> mapBefor = swagger.getDefinitions();
		SortedMap <String, Model> mapAfter = new TreeMap<String, Model>(new NotPageComparator());
		mapAfter.putAll(mapBefor);
		swagger.setDefinitions(mapAfter);
		setConfigOrderBy();
		return swagger.getDefinitions().keySet();
	}
	
	private void setConfigOrderBy( ) {
		Field field = ReflectionUtils.findField(m_config.getClass(), "definitionsOrderedBy");
		ReflectionUtils.makeAccessible(field);
		ReflectionUtils.setField(field, m_config, OrderBy.AS_IS);
	}
}