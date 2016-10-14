
package GUI;
import java.sql.Statement; 
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class code {
    String admission123;
   public void take_admno(String admission_no){
        admission123=admission_no;
       
        
    }
public String give_admno(){
       return admission123;
        
    }
}
    
    

