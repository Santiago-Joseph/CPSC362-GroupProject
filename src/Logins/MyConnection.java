/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author santi
 */
public class MyConnection {
      public static Connection getConnection(){
     
        Connection connection = null;
        try {
          // Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/barklogin", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return connection;
    }
    
}
