package com.dasom.ex;

public class DaoFactory {
	public UserDao userDao() {
		return new UserDao(connectionMaker());
	}
	
	public ConnectionMaker connectionMaker() {
		return new SimpleConnectionMaker();
	}
}