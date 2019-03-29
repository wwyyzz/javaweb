package com.wj.mvcapp.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.wj.mvcapp.db.JdbcUtils;

public class JdbcUtilsTest {

	@Test
	public void testGetConnection() throws SQLException {
		Connection connection =JdbcUtils.getConnection();
		assertTrue(true);
		System.out.println(connection);
	}

}
