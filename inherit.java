//SIMPLE INHERITANCE
public class inherit {

	public static void main(String[] args) {
		programmer p = new programmer();
		 int sal=p.salary;
		 int bon=p.bonus;
		
		System.out.println(sal+" "+bon);

	}

}

class employee{
	int salary=150000;
}

class programmer extends employee{
	int bonus=20000;
}
