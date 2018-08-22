package Package1;

class Teacher2 {
	
	String name="raja";
	int roll=11;
	float fee=222;
	Teacher2 (String name,int roll,float fee) {
		
		
		this.name = name;
		this.roll = roll;
		this.fee = fee;
	}
	
	void display () {
		System.out.println(name+ " " +roll+ " "+fee);
	}
}
