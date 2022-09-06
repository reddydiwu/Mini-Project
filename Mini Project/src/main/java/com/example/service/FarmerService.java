package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Farmer;
import com.example.repository.FarmRepsoitory;



@Service
public class FarmerService {

	@Autowired
	FarmRepsoitory repository;

	public List<Farmer> findallFarmers() {
		List<Farmer> farmersList = new ArrayList<Farmer>();
		//System.out.println(repository.findAll());
        repository.findAll().forEach(farmer -> farmersList.add(farmer));
		System.out.println(farmersList);
        return farmersList;
	}

	public void deleteById(int farmerId) {
		repository.deleteById(farmerId);
	}
	
   public List<Farmer> findAllByName(String name){
	   List<Farmer> farmersList = findallFarmers();

       List<Farmer> farmerList1=farmersList
       .stream()
       .filter(fty -> (fty.getName().toLowerCase().contains(name.toLowerCase())))
       .collect(Collectors.toList());

       return farmerList1;
   }

}

