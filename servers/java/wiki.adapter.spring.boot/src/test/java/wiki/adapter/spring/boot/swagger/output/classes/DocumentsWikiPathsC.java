package wiki.adapter.spring.boot.swagger.output.classes;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import wiki.adapter.spring.boot.swagger.output.interfaces.DocumentsWikiDefualtPathsI;

@Component
public class DocumentsWikiPathsC implements DocumentsWikiDefualtPathsI {
	
	@Override
	public String getOutPutDirTemp() {
		return OUTPUT_DIR_PATH_TEMP;
	}
	
	@Override
	public String getOutPutDirFinal() {
		return OUTPUT_DIR_PATH_FINAL;
	}

	@Override
	public String getNameOfPDF() {
		return OUTPUT_FILE_NAME_PDF;
	}

	@Override
	public String getNameOfHtml() {
		return OUTPUT_FILE_NAME_HTML;
	}
	
	@Override
	public String getNameOfAscii() {
		return OUTPUT_FILE_NAME_ASCII;
	}
	
	@Override
	public Map <String, String> getMapOfFilesNames () throws IOException {
		Map <String, String> map = new HashMap<String, String>();
		map.put(OVERVIEW_ASCII_DOC_ORIGINAL_NAME, OVERVIEW_ASCII_DOC_NAME);
		map.put(PATHS_ASCII_DOC_ORIGINAL_NAME, PATHS_ASCII_DOC_NAME);
		map.put(DEFINITIONS_ASCII_DOC_ORIGINAL_NAME, DEFINITIONS_ASCII_DOC_NAME);
		return map;
	}
}