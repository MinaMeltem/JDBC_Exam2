/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Analysis.DataAnalysis;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MEL
 */
public class DataAnalysisNodeFactory {
    
    public static ArrayList<DataAnalysis> createDataAnalysisNode() throws SQLException, ClassNotFoundException{
        
        Connection conn = DBSupport.DBConnection. establishDBConnection();
        Statement useStatment = conn.createStatement();
        useStatment.executeQuery("USE Tachyon");
        Statement queryStatement = conn.createStatement();
        String query = "SELECT * FROM analysisNodes" ;
        ResultSet rs = queryStatement.executeQuery(query);
        
        String node = null;
        int coordX ;
        int coordY;
        int coordZ;        
        ArrayList<DataAnalysis> DAList =  new ArrayList<DataAnalysis>();
        
        while(rs.next()){
            node = rs.getString("ANode");
            coordX = rs.getInt("XCoord");
            coordY = rs.getInt("YCoord");
            coordZ = rs.getInt("ZCoord");
            DataAnalysis da = new DataAnalysis(node, coordX, coordY, coordZ){};
            DAList.add(da);
        }        
        return DAList;        
    }
    
    //Test purpose
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ArrayList<DataAnalysis> dl = new ArrayList<>();
        dl = createDataAnalysisNode();
        for (int i=0; i < dl.size(); i++){
            System.out.println(dl.get(i).getNode()+" "+dl.get(i).getXcoor()+" "+
                    dl.get(i).getYcoord()+" "+ dl.get(i).getZcoord());
        }
    }
}
