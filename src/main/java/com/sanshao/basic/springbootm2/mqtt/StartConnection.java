package com.sanshao.basic.springbootm2.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartConnection implements CommandLineRunner {
    @Autowired
    MqttConfiguration mqttConfiguration;

    @Autowired
    MyCallback myCallback;

    @Autowired
    MqttPushClient mqttPushClient;

    MqttClient mqttClient;

    @Override
    public void run(String... args) throws Exception {
        connectToMqttServer();
        initSubscribe();
    }


    private void connectToMqttServer() {
        try {
            String host = mqttConfiguration.getHost();
            String clientID = mqttConfiguration.getClientid();
            String username = mqttConfiguration.getUsername();
            String password = mqttConfiguration.getPassword();
            int timeout = mqttConfiguration.getTimeout();
            int keepalive = mqttConfiguration.getKeepalive();

            mqttClient = new MqttClient(host, clientID, new MemoryPersistence());
            MqttConnectOptions options = new MqttConnectOptions();
            options.setCleanSession(true);
            options.setUserName(username);
            options.setPassword(password.toCharArray());
            options.setConnectionTimeout(timeout);
            options.setKeepAliveInterval(keepalive);
            try {
                mqttClient.setCallback(myCallback);
                mqttClient.connect(options);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    String kdTopic = "i love sanshao";

    private void initSubscribe() {
        mqttPushClient.subscribe(kdTopic);
    }


}
