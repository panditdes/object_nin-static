package object_create;
//Object in java
public class object_call {
	int a = 5;                                 //Non-static varible
	String b = "VELOCITY";                     //Non-static varible

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		object_call k = new object_call();     //object of class

		System.out.println(k.a);               //printed of non-static variable

		System.out.println(k.b);               //printed of non-static variable

		k.demomethod();
		System.out.println("I LOVE INDIA");
	}
	public void demomethod() {
		String c = "classonline";
		System.out.println(c); 


	}


}
