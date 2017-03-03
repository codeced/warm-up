package com.swamp.practice.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.swamp.practice.hibernate.employee.Employee;

public class MainMethod {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session openSession = factory.openSession();
		System.out.println("b4");
		Transaction t = openSession.beginTransaction();
		for (int i = 0; i <= 100; i++) {
			Employee emp = new Employee();
			emp.setEmpId(i+"");
			emp.setEmpName(i + " Narayana");
			openSession.persist(emp);
		}
		t.commit();
		System.out.println("after");
	}

}
