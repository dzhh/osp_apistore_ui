package com.osp.apistore.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 
 * @author fly
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ApiStoreUiMain {

	public static void main(String[] args) {
		SpringApplication.run(ApiStoreUiMain.class, args);
	}
}
