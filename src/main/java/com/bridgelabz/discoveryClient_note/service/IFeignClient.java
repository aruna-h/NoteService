package com.bridgelabz.discoveryClient_note.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
/**
 * @author bridgelabz
 * @since 13/08/2018 <br>
 *        <p>
 *        Business entity for IFeignClient <br>
 *        </p>
 */
@FeignClient(name = "UserDiscoveryClient", url = "http://localhost:8081")
@Service
public interface IFeignClient {
	@GetMapping(value = "user/allUsers")
	public List<?> getAllUsers();
}
