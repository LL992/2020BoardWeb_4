package com.koreait.pjt.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface JdbcSelectInterface {
	ResultSet prepared(PreparedStatement ps) throws SQLException;
	int excuteQuery(ResultSet rs) throws SQLException;
}