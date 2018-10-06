package cap.org.collectionset;

public class Customer implements Comparable<Customer> {
private int cid;
private String cname;



public Customer() {
	super();
}


public Customer(int cid, String cname) {
	super();
	this.cid = cid;
	this.cname = cname;

}


public int getCid() {
	return cid;
}


public void setCid(int cid) {
	this.cid = cid;
}


public String getCname() {
	return cname;
}


public void setCname(String cname) {
	this.cname = cname;
}


@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + "]";
}

/*
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + cid;
	result = prime * result + ((cname == null) ? 0 : cname.hashCode());
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
	Customer other = (Customer) obj;
	if (cid != other.cid)
		return false;
	if (cname == null) {
		if (other.cname != null)
			return false;
	} else if (!cname.equals(other.cname))
		return false;
	return true;
}
*/

@Override
public int compareTo(Customer o) {
	// TODO Auto-generated method stub
	if(this.getCid()>o.getCid())
		return 0;
	else if(this.getCid()<o.getCid())
		return -1;
	else
	return 0;
}




}
