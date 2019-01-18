/*package com.qa.garagerepository;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.springbootblockbuster.SpringBootBlockbusterApplication;
import com.qa.springbootblockbuster.model.SpringBootGarageDataModelVehicle;
import com.qa.springbootblockbuster.repositories.BlockBusterRepositoryCategory;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {SpringBootGarageApplication.class})
@ContextConfiguration(classes = SpringBootBlockbusterApplication.class)
@DataJpaTest
public class RepositoryTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private BlockBusterRepositoryCategory MyRepo;
	
	@Test
	public void retrieveByIdTest() {
		SpringBootGarageDataModelVehicle model1 = new SpringBootGarageDataModelVehicle("Elise","Lotus","880KG");
	entityManager.persist(model1);
	entityManager.flush();
	assertTrue(MyRepo.findById(model1.getVehicleID()).isPresent());
	}
	
}*/
