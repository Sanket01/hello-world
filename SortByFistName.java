package cap.org.collectionset;
import java.util.Comparator;
public class SortByFistName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpname().compareTo(o2.getEmpname())>0)
			return 1;
		else if(o1.getEmpname().compareTo(o2.getEmpname())<0)
			return -1;
			else
				return 0;
		
	}

}
