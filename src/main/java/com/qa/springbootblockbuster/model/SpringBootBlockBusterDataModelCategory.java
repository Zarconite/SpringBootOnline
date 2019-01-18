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
@Table(name="category")
@EntityListeners(AuditingEntityListener.class)
public class SpringBootBlockBusterDataModelCategory implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "category_id") Long categoryID;
	@NotBlank
	@Column(name = "name") private String categoryName;
	
	public SpringBootBlockBusterDataModelCategory(Long categoryID, String categoryName) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}
	public Long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void lastUpdate(String categoryName) {
		this.categoryName = categoryName;
	}
	public SpringBootBlockBusterDataModelCategory() {}
	
}



