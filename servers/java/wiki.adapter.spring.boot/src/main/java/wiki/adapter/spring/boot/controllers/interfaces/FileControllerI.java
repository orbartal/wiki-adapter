package wiki.adapter.spring.boot.controllers.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface FileControllerI extends RestControllerI {
	
	public static final String Entities_NAME = "Files";
	public String upload (String wikiId, MultipartFile file) throws Exception;
	public byte[] get (String wikiId, String fileId) throws Exception;
	public byte[] get (String wikiId, String fileId, int width, int height) throws Exception;
	public void delete (String wikiId, String fileId) throws Exception;
	//InputStreamResource, MultipartFile, File, byte[] 
}
