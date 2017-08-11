package wiki.adapter.spring.boot.swagger.mock;

import java.util.Comparator;

public class NotPageComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		if (o1 ==null || o2 ==null) {
			return 0;
		}
		
		boolean b1 = o1.contains("Page");
		boolean b2 = o2.contains("Page");
		
		if (b1 && !b2) {
			return 1;
		}else if (!b1 && b2) {
			return -1;
		}
		return o1.compareTo(o2);
	}

}
