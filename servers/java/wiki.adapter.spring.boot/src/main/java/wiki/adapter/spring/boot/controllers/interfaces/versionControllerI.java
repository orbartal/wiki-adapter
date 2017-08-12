package wiki.adapter.spring.boot.controllers.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface versionControllerI <T> extends RestControllerI  {
	public Page<T> getHistory 	(String wikiId, String spaceId, String entityId, Pageable pageable) throws Exception;
	public T getVersion 		(String wikiId, String spaceId, String entityId, String versionId) throws Exception; 
}
