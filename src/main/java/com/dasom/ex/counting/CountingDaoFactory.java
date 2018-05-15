package com.dasom.ex.counting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dasom.ex.maker.ConnectionMaker;
import com.dasom.ex.maker.SimpleConnectionMaker;

@Configuration
public class CountingDaoFactory {
	@Bean
	public UserDao userDao() {
		return new UserDao(connectionMaker());
	}
	
	@Bean
	public ConnectionMaker connectionMaker() {
		return new CountingConnectionMaker(realConnectionMaker());
	}
	@Bean
	public ConnectionMaker realConnectionMaker() {
		return new SimpleConnectionMaker();
	}
}
