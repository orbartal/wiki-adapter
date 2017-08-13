package wiki.adapter.spring.boot.swagger.output.interfaces;

public interface DocumentsWikiDefualtPathsI extends DocumentsWikiPathsI {
	public static final String OVERVIEW_ASCII_DOC_ORIGINAL_NAME = "overview.adoc";
	public static final String PATHS_ASCII_DOC_ORIGINAL_NAME = "paths.adoc";
	public static final String DEFINITIONS_ASCII_DOC_ORIGINAL_NAME = "definitions.adoc";
	public static final String OVERVIEW_ASCII_DOC_NAME = "1overview.adoc";
	public static final String PATHS_ASCII_DOC_NAME = "3paths.adoc";
	public static final String DEFINITIONS_ASCII_DOC_NAME = "2definitions.adoc";
	public static final String OUTPUT_FILE_NAME = "WikiRestAPI";
	public static final String OUTPUT_FILE_NAME_ASCII = OUTPUT_FILE_NAME + ".adoc";
	public static final String OUTPUT_FILE_NAME_PDF = OUTPUT_FILE_NAME + ".pdf";
	public static final String OUTPUT_FILE_NAME_HTML = OUTPUT_FILE_NAME + ".html";
	public static final String OUTPUT_DIR_PATH_TEMP = "target/docs/swagger/";
	public static final String OUTPUT_DIR_PATH_FINAL = "../../../logic/swagger/";
}
