
package form;

public class MainForm extends javax.swing.JFrame {

    //deklarasi manual variable
    JIBuatDiary buatDiary = new JIBuatDiary();
    JIUbahDiary ubahDiary = new JIUbahDiary();
    JHapusDiary hapusDiary = new JHapusDiary();
    ProfileProgramer aku = new ProfileProgramer();
    ProfileAplikasi apps = new ProfileAplikasi();
    JIUbahAkun ubahAkun = new JIUbahAkun();
    //-----------------------------------------------------------------------------------------------------
    
    //Konstruktor
    public MainForm() {
        initComponents();
    }
    //-----------------------------------------------------------------------------------------------------
    
    //Kode Utama
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        mainImage1 = new form.MainImage();
        keluar = new javax.swing.JButton();
        panelTransparanfJudul1 = new form.panelTransparanfJudul();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel = new form.panelTransparant();
        akunUbah = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Ubah = new javax.swing.JMenuItem();
        Hapus = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        aplikasi = new javax.swing.JMenuItem();
        programer = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi My Diary");
        setResizable(false);

        mainImage1.setPreferredSize(new java.awt.Dimension(1087, 630));

        keluar.setBackground(new java.awt.Color(204, 0, 51));
        keluar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("Keluar");
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                keluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                keluarMouseExited(evt);
            }
        });
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        panelTransparanfJudul1.setBackground(new java.awt.Color(0, 255, 255));
        panelTransparanfJudul1.setForeground(new java.awt.Color(0, 255, 255));

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("My Diary");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("\"Your Note is Your Memories\"");

        javax.swing.GroupLayout panelTransparanfJudul1Layout = new javax.swing.GroupLayout(panelTransparanfJudul1);
        panelTransparanfJudul1.setLayout(panelTransparanfJudul1Layout);
        panelTransparanfJudul1Layout.setHorizontalGroup(
            panelTransparanfJudul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanfJudul1Layout.createSequentialGroup()
                .addGroup(panelTransparanfJudul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransparanfJudul1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel2))
                    .addGroup(panelTransparanfJudul1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel3)))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        panelTransparanfJudul1Layout.setVerticalGroup(
            panelTransparanfJudul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransparanfJudul1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        akunUbah.setBackground(new java.awt.Color(51, 102, 255));
        akunUbah.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        akunUbah.setForeground(new java.awt.Color(255, 255, 255));
        akunUbah.setText("Ubah Akun");
        akunUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                akunUbahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                akunUbahMouseExited(evt);
            }
        });
        akunUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akunUbahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainImage1Layout = new javax.swing.GroupLayout(mainImage1);
        mainImage1.setLayout(mainImage1Layout);
        mainImage1Layout.setHorizontalGroup(
            mainImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainImage1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(mainImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTransparanfJudul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(akunUbah, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainImage1Layout.setVerticalGroup(
            mainImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainImage1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(mainImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainImage1Layout.createSequentialGroup()
                        .addComponent(akunUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelTransparanfJudul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar2.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar2.setForeground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Menu");
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExited(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/buatDiary.png"))); // NOI18N
        jMenuItem1.setText("Buat Baru");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Menu.add(jMenuItem1);

        Ubah.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        Ubah.setBackground(new java.awt.Color(0, 0, 0));
        Ubah.setForeground(new java.awt.Color(255, 255, 255));
        Ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/ubahDiary.png"))); // NOI18N
        Ubah.setText("Ubah");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        Menu.add(Ubah);

        Hapus.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        Hapus.setBackground(new java.awt.Color(0, 0, 0));
        Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hapusDiary.png"))); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        Menu.add(Hapus);

        jMenuBar2.add(Menu);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("About");

        aplikasi.setBackground(new java.awt.Color(0, 0, 0));
        aplikasi.setForeground(new java.awt.Color(255, 255, 255));
        aplikasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo My Diary.jpg"))); // NOI18N
        aplikasi.setText("Aplikasi");
        aplikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplikasiActionPerformed(evt);
            }
        });
        jMenu4.add(aplikasi);

        programer.setBackground(new java.awt.Color(0, 0, 0));
        programer.setForeground(new java.awt.Color(255, 255, 255));
        programer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/programer.jpg"))); // NOI18N
        programer.setText("Programer");
        programer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programerActionPerformed(evt);
            }
        });
        jMenu4.add(programer);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        buatDiary.dispose();
        ubahDiary.dispose();
        aku.dispose();
        apps.dispose();
        panel.add(hapusDiary);
        hapusDiary.setLocation(60, 25);
        hapusDiary.setVisible(true);
        hapusDiary.loadData();
    }//GEN-LAST:event_HapusActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void aplikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplikasiActionPerformed
        buatDiary.dispose();
        ubahDiary.dispose();
        hapusDiary.dispose();
        aku.dispose();
        
        panel.add(apps);
        apps.setLocation(60, 25);
        apps.setVisible(true);
    }//GEN-LAST:event_aplikasiActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        panel.add(buatDiary);
        buatDiary.setLocation(60, 25);
        buatDiary.setVisible(true);
        
        ubahDiary.dispose();
        hapusDiary.dispose();
        aku.dispose();
        apps.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        panel.add(ubahDiary);
        ubahDiary.setLocation(60, 25);
        ubahDiary.setVisible(true);
        ubahDiary.loadData();
        
        aku.dispose();
        apps.dispose();
        buatDiary.dispose();
        hapusDiary.dispose();
    }//GEN-LAST:event_UbahActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void keluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseEntered
        keluar.setBackground(new java.awt.Color(255,51,51));
    }//GEN-LAST:event_keluarMouseEntered
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void keluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseExited
        keluar.setBackground(new java.awt.Color(204,0,51));
    }//GEN-LAST:event_keluarMouseExited
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        this.dispose();
        
        //menampilkan FormAwal
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new FormAwal().setVisible(true);
            }
        });
    }//GEN-LAST:event_keluarActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void MenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEntered
        Menu.setBackground(new java.awt.Color(0,51,204));
    }//GEN-LAST:event_MenuMouseEntered
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void MenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExited
        Menu.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_MenuMouseExited
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void programerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programerActionPerformed
        panel.add(aku);
        aku.setLocation(60, 25);
        aku.setVisible(true);
        
        buatDiary.dispose();
        ubahDiary.dispose();
        hapusDiary.dispose();
        apps.dispose();
    }//GEN-LAST:event_programerActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void akunUbahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_akunUbahMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_akunUbahMouseEntered
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void akunUbahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_akunUbahMouseExited
    
    }//GEN-LAST:event_akunUbahMouseExited
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void akunUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akunUbahActionPerformed
        panel.add(ubahAkun);
        ubahAkun.setLocation(110, 25);
        ubahAkun.setVisible(true);
        ubahAkun.setUbahUser();
        ubahAkun.setUbahPass();
        ubahAkun.setPassAwal();
        
        buatDiary.dispose();
        ubahDiary.dispose();
        hapusDiary.dispose();
        aku.dispose();
        apps.dispose();
    }//GEN-LAST:event_akunUbahActionPerformed
    //-----------------------------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem Hapus;
    public javax.swing.JMenu Menu;
    public javax.swing.JMenuItem Ubah;
    private javax.swing.JButton akunUbah;
    private javax.swing.JMenuItem aplikasi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    public javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JButton keluar;
    private form.MainImage mainImage1;
    private form.panelTransparant panel;
    private form.panelTransparanfJudul panelTransparanfJudul1;
    private javax.swing.JMenuItem programer;
    // End of variables declaration//GEN-END:variables
}
