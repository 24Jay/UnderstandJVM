package part7_classloader;

public class Resolution
{

	
	static interface Inter
	{
		public int a =1;
	}
	
	static class Sup 
	{
		public static int a =1;
	}
	
	
	class Sub extends Sup implements Inter
	{
		public Sub()
		{}
	}
	
	public static void main(String []ar)
	{
//		Sub s = new Sub();
//		System.out.println(Sub.a);
	}
	
}
