package part2_runtime_memory;

/**
 * 虚拟机栈和本地方法栈OOM测试
 * 
 * @author jay
 *
 */
public class JVMStackOverFlow
{

	private int stackLength = 1;

	public void stackLeak()
	{
		stackLength++;
		stackLeak();
	}

	public static void main(String[] args) throws Exception
	{
		JVMStackOverFlow ovm = new JVMStackOverFlow();
		try
		{
			ovm.stackLeak();
		}
		catch (Throwable e)
		{
			System.out.println("stackLength = " + ovm.stackLength);
			e.printStackTrace();
		}
	}

}
/***
java.lang.StackOverflowError
	at part2_runtime_memory.JVMStackOF.stackLeak(JVMStackOF.java:17)
	at part2_runtime_memory.JVMStackOF.stackLeak(JVMStackOF.java:17)
*/