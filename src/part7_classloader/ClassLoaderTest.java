package part7_classloader;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest
{
	public static void main(String[] ar)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		ClassLoader loader = new ClassLoader()
		{

			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException
			{
				try
				{
					String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
//					System.out.println(System.getProperty());
					InputStream in = getClass().getResourceAsStream(
							"/home/jay/workspace/UnderstandJVM/bin/classloading/ClassLoaderTest.class");
					if (in == null)
					{
						return super.loadClass(fileName);
					}
					byte[] b = new byte[in.available()];
					in.read(b);
					return defineClass(fileName, b, 0, b.length);
				}
				catch (IOException e)
				{
					throw new ClassNotFoundException();
				}

			}

		};

		Object obj = loader.loadClass("classloading.ClassLoaderTest").newInstance();

		System.out.print(obj.getClass());
		System.out.println(obj instanceof part7_classloader.ClassLoaderTest);
	}
}
