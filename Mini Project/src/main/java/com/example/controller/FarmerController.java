package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.FarmerService;



@Controller
public class FarmerController {
	@Autowired
	FarmerService service;

	@RequestMapping(value="/search",method ={RequestMethod.GET,RequestMethod.POST} )
	public String searchAllByName(Model model,@RequestParam String name) {
		model.addAttribute("farmers", service.findAllByName(name));
		System.out.println(service.findAllByName(name));
		return "all-farmers.html";
	}


	@GetMapping("/delete/{id}")
	public String deleteFarmer(@PathVariable("id") int farmerId) {
		 service.deleteById(farmerId);
		return "redirect:/";
	}

	@GetMapping("/")
	@ResponseBody
	public String index(){
		return "hello world";
	}

}
