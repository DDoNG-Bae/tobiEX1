package com.dasom.ex;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoConnectionCountingTest {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		//DAO 사용코드
		User user = new User();
		user.setId("ektha3");
		user.setName("다솜");
		user.setPassword("ektha");
		
		dao.add(user);
		
		System.out.println(user.getId()+ "등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		
		
		CountingConnectionMaker ccm = context.getBean("connectionMaker",CountingConnectionMaker.class);
		System.out.println("Connection counter : "+ccm.getCounter());
	}

}
