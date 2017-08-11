package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.FormREC;

@JsonDeserialize(as = FormREC.class)
@ApiModel(value = "Form", description = "Form are used to insert semantic (structed) data into the wiki")
public interface FormREI extends AbstractREI {}
