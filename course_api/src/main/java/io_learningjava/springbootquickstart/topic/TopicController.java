package io_learningjava.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
		
	}
	
	//Making a post request
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		
	}
	
	//Update Api
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(id,topic);
		
	}
	
	//Delete Api
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
		public void deleteTopic(@PathVariable String id) {
			topicService.deleteTopic(id);
			
		}
	

}
