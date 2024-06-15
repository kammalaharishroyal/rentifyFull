package com.harish.rentify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harish.rentify.entity.User;
import com.harish.rentify.repository.UserRepo;

@RestController
@CrossOrigin(origins = {"http://localhost:3000/"})
public class RegisterController {
	
	@Autowired
	private UserRepo ur;
	
	@PostMapping("/register")
	public String register(@RequestBody User u)
	{
		ur.save(u);
		return "resgistered successfully";
	}
	@GetMapping("/userAll")
	public List<User> getAll()
	{
		return ur.findAll();
	}
	
	
	 

}
