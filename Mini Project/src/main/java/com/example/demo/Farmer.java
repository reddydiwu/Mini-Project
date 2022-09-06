package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FARMER")
public class Farmer {
	@Column(name="FARMER_ID")
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    int farmerId;

     @Column(name="NAME")
     String name;

     

     @Column(name="AGE")
     int age;

  
     @Column(name="EMAIL")
     String email;
         
    @Column(name="YEARS_OF_EXPERIENCE")
    //  float experience;   
    float yearsOfExperience;

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
     
    

}
