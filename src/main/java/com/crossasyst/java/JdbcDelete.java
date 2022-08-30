package com.crossasyst.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDelete {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
            con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
            PreparedStatement ps = con.prepareStatement("Delete from connection where id = 2");
            ps.execute();
            System.out.println("Deleted Successfully");
            }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
