package com.lov2code.springmvc.hibernate.entityset;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "nimash_test_instructor")
public class Instructor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "increm")
    @GenericGenerator( name = "increm",strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lasttName;

    @Column(name = "email")
    private String email;

    //note that
    //instructor_detail_id is not mentioned as a column name here

    /*
     * Entity Life cycle
     * Detach-  entity is not associated with a hibernate session
     * Merge-   merge will re attach entity to the session
     * Persist- transitions new instances to managed state. next commit will save in DB
     * Remove-  transitions managed entity to be removed. next commit will delete from DB
     * Refresh- reload/sync object with data from DB
     */

    /*
    Cascade types
    instructor(entity) <-----> Instructor detail(related entity)
    PERSIST-    if entity is saved,related entity will also be saved.
    REMOVE-     if entity is removed/deleted,related entity will also be deleted.
    REFRESH-    if entity is refreshed,related entity will also be refreshed.
    DETACH-     if entity is detached,related entity will also be detached.
    MERGE-     if entity is merge,related entity will also be merge.
    ALL-        all above types.
    */

    //@OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE})
    @OneToOne(cascade = CascadeType.ALL) //by default no operations are cascaded.
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetail instructorDetail;

    public Instructor( String firstName, String lasttName, String email )
    {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.email = email;
    }

    public Instructor()
    {
    }

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

    public InstructorDetail getInstructorDetail()
    {
        return instructorDetail;
    }

    public void setInstructorDetail( InstructorDetail instructorDetail )
    {
        this.instructorDetail = instructorDetail;
    }
}
