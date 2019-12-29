/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;


import form.FormAwal;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kim Geraldine
 */
public class Koneksi {
    
    private static Connection koneksi;
 
    public static String user = "root";
    public static String pass = "Kim@Anteiku1";
    public static String url = "jdbc:mysql://localhost:3306/diary"; 
    
        public String getUser(){
            return user;
        }
        
        public String getPass(){
            return pass;
        }
        
        public String getUrl(){
            return url;
        }
        
    public static Connection getKoneksi(){
        try{    
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass); 
        
        }catch(final SQLException e){
            
            JOptionPane.showMessageDialog(null, "Aplikasi tidak terkoneksi dengan Database !");
            e.printStackTrace();
             
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new FormAwal().setVisible(false);    
                }
                });
            
            System.exit(1);
        }
        
        return koneksi;
    }
    
    public static Connection getKoneksiUser(){
        try{    
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", user, pass); 
        
        }catch(final SQLException e){
            
            JOptionPane.showMessageDialog(null, "Aplikasi tidak terkoneksi dengan Database !");
             
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new FormAwal().setVisible(false);    
                }
                });
            
            System.exit(1);
        }
        
        return koneksi;
    }
        
    
    public Koneksi(){
               
        }
      
}
