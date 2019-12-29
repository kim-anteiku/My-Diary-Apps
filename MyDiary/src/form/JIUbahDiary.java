
package form;

//daftar import package
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;
import database.Koneksi;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
public class JIUbahDiary extends javax.swing.JInternalFrame {
//-----------------------------------------------------------------------------------------------------

    //deklarasi manual variable
    private DefaultTableModel model;
    
    //Konstruktor
    public JIUbahDiary() {
        initComponents();
        
        //membuat tabel
        model = new DefaultTableModel();
        
        tabelUbah.setModel(model);
        
        model.addColumn("No");
        model.addColumn("Tanggal");
        model.addColumn("Judul");
        model.addColumn("Isi");
        
    }
    //-----------------------------------------------------------------------------------------------------
    
    //menambahkan data pada tabel
    public void loadData(){
        //menghapus seluruh data
        model.getDataVector().removeAllElements();
        //memberi tahu bahwa data telah kosong
        model.fireTableDataChanged();
        
        //eksekusi database
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "select * from diary;";
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                //lakukan penelusuran baris
                Object[] o = new Object[4];
                o[0] = r.getInt("No");
                o[1] = r.getDate("Tanggal");
                o[2] = r.getString("Judul");
                o[3] = r.getString("isi");
                
                model.addRow(o);
            }
            
            r.close();
            s.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    //-----------------------------------------------------------------------------------------------------
    
    //Kode Utama
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUbah = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JIsi = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        JTanggal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JJudul = new javax.swing.JTextField();
        TombolUbah = new javax.swing.JButton();
        TombolBatal = new javax.swing.JButton();
        segar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setTitle("Ubah Diary\n");
        setPreferredSize(new java.awt.Dimension(800, 431));

        tabelUbah.setBackground(new java.awt.Color(0, 255, 255));
        tabelUbah.setForeground(new java.awt.Color(0, 0, 0));
        tabelUbah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelUbah.setFocusable(false);
        tabelUbah.setRequestFocusEnabled(false);
        tabelUbah.setRowSelectionAllowed(false);
        tabelUbah.getTableHeader().setReorderingAllowed(false);
        tabelUbah.setVerifyInputWhenFocusTarget(false);
        tabelUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelUbahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelUbah);
        if (tabelUbah.getColumnModel().getColumnCount() > 0) {
            tabelUbah.getColumnModel().getColumn(0).setResizable(false);
            tabelUbah.getColumnModel().getColumn(1).setResizable(false);
            tabelUbah.getColumnModel().getColumn(2).setResizable(false);
            tabelUbah.getColumnModel().getColumn(3).setResizable(false);
        }

        JIsi.setBackground(new java.awt.Color(0, 255, 255));
        JIsi.setColumns(20);
        JIsi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JIsi.setForeground(new java.awt.Color(0, 0, 0));
        JIsi.setLineWrap(true);
        JIsi.setRows(5);
        jScrollPane2.setViewportView(JIsi);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tanggal  :");

        JTanggal.setBackground(new java.awt.Color(0, 255, 255));
        JTanggal.setForeground(new java.awt.Color(0, 0, 0));
        JTanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));
        JTanggal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul     :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Isi  :");

        JJudul.setBackground(new java.awt.Color(0, 255, 255));
        JJudul.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JJudul.setForeground(new java.awt.Color(0, 0, 0));
        JJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JJudulActionPerformed(evt);
            }
        });

        TombolUbah.setBackground(new java.awt.Color(0, 204, 0));
        TombolUbah.setForeground(new java.awt.Color(255, 255, 255));
        TombolUbah.setText("Ubah");
        TombolUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolUbahActionPerformed(evt);
            }
        });

        TombolBatal.setBackground(new java.awt.Color(255, 0, 0));
        TombolBatal.setForeground(new java.awt.Color(255, 255, 255));
        TombolBatal.setText("Batal");
        TombolBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolBatalActionPerformed(evt);
            }
        });

        segar.setBackground(new java.awt.Color(0, 51, 255));
        segar.setForeground(new java.awt.Color(255, 255, 255));
        segar.setText("Segarkan");
        segar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Daftar Diary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(segar)
                        .addGap(147, 147, 147)
                        .addComponent(TombolUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(TombolBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4))
                    .addComponent(JTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(segar)
                            .addComponent(TombolUbah)
                            .addComponent(TombolBatal)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );

        setSize(new java.awt.Dimension(800, 431));
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void JJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JJudulActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void TombolUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolUbahActionPerformed
        
        //mendapatkan baris terseleksi dari tabel
        int i = tabelUbah.getSelectedRow();
        if(i == -1){
            return;
        }
        
        //deklarasi variable untuk eksekusi database
        Integer no = (Integer) model.getValueAt(i,0);
        
        java.util.Date Jtgl = (java.util.Date) JTanggal.getValue();
        String Jjudul = JJudul.getText();
        String Jisi = JIsi.getText();
        
        //eksekusi variable
        try{
            String sql = "update diary set judul = ?, isi = ?, tanggal = ? where no = ?; ";
            Connection c = Koneksi.getKoneksi();
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setString(1, Jjudul);
            p.setString(2, Jisi);
            p.setDate(3, new java.sql.Date(Jtgl.getTime()));
            p.setInt(4, no);
   
            
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Perubahan Diary telah berhasil !");
            p.close();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            //menambahkan fungsi loadData()
            loadData();
            JJudul.setText("");
            JIsi.setText("");
            JTanggal.setText("");
        }    
    }//GEN-LAST:event_TombolUbahActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void TombolBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolBatalActionPerformed
        this.dispose();
        JTanggal.setText("");
        JJudul.setText("");
        JIsi.setText("");
    }//GEN-LAST:event_TombolBatalActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void segarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segarActionPerformed
        loadData();
    }//GEN-LAST:event_segarActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void tabelUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelUbahMouseClicked
        
        //mendapatkan baris terpilih dari tabel
        int i = tabelUbah.getSelectedRow();
        if(i == -1){
            //tidak ada baris terseleksi;
            return;
        }
        
        //ambil baris terseleksi;
        Integer no = (Integer) model.getValueAt(i, 0);
        
        java.util.Date tanggal = (java.util.Date) model.getValueAt(i, 1);
        JTanggal.setValue(tanggal);
        
        String jdl = (String) model.getValueAt(i, 2);
        JJudul.setText(jdl);
        
        String Tisi = (String) model.getValueAt(i, 3);
        JIsi.setText(Tisi);
    }//GEN-LAST:event_tabelUbahMouseClicked
    //-----------------------------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JIsi;
    private javax.swing.JTextField JJudul;
    private javax.swing.JFormattedTextField JTanggal;
    private javax.swing.JButton TombolBatal;
    private javax.swing.JButton TombolUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton segar;
    private javax.swing.JTable tabelUbah;
    // End of variables declaration//GEN-END:variables
}
