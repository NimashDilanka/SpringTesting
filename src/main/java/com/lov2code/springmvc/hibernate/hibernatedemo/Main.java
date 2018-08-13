package com.lov2code.springmvc.hibernate.hibernatedemo;

import com.lov2code.springmvc.hibernate.entityset.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main
{
    public static void main( String[] args )
    {
        //create session factory
        SessionFactory factory = new Configuration()
                                .configure( "hibernate.cfg.xml" )
                                .addAnnotatedClass( Student.class )
                                .buildSessionFactory();

        //create a session
        Session session = factory.getCurrentSession();

        try
        {
            //use the session object to save java object
            Student student = new Student( "name", "last name", "asd@gmail.com" );

            //start a transaction
            session.beginTransaction();

            //save the student object
            session.save( student );

            //commit transaction
            session.getTransaction().commit();

            System.out.println("\n\ndone\n\n");
        }
        finally
        {
            factory.close();
        }
    }
}
