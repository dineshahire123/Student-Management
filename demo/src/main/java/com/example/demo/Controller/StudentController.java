package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.*;

import com.example.demo.Service.CourseService;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {

	
	
	@Autowired
	private StudentService studentService;
      
	
	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/")
	public String findAll(Model model)
	{
		List<Student> students = studentService.findAll();
		model.addAttribute("students", students);
		return "student-list";
	}
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("student") Student student)
	{
		studentService.save(student);
		return "redirect:/students";
	}
	

}
