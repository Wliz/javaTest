package com.future.javaTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public void method(){
    	Object o = new Byte((byte) 0);
    	System.out.println(o instanceof Object);
    	Integer i02 = 59;
    	Integer i03 =Integer.valueOf(59);
    	Integer i04 = new Integer(59);
    	System.out.println(i02 == i03);
    	System.out.println(i03== i04);
    	System.out.println(i02== i04);
    	
    	Long lon = 2l;
//    	System.out.println(lon == i02); 类型不同的两个引用比较会出现编译错误。
    	int i05 = 2;
    	long l2 = 2l;
    	System.out.println(i05 == l2); //类型不同的两个常量之间能比较大小
//    	if(1) 报错：Type mismatch: cannot convert from int to boolean
    	//原因是：java中的if语句条件必须是boolean，写成int类型的话不能转成boolean所以报错。
    		
    	
    }
}
