package part8_bytecode_executor;

public class StaticResolution
{
	/**
	 * invokestatic
	 */
	public static void sayHello()
	{
		System.out.println("Hello world!");
	}

	/**
	 * invokevirtual
	 */
	public void sayHello(String ar)
	{
		System.out.println("haha : " + ar);
	}

	/**
	 * invokespecial
	 * 
	 * @param ar
	 */
	private void say(String ar)
	{
		System.out.println("static : " + ar);
	}

	/**
	 * invokevirtual
	 */
	protected void say()
	{
		System.out.println("protected : ");
	}

	final public void sayHi()
	{
		System.out.println("final public");
	}

	public static void main(String[] ar)
	{

		// 编译后的字节码如下
		/****
		 * 0: invokestatic #47 // Method sayHello:()V 3: new #1 // class
		 * bytecode_executor/StaticResolution 6: dup 7: invokespecial #49 //
		 * Method "<init>":()V 10: ldc #50 // String lalala 12: invokevirtual
		 * #52 // Method sayHello:(Ljava/lang/String;)V
		 * 
		 */
		// 0: invokestatic #47 // Method sayHello:()V
		sayHello();

		// invokespecial #49 // Method "<init>":()V
		// invokevirtual #52 // Method sayHello:(Ljava/lang/String;)V
		StaticResolution s = new StaticResolution();
		s.sayHello();
		s.sayHello("lalala");
		s.say("wa");
		s.say();
		s.sayHi();
	}
}
