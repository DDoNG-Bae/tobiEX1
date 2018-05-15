package com.dasom.ex;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker {
	int counter = 0;
	private ConnectionMaker realConnectionMaker;
	
	public CountingConnectionMaker(ConnectionMaker realConnectionMaker) {
		// TODO Auto-generated constructor stub
		this.realConnectionMaker=realConnectionMaker;
	}
	@Override
	public Connection openConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		this.counter++;
		return realConnectionMaker.openConnection();
	}
	
	public int getCounter() {
		return this.counter;
	}

}
