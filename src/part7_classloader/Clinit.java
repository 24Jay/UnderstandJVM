package part7_classloader;

public class Clinit
{
	
	/****
	 * 如果既没有下面的static变量赋值，又没有static静态代码快<br>
	 *那么编译器不会为类生成<clinit>方法
	 */
	private static int a = 1;
	static
	{
		System.out.println(a);
	}
}
