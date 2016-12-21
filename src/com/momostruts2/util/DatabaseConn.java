package com.momostruts2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 数据库连接工具
 * 
 * @author MoYalan
 *
 */
public class DatabaseConn {

	public Connection connection = null;
	public ResultSet rs = null;
	public Statement statement = null;

	public void createConn() {
		String DRIVER = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/struts2_usermanage?user=root"
				+ "&password=root&useUnicode=true&characterEncoding=utf-8";
		if(connection == null) {
			try {
				Class.forName(DRIVER).newInstance();
				connection = DriverManager.getConnection(url);
				System.out.println("数据库连接成功！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
//	/**
//	 * 删、改、增
//	 * @param sql
//	 * @param map
//	 * @return
//	 * @throws SQLException
//	 */
//	public int update(String sql,Map<String, String> map) throws SQLException{
//		statement = connection.createStatement();
//		statement.executeUpdate(sql);
//		return 0;		
//	}
//	
//	/**
//	 * 查询
//	 * @param sql
//	 * @param map
//	 * @return
//	 * @throws SQLException
//	 */
//	public ResultSet query(String sql,Map<String, String> map) throws SQLException{
//		statement = connection.createStatement();
//		rs = statement.executeQuery(sql);
//		return rs;		
//	}

	public Connection getConn() {
		if(connection == null) {
			createConn();
		}
		return connection;
	}

	public void closeConn() {
		if(connection != null) {
			try {
				connection.close();
				connection = null;
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}
