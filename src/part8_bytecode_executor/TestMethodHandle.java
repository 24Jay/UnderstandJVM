package part8_bytecode_executor;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class TestMethodHandle
{

	public static void main(String[] ar)
	{
		Son son = new Son();
		son.thinking();
	}
}

class GrandFather
{
	void thinking()
	{
		System.out.println("I am grandfather!");
	}
}

class Father extends GrandFather
{
	void thinking()
	{
		System.out.println("I am father!");
	}
}

class Son extends Father
{
	void thinking()
	{
//		super.thinking();
		
		
		try
		{
		/*	MethodType mt = MethodType.methodType(String.class);
			MethodHandle mh = MethodHandles.lookup().findSpecial(Object.class, "toString", mt,
					this.getClass());
			System.out.println(mh.invoke(this));*/
			
			MethodType voi = MethodType.methodType(void.class);
			
			MethodHandle hh = MethodHandles.lookup().findVirtual(GrandFather.class, "thinking", voi);
			hh.invoke();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}
}
