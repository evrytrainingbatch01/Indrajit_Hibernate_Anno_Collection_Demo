package com.Evry.BankAccount_Anno_TPC;

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
         
         BankAccount ba = new BankAccount();
         ba.setAccUserId("Indrajit");
         ba.setBalance(500);
         
         HDFC_BankAccount hba = new HDFC_BankAccount();
         hba.setAccUserId("monaj");
         hba.setBalance(600);
         hba.setSchem("Savings");
         hba.setOffers("Puja Offer");
         
         SBI_BankAccount sba = new SBI_BankAccount();
         sba.setAccUserId("Srinivas");
         sba.setBalance(700);
         sba.setLocation("Bangalore");
         sba.setFacility("Low Intreast");
         
         session.persist(ba);
         session.persist(hba);
         session.persist(sba);
         
         tx.commit();
         session.close();
    }
}
