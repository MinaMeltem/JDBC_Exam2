/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import DBSupport.DBConnection;
import Environment.Particle;
import GeoLocation.Location;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MEL
 * 
 * Contains static methods which build and display persistent Particle objects 
 * from database
 * 
 * IDNumber    PCode
 * ---------   ------
 * TPA-26       AXAA
 */
public class ParticleFactory {    
    
    public static ArrayList<Particle> createDBParticle() throws SQLException, ClassNotFoundException{
        
        Connection conn = DBSupport.DBConnection. establishDBConnection();
        Statement useStatment = conn.createStatement();
        useStatment.executeQuery("USE Tachyon");
        Statement queryStatement = conn.createStatement();
        String query = "SELECT * FROM particles "
                + "LEFT JOIN particle_location "
                + "ON particles.IDNumber=particle_location.IDNumber;" ;
        ResultSet rs = queryStatement.executeQuery(query);       
       
        String pID = null;
        String pCode = null;
        Location loc;
        Particle particles = null;
        ArrayList<Particle> particleList = new ArrayList<>(); 
        
        while(rs.next()){
            pID = rs.getString("IDNumber");
            pCode = rs.getString("PCode");
            loc = new Location(rs.getInt("XCoord"),rs.getInt("YCoord"), rs.getInt("ZCoord"));            
            particles = new Particle(pID,pCode,loc);   
            particleList.add(particles);
        }        
        
        return particleList;  
    
    }     
   
    public static void displayParticles() throws SQLException, ClassNotFoundException {
        ArrayList<Particle> pl = new ArrayList<>();
        pl = createDBParticle();
        for (int i=0; i < pl.size(); i++){
            System.out.println(pl.get(i).getParticalID()+ " "+pl.get(i).getParticalCode() +" "+
                    pl.get(i).getLoc().getX()+" "+
                    pl.get(i).getLoc().getY()+" "+
                    pl.get(i).getLoc().getZ());
        }
    }  
    
     public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ArrayList<Particle> pl = new ArrayList<>();
        pl = createDBParticle();
        for (int i=0; i < pl.size(); i++){
            System.out.println(pl.get(i).getParticalID()+ " "+
                    pl.get(i).getParticalCode() +" "+
                    pl.get(i).getLoc().getX()+" "+
                    pl.get(i).getLoc().getY()+" "+
                    pl.get(i).getLoc().getZ());
        }
    }  
    
}
