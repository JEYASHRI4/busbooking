package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Signup;
import com.example.demo.service.Signupser;

@RestController
@CrossOrigin
public class Signupcon {
@Autowired
Signupser ss;
@PostMapping("addsignup")
public Signup adddetails(@RequestBody Signup d) {
	return ss.add(d);
}
@GetMapping("dispsignup")
public List<Signup> show( Signup d) {
	return ss.showdetails(d);
}
@GetMapping("getsignup/{emailid}/{password}")
public boolean login(@PathVariable String emailid,@PathVariable String password){
	return ss.getsignup(emailid, password);
	
}
}
