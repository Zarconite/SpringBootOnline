package com.qa.springbootblockbuster.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springbootblockbuster.model.*;

@Repository
public interface BlockBusterRepositoryActorInfo extends JpaRepository<SpringBootBlockBusterDataModelActorInfo, Long> {

}