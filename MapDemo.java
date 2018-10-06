package cap.org.map;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Map<Integer,String> maps=new HashMap();
maps.put(10, "one");
maps.put(2, "two");
maps.put(1, "three");
maps.put(11, "eleven");
maps.put(1, "five");
maps.put(105, "sive");
//maps.put(null, "hive");
//maps.put(null, "hikkve");
maps.put(125, null);
maps.put(126, null); */
	/*	Map<Integer,String> maps=new Hashtable();
		maps.put(10, "one");
		maps.put(2, "two");
		maps.put(1, "three");
		maps.put(11, "eleven");
		maps.put(1, "five");
		maps.put(105, "sive");
		//maps.put(null, "hive");
		//maps.put(null, "hikkve");
		//maps.put(125, null);
	//	maps.put(126, null);
System.out.println(maps);
System.out.println();

/*Set<Integer> set=maps.keySet();
Iterator<Integer> it1=set.iterator();
while(it1.hasNext()) {
	int key=it1.next();
	System.out.println(key+"->"+maps.get(key));
}*/
/*Collection<String> values=maps.values();
for(String str:values) {
	System.out.print(str+" ");
}

System.out.println();
Enumeration<String> enm=((Hashtable) maps).elements();
while(enm.hasMoreElements()) {
	System.out.print(enm.nextElement()+" ");
} */
	/*	Map<Integer,String> maps=new LinkedHashMap();
		maps.put(10, "one");
		maps.put(2, "two");
		maps.put(1, "three");
		maps.put(11, "eleven");
		maps.put(1, "five");
		maps.put(105, "sive");
		//maps.put(null, "hive");
		//maps.put(null, "hikkve");
		maps.put(125, null);
		maps.put(126, null);
		System.out.println(maps);
		System.out.println();

		Set<Integer> set=maps.keySet();
		Iterator<Integer> it1=set.iterator();
		while(it1.hasNext()) {
			int key=it1.next();
			System.out.print(key+"-> "+maps.get(key));
		}*/
		System.out.println();

		Map<Integer,String> maps=new TreeMap();
		maps.put(10, "one");
		maps.put(2, "two");
		maps.put(1, "three");
		maps.put(11, "eleven");
		maps.put(1, "five");
		maps.put(105, "sive");
		//maps.put(null, "hive");
		//maps.put(null, "hikkve");
		maps.put(125, null);
		maps.put(126, null);
		System.out.println(maps);
		System.out.println();
		Set<Integer> set=maps.keySet();
		Iterator<Integer> it1=set.iterator();
		while(it1.hasNext()) {
			int key=it1.next();
			System.out.print(key+"-> "+maps.get(key));
	}
	}
}
