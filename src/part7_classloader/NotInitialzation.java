package part7_classloader;

public class NotInitialzation
{
	public static void main(String[] ar)
	{
		System.out.println(ConstClass.HELLO);
	}
}

/****
 * 
 *
 javap -verbose NotInitialzation.class 
Classfile /home/jay/workspace/UnderstandJVM/bin/class_loading/NotInitialzation.class
 
 Constant pool:
  
  #22 = String             #23            // hello world!
  #23 = Utf8               hello world!
 
 *
 *
 *
 */
