package part9;

import java.awt.SystemTray;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/***
 * 动态代理
 * @author jay
 *
 */
public class DynamicProxyTest
{

	interface IHello
	{
		void sayHello();
	}

	static class Hello implements IHello
	{

		@Override
		public void sayHello()
		{
			System.out.println("Hello World!");
		}

	}

	static class DynamicProxy implements InvocationHandler
	{
		Object originalObj;

		Object bind(Object obj)
		{
			this.originalObj = obj;
			return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(),
					originalObj.getClass().getInterfaces(), this);
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
		{
			System.out.println("welcome");
			return method.invoke(originalObj, args);
		}

		public static void main(String[] ar)
		{

			IHello hello = (IHello) new DynamicProxy().bind(new Hello());

			hello.sayHello();
		}
	}

}
