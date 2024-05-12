
package DB;
import java.sql.*;
public class db {
    public static Connection getCon(){
     
        try{
           
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3308/carrentaldb", "root", "");
            Class.forName("com.mysql.cj.jdbc.Driver");
            return con;
 }
  catch(Exception e){
            System.out.println(e);
            return null;
    }
    
    
    }
}
