package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Schedule;
import dmacc.repository.ScheduleRepo;

/**  
* Ezra DeCleene - ecdecleene  
* CIS175 22149
* Apr 8, 2024  
*/
@Controller
public class ScheduleController {
	@Autowired
	ScheduleRepo repo;
	
	@GetMapping("/addSchedule")
	public String addSchedule(Model model) {
		Schedule schedule = new Schedule();
		model.addAttribute("newSchedule", schedule);
		return "create_schedule";
	}
	
	@PostMapping("/addSchedule")
	public String addSchedule(@ModelAttribute Schedule schedule, Model model) {
		repo.save(schedule);
		return viewSchedule(model);
	}
	
	@GetMapping("viewSchedule")
	public String viewSchedule(Model model) {
		if(repo.findAll().isEmpty()) {
			return addSchedule(model);
		}
		
		model.addAttribute("schedule", repo.findAll());
		return "schedule";
	}
	
	@PostMapping("/updateSchedule/{id}")
	public String updateSchedule(Schedule s, Model model) {
		repo.save(s);
		return viewSchedule(model);
	}
	
	@GetMapping("/editSchedule/{id}")
	public String showUpdateSchedule(@PathVariable("id") long id, Model model) {
		Schedule s = repo.findById(id).orElse(null);
		System.out.println("SCHEDULE TO EDIT: " + s.toString());
		model.addAttribute("newSchedule", s);
		return "create_schedule";
	}
	
	@GetMapping("/deleteSchedule/{id}")
	public String deleteSchedule(@PathVariable("id") long id, Model model) {
		Schedule s = repo.findById(id).orElse(null);
		repo.delete(s);
		return viewSchedule(model);
	}
}
