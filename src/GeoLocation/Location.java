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
 */
public class Location {
    
    protected int X;
    protected int Y;
    protected int Z;

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
    
    
    public static double euclidean3D(Location L1, Location L2){
       double d = sqrt(pow((L2.X - L1.X),2) + pow((L2.Y - L1.Y),2) + pow((L2.Z - L1.Z),2));
       return d;
    }
       
}
