package com.lov2code.springmvc.hibernate.entityset;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nimash_test_student")
public class Student
{
    @Id
    @Column(name = "id")
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
