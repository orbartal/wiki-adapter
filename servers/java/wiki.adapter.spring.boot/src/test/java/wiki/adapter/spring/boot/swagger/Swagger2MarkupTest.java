package wiki.adapter.spring.boot.swagger;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import wiki.adapter.spring.boot.WikiAdapterMain;
import wiki.adapter.spring.boot.swagger.output.interfaces.AsciiUtilsWikiI;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={WikiAdapterMain.class, SpringSwaggerConfig.class, EmbeddedWebApplicationContext.class})
@AutoConfigureMockMvc
public class Swagger2MarkupTest {

	@Autowired
	protected MockMvc mockMvc;
	@Autowired
	protected AsciiUtilsWikiI m_asciiUtilsWiki;

	@Test
	public void createApiDocument() throws Exception {
		String swaggerJson =  getSwaggerJson();	
		m_asciiUtilsWiki.create(swaggerJson);
	}
	
	protected String getSwaggerJson() throws Exception{
		MvcResult mvcResult = this.mockMvc.perform(get("/v2/api-docs")
               .accept(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk())
               .andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		String swaggerJson = response.getContentAsString();
		return swaggerJson;
	}	
}