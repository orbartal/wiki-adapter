package wiki.adapter.spring.boot.utils.classes;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.springframework.stereotype.Component;

import com.google.common.base.Charsets;

import wiki.adapter.spring.boot.utils.interfaces.FilesUtilsWikiI;

@Component
public class FilesUtilsWikiC implements FilesUtilsWikiI {
	
	@Override
	public File createDir (String strFilePath) throws IOException {
		   String strFullPath =  System.getProperty("user.dir") + "\\" + strFilePath;
	       File dir = new File (strFullPath);
	       FileUtils.deleteDirectory(dir);
	       dir.mkdirs();
	       return dir;
	}
	
	@Override
	public File mergeFileByType (File dir, String type, String strOut, String separator) throws IOException {
		 StringBuilder sb = new StringBuilder();
		 File outputFile = new File(dir, strOut);
		 FileFilter typeFilter = new WildcardFileFilter(type);
		 List<File> lstAdocFiles = Arrays.asList(dir.listFiles(typeFilter));
		 for (File inputFile : lstAdocFiles){
			 String strContents = FileUtils.readFileToString(inputFile);
			 sb.append(strContents+separator);
		 }
		 FileUtils.writeStringToFile(outputFile, sb.toString(), Charsets.UTF_8);
		 return outputFile;
	}
	
	@Override
	public void renameFiles(File dir, Map <String, String> map) throws IOException {
		for (Entry<String, String> pair : map.entrySet()){
			File oldFile = new File (dir, pair.getKey());
			File newFile = new File (dir, pair.getValue());
			FileUtils.moveFile (oldFile, newFile);
		}
	}

	@Override
	public void copyFilesToDir(String strSource, String strTarget) throws IOException {
		File fDirSource = new File (strSource);
		File fDirTarget = new File (strTarget);
		FileUtils.copyDirectory(fDirSource, fDirTarget);
	}
}