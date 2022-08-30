package com.crossasyst.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsert {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
            con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
            PreparedStatement psmt = con.prepareStatement("insert into connection values(1, 'Raj')");
            //PreparedStatement psmt = con.prepareStatement("insert into connection values(2, 'Sanket')");

            psmt.execute();
            System.out.println("Inserted Successfully");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            con.close();
        }
    }
}