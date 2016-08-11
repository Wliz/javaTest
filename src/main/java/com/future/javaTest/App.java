package com.future.javaTest;

/**
 * Hello world!
 *
 */
public class App 
{
	static int a = 1;
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        a = 2;
//        System.out.println(a);
//        final String sex1 = "男";
//        System.out.println(sex1);
//        
    	
//    	String x = "fmn";
//    	String z = x.toUpperCase();
//    	System.out.println(x);
//    	System.out.println(z);
//    	String y = x.replace("f", "F");
//    	
//    	y += "wxy";
//    	System.out.println(y);
    	
    	
//    	Object o = new Object(){
//    		public boolean equals(Object obj){
//    			return true;
//    		}
//    	};
    	
//    	System.out.println(o.equals("fadsfasdf"));
    	
//    	Object o=new Object(){
//	    		public boolean equals(Object obj){
//	    			return true;
//	    		}
//    		}; 
//    		System.out.println(o.equals(""));
    	int result = fact(5);
    	System.out.println(result);
    	
    }
    
    static int fact(int n){
    	if(n == 1){
    		return 1;
    	}else{
    		return n* fact(n - 1);
    	}
    }
}
