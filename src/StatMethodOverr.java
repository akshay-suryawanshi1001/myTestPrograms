class Base{
	public static void display() {
		System.out.println("static diaplcay from Base");
	}
	
	public void print() {
		System.out.println("print  from Base");
	}
}
class Derived extends Base{
	public static void display() {
		System.out.println("static diaplcay from Derived");
	}
	public void print() {
		System.out.println("print  from Derived");
	}
}

public class StatMethodOverr {

	public static void main(String[] args) {
		Base b = new Derived();
		b.display();
		b.print();
	}

}
