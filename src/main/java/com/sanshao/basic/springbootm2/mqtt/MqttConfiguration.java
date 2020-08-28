package com.sanshao.basic.springbootm2.mqtt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
@PropertySource(value = {"classpath:mqtt.properties"}, ignoreResourceNotFound = true)
public class MqttConfiguration {

    @Value("${host}")
    private String host;
    @Value("${clientid}")
    private String clientid;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;
    @Value("${topic}")
    private String topic;
    @Value("${timeout}")
    private int timeout;
    @Value("${keepalive}")
    private int keepalive;

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getKeepalive() {
        return keepalive;
    }

    public void setKeepalive(int keepalive) {
        this.keepalive = keepalive;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "MqttConfiguration{" +
                "host='" + host + '\'' +
                ", clientid='" + clientid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", topic='" + topic + '\'' +
                ", timeout=" + timeout +
                ", keepalive=" + keepalive +
                '}';
    }


}

