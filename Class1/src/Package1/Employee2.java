package Package1;

public class Employee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee1 emp = new Employee1("Google");
		emp.empid = 100;
		emp.name = "Amrish";
		emp.companyname = "UST";
		emp.attendMeeting();
		emp.takeLeave();
		
		
		System.out.println(emp.empid);
		System.out.println(emp.name);
		System.out.println(emp.companyname);
		
		
		Employee1 emp1 = new Employee1("Amazone");
		
		emp1.empid = 100;
		emp1.name = "Amrish";
		emp1.companyname = "UST";
		emp1.attendMeeting();
		emp1.takeLeave();
		
		
		System.out.println(emp1.empid);
		System.out.println(emp1.name);
		System.out.println(emp1.companyname);
		
		
	}

}
