package com.dasom.ex.maker;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
	public Connection openConnection() throws ClassNotFoundException,SQLException;
}
