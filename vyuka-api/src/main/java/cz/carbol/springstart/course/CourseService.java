package cz.carbol.springstart.course;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courserepository;

	void deleteCourseById(String id){
		
		courserepository.deleteById(id);
	}
	
	void addCourse(Course course){
		
		courserepository.save(course);
		
	}
	
	void updateCourse(Course course){
		courserepository.save(course);
		
	}
	
	Course getCourse(String id){
		
		return courserepository.findById(id).orElse(null);
		
	}
	
	ArrayList<Course> getAllCourses(){
		
		ArrayList<Course> courseList = new ArrayList<>();
	courserepository.findAll().forEach(courseList :: add);
	return courseList;
	}
	

	
	
	
}

