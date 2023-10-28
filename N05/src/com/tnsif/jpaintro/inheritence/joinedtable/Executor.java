package com.tnsif.jpaintro.inheritence.joinedtable;

import javax.persistence.EntityManager;

import com.tnsif.jpaintro.JPAIUtil;

public class Executor {

	public static void main(String[] args) {
		Device device=new Device();
		device.setDeviceCode(1001);
		device.setCompany("LG");
		
		Laptop lDevice=new Laptop();
		lDevice.setDeviceCode(2001);
		lDevice.setCompany("HP");
		lDevice.setProcessor("Intel 5");
		lDevice.setStorage(2);
		lDevice.setPrice(54000);
		
		Mobile mDevice=new Mobile();
		mDevice.setDeviceCode(3001);
		mDevice.setCompany("Samsung");
		mDevice.setSeries("M21");
		mDevice.setPrice(23000);
		
		EntityManager em=JPAIUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(device);
		em.persist(lDevice);
		em.persist(mDevice);
		em.getTransaction().commit();
		
	}

}
