package com.Evry.Patient_Anno_TPH;

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
         
         Patient patient = new Patient();
         patient.setPatientName("Indrajit");
         
         OutPatient outPatient = new OutPatient();
         outPatient.setPatientName("Monaj");
         outPatient.setDepartment("ENT");
         outPatient.setTest("Blood");
         
         InPatient inPatient = new InPatient();
         inPatient.setPatientName("Srinivas");
         inPatient.setCabinNo("EV-02");
         inPatient.setCondition("Normal");
         
         session.persist(patient);
         session.persist(outPatient);
         session.persist(inPatient);
         
         tx.commit();
         factory.close();
    }
}