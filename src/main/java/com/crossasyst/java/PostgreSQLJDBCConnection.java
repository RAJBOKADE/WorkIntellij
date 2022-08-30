package com.crossasyst.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class PostgreSQLJDBCConnection {
    private final String url="jdbc:postgresql://localhost:5432/crossasyst";
    private final String user = "postgres";
    private final String password = "1234";

    public static void main(String[] args) throws SQLException {
        Connection con=null;
        try{
            Class.forName("org.postgresql.Driver");
            con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
            if(con!=null){
                System.out.println("Connected");
            } else {
                System.out.println("Not connceted");
            }
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}