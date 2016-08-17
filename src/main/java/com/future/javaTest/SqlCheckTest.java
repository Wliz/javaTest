package com.future.javaTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/** 
 * @ClassName: SqlCheckTest 
 * @Description: 测试sql语句中的check约束
 * @author: a9858
 * @date: 2016年8月16日 下午10:09:15  
 */
public class SqlCheckTest {

	public static void main(String[] args) throws SQLException {
//1、		createTable();
//2、		insertData(10);
		insertData(-10);
		
	}
	
	/** 
	 * @Title: insertData 
	 * @Description:插入数据
	 * @return: void
	 */
	public static void insertData(int age) throws SQLException{
		
		System.out.println("正在执行。。。");
		
		//获得和数据库的链接
		Connection conn = getConnection();
		
		//准备sql语句
		PreparedStatement ps = conn.prepareStatement("insert into newtable2 "
													+ "values"
													+ "("
													+ "1, '张三',"+ age
													+ ")");
		//执行语句
		ps.executeUpdate();
		
		System.out.println("执行结束。。。");
		
		//关闭链接
		conn.close();
	}
	
	/** 
	 * @Title: createTable 
	 * @Description: 新建一张表，并添加check约束
	 * @throws SQLException
	 * @return: void
	 */
	public static void createTable() throws SQLException{
		
		System.out.println("正在执行。。。");
		//获得和数据库的链接
		Connection conn = getConnection();
		//准备sql语句
		PreparedStatement ps = conn.prepareStatement("create table newtable2"
													+ "("
													+ "id int not null,"
													+ "name varchar(100),"
													+ "age int,"
													+ "check (age > 0)"
													+ ")");
		//preparedStetement执行更新
		ps.executeUpdate();
		
		System.out.println("执行结束。。。");
		
		//关闭链接
		conn.close();
	}
	
	/** 
	 * @Title: getConnection 
	 * @Description: 返回一个链接，用于和数据库交互
	 * @return
	 * @throws SQLException
	 * @return: Connection
	 */
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql:///mycrm", "root", "root");
	}

}
