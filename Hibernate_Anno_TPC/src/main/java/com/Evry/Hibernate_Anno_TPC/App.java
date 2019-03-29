package com.Evry.Hibernate_Anno_TPC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args ){
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  
          
         Transaction tx=session.beginTransaction();  
         
         Customer customer = new Customer();
         customer.setCustomerName("Indrajit");
         
         RegularCustomer regCustomer = new RegularCustomer();
         regCustomer.setCustomerName("Monaj");
         regCustomer.setPrice(500);
         regCustomer.setAmount(1000);
         
         PartialCustomer partCustomer = new PartialCustomer();
         partCustomer.setCustomerName("Srinivas");
         partCustomer.setPartialPrice(600);
         partCustomer.setPartialAmount(1100);
         
         session.persist(customer);
         session.persist(regCustomer);
         session.persist(partCustomer);
         
         tx.commit();
         session.close();
    }
}
