package cz.carbol.springstart.topic;

import javax.persistence.Entity; 

import java.util.ArrayList;


import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	private ArrayList<Topic> topics;
	
	public Course() { 
		
	}

	public Course(String id, String name, String description){
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		
		topics = new ArrayList<>();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) { 
		this.description = description;
	}

	public ArrayList<Topic> getTopics() {
		return topics;
	}

	void adTopic(Topic topic){
		
		this.topics.add(topic);
		
	}
	
void deleteTopic(Topic topic){
		
		this.topics.remove(topic);
		
	}
	
	
}
