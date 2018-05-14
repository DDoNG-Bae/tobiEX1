package com.dasom.ex;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
	public Connection openConnection() throws ClassNotFoundException,SQLException;
}
