/*package com.qa.garageintegration;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.PathVariable;

import com.qa.springbootblockbuster.SpringBootBlockbusterApplication;
import com.qa.springbootblockbuster.controller.SpringBootBlockbusterController;
import com.qa.springbootblockbuster.exception.ResourceNotFoundException;
import com.qa.springbootblockbuster.model.SpringBootGarageDataModelVehicle;
import com.qa.springbootblockbuster.repositories.BlockBusterRepositoryCategory;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootBlockbusterApplication.class})
//ContextConfiguration(classes = SpringBootGarageApplication.class)
@AutoConfigureMockMvc

public class IntegrationTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private BlockBusterRepositoryCategory repository;

	@Before
	public void clearDB() {
		repository.deleteAll();
	}

	// ========== Find all vehicles from database ==========
	@Test
	public void findingAndRetrievingVehiclesFromDatabase()
	throws Exception {
		repository.save(new SpringBootGarageDataModelVehicle("M12","Vector","1320KG"));
		mvc.perform(get("/api/vehicle")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content()
				.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].vehicleBrand",is("Vector")));
	}
	
	// ========== Add a vehicle to the database ==========
	@Test
	public void addAVehicleToDatabaseTest() throws Exception{
		mvc.perform(MockMvcRequestBuilders.post("/api/vehicle")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"vehicleModel\":\"M600\",\"vehicleBrand\":\"Nobel\",\"vehicleWeight\":\"975KG\"}"))
		.andExpect(status()
				.isOk())
		.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.vehicleBrand", is("Nobel")));
	}
	
	// ========== Update a vehicle in the database ==========
	@Test
	public void updateAVehicleInDatabaseTest() throws Exception{
		SpringBootGarageDataModelVehicle vehicle = new SpringBootGarageDataModelVehicle("M600","Nobel","975KG");
		repository.save(vehicle);
		
		mvc.perform(MockMvcRequestBuilders.put("/api/vehicle/"+vehicle.getVehicleID())
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"vehicleModel\":\"Elise\",\"vehicleBrand\":\"Lotus\",\"vehicleWeight\":\"880KG\"}"));
		
		mvc.perform(get("/api/vehicle/"+vehicle.getVehicleID())
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status()
				.isOk())
		.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.vehicleBrand", is("Lotus")));
	}

	// ========== Find one vehicle from database ==========
	@Test
	public void findingOneVehicleFromDatabase() throws Exception {
		SpringBootGarageDataModelVehicle vehicle = new SpringBootGarageDataModelVehicle("Fiesta","Ford","1120KG");
		repository.save(vehicle);
		
		mvc.perform(get("/api/vehicle/"+vehicle.getVehicleID())
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content()
				.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.vehicleBrand",is("Ford")));
	}

	// ========== Deleting a vehicle from database ==========
	@Test
	public void deletingAVehicleFromDatabase() throws Exception {
		SpringBootGarageDataModelVehicle vehicle = new SpringBootGarageDataModelVehicle("F50","Ferrari","1310KG");
		repository.save(vehicle);

		mvc.perform(get("/api/vehicle/"+vehicle.getVehicleID())
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content()
				.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.vehicleBrand",is("Ferrari")));
	
		mvc.perform(delete("/api/vehicle/"+vehicle.getVehicleID())
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
		
		mvc.perform(get("/api/vehicle/"+vehicle.getVehicleID())
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound());
	}
	
	// ========== Force resourceNotFound ==========
	@Test
	public void resourceNotFound() throws Exception {
		   try
		   {
			   throw new ResourceNotFoundException("Bacon","Eggs and","Sausages");
		   }
		   catch(ResourceNotFoundException testResourceNotFoundException)
		   {
		      assertEquals("Bacon not found with Eggs and : 'Sausages'", testResourceNotFoundException.getMessage());
		    }
		
	}
	
}*/
