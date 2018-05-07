package com.wxj.dao;

import java.sql.*;



public interface ConnectionDAO {
	public Connection getConnection();
	public Statement getStatement();
}
