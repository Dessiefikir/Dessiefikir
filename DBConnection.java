
package Mini_Project;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {
 Connection c;
 Statement s;
 
 public DBConnection()
 {
     try{
         Class.forName("com.mysql.jdbc.Driver");
         c = DriverManager.getConnection("jdbc:mysql:///waterbillingsystemlogin","root","");
         s = c.createStatement();
         
     }catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
     }
 }
}
