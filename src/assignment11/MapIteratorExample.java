package assignment11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(1, "Earth");
		map.put(2, "Mars");
		map.put(3, "Venus");
		map.put(4, "Jupiter");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

        // Iterate using Iterator
        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
		

	}

}
