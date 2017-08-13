package wiki.adapter.spring.boot.swagger.output.interfaces;

import java.util.Map;

public interface DocumentsWikiPathsI {

	public String getOutPutDirTemp() throws Exception;

	public String getOutPutDirFinal() throws Exception;

	public String getNameOfPDF() throws Exception;

	public String getNameOfHtml() throws Exception;

	public String getNameOfAscii() throws Exception;

	public Map<String, String> getMapOfFilesNames() throws Exception;
}