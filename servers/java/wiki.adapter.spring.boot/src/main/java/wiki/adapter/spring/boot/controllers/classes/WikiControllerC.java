package wiki.adapter.spring.boot.controllers.classes;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import wiki.adapter.spring.boot.controllers.interfaces.CrudControllerI;
import wiki.adapter.spring.boot.model.classes.WikiCEC;
import wiki.adapter.spring.boot.model.interfaces.WikiCEI;

@RestController
@RequestMapping("/Wikis")
public class WikiControllerC  implements CrudControllerI<WikiCEI>{

	@RequestMapping(method = RequestMethod.GET)
	public List<WikiCEI> get() throws Exception {
		return Arrays.asList((WikiCEI)new WikiCEC(0, "wikiA"), new WikiCEC(1, "wikiB"), new WikiCEC(2, "wikiC"));
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public WikiCEI get(@PathVariable Long id) throws Exception {
		return new WikiCEC(0, "wikiA");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public WikiCEI create(@RequestBody WikiCEI wiki) throws Exception {
		return wiki;
	}

	@RequestMapping(method=RequestMethod.PUT)
	public WikiCEI update(@PathVariable Long id, @RequestBody WikiCEI wiki) throws Exception {
		return wiki;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable Long id) throws Exception {}

}