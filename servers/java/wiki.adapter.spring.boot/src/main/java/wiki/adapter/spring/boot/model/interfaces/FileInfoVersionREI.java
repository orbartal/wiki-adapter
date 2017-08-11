package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.FileInfoVersionREC;

@JsonDeserialize(as = FileInfoVersionREC.class)
@ApiModel(value = "FileVersion", description =
		"Wiki Files (e.g. images, attachments, docs ..) have versions. "
		+ "Each time a File is edit\reuploaded and change a new version of it is created.")
public interface FileInfoVersionREI extends AbstractREI {}
