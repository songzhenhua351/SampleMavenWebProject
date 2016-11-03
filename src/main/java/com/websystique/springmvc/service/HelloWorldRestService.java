package com.websystique.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websystique.springmvc.domain.Message;
import com.websystique.springmvc.repository.HelloWorldRestRepository;

@Service
public class HelloWorldRestService {
	
	@Autowired
	HelloWorldRestRepository helloWorldRestRepository;
	
	public Message getMessageByPlayer(String player) {
		Message msg = helloWorldRestRepository.getMessageByPlayer(player);
		return msg;
	}

}