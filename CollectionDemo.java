package org.cap.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {

	
	public static void main(String[] args) {
		
//ArrayList list=new ArrayList<>(); //it can access iterable,collection,list and arraylist method
		
	List lst=new ArrayList<>();	//it can access iterable,collection,list  method
	//Collection lst =new ArrayList<>(); //it can access iterable,collection method
//	Iterable lst=new ArrayList<>(); //it can access iterable method
	
	lst.add(3);
	lst.add("Tom");
	lst.add(45.89);
	lst.add(48555695522l);
	lst.add(new Object());
	lst.add(3);
	lst.add("Tom");
	lst.add(45.89);
	lst.add(48555695522l);
	lst.add(null);
	System.out.println(lst);
	System.out.println(lst.get(2));
	System.out.println();
	List<Integer> lst1=new ArrayList();
	lst1.add(25);
	//lst1.add("hii"); 
	}

}
