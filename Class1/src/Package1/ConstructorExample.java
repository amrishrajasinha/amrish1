package Package1;

public class ConstructorExample {
	
	String name;
	int id;
	
	ConstructorExample() {
		System.out.println("This is constructor called");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConstructorExample cc = new ConstructorExample();
		System.out.println(cc.name);
		System.out.println(cc.id);
	}

}
