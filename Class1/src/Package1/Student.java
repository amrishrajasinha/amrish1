package Package1;

public class Student {
	
	
	String name;
	int rollnumber;
	String section;
	
	Student (String name, int rollnumber){
		
		this.name=name;
		this.rollnumber=rollnumber;
		System.out.println("My name is  "+ name + "My Roll Numbner is  "+ rollnumber);
	
		
	}
	
	
	
	Student (String name,int rollnumber,String section){
		
		this.name=name;
		this.rollnumber=rollnumber;
		this.section=section;
		
		System.out.println("My name is  " + name + " My Roll Numbner is  " + rollnumber + "My section is " + section );
	}
	
	void display() {
		System.out.println(name +rollnumber +section);
	}
		

	}

	


