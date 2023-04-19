package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.*;

@Service
public interface StudentService {

	List<Student> findAll();

	void save(Student student);

}
