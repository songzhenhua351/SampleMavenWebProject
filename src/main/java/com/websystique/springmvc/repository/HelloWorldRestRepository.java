package com.websystique.springmvc.repository;

import org.springframework.stereotype.Repository;

import com.websystique.springmvc.domain.Message;

@Repository
public class HelloWorldRestRepository {

	public Message getMessageByPlayer(String player) {
		Message msg = new Message(player, "Hello " + player);
		return msg;
	}
}
