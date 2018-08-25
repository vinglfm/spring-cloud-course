package com.apryshchepa.example.springcloudexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudExamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudExamplesApplication.class, args);
    }
}
