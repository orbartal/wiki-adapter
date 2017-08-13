package wiki.adapter.spring.boot.utils.classes;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.stereotype.Component;

import wiki.adapter.spring.boot.utils.interfaces.ReflectionUtilsWikiI;

@Component
@SuppressWarnings("rawtypes")
public class ReflectionUtilsWikiC implements ReflectionUtilsWikiI {
	
	@Override
	public Class getEntityClass (Object generic) throws Exception {
		Type superclassType = generic.getClass().getGenericSuperclass();
	    ParameterizedType parameterizedType = (ParameterizedType) superclassType;
	    Type[] typeArguments = parameterizedType .getActualTypeArguments();
	    Type result0 = typeArguments[0];
	    Class result = (Class) result0;
	    return result;
	}
}
