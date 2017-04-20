package part4_jconsole;

import java.util.ArrayList;
import java.util.List;

public class MonitoringTest
{
	private static byte[] holder = new byte[10 * 1014 * 1024];

	public static void fillHeap() throws InterruptedException
	{
		List<OOMObject> list = new ArrayList<OOMObject>();
		for (int i = 0; i < 1000; i++)
		{
			Thread.sleep(100);
			list.add(new OOMObject());
		}
		/**
		 * 由于还没有离开方法,所以在这里gc,无法回收内存
		 */
		// System.gc();

	}

	public static void main(String[] ra) throws InterruptedException
	{
		fillHeap();
		/**
		 * 在这里回收才可以
		 */
		 System.gc();
		System.out.println("Monitoring Test!");
		Thread.sleep(100000);
	}
}

class OOMObject
{
	public byte[] placeHolder = new byte[64 * 1024];
}
