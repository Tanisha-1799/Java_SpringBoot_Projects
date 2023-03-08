package io_learningjava.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics=new ArrayList<>( Arrays.asList(
			new Topic("spring","Spring Framework","Spring Framework description"),
			new Topic("java","Core Java","Core Java description"),
			new Topic("javascript","Core Javascript","Core Javascript description"),
			new Topic("react","Basic react JS","Basics of React JS description "),
			new Topic("angular","Basic Angular JS","Basics of Angular JS description")
			
			
			
			
			)); 
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	

}
