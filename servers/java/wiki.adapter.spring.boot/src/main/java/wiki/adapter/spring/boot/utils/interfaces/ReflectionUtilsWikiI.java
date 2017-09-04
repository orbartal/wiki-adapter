package wiki.adapter.spring.boot.utils.interfaces;

import java.lang.reflect.Type;

@SuppressWarnings("rawtypes")
public interface ReflectionUtilsWikiI {

	Class getGenericClass(Object generic) throws Exception;
	Class getGenericClass(Object generic, Class<?> genericInterface, int argNumber) throws Exception;
	Type getGenericType(Object generic, Class<?> genericInterface, int argNumber) throws Exception;
}