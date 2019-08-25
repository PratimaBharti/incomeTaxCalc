/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;

/**
 *
 * @author pratima
 */
public class DBconnection {
    
    public Connection getConnection()
    {
        Connection con = null;
        //ResultSet rs=null;
        try{  
              Class.forName("com.mysql.jdbc.Driver");  
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/incometable","root","root");  
    }catch(ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return con;
}
}
