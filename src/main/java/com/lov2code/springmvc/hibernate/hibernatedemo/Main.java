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
            Student student = new Student( "name1", "last name1", "asd1@gmail.com" );
            Student student1 = new Student( "name2", "last name2", "asd1@gmail.com" );
            Student student2 = new Student( "name3", "last name2", "asd1@gmail.com" );

            //start a transaction
            session.beginTransaction();

            //save the student object
            session.save( student );
            session.save( student1 );
            session.save( student2 );

            //commit transaction
            session.getTransaction().commit();

            System.out.println("\n\ndone inserting\n\n");

            //set student primary key
            int StudentID = 99;

            //retrieving obj though new session
            session = factory.getCurrentSession();
            session.beginTransaction();
            Student stuRetrieve = session.get( Student.class, StudentID ); //(Obj type, primary key)
            session.getTransaction().commit();
            System.out.println( "obj retrieved :"+ stuRetrieve );
            System.out.println(stuRetrieve.toString());


        }
        finally
        {
            session.close();
            factory.close();

        }
    }
}
