package bytecode;

public class TestContantPool
{

	private static String a = "1234";

	final String x = "34";

	final String y;

	public TestContantPool()
	{
		y = "34";
	}

	public void test()
	{
		String b = "1234";
		String c = "12" + "34";
		String d = new String("12345");
		final String e = "34";
		String f = "34";
		String g = "12" + e;
		String h = "12" + f;
		String i = "12" + x;
		String j = "12" + y;

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a != d);
		System.out.println(a == g);
		System.out.println(a != h && a == h.intern());
		System.out.println(a == i && a == i.intern());
		System.out.println(a != j && a == j.intern());
		System.out.println(h.intern() == i.intern());

	}

	public static void main(String[] ar)
	{
		new TestContantPool().test();
	}
}

/**
 * true true true true true true true
 */