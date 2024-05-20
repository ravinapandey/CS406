
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SAIT
 */
public class MyConnection {
 
    
    public static Connection getConnection() 
    {
        try {
        //load driver class
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          // create connection
          Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/college.managment","root","");
      return cn;
        }
        catch(Exception e)
        {
            
        }
       return null; 
    }

    
}
   

