package com.example.springcloudmsclient2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestService {

	@GetMapping
	public ResponseEntity<String> sayHy(){
		return new ResponseEntity<>("Hy by msclient2", HttpStatus.OK);
	}
	
}
