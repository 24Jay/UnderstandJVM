package part2_runtime_memory;

import java.util.LinkedList;
import java.util.List;


/**
 * 由于在1.8之中，已经没有了永久代，所以这里不会出现Pergen SPace OutOfMemory
 * @author jay
 *
 */
public class RuntimeConstanPoolOutOfMemory
{
	public static void main(String[] ar)
	{
		List<String> list = new LinkedList<>();
		int i = 0;
		while (true)
		{
			list.add((i++ + "_string").intern());
			System.out.println("list.size = " + list.size());
		}
	}
}
