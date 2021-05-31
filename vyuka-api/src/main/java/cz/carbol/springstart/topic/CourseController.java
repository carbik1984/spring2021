package cz.carbol.springstart.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController { 
	
@Autowired
private CourseService courseservice;


@RequestMapping(value = "/courseList", method = RequestMethod.POST)
void addCourse(@RequestBody Course course){
	courseservice.addCourse(course);
}

@RequestMapping(value = "courseList/{id}", method = RequestMethod.GET)	 
Course getCourseById(@PathVariable String id){
	
	return courseservice.getCourse(id);

}

@RequestMapping(value = "/courseList", method = RequestMethod.PUT)
void upadateCourse(@RequestBody Course course){
	
	courseservice.updateCourse(course);
	
}

@RequestMapping(value = "courseList/{id}", method = RequestMethod.DELETE)
void deleteCourse(@PathVariable String id){
	
	courseservice.deleteCourseById(id);
	
}

@RequestMapping(value = "courseList/{id}", method = RequestMethod.POST)	 
void addTopic(@PathVariable String id, @RequestBody Topic topic){ 
	
	courseservice.getCourse(id).adTopic(topic);

}

@RequestMapping(value = "courseList/{id}", method = RequestMethod.POST)	 
void deleteTopic(@PathVariable String id, @RequestBody Topic topic){ 
	
	courseservice.getCourse(id).deleteTopic(topic);

}


}
