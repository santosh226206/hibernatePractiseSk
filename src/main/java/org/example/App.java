package org.example;

//import javax.security.auth.login.Configuration;
//import org.hibernate.cfg.Configuration;

import org.example.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//import java.lang.module.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Configuration
        //Configuration cfg=new Configuration
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        // Open a new session
        Session session = sessionFactory.openSession();

        System.out.println("Hibernate Session Created Successfully!" + " " + session.getSessionFactory().toString());
        Student student= new Student(1,"santosha","5.6");
        Transaction transaction=session.beginTransaction();
        Student mergedStudent = (Student) session.merge(student);
        mergedStudent.setName("sanosha");
        transaction.commit();
        // Close session and factory
        session.close();
        sessionFactory.close();
    }
}
