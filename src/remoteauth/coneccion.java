/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remoteauth;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;


/**
 *
 * @author josef
 */
public class coneccion {
    Connection con = null;
    String connection = "jdbc:sqlserver://localhost:1433;databaseName=OS2;user=pruebas;password=1234";
    public coneccion(){
       con = null;
       connection = "jdbc:sqlserver://localhost:1433;databaseName=OS2;user=pruebas;password=1234";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connection);

        } catch (Exception ex) {
            System.out.println("sss");
            System.out.println(ex);
        }
        
    }
    public boolean insertar(String aejecutar){
         try {
             PreparedStatement statement = con.prepareStatement(aejecutar);
             statement.execute();
        } catch (Exception ex) {
             System.out.println(ex);
             return false;
       }
         return true;
    }
    public String autenticar(String login , String password){
        try {
            String ejecucion="select* from usuario where loginname='"+login+"'"+ " and password='"+password+"'";
             Statement statement = con.createStatement();
              ResultSet rs;
            rs = statement.executeQuery(ejecucion);
            System.out.println(ejecucion);
            System.out.println(rs);
            System.out.println("sssssssssss");
            String h=" ";
            String g="";
            while(rs.next()){
                h=(rs.getString(1))+" ";
            }
            if (h==null){
                return h;
            }else{
                return "error";
            }
            //System.out.println(h);
            //System.out.println(g);
          
            
        } catch (Exception ex) {
             System.out.println(ex);
             return "error";
       }
         
    }
    public  ArrayList todos(){
        ArrayList list=new ArrayList();
        try {
            String ejecucion="select* from usuario";
             Statement statement = con.createStatement();
              ResultSet rs;
            rs = statement.executeQuery(ejecucion);
            System.out.println(ejecucion);
            System.out.println(rs);
            System.out.println("sssssssssss");
            String h=" ";
            String g="";
            while(rs.next()){
                list.add((rs.getString(1))+" ");
                list.add((rs.getString(2))+" ");
                list.add((rs.getString(3))+" ");
                list.add((rs.getString(4))+" ");
                list.add((rs.getString(5))+" ");
                list.add((rs.getString(6))+" ");
            }
            for (Object objecte : list) {
                System.out.println(objecte);
            }
            return list;
            //System.out.println(h);
            //System.out.println(g);
          
            
        } catch (Exception ex) {
             System.out.println(ex);
             return list;
       }
    }
     public  ArrayList porlogin(String loginname){
         ArrayList list=new ArrayList();
        try {
            String ejecucion="select* from usuario where loginname= '"+loginname+"'";
             Statement statement = con.createStatement();
              ResultSet rs;
            rs = statement.executeQuery(ejecucion);
            System.out.println(ejecucion);
            System.out.println(rs);
            System.out.println("sssssssssss");
            String h=" ";
            String g="";
            while(rs.next()){
                list.add((rs.getString(1))+" ");
                list.add((rs.getString(2))+" ");
                list.add((rs.getString(3))+" ");
                list.add((rs.getString(5))+" ");
                list.add((rs.getString(6))+" ");
            }
            for (Object objecte : list) {
                System.out.println(objecte);
            }
            return list;
            //System.out.println(h);
            //System.out.println(g);
          
            
        } catch (Exception ex) {
             System.out.println(ex);
             return list;
       }
     }
     public  ArrayList porid(String loginname){
         ArrayList list=new ArrayList();
        try {
            String ejecucion="select* from usuario where id= '"+loginname+"'";
             Statement statement = con.createStatement();
              ResultSet rs;
            rs = statement.executeQuery(ejecucion);
            System.out.println(ejecucion);
            System.out.println(rs);
            System.out.println("sssssssssss");
            String h=" ";
            String g="";
            while(rs.next()){
                list.add((rs.getString(1))+" ");
                list.add((rs.getString(2))+" ");
                list.add((rs.getString(3))+" ");
                list.add((rs.getString(5))+" ");
                list.add((rs.getString(6))+" ");
            }
            for (Object objecte : list) {
                System.out.println(objecte);
            }
            return list;
            //System.out.println(h);
            //System.out.println(g);
          
            
        } catch (Exception ex) {
             System.out.println(ex);
             return list;
       }
     }
     public boolean borrar(String loginname, String password){
         try{
             String ejecucion="delete from usuario where loginname= '"+loginname+"' and password = '"+ password +"'";
             Statement statement = con.createStatement();
             return true;
         }catch (Exception ex){
             return false;
         }
     }
    
}
