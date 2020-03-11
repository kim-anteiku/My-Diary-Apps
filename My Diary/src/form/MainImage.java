
package form;

//daftar import package
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
//-----------------------------------------------------------------------------------------------------

public class MainImage extends javax.swing.JPanel {

    //deklarasi variable manual 
    private Image gambar;
    
    //Konstruktor
    public MainImage() {
        
        initComponents();
        
        gambar = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/gambar/bg2.png"));
        MediaTracker media = new MediaTracker(this);
        media.addImage(gambar, 0);
        try {
            media.waitForID(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(FotoAku.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //-----------------------------------------------------------------------------------------------------
    
    //mengubah background MainImage
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(gambar, 0, 0, getWidth(), getHeight(), this);
    }
    //-----------------------------------------------------------------------------------------------------
    
    //Kode Utama
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
