package wiki.adapter.spring.boot.swagger.output.classes;

import java.io.File;
import java.util.Map;
import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.github.robwin.swagger2markup.Swagger2MarkupConverter;
import io.github.robwin.swagger2markup.Swagger2MarkupConverter.Builder;
import wiki.adapter.spring.boot.swagger.mock.MySwagger2MarkupConverter;
import wiki.adapter.spring.boot.swagger.output.interfaces.AsciiUtilsWikiI;
import wiki.adapter.spring.boot.swagger.output.interfaces.DocumentsWikiPathsI;
import wiki.adapter.spring.boot.utils.interfaces.FilesUtilsWikiI;

@Component
public class AsciiUtilsWikiC implements AsciiUtilsWikiI  {
	
	protected DocumentsWikiPathsI m_paths = null;
	protected FilesUtilsWikiI m_FilesUtils = null;
	
	@Autowired
	public AsciiUtilsWikiC (FilesUtilsWikiI filesUtility, DocumentsWikiPathsI paths){
		m_paths = paths;
		m_FilesUtils = filesUtility;
	}
	
	@Override
	public void create (String swaggerJson) throws Exception {
		create (m_FilesUtils.createDir(m_paths.getOutPutDirTemp()), swaggerJson); 
	}
	
	@Override
	public void create (String strDirPath, String swaggerJson) throws Exception {
		create (m_FilesUtils.createDir(strDirPath), swaggerJson); 
	}

	@Override
	public void create (File dir, String swaggerJson) throws Exception {
	   jsonToAsciiDocs(dir, swaggerJson);
	   File asciiDoc = mergeAsciiDocs(dir);
	   convertAsciiToPdf  (dir, asciiDoc);
	   convertAsciiToHtml (dir, asciiDoc);
	   m_FilesUtils.copyFilesToDir(m_paths.getOutPutDirTemp(), m_paths.getOutPutDirFinal());
	}
	
	protected void jsonToAsciiDocs(File dir, String swaggerJson)  throws Exception {
		   Builder builder = Swagger2MarkupConverter.fromString(swaggerJson);
		   Swagger2MarkupConverter smc = builder.build();
		   /*
		    This is an ugly temporary work around that I had to use to fix a bug in asciidoctorj. 
		    io.github.robwin.swagger2markup.Swagger2MarkupConverter
		    io.github.robwin.swagger2markup.builder.document.PathsDocument
		    io.github.robwin.swagger2markup.utils.ParameterUtil
		    The method ParameterUtil.getDefaultValue that is called from
		    PathsDocument (that is used by Swagger2MarkupConverter) throw
		    an unexplained exception. I could not change the source code
		    so I replace it with my own code. Hope to remove it soon. 
		    */
		// smc.intoFolder(dir.getAbsolutePath());
		   MySwagger2MarkupConverter msmc = new MySwagger2MarkupConverter(smc);
		   msmc.intoFolder(dir.getAbsolutePath());  
	}
	
	 protected File mergeAsciiDocs(File dir) throws Exception {
		Map <String, String>  map = m_paths.getMapOfFilesNames();
		m_FilesUtils.renameFiles(dir, map);
		return m_FilesUtils.mergeFileByType(dir, "*.adoc", m_paths.getNameOfAscii(), "\n<<<\n");
	}

	protected void convertAsciiToPdf(File dir, File inputFile) throws Exception {
		File  outputFile = new File(dir, m_paths.getNameOfPDF());
		convertAsciiToFormat(inputFile, outputFile, "pdf");
	}
	
	protected void convertAsciiToHtml(File dir, File inputFile) throws Exception {
		File outputFile = new File(dir, m_paths.getNameOfHtml());
		convertAsciiToFormat(inputFile, outputFile, "html");
	}
	
	protected void convertAsciiToFormat(File inputFile, File outputFile, String format) {
    	Asciidoctor asciidoctor = Asciidoctor.Factory.create();
        Options options = new Options();
    	options.setBackend(format);
    	options.setHeaderFooter(true);
    	options.setToFile(outputFile.getAbsolutePath());
    	asciidoctor.renderFile(inputFile, options);
	}
}