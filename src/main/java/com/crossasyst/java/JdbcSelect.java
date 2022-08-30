package com.crossasyst.java;

import org.postgresql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcSelect {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("org.postgresql.Driver");
            con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from address4");
            while(rs.next()){
                System.out.println(rs.getInt(1) +" "+rs.getString("address_1"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
