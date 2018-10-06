package cap.org.collectionset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainClass {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Map<Customer,Address> maps=new HashMap();
		
		maps.put(new Customer(1410,"sanket"),new Address("sbc","punjab"));
		maps.put(new Customer(1411,"fanket"),new Address("def","spunjab"));
		maps.put(new Customer(1412,"danket"),new Address("aff","bpunjab"));
		maps.put(new Customer(1413,"kanket"),new Address("vv","vpunjab"));
		maps.put(new Customer(1420,"manket"),new Address("kkc","cpunjab"));
		maps.put(new Customer(1410,"sanket"),new Address("bihar","hunjab"));
		maps.put(new Customer(),new Address("sbc","punjab"));
		maps.put(new Customer(1410,"sanket"),new Address());*/
Map<Customer,Address> maps=new TreeMap();
		
		maps.put(new Customer(1410,"sanket"),new Address("sbc","punjab"));
		maps.put(new Customer(1411,"fanket"),new Address("def","spunjab"));
		maps.put(new Customer(1412,"danket"),new Address("aff","bpunjab"));
		maps.put(new Customer(1413,"kanket"),new Address("vv","vpunjab"));
		maps.put(new Customer(1420,"manket"),new Address("kkc","cpunjab"));
		maps.put(new Customer(1410,"sanket"),new Address("bihar","hunjab"));
		maps.put(new Customer(),new Address("sbc","punjab"));
		maps.put(new Customer(1410,"sanket"),new Address());
		System.out.println(maps);
		System.out.println();

		Set<Customer> set=maps.keySet();
		Iterator<Customer> it1=set.iterator();
		while(it1.hasNext()) {
			Customer key=it1.next();
			System.out.println(key+" ->"+maps.get(key));
		}
		
	
	}

}
