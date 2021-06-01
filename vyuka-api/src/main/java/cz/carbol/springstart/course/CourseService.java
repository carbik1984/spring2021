package cz.carbol.springstart.course;

import java.util.ArrayList; 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	void deleteCourseById(String id){
		
		courseRepository.deleteById(id);
	}
	
	void addCourse(Course course){
		
		courseRepository.save(course);
		
	}
	
	void updateCourse(Course course){
		courseRepository.save(course);
		
	}
	
	Course getCourse(String id){
		
		return courseRepository.findById(id).orElse(null);
		
	}
	
	List<Course> getAllCourses(String topicId){

		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	

	
	
	
}

