package com.CNassets.phones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CNassets.phones.entity.Abroad;
import com.CNassets.phones.entity.Department;
import com.CNassets.phones.entity.Phone;
import com.CNassets.phones.entity.Status;
import com.CNassets.phones.service.PhoneService;

@Controller
@RequestMapping("/")
public class PhoneController {

	@Autowired
	private PhoneService phoneService;

	
	@GetMapping("/phones/list") 
	public String phonesList(Model theModel){
				
		List <Phone> thePhones = phoneService.findAll();
		
		theModel.addAttribute("phones", thePhones);
		
		return "phone/phone-list";
	}	
		
	@GetMapping("/phone/showAddForm") 
	public String showAddForm(Model theModel) {
		
		// create model attribute to bind form data
		Phone thePhone = new Phone();
				
		List<Department> theDepartment = phoneService.findAllDepartments();
		
		List<Abroad> theAbroad = phoneService.findAllAbroads();
		
		List<Status> theStatus = phoneService.findAllStatus();
		
		theModel.addAttribute("phone", thePhone);
		theModel.addAttribute("departmentsInfo", theDepartment);
		theModel.addAttribute("abroadsInfo", theAbroad);
		theModel.addAttribute("statussInfo", theStatus);
				
		return "phone/phone-form";
	}
	
	@GetMapping("/phone/showUpdateForm")
	public String showUpdateForm(@RequestParam("phoneId") int theId, 
			Model theModel) {
		
		
		Phone thePhone = phoneService.findById(theId);
	
		List<Department> theDepartment = phoneService.findAllDepartments();
		
		List<Abroad> theAbroad = phoneService.findAllAbroads();
		
		List<Status> theStatus = phoneService.findAllStatus();
		
		// set phone as a model attribute to pre-populate the form
		theModel.addAttribute("phone", thePhone);
		theModel.addAttribute("departmentsInfo", theDepartment);
		theModel.addAttribute("abroadsInfo", theAbroad);
		theModel.addAttribute("statussInfo", theStatus);
		
		
		return "phone/phone-form";
		
	}
	
	@PostMapping("/phone/save")
	public String savePhone(@ModelAttribute("phone") Phone thePhone) {
		
		
		phoneService.save(thePhone);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/phones/list";
		
	}
	
	@GetMapping("/phone/delete")
	public String delete(@RequestParam("phoneId") int theId) {
		
		
		phoneService.deleteById(theId);
		
		
		return "redirect:/phones/list";
	}
	
	@GetMapping("/phone")
	public String getPhone(@RequestParam int phoneId, Model theModel){
		
        Phone thePhones = phoneService.findByPhoneId(phoneId);
		
        theModel.addAttribute("phones", thePhones);
        
		return "phone/phone";
		
	}
	@GetMapping("/error")
	public String error() {
		
		return "/error";
	}
	
}
