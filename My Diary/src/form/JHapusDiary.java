
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
//-----------------------------------------------------------------------------------------------------

public class JHapusDiary extends javax.swing.JInternalFrame {
    
    private DefaultTableModel model;
    
    //Konstruktor
    public JHapusDiary() {
        
        initComponents();
        
        //membuat tabel
        model = new DefaultTableModel();
        tabelHapus.setModel(model);
        model.addColumn("Id");
        model.addColumn("Tanggal");
        model.addColumn("Judul");
        
        //agar loadData() dijalankan ketika class di jalankan
        loadData();
    }
    //-----------------------------------------------------------------------------------------------------
    
    //menampilkan data pada tabel ketika aplikasi dijalankan
    public void loadData(){
        //menghapus seluruh data
        model.getDataVector().removeAllElements();
        //memberi tahu bahwa data telah kosong
        model.fireTableDataChanged();
        
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "select id, judul, tanggal from diary;";
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                //lakukan penelusuran baris
                Object[] o = new Object[3];
                o[0] = r.getInt("Id");
                o[1] = r.getDate("Tanggal");
                o[2] = r.getString("Judul");
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
        tabelHapus = new javax.swing.JTable();
        TombolHapus = new javax.swing.JButton();
        TombolBatal = new javax.swing.JButton();
        segar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setTitle("Hapus Diary ");
        setPreferredSize(new java.awt.Dimension(800, 431));

        tabelHapus.setBackground(new java.awt.Color(0, 255, 255));
        tabelHapus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tanggal", "Judul", "Isi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelHapus.setRequestFocusEnabled(false);
        tabelHapus.setUpdateSelectionOnSort(false);
        tabelHapus.setVerifyInputWhenFocusTarget(false);
        tabelHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelHapusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelHapus);
        if (tabelHapus.getColumnModel().getColumnCount() > 0) {
            tabelHapus.getColumnModel().getColumn(0).setResizable(false);
            tabelHapus.getColumnModel().getColumn(1).setResizable(false);
            tabelHapus.getColumnModel().getColumn(2).setResizable(false);
            tabelHapus.getColumnModel().getColumn(3).setResizable(false);
        }

        TombolHapus.setBackground(new java.awt.Color(0, 204, 0));
        TombolHapus.setForeground(new java.awt.Color(255, 255, 255));
        TombolHapus.setText("Hapus");
        TombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolHapusActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Diary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(segar)
                        .addGap(18, 18, 18)
                        .addComponent(TombolHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TombolBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segar)
                    .addComponent(TombolHapus)
                    .addComponent(TombolBatal))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(800, 431));
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------
 
    //event untuk menghapus data pada tabel
    private void TombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolHapusActionPerformed
        //memilih item terpilih
        int i = tabelHapus.getSelectedRow();
        if(i == -1){
            return;
        }
        Integer id = (Integer) model.getValueAt(i, 0);
        
        //validasi untuk menghapus data
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus Diary ini ?","Perhatian !",JOptionPane.YES_NO_OPTION);
        if(konfirmasi==0){
            try{
            String sql = "delete from diary where id = ?; ";
            Connection c = Koneksi.getKoneksi();
            PreparedStatement p = c.prepareStatement(sql);
            
            p.setInt(1, id);
            
            p.executeUpdate();
            p.close();
            
            }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            }finally{
            loadData();
        }
        }else if(konfirmasi==1){
            JOptionPane.showMessageDialog(null, "Diary anda tidak jadi dihapus :) ");
        }
    }//GEN-LAST:event_TombolHapusActionPerformed
    //-----------------------------------------------------------------------------------------------------
 
    //event membatalkan opsi Ubah
    private void TombolBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolBatalActionPerformed
        this.dispose();
    }//GEN-LAST:event_TombolBatalActionPerformed
    //-----------------------------------------------------------------------------------------------------
 
    //event untuk refresh tabel
    private void segarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segarActionPerformed
        loadData();
    }//GEN-LAST:event_segarActionPerformed
    //-----------------------------------------------------------------------------------------------------
 
    //event handling
    private void tabelHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelHapusMouseClicked
      
    }//GEN-LAST:event_tabelHapusMouseClicked
    //-----------------------------------------------------------------------------------------------------
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TombolBatal;
    private javax.swing.JButton TombolHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton segar;
    private javax.swing.JTable tabelHapus;
    // End of variables declaration//GEN-END:variables
}
