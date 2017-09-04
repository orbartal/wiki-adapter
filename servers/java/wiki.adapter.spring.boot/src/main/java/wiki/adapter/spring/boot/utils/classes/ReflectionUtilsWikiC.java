package wiki.adapter.spring.boot.utils.classes;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.springframework.stereotype.Component;
import wiki.adapter.spring.boot.utils.interfaces.ReflectionUtilsWikiI;

//TODO: check errors
@Component
@SuppressWarnings("rawtypes")
public class ReflectionUtilsWikiC implements ReflectionUtilsWikiI {
	
	//Get Rest controller entity class
	@Override
	public Class getGenericClass (Object generic) throws Exception {
		Type superclassType = generic.getClass().getGenericSuperclass();
	    ParameterizedType parameterizedType = (ParameterizedType) superclassType;
	    Type[] typeArguments = parameterizedType .getActualTypeArguments();
	    Type result0 = typeArguments[0];
	    Class result = (Class) result0;
	    return result;
	}

	@Override
	public Class getGenericClass(Object generic, Class<?> genericInterface, int argNumber) throws Exception {
		 Type type = this.getGenericType(generic, genericInterface, argNumber);
		 if (type instanceof Class) {
			  Class<?> clazz = (Class<?>) type;
			  return clazz;
		 }
		 throw new Exception ("Type: " + type + " is not a class");
	}
	public Type getGenericType(Object generic, Class<?> genericInterface, int argNumber) throws Exception {
		Type[] arrInterfaces = generic.getClass().getGenericInterfaces();
		for (Type interfaceType : arrInterfaces) {
		    if (!(interfaceType instanceof ParameterizedType)) {
		    	continue;
		    }
	    	String strGenericInterface = interfaceType.getTypeName();
	    	if (!strGenericInterface.startsWith(genericInterface.getName())) {
	    		continue;
	    	}
	        Type[] genericTypes = ((ParameterizedType) interfaceType).getActualTypeArguments();
	        if (genericTypes.length<argNumber) {
	        	throw new Exception ("interfaceType " + interfaceType + " does contain only " + genericTypes.length + " (<" +  argNumber + ") args.");
	        }
	        Type result = genericTypes[argNumber];
	        return result;
		}
		throw new Exception ("Object " + generic + " does not implament interface " + genericInterface);
	}
}
