package com.lov2code.springmvc.hibernate.entityset;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nimash_test_student")
public class Student
{
    @Id //primary key or applied at the field level to mark the field used for identiy purpose.
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY ,generator = "increment")
    //let oracle to handle auto increment
    //@SequenceGenerator(name = "id_Sequence", sequenceName = "nimash_test_student_seq")
    //define oracle sequence to use for auto increment
    @GenericGenerator(name="increment", strategy = "increment")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lasttName;

    @Column(name = "email")
    private String email;

    public Student( String firstName, String lasttName, String email )
    {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.email = email;
    }

    //region GETTER_SETTER
    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLasttName()
    {
        return lasttName;
    }

    public void setLasttName( String lasttName )
    {
        this.lasttName = lasttName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    //endregion

    @Override public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
