package object_create;

public class Return_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Return_type k = new Return_type();
		
		k.addition(45,56 );
		
		int l = k.addition(25, 48, 78);
		System.out.println(l);
		
		
	}

	
	public void addition (int a,int b)
	{
		int c = a + b ;
		System.out.println(c);
	}
	
	public int addition (int a,int b,int c)
	{
		int d = a+b+c;
		System.out.println(d);
		return d;
	}

}