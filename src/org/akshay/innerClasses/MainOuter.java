package org.akshay.innerClasses;

class OuterClass{
	int x = 10;
	static private int i=20; 
	int ab = new InnerClass().y; //here i can access members of inner class
	int ac = new SecondInnerClass().z; //here i can access members of static inner class also
	int l = 1000;
	
	void show() {
		InnerClass abc = new InnerClass();
		System.out.println(abc.j); //accessing inner class code from instance area of outer class
	}
	
	//also i can make my inner classes private if I dont want any other class to access them except my OuterClass
	class InnerClass{
		//we cannot declare static members inside non static inner classes
		int y =12; //non static inner class cannot have anything in static declaration exception is static final variable
		int k = x;//here i can access members of outerclass
		int j = i;//here i can even access static members of outer class
		int l = 100;
		public void show() {
			int l=10;
			System.out.println("local method var l is : "+ l); //10
			System.out.println("instance var l of InnerClass class is :" + this.l); // 100 use this keyword or InnerClass.this
			System.out.println("instance var l of OuterClass class is :" + OuterClass.this.l); // 100 user Outer.this.varName
		}
	}
	
	 static class SecondInnerClass{
		//here this static class can access only i i.e. static variables of outer class(even if it is private) and not x i.e.instance var of outer class
		 int z=13;
		void showOuterClassVar() {
			System.out.println("value of the only static var in outer class is : " + i);//gives error when x is accessed
		}
	}
	
	static void outerClassMethod() {
		System.out.println("here i can only access the static members of this class and not no-static members");
	}
}

public class MainOuter {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		System.out.println("x in the outer is : " + outer.x);
		
		//here to access inner class we must create object of outer class first
		OuterClass.InnerClass inner = outer.new InnerClass(); //alternative is = new OuterClass().new InnerClass();
		System.out.println("y in the inner class is :" + inner.y + " and value of static var i in outer class is :" + inner.j);
		inner.show();
		
		//static inner class can be accessed even without creating object of outer class
		//and static inner class cannot access non-static members of outer class i.e. check method in static inner class
		OuterClass.SecondInnerClass secondInner = new OuterClass.SecondInnerClass();
		secondInner.showOuterClassVar();
	}

}
