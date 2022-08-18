package com.ty.manytomany.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomany.dto.Car;
import com.ty.manytomany.dto.Features;

public class SaveCarFeatures {

	public static void main(String[] args) {
		
		
		List<Car> cars=new ArrayList<Car>();
		
		List<Features> features=new ArrayList<Features>();
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		Features feature=new Features();
		feature.setType("AC");
		feature.setColor("WhITE");
		
		features.add(feature);
		
		Features feature1=new Features();
		feature1.setType("AC");
		feature1.setColor("WhITE");
		
		features.add(feature1);
		
		Features feature2=new Features();
		feature1.setType("AC");
		feature1.setColor("WhITE");
		
		features.add(feature1);
		
		
		Car car=new Car();
		car.setBrand("FORD");
		car.setColor("RED");
		car.setCost(596556);
		
		car.setFeatures(features);
		

		
		transaction.begin();
		manager.persist(car);
		manager.persist(feature);
		manager.persist(feature1);
		manager.persist(feature2);
		transaction.commit();
		
		
		
	}

}
