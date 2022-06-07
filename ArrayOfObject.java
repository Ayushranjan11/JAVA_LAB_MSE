//ARRAY OF OBJECTS
public class ArrayOfObject {

	public static void main(String[] args) {
		//creating an array of product object
		product[] obj=new product[5];
		
		//creation & initialisation using constructor
		obj[0] = new product(23907,"Dell laptop");
		obj[1] = new product(91240,"HP 630");  
		obj[2] = new product(29823,"LG OLED TV");  
		obj[3] = new product(11908,"MI Note Pro Max 9");  
		obj[4] = new product(43590,"Kingston USB"); 
		
		
		System.out.println("Product Object 1:");  
		obj[0].display();  
		System.out.println("Product Object 2:");  
		obj[1].display();  
		System.out.println("Product Object 3:");  
		obj[2].display();  
		System.out.println("Product Object 4:");  
		obj[3].display();  
		System.out.println("Product Object 5:");  
		obj[4].display();  
	}

}

class product{
	int pro_id;
	String pro_name;
	
	//class constructor
	product(int i,String n){
		pro_id=i;
		pro_name=n;
	}
	
	public void display() {
		System.out.println(pro_id+" "+pro_name);
	}
}
