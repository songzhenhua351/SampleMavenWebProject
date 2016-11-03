package com.websystique.springmvc.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.websystique.springmvc.domain.Message;
import com.websystique.springmvc.service.HelloWorldRestService;
 
@RestController
public class HelloWorldRestController {
    @Autowired
    HelloWorldRestService helloWorldRestService;
 
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {
        Message msg = helloWorldRestService.getMessageByPlayer(player);
        return msg;
    } 
}
