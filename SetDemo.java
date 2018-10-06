package cap.org.collectionset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Set<Integer> set=new HashSet();
//HashSet<Integer> set=new HashSet();
	//	LinkedHashSet<Integer> set=new LinkedHashSet();
		TreeSet<Integer> set=new TreeSet();
set.add(100);
set.add(200);
set.add(600);
set.add(20);
//set.add(null);  //null value only allowed in HashSet
System.out.println(set);

//Iterator method forward traversal
Iterator<Integer> itr=set.iterator();
while(itr.hasNext()) {
	Integer str=itr.next();
	System.out.print(str+",");
	}

}
}