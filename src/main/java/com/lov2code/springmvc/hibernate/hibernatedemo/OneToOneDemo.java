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


        try (SessionFactory factory = new Configuration()
                .configure( "hibernate.cfg.xml" )
                .addAnnotatedClass( Instructor.class )
                .addAnnotatedClass( InstructorDetail.class )
                .buildSessionFactory();
             Session session = factory.getCurrentSession())
        {
            //create a session

            session.beginTransaction();
            InstructorDetail instructorDetail = session.get( InstructorDetail.class, 3333 );
            System.out.println( instructorDetail.toString() );
            System.out.println( "related instructor:" + instructorDetail.getInstructor() );
            System.out.println( "related instructor's instructor detail:" + instructorDetail.getInstructor().getInstructorDetail() );
            System.out.println( "related instructor's instructor detail's instructor:" + instructorDetail.getInstructor().getInstructorDetail().getInstructor() );

            session.delete( instructorDetail );
            session.getTransaction().commit();
        }
        catch( Exception ex )
        {
            ex.printStackTrace();
        }

    }

}
