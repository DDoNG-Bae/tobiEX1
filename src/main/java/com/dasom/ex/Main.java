package com.dasom.ex;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		UserDao dao = new UserDao(new SimpleConnectionMaker());
		
		User user = new User();
		user.setId("ektha1");
		user.setName("다솜");
		user.setPassword("ektha");
		
		dao.add(user);
		
		System.out.println(user.getId()+ "등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
	}

}
