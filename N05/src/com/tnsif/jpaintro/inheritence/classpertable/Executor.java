package com.tnsif.jpaintro.inheritence.classpertable;

import javax.persistence.EntityManager;

import com.tnsif.jpaintro.JPAIUtil;

public class Executor {

	public static void main(String[] args) {
		EntityManager em=JPAIUtil.getEntityManager();
		
		//add vehicle record
		Vehicle vObj=new Vehicle();
		vObj.setType("Four Wheeler");
		vObj.setModelNo(1230);
		vObj.setCompany("TATA");
		
		Vehicle vObjOne=new Vehicle();
		vObjOne.setType("Four Wheeler");
		vObjOne.setModelNo(888);
		vObjOne.setCompany("Mahindra");
		
		Car carObjOne=new Car();
		carObjOne.setModelNo(111);
		carObjOne.setCompany("Hondai");
		carObjOne.setFuelType("Petrol");
		carObjOne.setAverage(17.2f);
		carObjOne.setPrice(900000);
		carObjOne.setType("Four Wheeler");
		
		em.getTransaction().begin();
		em.persist(vObj);
		em.persist(vObjOne);
		em.persist(carObjOne);
		em.getTransaction().commit();
		
		

	}

}
