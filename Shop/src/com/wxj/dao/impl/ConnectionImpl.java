package com.wxj.dao.impl;


import com.sun.crypto.provider.RSACipher;
import com.sun.media.jfxmedia.control.VideoDataBuffer;
import com.wxj.dao.ConnectionDAO;
import java.sql.*;



public class ConnectionImpl implements ConnectionDAO{
	

	/*
	 * 连接数据库，得到Connection实例
	 */
	 public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "wxj123");
			if(!conn.isClosed()) {
				System.out.println("connected successful");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		return conn;
			
	}

   /*
	* 得到Statement实例
	*/	
	public Statement getStatement() {
		Statement stmt = null;
		
		try {
			stmt =  getConnection().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
   /*
	* 得到Preparedstatement实例
	*/
	public PreparedStatement getPreparedStatement(String sql) {

		PreparedStatement pstmt = null;
		
		try {
			pstmt =  getConnection().prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	   /*
		* 
		*/
	public void add(String sql) {
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = getConnection();
			stmt =  conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void delete(String sql) {
		
	}
	
	public void modify(String sql) {
		
	}
	
	public void query(String sql) {
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = getConnection();
			stmt =  conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			
		}
	}
}
