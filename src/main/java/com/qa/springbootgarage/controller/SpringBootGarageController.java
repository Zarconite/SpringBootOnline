package com.qa.springbootonline.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springbootonline.exception.ResourceNotFoundException;
import com.qa.springbootonline.model.SpringBootDataModel;

import com.qa.springbootonline.repository.*;

@RestController
@RequestMapping("/api")
public class SpringBootOnlineController {

	@Autowired
	PersonRepository myRepository;
	
	//create a person
	@PostMapping("/person")
	public SpringBootDataModel createPerson(@Valid @RequestBody SpringBootDataModel mSDM) {
	return myRepository.save(mSDM);
}
	//get a person
	@GetMapping("/person/{id}")
	public SpringBootDataModel getPersonbyID(@PathVariable(value="id")Long personID) {
		return myRepository.findById(personID).orElseThrow(()->new ResourceNotFoundException("MySpringBootDataModel","id",personID));		
	}
	
	//get all people
	@GetMapping("/person")
	public List<SpringBootDataModel> getAllPeople(){
		return myRepository.findAll();
	}
	
	//update a person
	@PutMapping("/person/{id}")
	public SpringBootDataModel updatePerson(@PathVariable(value="id") Long personID,
			@Valid @RequestBody SpringBootDataModel personDetails) {
		
		SpringBootDataModel mSDM = myRepository.findById(personID).orElseThrow(()->new ResourceNotFoundException("MySpringBootDataModel","id",personID));
		
		mSDM.setName(personDetails.getName());
		mSDM.setAddress(personDetails.getAddress());
		mSDM.setAge(personDetails.getAge());
		
		SpringBootDataModel updateData = myRepository.save(mSDM);
		return updateData;
	}
	
	//remove a person
	@DeleteMapping("/person/{id}")
	public ResponseEntity<?> deletePerson(@PathVariable(value = "id")Long personID){
		SpringBootDataModel mSDM = myRepository.findById(personID).orElseThrow(()->new ResourceNotFoundException("MySpringBootDataModel","id",personID));
		
		myRepository.delete(mSDM);
		return ResponseEntity.ok().build();
		
	}
	
}
