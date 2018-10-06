package org.cap.demo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class ArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<String> lst=new ArrayList();
		//Vector<String> lst=new Vector();
		lst.add("Tom");
	
		lst.add("mon");
		lst.add("Tom");
		
		lst.add("mon");
		
	/*	//enumeration methdo for vector 
		Enumeration<String> enm=lst.elements();
		while(enm.hasMoreElements()) {
			String ch=enm.nextElement();
			System.out.print(ch+"->");
		}*/
		System.out.println();
		//enhanced loop
		for(String st:lst) {
			System.out.print(st+", ");
		}
	System.out.println();
	//Iterator method forward traversal
	Iterator<String> itr=lst.iterator();
	while(itr.hasNext()) {
		String str=itr.next();
		if(str.equals("Tom")) {
			itr.remove();
			//itr.add("jasmin");
		}
		System.out.print(str+",");
	}
	System.out.println();
	//List Iterator both traversal f/w and b/w only for 
	ListIterator<String> lstitr=lst.listIterator();
	while(lstitr.hasNext()) {
		String s=lstitr.next();
		if(s.equals("mon")) {
		//	lstitr.remove();
			lstitr.set("jasmin");
			//itr.add("jasmin");
		}
		System.out.print(s+"-->");
	}
	System.out.println();
	//backward traversal 1st need forward traversal to reach last element 
	while(lstitr.hasPrevious()) {
		String s=lstitr.previous();
		System.out.print(s+"-->");
	}
	System.out.println("********************");
	
	ArrayList<String> ar1=new ArrayList();
	ar1.add("hii");
	ar1.add("hello");
	lst.addAll(ar1);
	for(String st:lst) {
		System.out.print(st+", ");
	}
	System.out.println(lst.size()); //8
	System.out.println(lst.contains("hoo")); //false
	//ar1.clear(); //clear all element
	System.out.println(ar1.isEmpty()); //true
	lst.set(1,"capg"); //replace 1 index with capg
	System.out.println(lst);
	lst.toArray();
	System.out.println(lst);
	lst.add(4,"mipl");  //inserting mipl at 4th position
	System.out.println(lst);
	ar1.add("good");
	lst.addAll(5, ar1); //inserting ar1 starting with 5th index
	System.out.println(lst);
	System.out.println(lst.containsAll(ar1)); //true
	ar1.ensureCapacity(4);
	System.out.println(ar1);
	System.out.println(lst.equals(ar1)); //false
	System.out.println(lst.indexOf("hii")); //5
	System.out.println(lst.lastIndexOf("hii")); //10
	System.out.println(lst.listIterator(2));
	System.out.println(lst.subList(3,9));
	System.out.println(lst.size()); //12
	lst.remove(2);
	System.out.println(lst); //11
	lst.removeAll(ar1);
	System.out.println(lst);
	System.out.println(lst.size());
	lst.trimToSize();
	System.out.println(lst);
	String sy="zoo";
	lst.set(3,"Capgemini");  //replace the string at index 3 with Capgemini
	System.out.println(lst);
Spliterator<String> spt=lst.spliterator();
System.out.println(spt.SIZED);
System.out.println(spt.SORTED);
List<String> ls2=(List<String>) lst.clone();
for(String st2:ls2) {
	System.out.print(st2+", ");
}
System.out.println();
Object[] ob=lst.toArray();
for(Object st:ob) {
	System.out.print(st+"-> ");
}
System.out.println();
System.out.println();
	}

}
