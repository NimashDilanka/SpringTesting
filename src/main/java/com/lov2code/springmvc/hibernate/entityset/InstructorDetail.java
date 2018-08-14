package com.lov2code.springmvc.hibernate.entityset;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "nimash_test_instructor_detail")
public class InstructorDetail
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @Column(name = "hobby")
    private String hobby;

    //mapped by tells hibernate that:
    //look at "instructorDetail" property in Instructor class
    //use information from Instructor class @JoinColumn(...) to find out associated instructor.
    @OneToOne(mappedBy = "instructorDetail",cascade = CascadeType.ALL)
    private Instructor instructor;

    public InstructorDetail(String youtubeChannel, String hobby )
    {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }

    public InstructorDetail()
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

    public String getYoutubeChannel()
    {
        return youtubeChannel;
    }

    public void setYoutubeChannel( String youtubeChannel )
    {
        this.youtubeChannel = youtubeChannel;
    }

    public String getHobby()
    {
        return hobby;
    }

    public void setHobby( String hobby )
    {
        this.hobby = hobby;
    }

    public Instructor getInstructor()
    {
        return instructor;
    }

    public void setInstructor( Instructor instructor )
    {
        this.instructor = instructor;
    }
}
