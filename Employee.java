package collection;

public class Employee extends Dept implements Comparable<Employee> {

	String name;
	int eid;
	int deptno;
	double sal;
	String job;
	String manager;
	
	
	
	
	public Employee(String name, int eid, double sal, String job, String manager,int deptno,String dname,String loc) {
		super(deptno,dname,loc);
		this.name = name;
		this.eid = eid;
		
		this.sal = sal;
		this.job = job;
		this.manager = manager;
	}




	public String toString() {
		return "[Name=" + name + ", ID=" + eid  + ", Salary=" + sal + ", Job=" + job
				+ ", Manager=" + manager +", DeptNo=" + super.deptno+ "]";
	}
	
	public int compareTo(Employee o) {
		
		
		if (this.sal>o.sal) {
			return 1;
		} else if (this.sal<o.sal) {
			return -1;
		}
		return 0;
	}
	
}
