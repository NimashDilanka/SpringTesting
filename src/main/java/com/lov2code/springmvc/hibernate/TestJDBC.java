package com.lov2code.springmvc.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC
{
    public static void main( String[] args )
    {
        try(Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@192.168.2.3:1521:dsndev", "TBX", "TBX" );
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( "select * FROM CLI_SAP_BILLING_PROFILE where ROWNUM <= 5 " );)
        {
            //step1 load the driver class
            Class.forName( "oracle.jdbc.driver.OracleDriver" );
            while( rs.next() )
            {
                System.out.println( "row: " + rs.getInt( 1 ) + "  " + rs.getString( 2 ) + "  " + rs.getLong( 3 ) );
            }

        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}
