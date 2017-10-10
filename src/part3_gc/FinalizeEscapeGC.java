package part3_gc;

public class FinalizeEscapeGC
{

	public static FinalizeEscapeGC SAVE_HOOK = null;

	@Override
	protected void finalize() throws Throwable
	{
		super.finalize();
		System.out.println("finalize method executed!");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}

	public void isAlive()
	{
		System.out.println("Yes, I am still alive!");
	}

	public static void main(String[] ar) throws InterruptedException
	{
		SAVE_HOOK = new FinalizeEscapeGC();

		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(500);
		if (SAVE_HOOK != null)
		{
			SAVE_HOOK.isAlive();
		}
		else
		{
			System.out.println("No, I am dead：");
		}

		/***
		 * 因为任何一个对象的finalize()方法只会被系统自动调用一次<br>
		 * 如果对象面临下一次回收，它的finalize()方法不会再次被执行
		 */
		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(500);
		if (SAVE_HOOK != null)
		{
			SAVE_HOOK.isAlive();
		}
		else
		{
			System.out.println("No, I am dead：");
		}

	}

}
