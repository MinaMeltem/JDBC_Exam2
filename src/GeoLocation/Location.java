/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeoLocation;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author MEL
 * 
 * Returns the 3D Euclidean distance between the  Location object and 
 * another Location object
 */
public class Location {
    
    private int X;
    private int Y;
    private int Z;
    


    public Location(int X, int Y, int Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getZ() {
        return Z;
    }

    public void setZ(int Z) {
        this.Z = Z;
    }  
    
    
    public double euclidean (Location L){
        return sqrt(pow((this.getX() - L.getX()),2) + pow((this.Y - L.getY()),2) + pow((this.getZ() - L.getZ()),2));
    }
     
    public static double euclidean3D(Location L1, Location L2){
        return L2.euclidean(L1);
    }
    
    
}
