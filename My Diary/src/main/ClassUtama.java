
package main;

import form.FormAwal;
import database.Koneksi;
public class ClassUtama {
    
    private static Koneksi koneksi = new Koneksi();
    
    public static void main(String args[]){  
           java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new FormAwal().setVisible(true);
            }
        });
        koneksi.getKoneksi();
    }
    
    
}
