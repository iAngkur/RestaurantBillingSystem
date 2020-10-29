package restaurant;

import java.sql.*;
import javax.swing.JOptionPane;

public class conn {
    Connection dbCon;
    Statement stmt;
    
    public conn() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.dbCon = DriverManager.getConnection("jdbc:mysql:///restaurant", "root", "");
            this.stmt = dbCon.createStatement(); // used ot access to our database. 
                                     // useful when we are using static SQL statements at runtime
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
              System.out.println(e);
        }
    }
}
