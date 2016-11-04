package com.websystique.springmvc.repository;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.domain.Message;

@Repository
public class HelloWorldRestRepository {
	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
	
	public Message getMessageByPlayer(String player) {
		
		Message msg = new Message(player, "Hello " + player);
		return msg;
	}
}
