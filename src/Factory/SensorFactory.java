/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import GeoLocation.Location;
import Sensor.Sensor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author MEL
 * Contains static methods which build and display persistent Sensor objects 
 * from database  
 * SID      SType     Status 
 *------    ------    ------
 * SenA-0   Sensor_A  Online |
 * 
 */
public class SensorFactory {
    
     public static ArrayList<Sensor> createSensor() throws SQLException, ClassNotFoundException{
        
        Connection conn = DBSupport.DBConnection. establishDBConnection();
        Statement useStatment = conn.createStatement();
        useStatment.executeQuery("USE Tachyon");
        Statement queryStatement = conn.createStatement();
        String query = "SELECT * FROM sensors "
                + "LEFT JOIN sensor_location "
                + "ON sensors.SID=sensor_location.SID;" ;
        ResultSet rs = queryStatement.executeQuery(query);       
       
        String sID = null;
        String sType = null;
        String sStatus = null;
        Location location;
        Sensor sensors = null;
        
        ArrayList<Sensor> sensorList = new ArrayList<>(); 
        
        while(rs.next()){
            sID = rs.getString("SID");
            sType = rs.getString("SType");
            sStatus = rs.getString("Status");
            location = new Location (rs.getInt("XCoord"), rs.getInt("YCoord"), rs.getInt("ZCoord"));            
            sensors = new Sensor(sID,sType, sStatus,location) {};
            sensorList.add(sensors);
        }
        
        return sensorList;    
    
    }     
   
     public static void displaySensors() throws SQLException, ClassNotFoundException {
        ArrayList<Sensor> sl = new ArrayList<>();
        sl = createSensor();
        for (int i=0; i < sl.size(); i++){
            System.out.println(
                    sl.get(i).getSensorID()+ " "+
                    sl.get(i).getSensorType()+" " +
                    sl.get(i).getSensorStatus()+" "+
                    sl.get(i).getLocation().getX()+" "+
                    sl.get(i).getLocation().getY()+ " "+
                    sl.get(i).getLocation().getZ());
        }         
         
    }    
    
}
