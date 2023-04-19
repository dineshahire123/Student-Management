package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.Course;
import com.example.demo.Repository.CourseRepository;

public class CourseServiceImpl implements CourseService {


	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	@Override
	public void save(Course  course) {
		// TODO Auto-generated method stub
	      courseRepository.save(course);
	}
	
	
	

}
