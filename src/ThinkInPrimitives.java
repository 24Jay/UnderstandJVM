
/****
 * 参考文章:
 * https://mp.weixin.qq.com/s?__biz=MjM5NzMyMjAwMA==&mid=2651479200&idx=1&sn=dc3c2e2200d50680f0056d7edb5c1eee&chksm=bd2530df8a52b9c94869e2bdfd5c6678b76e8889efa24bc5eff4f5e3fff0bc7f9327b7a7736d&mpshare=1&scene=1&srcid=1010VCL3HWKG0mDjqfq3peGl&pass_ticket=y4nB%2BrYQrZJS5Zs34%2FxvxuYooxkTresCAxLJbVEAzFhBPjK3OSImSYCRFqjfQbf2#rd
 * 
 * @author jay
 *
 */
public class ThinkInPrimitives
{
	public static void main(String[] ar)
	{
		/***
		 * 比较double和Double内存的使用效率<br>
		 * 比较结果看出: 每一个double变量占用8个字节(64位)<br>
		 * 想比较而言, 一个Double比如n2要占用24个字节——对象的引用占8个字节<br>
		 * 对象中的double的值占8个字节，对象中对Double对象的引用占8个字节<br>
		 * 此外，Java需要使用额外的内存来支持对象的垃圾回收，但是基本类型不需要。
		 */
		// getBytesUsingPrimitives(1000);
		getBytesUsingObject(1000);
	}

	public static long getBytesUsingPrimitives(int n)
	{
		System.gc();
		long memStart = Runtime.getRuntime().freeMemory();
		double[][] a = new double[n][n];

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
				a[i][j] = Math.random();
		}
		// System.out.println(Arrays.toString(a));
		long memEnd = Runtime.getRuntime().freeMemory();

		System.out.println("memStart = " + memStart);
		System.out.println("memEnd = " + memEnd);
		System.out.println("Allocated Total Memory is : " + (memStart - memEnd) / 1024 + "kb");
		System.out.println(
				"Allocated Average Memory is : " + (memStart - memEnd) / (n * n) + "bytes");
		return memEnd - memStart;
	}

	public static long getBytesUsingObject(int n)
	{
		System.gc();
		long memStart = Runtime.getRuntime().freeMemory();
		Double[][] a = new Double[n][n];

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
				a[i][j] = Math.random();
		}

		long memEnd = Runtime.getRuntime().freeMemory();

		System.out.println("memStart = " + memStart);
		System.out.println("memEnd = " + memEnd);
		System.out.println("Allocated Total Memory is : " + (memStart - memEnd) / 1024 + "kb");
		System.out.println(
				"Allocated Average Memory is : " + (memStart - memEnd) / (n * n) + "bytes");
		return memEnd - memStart;
	}
}
