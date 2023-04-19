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

@RestController
@RequestMapping("/courses")
public class CourseController {

	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("")
	public String findAll(Model model)
	{
		List<Course> courses = courseService.findAll();
		model.addAttribute("courses", courses);
		return "course-list";
	}
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("theCourse") Course theCourse)
	{
		courseService.save(theCourse);
		return "redirect:/courses";
	}
}

