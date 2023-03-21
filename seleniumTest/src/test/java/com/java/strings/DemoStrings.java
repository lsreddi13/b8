package com.java.strings;

public class DemoStrings {
	public static void main(String[] args) {
		/*
		 * String course = "Selenium"; int a = course.length();
		 * 
		 * String s= new String("Hello"); s.concat("Java"); System.out.println(s);//
		 * prints Hello
		 */		
		String a="nikhil";     // it stores in String constant pool
	    String s1=new String("nikhil");    //with new stores in heap
	    System.out.println(Integer.toHexString(System.identityHashCode(a)));
	    System.out.println(Integer.toHexString(System.identityHashCode(s1)));
	    
	    String ob = new String("Hello");
	    System.out.println(ob);
	    
	    String s = "foo";
        System.out.println("1: " + s);
        System.out.println("2: " + s.toString());
        System.out.println("3: " + DemoStrings.mimicObjectToString(s));
	}
	public static String mimicObjectToString(Object o)
    {
        //prevent a NullPointerException by returning null if o is null
        String result = null;
        if (o !=null)
        {
            result = o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
        }
        return  result;
    }
}
