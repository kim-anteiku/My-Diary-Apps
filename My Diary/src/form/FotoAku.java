
package form;


//daftar import package
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
//-----------------------------

public class FotoAku extends javax.swing.JPanel {
    
    //Konstruktor
    public FotoAku() {
        gambar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/gambar/saya.png"));
        MediaTracker media = new MediaTracker(this);
        media.addImage(gambar, 0);
        try {
            media.waitForID(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(FotoAku.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
    }
    //-------------------------------------------------------------------------------------------------------
    
    //method untuk mengubah background Jpanel ini dengan gambar
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(gambar, 0, 0, getWidth(), getHeight(), this);
    }
    //--------------------------------------------------------------------------------------------------------        
            
            
    //Kode Utama
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    //--------------------------------------------------------------------------------------------------------
    
    //deklarasi variable manual
    private Image gambar;
    //-------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
