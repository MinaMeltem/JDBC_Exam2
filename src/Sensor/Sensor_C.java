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
import Globals.SensorRanges;
import java.util.ArrayList;

/**
 *
 * @author MEL
 */
public class Sensor_C extends Sensor implements Detectable{
    public Sensor_C(String sensorID, String sensorType, String sensorStatus, Location location) {
        super(sensorID, sensorType, sensorStatus, location);
    } 

    @Override
    public void detectParticle(Particle[] pSpace) {
        super.detectParticle(pSpace); 
        
        for (Particle pObj : pSpace) {
            double d = this.getLocation().euclidean(pObj.getLoc());
            if (d <SensorRanges.Sensor_C) {
                if (pObj.getParticalCode().charAt(0) == 'C') {
                    this.detectedParticles.add(pObj);
                }
            }             
        }       
    }

    @Override
    public void decodeParticle() {
        
        for (int i=0; i<this.detectedParticles.size(); i++){
            switch (this.detectedParticles.get(i).toString()) {
                case "CCCC":
                    this.decodedParticles.add(1);
                    break;
                case "CCCX":
                    this.decodedParticles.add(2);
                    break;
                case "CCXC":
                    this.decodedParticles.add(3);
                    break;
                default:
                    this.decodedParticles.add(4);
                    break;
            }
        }
        
    }

    @Override
    public void sendDataToFushionNode(DataFusion df) {
        
    }    
}
