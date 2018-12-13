/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensor;

import Environment.Particle;
import Fusion.DataFusion;
import GeoLocation.Location;
import Globals.Detectable;
import java.util.ArrayList;

/**
 *
 * @author MEL
 * * SID      SType     Status 
 *------    ------    ------
 * SenA-0   Sensor_A  Online |
 * 
 */
public abstract class Sensor implements Detectable{
       
    protected String sensorID;
    protected String sensorType;
    protected String sensorStatus;    
    protected Location location;
    boolean transmittingAuthority;
    ArrayList<Integer>decodedParticles;
    ArrayList<Particle> detectedParticles;    
    
    //Class Methods
    public  void displayDetectedParticles(){
        for(int i=0; i< detectedParticles.size(); i++){
            System.out.println(detectedParticles.get(i).toString());
        }
        
    }
    
    public void displayDecodedParticle(){
        for(int i=0; i< decodedParticles.size(); i++){
            System.out.println(decodedParticles.get(i).toString());
        } 
    }
  
    public void sendDataToFusionNode(DataFusion df){
        
    }
    
    public void detectParticle(Particle[]pSpace){
        
    }
    
    public void decodePartcile(){
        
    }
    
    
    //Consturtion -Getter -Stters

    public Sensor(String sensorID, String sensorType, String sensorStatus, Location location, boolean transmittingAuthority, ArrayList<Integer> decodedParticles, ArrayList<Particle> detectedParticles) {
        this.sensorID = sensorID;
        this.sensorType = sensorType;
        this.sensorStatus = sensorStatus;
        this.location = location;
        this.transmittingAuthority = transmittingAuthority;
        this.decodedParticles = decodedParticles;
        this.detectedParticles = detectedParticles;
    }

    public String getSensorID() {
        return sensorID;
    }

    public String getSensorType() {
        return sensorType;
    }

    public String getSensorStatus() {
        return sensorStatus;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isTransmittingAuthority() {
        return transmittingAuthority;
    }

    public ArrayList<Integer> getDecodedParticles() {
        return decodedParticles;
    }

    public ArrayList<Particle> getDetectedParticles() {
        return detectedParticles;
    }
    
    
    
}