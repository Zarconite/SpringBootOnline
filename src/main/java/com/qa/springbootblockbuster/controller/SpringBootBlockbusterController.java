package com.qa.springbootblockbuster.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.qa.springbootblockbuster.exception.ResourceNotFoundException;
import com.qa.springbootblockbuster.model.SpringBootBlockBusterDataModelActorInfo;
import com.qa.springbootblockbuster.model.SpringBootBlockBusterDataModelCategory;
import com.qa.springbootblockbuster.model.SpringBootBlockBusterDataModelFilmList;
import com.qa.springbootblockbuster.repositories.*;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
@RequestMapping("/api")
public class SpringBootBlockbusterController {

	@Autowired
	BlockBusterRepositoryCategory categoryRepository;
	@Autowired
	BlockBusterRepositoryFilmList filmListRepository;
	@Autowired
	BlockBusterRepositoryActorInfo actorInfoRepository;
	
/*		//create an (x)
	@PostMapping("/category")
	public SpringBootBlockBusterDataModelCategory createCategory(@Valid @RequestBody SpringBootBlockBusterDataModelCategory mSDM) {
	return categoryRepository.save(mSDM);
}
	@PostMapping("/filmlist")
	public SpringBootBlockBusterDataModelFilmList createFilmList(@Valid @RequestBody SpringBootBlockBusterDataModelFilmList mSDM) {
	return filmListRepository.save(mSDM);
}*/
	
	//get an (x)
	@GetMapping("/category/{id}")
	public SpringBootBlockBusterDataModelCategory getCategoryID(@PathVariable("id") Long categoryID) {
		return categoryRepository.findById(categoryID).orElseThrow(()->new ResourceNotFoundException("SpringBootBlockBusterDataModelCategory","categoryID",categoryID));		
	}
	@GetMapping("/filmlist/{id}")
	public SpringBootBlockBusterDataModelFilmList getFilm_ListID(@PathVariable("id") Long film_ListID) {
		return filmListRepository.findById(film_ListID).orElseThrow(()->new ResourceNotFoundException("SpringBootBlockBusterDataModelFilmList","film_ListID",film_ListID));		
	}
	@GetMapping("/actorinfo/{id}")
	public SpringBootBlockBusterDataModelActorInfo getActorID(@PathVariable("id") Long actorID) {
		return actorInfoRepository.findById(actorID).orElseThrow(()->new ResourceNotFoundException("SpringBootBlockBusterDataModelFilmList","actorID",actorID));		
	}
	@GetMapping("/filmlist/category/{category}")
	public List<SpringBootBlockBusterDataModelFilmList> getFilm_Category(@PathVariable("category") String film_Category) {
		
		if(filmListRepository.findByFilmCategory(film_Category) == null) {
		throw new ResourceNotFoundException("SpringBootBlockBusterDataModelFilmList","film_Category",film_Category);	
		}
		return filmListRepository.findByFilmCategory(film_Category);
	}		
	@GetMapping("/filmlist/title/{title}")
	public List<SpringBootBlockBusterDataModelFilmList> getFilmTitle(@PathVariable("title") String filmTitle) {
		
		if(filmListRepository.findByFilmCategory(filmTitle) == null) {
		throw new ResourceNotFoundException("SpringBootBlockBusterDataModelFilmList","filmTitle",filmTitle);	
		}
		return filmListRepository.findByFilmCategory(filmTitle);
	}		
	
	//get all (x)
	@GetMapping("/category")
	public List<SpringBootBlockBusterDataModelCategory> getAllCategories(){
		return categoryRepository.findAll();
	}
	@GetMapping("/filmlist")
	public List<SpringBootBlockBusterDataModelFilmList> getAllFilmLists(){
		return filmListRepository.findAll();
	}
	@GetMapping("/actorinfo")
	public List<SpringBootBlockBusterDataModelActorInfo> getAllActorIDs(){
		return actorInfoRepository.findAll();
	}

/*	//update an (x)
	@PutMapping("/category/{id}")
	public SpringBootBlockBusterDataModelCategory updateCategory(@PathVariable("id") Long categoryID,
			@Valid @RequestBody SpringBootBlockBusterDataModelCategory vehicleDetails) {
		SpringBootBlockBusterDataModelCategory mSDM = categoryRepository.findById(categoryID).orElseThrow(()->new ResourceNotFoundException("SpringBootGarageDataModelVehicle","categoryID",categoryID));
		
		mSDM.setCategoryName(vehicleDetails.getCategoryName());
		mSDM.setLastUpdate(vehicleDetails.getLastUpdate());
		
		SpringBootBlockBusterDataModelCategory updateData = categoryRepository.save(mSDM);
		return updateData;
	}
	
	//remove an (x)
	@DeleteMapping("/category/{id}")
	public ResponseEntity<?> deleteVehicle(@PathVariable("id") Long categoryID){
		SpringBootBlockBusterDataModelCategory mSDM = categoryRepository.findById(categoryID).orElseThrow(()->new ResourceNotFoundException("SpringBootGarageDataModelVehicle","categoryID",categoryID));
		
		categoryRepository.delete(mSDM);
		return ResponseEntity.ok().build();
		
	}*/
	
}
