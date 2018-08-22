package Package1;

class ConstructorExample2 {
	
	String name;
	int id;
	ConstructorExample2(String a, int b) {
		
		name = a;
		id = b;
	}
	
	void display () {
		
		System.out.println(name + " " +id);
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample2 cc1 = new ConstructorExample2("Amrish", 1001);
		ConstructorExample2 cc2 = new ConstructorExample2("Rishi", 1002);
		cc1.display();
		cc2.display();
		
	}
}

