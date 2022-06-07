//CONSTRUCTOR OVERLOADING
public class student3 {
	int id;
	String name;
	int age;
	
	//constructor with 2 parameters
	student3(int i,String n){
		id=i;
		name=n;
	}
	
	//constructor with 3 parameters
	student3(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		student3 s1=new student3(23,"Ayush");
		student3 s2=new student3(48,"Gaurav",21);
		
		s1.display();
		s2.display();

	}

}
