package wiki.adapter.spring.boot.controllers.classes.rest.v1.wiki.space.file;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.controllers.interfaces.FileControllerI;
import wiki.adapter.spring.boot.controllers.interfaces.WikiControllerI;

@Controller
@Api(value = "Rest for file", description = "Rest for File upload and download")
@RequestMapping(FileControllerI.URL_REST_API+"/"+FileControllerI.LAST_API_VERSION+"/"+ 
		WikiControllerI.Entities_NAME + "/{wikiId}/"+ 
		FileControllerI.Entities_NAME)

public class FileControllerC implements FileControllerI {

	@RequestMapping(consumes = { MediaType.MULTIPART_FORM_DATA_VALUE }, method = RequestMethod.POST)
	public String upload(String wikiId, MultipartFile file) throws Exception {
		return null;
	}
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET, produces = "image/png")
	public byte[] get(String wikiId, String fileId) throws Exception {
		return null;
	}

	@RequestMapping(value="/{name}/{width}/{height}", method=RequestMethod.GET, produces = "image/png")
	public byte[] get(String wikiId, String fileId, int width, int height) throws Exception {
		return null;
	}

	@RequestMapping(value="/{name}", method=RequestMethod.DELETE, produces = "image/png")
	public void delete(String wikiId, String fileId) throws Exception {
	}

}