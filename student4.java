//PARAMETERIZED CONSTRUCTOR
public class student4 {
	int id;
	String name;
	
	//parameterized constructor
	student4(int i,String n){
		id=i;
		name=n;
	}
	
	//method to display
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		//creation of object
		student4 s1=new student4(23,"Ayush");
		student4 s2=new student4(48,"Gaurav");
		
		s1.display();
		s2.display();

	}

}
