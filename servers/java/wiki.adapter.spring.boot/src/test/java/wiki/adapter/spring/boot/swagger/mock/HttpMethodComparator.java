package wiki.adapter.spring.boot.swagger.mock;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import io.swagger.models.HttpMethod;

public class HttpMethodComparator implements Comparator <HttpMethod> {
	
	protected Map <HttpMethod, Integer> score = null;// new Map
	
	public HttpMethodComparator () {
		score = new HashMap<HttpMethod, Integer>();
		score.put(HttpMethod.GET, 1);
		score.put(HttpMethod.POST, 2);
		score.put(HttpMethod.PUT, 3);
		score.put(HttpMethod.DELETE, 4);
		score.put(HttpMethod.HEAD, 5);
		score.put(HttpMethod.OPTIONS, 6);
		score.put(HttpMethod.PATCH, 7);
	}

	public int compare(HttpMethod o1, HttpMethod o2) {
		Integer score1 =  score.get(o1);
		Integer score2 =  score.get(o2);
		if (score1==null || score2==null) {
			return 0;
		}
		return score1.compareTo(score2);
	}

}
