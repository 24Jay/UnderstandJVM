

/**
 * 虚拟机栈和本地方法栈OOM测试
 * @author jay
 *
 */
public class JVMStackOF {

	private int stackLength = 1;

	public void stackLeak() {
		stackLength++;
		stackLeak();
	}

	public static void main(String[] args) throws Exception {
		JVMStackOF ovm = new JVMStackOF();
		try {
			ovm.stackLeak();
		} catch (Throwable e) {
			System.out.println("stackLength = " + ovm.stackLength);
		}
	}

}
