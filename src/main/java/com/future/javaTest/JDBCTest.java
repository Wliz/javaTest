package com.future.javaTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC测试，简单的测试 statement和prepareStatement的区别<br>
 * statement:创建时不传入参数，每次运行都要编译<br>
 * preparedStatement:创建时需要传入参数，预编译。<br>
 * 两者比较：preparedSatement效率高于statement<br>
 * @author a9858
 *
 */
public class JDBCTest {
	public static void main(String[] args) throws SQLException {
		//jdbc:mysql:///FutureCRM?useUnicode=true&characterEncoding=UTF-8
		statementTest();
		preparedStatementTest();
	}
	
	/**
	 * 测试 Statement
	 * 创建时不需要传入参数（Sql语句）
	 * @throws SQLException
	 */
	public static void statementTest() throws SQLException{
		Connection con = getConnection();
		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery("select * from news");
		while(result.next()){
			System.out.println(result.getInt("id") + " and " + result.getString("title"));
		}
		con.close();
	}
	
	/**
	 * 测试 PreparedStatement
	 * 创建时需要传入参数（Sql语句）
	 * @throws SQLException
	 */
	public static void preparedStatementTest() throws SQLException{
		Connection con = getConnection();
		
		PreparedStatement ps = con.prepareStatement("select * from announcement");
		ResultSet result = ps.executeQuery();
		while(result.next()){
			System.out.println(result.getInt("id") + "==" + result.getString("title"));
		}
		con.close();
	}
	
	/**
	 * 返回一个链接
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql:///futureCRM", "root", "root");
	}
}
