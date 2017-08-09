package wiki.adapter.spring.boot.model.classes;

import wiki.adapter.spring.boot.model.interfaces.WikiCEI;

public class WikiCEC implements WikiCEI {
	
	protected long id;
	protected String name;

	public WikiCEC() {}
	public WikiCEC(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}