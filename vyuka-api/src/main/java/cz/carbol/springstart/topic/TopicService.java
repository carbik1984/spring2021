package cz.carbol.springstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//komentar
@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "spring framework", "spring framework description"), new Topic("Java", "Java Core", "Java Description")));

public List<Topic> getAllTopicso(){  
		
		return topics;
	}

public Topic getTopic(String id){
	
	return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
}


public void addTopic(Topic topic) { // Request head , body
	
	topics.add(topic);   
}

public void updateTopic(String id, Topic topic) {
	
//topics.stream().filter(t -> t.getId().equals(id)).findFirst().get().setDescription(topic.getDescription());
//topics.stream().filter(t -> t.getId().equals(id)).findFirst().get().setName(topic.getName());
//topics.stream().filter(t -> t.getId().equals(id)).findFirst().get().setId(topic.getId());

	//PROC TOHLE NEFUNGUJE?
//	int index = topics.indexOf(topics.stream().filter(t -> t.getId().equals(id)).findFirst().get());
	// zkusit bez toho remove
	//topics.remove(topics.stream().filter(t -> t.getId().equals(id)).findFirst().get());
	//	topics.set(index, topic);
	
	
	for (int i = 0; i < topics.size(); i++) {
	Topic t = topics.get(i);
		
		// kdyz vime jaky, tak ho prepiseme novym z parametru metody
if (t.getId().equals(id)) {
		topics.set(i, topic);
	return;
	}
		}
}


public void deleteTopic(String id) {
	
	for (int i = 0; i < topics.size(); i++) {
		Topic t = topics.get(i);
			
		
	if (t.getId().equals(id)) {
			topics.remove(t);
		return;
		}
	
}

}

@Autowired
TopicRepository topicrepository;





}
