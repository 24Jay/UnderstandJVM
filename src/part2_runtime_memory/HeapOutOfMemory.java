package part2_runtime_memory;

import java.util.ArrayList;
import java.util.List;

/***
 * -Xms10m
 * -Xmx10m
 * @author jay
 *
 */
public class HeapOutOfMemory
{
	static class OOMObject
	{

	}

	public static void main(String[] args)
	{
		List<OOMObject> list = new ArrayList<OOMObject>();
		int i = 0;
		while (true)
		{
			System.out.println(i++);
			list.add(new OOMObject());
		}
	}
}

/**
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space at
 * java.util.Arrays.copyOf(Arrays.java:3181) at
 * java.util.ArrayList.grow(ArrayList.java:261) at
 * java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235) at
 * java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227) at
 * java.util.ArrayList.add(ArrayList.java:458) at
 * HeapOverflowTest.main(HeapOverflowTest.java:23)
 */
