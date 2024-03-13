package assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assignment1 {

    public static Connection mycon(){
        
        String url = "jdbc:mysql://localhost:3306/library";
        String username = "root";
        String password = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to the database");
            return conn ;
        }
        catch(Exception e){
            System.out.println("Couldn't connect to the database");
            e.printStackTrace();
            return null ;
        }
    }
    
}
