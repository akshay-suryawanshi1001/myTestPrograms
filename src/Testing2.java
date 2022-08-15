interface A{
	public void printList() ;
}
class Testing3 implements A {
	public int akshay = 10;
	public void printList() {
		System.out.println("this is from Class");
	}
	public void printAk() {
		System.out.println("this is from Class and is AK");
	}
}
public class Testing2 {
	public void printAb() {
		System.out.println("this is from Class and is AB");
	}
	public static void main(String[] args) {
		Testing3 ak = new Testing3();
		//ak.p;
	}
}
