package wiki.adapter.spring.boot.controllers.classes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import wiki.adapter.spring.boot.model.interfaces.WikiCEI;

@RestController
@RequestMapping("/Wikis")
@Api(value = "wikis", description = "Rest for wiki entities")
public class WikiControllerC extends AbstractCrudControllerC <WikiCEI> {}