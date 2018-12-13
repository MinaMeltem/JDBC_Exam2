/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBSupport;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author MEL
 */
public class DBConnection {    
    
    public static Connection establishDBConnection() throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
        
        Connection connect = null;
        Properties connProp =  new Properties();
        connProp.put("dbms", "mysql");
        connProp.put("user","root");
        connProp.put("password", "Mltm_3252");
        connProp.put("useSSL", "false");

        connect = (Connection) DriverManager.getConnection("jdbc:" + "mysql" + "://" + "localhost" + ":" + 3306 + "/", connProp);
        System.out.println("Connected to DB");
        return connect;
    
    }
    
}
