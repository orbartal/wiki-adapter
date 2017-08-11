package wiki.adapter.spring.boot.model.interfaces;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import wiki.adapter.spring.boot.model.classes.JobREC;

@JsonDeserialize(as = JobREC.class)
@ApiModel(value = "Job", description =
		"A job is a some task that run on the wiki server in a seperate thread/process. "
		+ "It can start from a user request or automaticlly as part of the server work. "
		+ "A user can ask for data on a job it started, or an admin can ask for data "
		+ "on all the jobs running on a server.")
public interface JobREI extends AbstractREI {}
