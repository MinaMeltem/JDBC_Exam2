/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensor;

import Environment.Particle;
import GeoLocation.Location;
import Globals.Detectable;
import java.util.ArrayList;

/**
 *
 * @author MEL
 */
public class Sensor_C extends Sensor implements Detectable{
    public Sensor_C(String sensorID, String sensorType, String sensorStatus, Location location, boolean transmittingAuthority, ArrayList<Integer> decodedParticles, ArrayList<Particle> detectedParticles) {
        super(sensorID, sensorType, sensorStatus, location, transmittingAuthority, decodedParticles, detectedParticles);
    }
    
    
    @Override
    public void detectParticle(Particle[]pSpace){
        
    }
    
    @Override
    public void decodePartcile(){
        
    }
    
    
}
