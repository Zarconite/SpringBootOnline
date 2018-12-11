package com.qa.springbootonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springbootonline.SpringBootData;
import com.qa.springbootonline.model.*;

@Repository
public interface PersonRepository extends JpaRepository<SpringBootDataModel, Long> {

}
