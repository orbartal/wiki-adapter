package wiki.adapter.spring.boot.controllers;

import wiki.adapter.spring.boot.utils.ReflectionUtilsWikiC;

@SuppressWarnings("rawtypes")
public class GenericWithEntity <T> {
	
	protected Class m_entityClass = null;
	
	public GenericWithEntity() {
		m_entityClass = ReflectionUtilsWikiC.getEntityClass(this);
		m_entityClass.toString();
	}
	
	public Class getEntityClass() {
		return m_entityClass;
	}
}
