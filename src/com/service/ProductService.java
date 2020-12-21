package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.Session;

import com.dao.ProdDao;
import com.model.AddProduct;
import com.utility.HibernateUtility;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

//This class is used as a service for the Products
public class ProductService implements ProdDao{


	//This function is used to record a product into the database
	@Override
	public void addProduct(AddProduct ap) {
		System.out.println("inside service");

		try {
			
			//This declares the Hibernate session
			Session session= HibernateUtility.getSession();
			Transaction tx= session.beginTransaction();
			
			session.save(ap);
			tx.commit();
			System.out.println(("Product Added"));
			
			

		} catch (Exception e) {
			
		}

	}
	

}