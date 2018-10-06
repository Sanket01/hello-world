package cap.org.collectionset;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
private int empid;
private String empname;
private long salary;
private LocalDate ldate;

Employee(){
	
}

	public Employee(int empid, String empname, long salary, LocalDate ldate) {
	this.empid = empid;
	this.empname = empname;
	this.salary = salary;
	this.ldate = ldate;
}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public LocalDate getLdate() {
		return ldate;
	}

	public void setLdate(LocalDate ldate) {
		this.ldate = ldate;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", ldate=" + ldate + "]";
	}
/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		result = prime * result + ((ldate == null) ? 0 : ldate.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (ldate == null) {
			if (other.ldate != null)
				return false;
		} else if (!ldate.equals(other.ldate))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
*/	
@Override
public int compareTo(Employee em) {
	// TODO Auto-generated method stub
	if(this.getEmpid()>em.getEmpid())
		return 1;
	else if(this.getEmpid()<em.getEmpid())
		return -1;
		else
			return 0;
	
	
}
	//sORTED A/C TO
	/*
@Override
public int compareTo(Employee em) {
	// TODO Auto-generated method stub
	if(this.getEmpname().compareTo(em.getEmpname())>0)
		return 1;
	else if(this.getEmpname().compareTo(em.getEmpname())<0)
		return -1;
		else
			return 0;
	
	
}*/

}
