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
		return Arrays.asList(
				new Topic("spring","Spring Framework","Spring Framework description"),
				new Topic("java","Core Java","Core Java description"),
				new Topic("javascript","Core Javascript","Core Javascript description"),
				new Topic("react","Basic react JS","Basics of React JS description "),
				new Topic("angular","Basic Angular JS","Basics of Angular JS description")
				
				
				
				
				); 
		
	}

}
