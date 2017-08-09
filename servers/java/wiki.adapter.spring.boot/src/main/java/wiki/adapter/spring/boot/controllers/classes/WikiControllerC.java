package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wiki.adapter.spring.boot.model.interfaces.WikiCEI;

@RestController
@RequestMapping("/Wikis")
public class WikiControllerC extends AbstractCrudControllerC <WikiCEI> {}