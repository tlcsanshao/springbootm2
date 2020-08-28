package com.sanshao.basic.springbootm2.controller;

import com.sanshao.basic.springbootm2.domain.User;
import com.sanshao.basic.springbootm2.domain.UserRepository;
import com.sanshao.basic.springbootm2.mqtt.MqttPushClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WebHookController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private MqttPushClient mqttPushClient;

    @GetMapping("/hello")
    public String sendHello() {
        String kdTopic = "i love sanshao";
//        mqttPushClient.subscribe(kdTopic);
        mqttPushClient.publish(0, false, kdTopic, "15345715326");
        return "123";
    }


    @GetMapping("/test")
    public void testMongo() {
        System.out.println("test mongodb");
        User user = new User("1", "zhangsan", "123456");
        userRepository.save(user);
    }


}
