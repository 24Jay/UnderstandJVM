package part6_bytecode;

import java.util.Arrays;

public class ThinkInConstantPool
{

	public static void main(String []ar)
	{
		String s = new String("1");
	    s = s.intern();
	    String s2 = "1";
	    System.out.println(s == s2);
	 
	    String s3 = new String("1") + new String("1");
	    s3.intern();
	    String s4 = "11";

	    System.out.println(s3 == s4);
	    
	}
	
	
}
