package cap.org.collectionset;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Boot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet<Employee> emp=new HashSet();  //duplicate value allowed but mentioning hashcode n equals method unique will produced
		
		//LinkedHashSet<Employee> emp=new LinkedHashSet(); //it gives unique value
		/*TreeSet<Employee> emp=new TreeSet();
		emp.add(new Employee(1397,"Samar",65000,LocalDate.now()));
		emp.add(new Employee(1340,"Pam",5000,LocalDate.now()));
		emp.add(new Employee(1350,"Kuman",6000,LocalDate.of(2012,3,12)));
		emp.add(new Employee(1360,"Aaank",51000,LocalDate.of(2018,5,25)));
		emp.add(new Employee(1320,"Lnu",6500,LocalDate.now()));
		emp.add(new Employee(1360,"Jaank",51000,LocalDate.of(2018,5,25)));
		emp.add(new Employee(1320,"Rnu",6500,LocalDate.now()));
		//System.out.println(emp);
		Iterator<Employee> it=emp.iterator();
		while(it.hasNext()) {
			Employee st=it.next();
			System.out.println(st);
		}*/
		ArrayList<Employee> emp=new ArrayList();
		emp.add(new Employee(1397,"Samar",65000,LocalDate.now()));
		emp.add(new Employee(1340,"Pam",5000,LocalDate.now()));
		emp.add(new Employee(1350,"Kuman",6000,LocalDate.of(2012,3,12)));
		emp.add(new Employee(1360,"Aaank",51000,LocalDate.of(2018,5,25)));
		emp.add(new Employee(1320,"Lnu",6500,LocalDate.now()));
		emp.add(new Employee(1360,"Jaank",51000,LocalDate.of(2018,5,25)));
		emp.add(new Employee(1320,"Rnu",6500,LocalDate.now()));
		//System.out.println(emp);
		Collections.sort(emp);
		Iterator<Employee> it=emp.iterator();
		while(it.hasNext()) {
			Employee st=it.next();
			System.out.println(st);
		}
		System.out.println("=============================");
		
		
		Collections.sort(emp, new SortByFistName());
		while(it.hasNext()) {
			Employee st=it.next();
			System.out.println(st);
		}
		System.out.println("*****************");
	
	}

}
