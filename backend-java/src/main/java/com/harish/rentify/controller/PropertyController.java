package com.harish.rentify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.harish.rentify.entity.Property;
import com.harish.rentify.repository.PropertyRepo;

@RestController
@CrossOrigin(origins = {"http://localhost:3000/"})
public class PropertyController {
	@Autowired
	PropertyRepo pr;
	
	@PostMapping("/save")
	public String saveProperty(@RequestBody Property p)
	{	System.out.println("added"+p);
		pr.save(p);
		return "property saved";
	}
	
	@GetMapping("/getall")
	public List<Property> getAllProperties()
	{
		return pr.findAll();
	}
	

}
