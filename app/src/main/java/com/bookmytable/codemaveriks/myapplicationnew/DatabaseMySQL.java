package com.bookmytable.codemaveriks.myapplicationnew;
import java.sql.*;



public class DatabaseMySQL {

    private static String CONN_STRING="jdbc:mysql://localhost/biometric" ;
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private Connection conn;

    public void connect(){
        try{
            conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected!");
        }catch(SQLException e){
            System.err.println(e);
        }
    }

    public void sql(String sql) {
        try {
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
