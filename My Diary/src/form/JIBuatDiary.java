
package form;

//daftar import package
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import database.Koneksi;
//-----------------------------------------------------------------------------------------------------
 
public class JIBuatDiary extends javax.swing.JInternalFrame {
    
    //Konstruktor
    public JIBuatDiary() {
        initComponents();
        java.util.Date date = new java.util.Date();
        JTanggal.setValue(date);
    }
    //-----------------------------------------------------------------------------------------------------
 
    //Kode Utama
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JJudul = new javax.swing.JTextField();
        JTanggal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JIsi = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setTitle("Buat Diary\n");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tanggal  :");

        JJudul.setBackground(new java.awt.Color(0, 255, 255));
        JJudul.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JJudul.setForeground(new java.awt.Color(0, 0, 0));

        JTanggal.setBackground(new java.awt.Color(0, 255, 255));
        JTanggal.setForeground(new java.awt.Color(0, 0, 0));
        JTanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));
        JTanggal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul     :");

        JIsi.setBackground(new java.awt.Color(51, 255, 255));
        JIsi.setColumns(20);
        JIsi.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        JIsi.setForeground(new java.awt.Color(0, 0, 0));
        JIsi.setLineWrap(true);
        JIsi.setRows(5);
        JIsi.setDragEnabled(true);
        JIsi.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(JIsi);

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Isi :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(553, 553, 553)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(JJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    @SuppressWarnings("empty-statement")
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Connection c = Koneksi.getKoneksi(); 
            
            //mendapatkan nilai dari setiap kolom
            java.util.Date tanggal = (java.util.Date) JTanggal.getValue();
            String judul = JJudul.getText();
            String isi = JIsi.getText();
            
            //eksekusi database
            final PreparedStatement prepare = c.prepareStatement("insert into diary(id, tanggal, judul, isi) value(?, ?, ?, ?);");
            
            prepare.setInt(1, 0);
            prepare.setDate(2, new Date(tanggal.getTime()));
            prepare.setString(3, judul);
            prepare.setString(4, isi);
            
            prepare.executeUpdate();
            prepare.close();
            
            JOptionPane.showMessageDialog(null, "Diary berhasil ditambahkan !");
            
            this.dispose();
            
            JTanggal.setText("");
            JJudul.setText("");
            JIsi.setText("");
            
        }catch(final SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(null, "Pengisian Nilai Tanggal kurang tepat atau Isi, dan Judul Diary tidak boleh kosong !");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    //-----------------------------------------------------------------------------------------------------
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JIsi;
    private javax.swing.JTextField JJudul;
    private javax.swing.JFormattedTextField JTanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
