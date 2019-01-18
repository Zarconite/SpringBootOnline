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
@Table(name="actor_info")
@EntityListeners(AuditingEntityListener.class)
public class SpringBootBlockBusterDataModelActorInfo implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "actor_id") Long actorID;
	@NotBlank
	@Column(name = "first_name") private String first_Name;
	@NotBlank
	@Column(name = "last_name") private String last_Name;
	@NotBlank
	@Column(name = "film_info") private String film_Info;
	
	public SpringBootBlockBusterDataModelActorInfo(Long actorID, String first_Name, String last_Name, String film_Info) {
		this.actorID = actorID;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.film_Info = film_Info;
	}
	
	public Long getActorID() {
		return actorID;
	}

	public void setActorID(Long actorID) {
		this.actorID = actorID;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getFilm_Info() {
		return film_Info;
	}

	public void setFilm_Info(String film_Info) {
		this.film_Info = film_Info;
	}

	public SpringBootBlockBusterDataModelActorInfo() {}
	
}



