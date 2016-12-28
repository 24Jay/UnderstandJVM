

/**
 * Creted by Administrator on 2016/11/16.
 *
 * 《Understanding the JVM》Page.93 ：新生代Minor GC
 */
public class TestAllocation
{
	private static final int _1MB = 1024 * 1024;

	public static void main(String[] args)
	{
		byte[] allo1, allo2, allo3, allo4;
		allo1 = new byte[2 * _1MB];
		allo2 = new byte[2 * _1MB];
		allo3 = new byte[2 * _1MB];
		allo4 = new byte[4 * _1MB];
	}
}
