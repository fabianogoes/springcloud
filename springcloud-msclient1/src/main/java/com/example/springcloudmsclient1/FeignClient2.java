package com.example.springcloudmsclient1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("MSCLIENT2")
public interface FeignClient2 {

	@RequestMapping(value="/api", method=RequestMethod.GET)
	String sayHyByClient2();
	
}
