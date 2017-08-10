package wiki.adapter.spring.boot.controllers.classes;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@Api(value = "Default", description = "A welcome page with help info about the api")
public class DefualtControllerC {
	
	@Autowired
	protected EmbeddedWebApplicationContext appContext;
	
	@ApiOperation(value = "Get site url")
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public String get() throws Exception {
		String siteUrl =  getBaseUrl();
		JsonObject jsonSite = new JsonObject();
		jsonSite.addProperty("siteUrl", siteUrl);
		jsonSite.add("paths", getJsonSwagger(siteUrl));
		String jsonString = jsonSite.toString();
		return jsonString;
	}
	
	protected JsonElement getJsonSwagger(String siteUrl) {
		JsonObject jsonSwagger = new JsonObject();
		jsonSwagger.addProperty("api-docs", siteUrl+"/v2/api-docs");
		jsonSwagger.addProperty("swagger-ui", siteUrl+"/swagger-ui.html");
		return jsonSwagger;
	}

	//https://stackoverflow.com/questions/40401383/spring-boot-get-application-base-url-outside-of-servlet-context
	protected String getBaseUrl() throws UnknownHostException {
		EmbeddedServletContainer container = appContext.getEmbeddedServletContainer();
		TomcatEmbeddedServletContainer tomcatContainer = (TomcatEmbeddedServletContainer) container;
		Connector connector = tomcatContainer.getTomcat().getConnector();
	    String scheme = connector.getScheme();
	    String ip = InetAddress.getLocalHost().getHostAddress();
	    int port = connector.getPort();
	    String contextPath = appContext.getServletContext().getContextPath();
	    return scheme + "://" + ip + ":" + port + contextPath;
	}
}