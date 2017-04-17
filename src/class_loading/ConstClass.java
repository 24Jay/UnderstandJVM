package class_loading;

public class ConstClass
{
	public static final String HELLO = "hello world!";
	static
	{
		System.out.println("ConstClass init!");
	}

}
