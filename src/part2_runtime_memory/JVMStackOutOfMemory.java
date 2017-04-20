package part2_runtime_memory;


/***
 
 * @author jay
 *
 */
public class JVMStackOutOfMemory
{
	public static int count = 0;

	private void dontStop()
	{
		while (true)
		{

		}
	}

	public void stackLeakThread()
	{
		while (count < 100000)
		{
			Thread thread = new Thread(new Runnable()
			{

				@Override
				public void run()
				{
					System.out.println("ThreadCount = " + count++);
					dontStop();
				}
			});

			thread.start();
		}
	}

	public static void main(String[] args)
	{

		JVMStackOutOfMemory oom = new JVMStackOutOfMemory();
		oom.stackLeakThread();

	}
}
