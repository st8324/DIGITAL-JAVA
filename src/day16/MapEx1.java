package day16;

import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("abcde","1234");
		map.put("abcde","12345");
		map.put("abcdef","1234");
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String,String> e = it.next();
			System.out.println("id : "+e.getKey());
			System.out.println("pw : "+e.getValue());
			System.out.println("===============");
		}
		Set<String> keySet = map.keySet();
		Collection<String> valueSet = map.values();
	}
}
class Entry{
	Object key;
	Object value;
}
