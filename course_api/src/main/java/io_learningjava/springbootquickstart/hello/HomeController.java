package io_learningjava.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This annotation tells the spring boot that this class is going to be a controller
@RestController
public class HomeController {
	//here you can have methods that can map to url requests
	
	//THis annotation takes a url as a parameter to which this function has to be mapped to 
	//THis annotation maps only get method by default to map other http methods you'll need to 
	//specify it in the annotation
	@RequestMapping("/hello")
	public String sayHi() {
		return "hii";
	}

}
