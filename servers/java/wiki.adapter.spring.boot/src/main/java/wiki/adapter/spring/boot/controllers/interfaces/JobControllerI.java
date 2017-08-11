package wiki.adapter.spring.boot.controllers.interfaces;

import wiki.adapter.spring.boot.model.interfaces.JobREI;

public interface JobControllerI extends CrudController2I<JobREI> {
	public static final String Entities_NAME = "Jobs";
}
