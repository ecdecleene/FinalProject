package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Course;
import dmacc.repository.CourseRepo;

/**  
* Ezra DeCleene - ecdecleene  
* CIS175 22149
* Apr 6, 2024  
*/
@Controller
public class CourseController {
	@Autowired
	CourseRepo repo;
	
	@GetMapping("/addCourse")
	public String addCourse(Model model) {
		Course course = new Course();
		model.addAttribute("newCourse", course);
		return "add_course";
	}
	
	@PostMapping("/addCourse")
	public String addCourse(@ModelAttribute Course course, Model model) {
		repo.save(course);
		return viewCourses(model);
	}
	
	@GetMapping({"/", "viewCourses"})
	public String viewCourses(Model model) {
		if(repo.findAll().isEmpty()) {
			return addCourse(model);
		}
		
		model.addAttribute("courses", repo.findAll());
		return "courses";
	}
	
	@PostMapping("/updateCourse/{id}")
	public String updateCourse(Course c, Model model) {
		repo.save(c);
		return viewCourses(model);
	}
	
	@GetMapping("/editCourse/{id}")
	public String showUpdateCourse(@PathVariable("id") long id, Model model) {
		Course c = repo.findById(id).orElse(null);
		System.out.println("COURSE TO EDIT: " + c.toString());
		model.addAttribute("newCourse", c);
		return "add_course";
	}
	
	@GetMapping("/deleteCourse/{id}")
	public String deleteCourse(@PathVariable("id") long id, Model model) {
		Course c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewCourses(model);
	}
}
