package com.tnsif.jpaintro.inheritence;

import javax.persistence.EntityManager;

import com.tnsif.jpaintro.JPAIUtil;

public class Executor {

	public static void main(String[] args) {
		EntityManager em= JPAIUtil.getEntityManager();
		Person p=new Person();
		p.setPersonId(105);
		p.setName("Ankita");
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		Employee e=new Employee();
		e.setPersonId(104);
		e.setName("Poonam");
		e.setSalary(60000);
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
	}

}
