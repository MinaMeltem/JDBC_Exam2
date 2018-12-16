/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fusion;

import GeoLocation.Location;
import Globals.Fusionable;
import Globals.NodeStatus;
import java.util.ArrayList;

/**
 *
 * @author MEL
 */
public class DataFusion_B extends DataFusion implements Fusionable{

    public DataFusion_B(String NodeID, NodeStatus sensorStatus, Location location, ArrayList<ArrayList<Integer>> codeBuffer, ArrayList<Integer> fusedBuffer) {
        super(NodeID, sensorStatus, location, codeBuffer, fusedBuffer);
    }
    
}
