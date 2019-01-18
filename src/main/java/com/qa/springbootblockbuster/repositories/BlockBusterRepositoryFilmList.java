package com.qa.springbootblockbuster.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springbootblockbuster.model.*;

@Repository
public interface BlockBusterRepositoryFilmList extends JpaRepository<SpringBootBlockBusterDataModelFilmList, Long> {
	List<SpringBootBlockBusterDataModelFilmList> findByFilmCategory(String film_Category);
	List<SpringBootBlockBusterDataModelFilmList> findByFilmTitle(String filmTitle);
}