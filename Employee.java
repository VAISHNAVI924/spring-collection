package collections;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class Employee {
	private int id;
	private String name;
	List<Integer>employeeid;
	Set<String>employeename;
	Map<Integer,String>employeeidname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(List<Integer> employeeid) {
		this.employeeid = employeeid;
	}
	public Set<String> getEmployeename() {
		return employeename;
	}
	public void setEmployeename(Set<String> employeename) {
		this.employeename = employeename;
	}
	public Map<Integer, String> getEmployeeidname() {
		return employeeidname;
	}
	public void setEmployeeidname(Map<Integer, String> employeeidname) {
		this.employeeidname = employeeidname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", employeeid=" + employeeid + ", employeename=" + employeename
				+ ", employeeidname=" + employeeidname + "]";
	}
	

}
