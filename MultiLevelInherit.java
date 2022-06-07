
public class MultiLevelInherit {

	public static void main(String[] args) {
		cat c=new cat();
		c.action();
		c.bark();
		c.eat();

	}

}

class animal{
	void eat() {
		System.out.println("Eating..");
	}
}

class dog extends animal{
	void bark() {
		System.out.println("Barking..");
	}
}

class cat extends dog{
	void action() {
		System.out.println("sleeping..");
	}
}
