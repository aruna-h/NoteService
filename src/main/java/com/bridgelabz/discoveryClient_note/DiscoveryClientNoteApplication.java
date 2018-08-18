package com.bridgelabz.discoveryClient_note;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author bridgelabz
 * @since 10/08/2018 <br>
 *        <p>
 *        Business entity for DiscoveryClientNoteApplication <br>
 *        </p>
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name="NoteDiscoveryClient")
@EnableFeignClients
public class DiscoveryClientNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClientNoteApplication.class, args);
	}
}
