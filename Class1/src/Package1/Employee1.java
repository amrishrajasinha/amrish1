package Package1;

public class Employee1 {
	
	String name;
	int empid;
	String companyname;
	
	public Employee1(String cName) {
		
		companyname = cName;
		System.out.println("Constructor of employee is called for value :  " +companyname);
	
	}
	
	public Employee1(String cName, String eName, int eid) {
		
		name = eName;
		empid = eid;
		companyname = cName;
		
	}
	
	public void attendMeeting () {
		System.out.println("ID " + empid +" is attending meeting");
	}
	
	public void takeLeave () {
		System.out.println("ID  " + empid + " is on leave today");
		
	}
	

}
