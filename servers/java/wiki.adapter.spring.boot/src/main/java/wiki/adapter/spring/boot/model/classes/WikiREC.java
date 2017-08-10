package wiki.adapter.spring.boot.model.classes;

import wiki.adapter.spring.boot.model.interfaces.WikiREI;

public class WikiREC implements WikiREI {
	
	protected String id;
	protected String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}