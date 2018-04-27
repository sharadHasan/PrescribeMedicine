package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    Connection connection = null;
    
    public DBConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PatientRecord", "root", "");
            //System.out.println("Connection Successful");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
