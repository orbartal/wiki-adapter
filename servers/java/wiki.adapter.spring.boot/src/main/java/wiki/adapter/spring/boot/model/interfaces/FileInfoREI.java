package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.FileInfoREC;

@JsonDeserialize(as = FileInfoREC.class)
@ApiModel(value = "FileInfo", description =
		"FileInfo is data in the wiki about a File (e.g. image, attachment, embedded, doc..) "
		+ " in the wiki. A file is another entity wiki manage beside text article. "
		+ "It can be use inside articles or in its own page.")
public interface FileInfoREI extends AbstractREI {}
