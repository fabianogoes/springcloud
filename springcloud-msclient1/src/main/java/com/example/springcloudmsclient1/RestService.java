package com.example.springcloudmsclient1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestService {

	@Autowired
	private FeignClient2 feignClient2;
	
	@GetMapping
	public ResponseEntity<String> sayHy(){
		return new ResponseEntity<>(feignClient2.sayHyByClient2() +" using msclient1", HttpStatus.OK);
	}
	
}
