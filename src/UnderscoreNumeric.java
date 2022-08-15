import java.io.File;
class I1{
	public void checkDemo() {
		System.out.println("this is from I1");
	}
}
class I2 extends I1{
	public void checkDemo() {
		super.checkDemo();
		//System.out.println("this is from I2");
	}
	public void checkAk() {
		System.out.println("this is from Ak");
	}
}

class UnderscoreNumeric{
	public static void main(String[] args) {
		/*I1 ak = new I2();
		ak.checkDemo();
		int num= 100_23_34;
		System.out.println(num);
		String a = "akshay";
		String b = "rohit";
		System.out.println("a is "+ a +" and b is "+b);
		a = a + b;
		System.out.println("a is " + a);
		System.out.println("index of y is " + a.indexOf('y'));
		b = a.substring(0,a.length() - b.length());
		System.out.println("b is " + b);
		a = a.substring(b.length());
		System.out.println("a is " + a);
		System.out.println("a is "+ a +" and b is "+b);
		File file = new File("D:\\");
		System.out.println(file.getTotalSpace()/(1024*1024*1024));*/
		Student s = new Student("akshay", 11L);
		
	}
}