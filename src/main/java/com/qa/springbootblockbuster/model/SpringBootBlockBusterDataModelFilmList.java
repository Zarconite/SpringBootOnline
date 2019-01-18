package com.qa.springbootblockbuster.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="film_list")
@EntityListeners(AuditingEntityListener.class)
public class SpringBootBlockBusterDataModelFilmList implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "fid") Long film_ListID;
	@NotBlank
	@Column(name = "title") private String filmTitle;
	@NotBlank
	@Column(name = "description") private String filmDescription;
	@NotBlank
	@Column(name = "category") private String filmCategory;
	@NotBlank
	@Column(name = "price") private String filmPrice;
	@NotBlank
	@Column(name = "length") private String filmLength;
	@NotBlank
	@Column(name = "rating") private String filmrating;
	@NotBlank
	@Column(name = "actors") private String filmactors;
	
	public SpringBootBlockBusterDataModelFilmList(Long filmListID, String filmTitle, String filmDescription, String filmCategory, String filmPrice, String filmLength, String filmrating, String filmactors) {
		this.film_ListID = film_ListID;
		this.filmTitle = filmTitle;
		this.filmDescription = filmDescription;
		this.filmCategory = filmCategory;
		this.filmPrice = filmPrice;
		this.filmLength = filmLength;
		this.filmrating = filmrating;
		this.filmactors = filmactors;
		
	}
	public Long getFilm_ListID() {
		return film_ListID;
	}
	public void setFilm_ListID(Long film_ListID) {
		this.film_ListID = film_ListID;
	}

	public String getFilmTitle() {
		return filmTitle;
	}
	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}
	public String getFilmDescription() {
		return filmDescription;
	}
	public void setFilmDescription(String filmDescription) {
		this.filmDescription = filmDescription;
	}
	public String getFilmCategory() {
		return filmCategory;
	}
	public void setFilmCategory(String filmCategory) {
		this.filmCategory = filmCategory;
	}
	public String getFilmPrice() {
		return filmPrice;
	}
	public void setFilmPrice(String filmPrice) {
		this.filmPrice = filmPrice;
	}
	public String getFilmLength() {
		return filmLength;
	}
	public void setFilmLength(String filmLength) {
		this.filmLength = filmLength;
	}
	public String getFilmrating() {
		return filmrating;
	}
	public void setFilmrating(String filmrating) {
		this.filmrating = filmrating;
	}
	public String getFilmactors() {
		return filmactors;
	}
	public void setFilmactors(String filmactors) {
		this.filmactors = filmactors;
	}
	public SpringBootBlockBusterDataModelFilmList() {}
	
}



