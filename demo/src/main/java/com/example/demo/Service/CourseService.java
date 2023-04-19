package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;

@Service
public interface CourseService {

	List<Course> findAll();

	void save(Course theCourse);

}
