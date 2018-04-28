package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    Connection connection = null;
    
    public DBConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PatientRecord", "root", "");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
