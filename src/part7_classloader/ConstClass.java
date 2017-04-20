package part7_classloader;

public class ConstClass
{
	public static final String HELLO = "hello world!";
	static
	{
		System.out.println("ConstClass init!");
	}

}
