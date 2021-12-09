package com.ofss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GateWayMainApp {

	public static void main(String[] args) {
		SpringApplication.run(GateWayMainApp.class,args);
		System.out.println("Gateway api server started");

	}

}
