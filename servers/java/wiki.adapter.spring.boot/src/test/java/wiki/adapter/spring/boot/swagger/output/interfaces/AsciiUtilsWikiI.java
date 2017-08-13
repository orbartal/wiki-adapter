package wiki.adapter.spring.boot.swagger.output.interfaces;

import java.io.File;

public interface AsciiUtilsWikiI {

	public void create(String strDirPath, String swaggerJson) throws Exception;

	public void create(File dir, String swaggerJson) throws Exception;

	public void create(String swaggerJson) throws Exception;

}