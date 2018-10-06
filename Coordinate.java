package cap.org.collectionset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Coordinate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map<Integer,Integer> pnt=new HashMap();
		pnt.put(2,5);
		pnt.put(1,3);
		pnt.put(1,3);
		pnt.put(0, 1);
		Set<Integer> set=pnt.keySet();
		Iterator<Integer> it1=set.iterator();
		while(it1.hasNext()) {
			Integer key=it1.next();
			System.out.println(key+" ->"+pnt.get(key));
		}
		
		
		
		
	}

}
