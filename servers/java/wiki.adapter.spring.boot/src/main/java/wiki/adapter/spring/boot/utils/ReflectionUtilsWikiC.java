package wiki.adapter.spring.boot.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectionUtilsWikiC {
	
	//TODO: improve!!!
	@SuppressWarnings("rawtypes")
	static public Class getEntityClass (Object generic){
		try {
			Type superclassType = generic.getClass().getGenericSuperclass();
		    ParameterizedType parameterizedType = (ParameterizedType) superclassType;
		    Type[] typeArguments = parameterizedType .getActualTypeArguments();
		    Type result0 = typeArguments[0];
		    Class result = (Class) result0;
		    return result;
		}catch(Exception e){
			return null;
		}
		
	    /*
	     	if (!ParameterizedType.class.isAssignableFrom(superclassType.getClass())) {
		       throw new Exception ("class: " + generic.getClass().getName() + " is not generic!");
		    }
	     */

	}
}
