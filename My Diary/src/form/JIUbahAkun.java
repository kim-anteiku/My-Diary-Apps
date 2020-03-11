/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

//daftar import package
import database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
//-----------------------------------------------------------------------------------------------------
 
public class JIUbahAkun extends javax.swing.JInternalFrame {
    
    //deklarasi manual variable
    FormAwal awal;
    
    //Konstruktor
    public JIUbahAkun() {
        initComponents();
    }
    //-----------------------------------------------------------------------------------------------------

    //mendapatkan nilai dari field username
    public String getUbahUser(){
        return Juserubah.getText();
    }
    //-----------------------------------------------------------------------------------------------------
    
    //mendapatkan nilai dari field Password
    public String getUbahPass(){
        return Jpassubah.getText();
    }
    //-----------------------------------------------------------------------------------------------------
    
    //mendapatkan nilai null dari Jpassubah
    public void setUbahPass(){
        Jpassubah.setText("");
    }
    //-----------------------------------------------------------------------------------------------------
    
    //mendapatkan nilai null dari Juserubah
    public void setUbahUser(){
        Juserubah.setText("");
    }
    //-----------------------------------------------------------------------------------------------------
    
    //mendapatkan nilai dari kolom Password Awal
    public String getPassAwal(){
        return JpassAwal.getText();
    }
    //-----------------------------------------------------------------------------------------------------
    
    public void setPassAwal(){
        JpassAwal.setText("");
    }
    //-----------------------------------------------------------------------------------------------------
    
    //Kode Utama
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUser = new javax.swing.JLabel();
        Juserubah = new javax.swing.JTextField();
        Jpassubah = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        ubah = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        JpassAwal = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setTitle("Ubah Akun");

        labelUser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelUser.setForeground(new java.awt.Color(255, 255, 255));
        labelUser.setText("Username Baru  :");

        Juserubah.setBackground(new java.awt.Color(0, 255, 255));
        Juserubah.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Juserubah.setForeground(new java.awt.Color(51, 51, 51));
        Juserubah.setToolTipText("Masukan Username\n");
        Juserubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuserubahActionPerformed(evt);
            }
        });
        Juserubah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JuserubahKeyPressed(evt);
            }
        });

        Jpassubah.setBackground(new java.awt.Color(0, 255, 255));
        Jpassubah.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Jpassubah.setToolTipText("Masukan Password");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password  Baru  :");

        ubah.setBackground(new java.awt.Color(0, 204, 0));
        ubah.setForeground(new java.awt.Color(255, 255, 255));
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });
        ubah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ubahKeyPressed(evt);
            }
        });

        batal.setBackground(new java.awt.Color(255, 0, 0));
        batal.setForeground(new java.awt.Color(255, 255, 255));
        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        JpassAwal.setBackground(new java.awt.Color(0, 255, 255));
        JpassAwal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JpassAwal.setToolTipText("Masukan Password");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Masukan Password Awal :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(JpassAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUser)
                                    .addComponent(jLabel7))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Juserubah)
                                    .addComponent(Jpassubah, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUser)
                    .addComponent(Juserubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Jpassubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpassAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubah)
                    .addComponent(batal))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void JuserubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuserubahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JuserubahActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //evnt handling
    private void JuserubahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JuserubahKeyPressed

    }//GEN-LAST:event_JuserubahKeyPressed
    //-----------------------------------------------------------------------------------------------------

    //event handling
    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        
        //mengambil koneksi
        Connection c = Koneksi.getKoneksiUser();
        
        //merubah username dan password
        try{
            
            //validasi password awal
            Statement state = c.createStatement();
            ResultSet r = state.executeQuery("select * from user");
            
            if(r.next()){    
            if(getUbahUser().equals("") && getUbahPass().equals("")){
                JOptionPane.showMessageDialog(null, "Untuk menjaga keamanan My Diary anda, Username Baru dan Password Baru tidak boleh kosong ! ");
            }else if(getUbahUser().equals("")){
                JOptionPane.showMessageDialog(null, "Untuk menjaga keamanan My Diary anda, Username Baru tidak boleh kosong !");
            }else if(getUbahPass().equals("")){
                JOptionPane.showMessageDialog(null, "Untuk menjaga keamanan My Diary anda, Password Baru tidak boleh kosong !");
            }else if(!getPassAwal().equals(r.getString("password"))){
                JOptionPane.showMessageDialog(null, "Mohon masukan Password Awal secara benar dan tepat !");
            }else{
                //lakukan update akun
                    try{
            
                        Statement s = c.createStatement();
                        s.executeUpdate("update user set user = '"+getUbahUser()+"', password = '"+getUbahPass()+"';");
                        JOptionPane.showMessageDialog(null, "Akun telah berhasil diubah !");
                        this.dispose();
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(null, e);
                        this.dispose();
                    }    
            }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_ubahActionPerformed
    //-----------------------------------------------------------------------------------------------------

    //event handling
    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        this.dispose();
    }//GEN-LAST:event_batalActionPerformed
    //-----------------------------------------------------------------------------------------------------

    //event handling
    private void ubahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ubahKeyPressed
         //mengambil koneksi
        Connection c = Koneksi.getKoneksiUser();
        
        //merubah username dan password
        try{
                Statement s = c.createStatement();
                s.executeUpdate("update user set user = '"+getUbahUser()+"', password = '"+getUbahPass()+"';");
                JOptionPane.showMessageDialog(null, "Akun telah berhasil diubah !");
                this.dispose();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        this.dispose();
    }//GEN-LAST:event_ubahKeyPressed
    //-----------------------------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JpassAwal;
    private javax.swing.JPasswordField Jpassubah;
    private javax.swing.JTextField Juserubah;
    private javax.swing.JButton batal;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelUser;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
