package com.lov2code.springmvc.hibernate.hibernatedemo;

import com.lov2code.springmvc.hibernate.entityset.Instructor;
import com.lov2code.springmvc.hibernate.entityset.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OneToOneDemo
{
    public static void main( String[] args )
    {
        //create session factory
        SessionFactory factory = new Configuration()
                .configure( "hibernate.cfg.xml" )
                .addAnnotatedClass( Instructor.class )
                .addAnnotatedClass( InstructorDetail.class )
                .buildSessionFactory();

        try
        {
            //create a session
            Session session = factory.getCurrentSession();

            Instructor instructor = new Instructor( "insName", "lastName", "email" );
            InstructorDetail instructorDetail = new InstructorDetail( "youtube channel", "hobby" );

            //associate the objects
            instructor.setInstructorDetail( instructorDetail );

            session.beginTransaction();
            session.save( instructor );
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Instructor insResult = session.get( Instructor.class, 2 );
            if( insResult == null )
            {
                System.out.println( "result null" );
            }
            else
            {
                session.delete( insResult ); //will delete detail obj also.

            }
            session.getTransaction().commit();
        }
        finally
        {
            factory.close();
        }
    }

}
