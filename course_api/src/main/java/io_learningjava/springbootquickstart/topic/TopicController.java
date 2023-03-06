package io_learningjava.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//whatever is returned by the function will be in json form and this happens due to restController annotation

@RestController
public class TopicController {
	
	//Making a dependency 
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		//The generated JSON has key names corresponding to property names of the topic class.
		//The JSON values are the values of those properties							
		return topicService.getAllTopics();
		
	}

}
