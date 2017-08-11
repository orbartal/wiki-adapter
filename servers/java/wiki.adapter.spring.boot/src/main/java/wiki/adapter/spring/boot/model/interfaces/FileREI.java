package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.FileREC;

@JsonDeserialize(as = FileREC.class)
@ApiModel(value = "FileInWiki", description =
		"File (e.g. image, attachment, embedded, doc..) is another entity wiki manage beside text article. "
		+ "It can be use inside articles or in its own page.")
public interface FileREI extends AbstractREI {}
