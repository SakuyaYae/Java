/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.santas_database;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Elev
 */
public class ConnectionFactory {
    
    public static Connection getconnection() throws ClassNotFoundException, SQLException{
        String user = "root";
        String pssword = "";
        String url = "jdbc:mysql://localhost/manga_list";
        Class.forName("com.mysql.jdbc.Driver");
        return (Connection)DriverManager.getConnection(url, user, pssword);
    }
}
