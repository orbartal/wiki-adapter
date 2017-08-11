package wiki.adapter.spring.boot.model.classes;

import wiki.adapter.spring.boot.model.interfaces.AbstractREI;

public class AbstractREC implements AbstractREI {
	
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
