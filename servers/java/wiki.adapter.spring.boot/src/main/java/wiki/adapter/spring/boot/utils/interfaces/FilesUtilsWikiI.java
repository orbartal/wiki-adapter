package wiki.adapter.spring.boot.utils.interfaces;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public interface FilesUtilsWikiI {

	File createDir(String strFilePath) throws IOException;

	File mergeFileByType(File dir, String type, String strOut, String separator) throws IOException;

	void renameFiles(File dir, Map<String, String> map) throws IOException;

	void copyFilesToDir(String strSource, String strTarget) throws IOException;

}