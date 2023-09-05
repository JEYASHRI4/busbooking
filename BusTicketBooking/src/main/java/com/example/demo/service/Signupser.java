package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Signup;
import com.example.demo.repository.Signuprepo;

@Service
public class Signupser {
@Autowired 
Signuprepo sr;
public Signup add(Signup d) {
	return sr.save(d);
}
public List<Signup> showdetails(Signup d){
	return sr.findAll();
}
public boolean getsignup(String email,String pass){
	return sr.existsByName(email,pass);
}
}
