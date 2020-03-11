
package form;

//daftar import package
import javax.swing.JOptionPane;
import database.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
//---------------------------------------------------------------------------------------------------------

public class FormAwal extends javax.swing.JFrame {

    //Deklarasi variable dari setiap class
    MainForm main = new MainForm();
    JIUbahAkun ubahAkun = new JIUbahAkun();
    //-----------------------------------------------------------------------------------------------------
    
    //method untuk mendapatkan username
    public String getMainUser(){
        return Jusername.getText();
    }
    //-----------------------------------------------------------------------------------------------------
    
    //method untuk mendapatkan password
    protected String getMainPass(){
        return Jpassword.getText();
    }
    //-----------------------------------------------------------------------------------------------------
    
    //Konstruktor
    public FormAwal() {
        initComponents();
        PanelLogin.setVisible(false);
        PanelBuatAkun.setVisible(false);
    } 
    //-----------------------------------------------------------------------------------------------------
    
    //untuk mendapatkan username dan password baru
    public String getUserBaru(){
        return JUsernameBaru.getText();
    }
    public String getPassBaru(){
        return JPasswordBaru.getText();
    }
    public String getRePass(){
        return JRePasswordBaru.getText();
    }
    //.....................................................................................................
    
    //method untuk menutup Panel BuatAkun
    public void tutupPanelBuatAkun(){
        PanelBuatAkun.setVisible(false);
    }
    //Kode Utama
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backgroundAwal1 = new form.backgroundAwal();
        Login = new javax.swing.JButton();
        PanelTransparant = new form.panelTransparant();
        panelTransparanfJudul = new form.panelTransparanfJudul();
        BuatAkun = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jusername = new javax.swing.JTextField();
        Jpassword = new javax.swing.JPasswordField();
        masuk = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        PanelBuatAkun = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JUsernameBaru = new javax.swing.JTextField();
        JPasswordBaru = new javax.swing.JPasswordField();
        buat = new javax.swing.JButton();
        batalBuat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        JRePasswordBaru = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi My Diary");
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1087, 641));

        Login.setBackground(new java.awt.Color(0, 204, 0));
        Login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Masuk");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginKeyPressed(evt);
            }
        });

        PanelTransparant.setBackground(new java.awt.Color(0, 0, 0));
        PanelTransparant.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelTransparantLayout = new javax.swing.GroupLayout(PanelTransparant);
        PanelTransparant.setLayout(PanelTransparantLayout);
        PanelTransparantLayout.setHorizontalGroup(
            PanelTransparantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        PanelTransparantLayout.setVerticalGroup(
            PanelTransparantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        panelTransparanfJudul.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout panelTransparanfJudulLayout = new javax.swing.GroupLayout(panelTransparanfJudul);
        panelTransparanfJudul.setLayout(panelTransparanfJudulLayout);
        panelTransparanfJudulLayout.setHorizontalGroup(
            panelTransparanfJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        panelTransparanfJudulLayout.setVerticalGroup(
            panelTransparanfJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        BuatAkun.setBackground(new java.awt.Color(51, 102, 255));
        BuatAkun.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BuatAkun.setForeground(new java.awt.Color(255, 255, 255));
        BuatAkun.setText("Buat Akun");
        BuatAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuatAkunMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuatAkunMouseEntered(evt);
            }
        });
        BuatAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuatAkunActionPerformed(evt);
            }
        });
        BuatAkun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuatAkunKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout backgroundAwal1Layout = new javax.swing.GroupLayout(backgroundAwal1);
        backgroundAwal1.setLayout(backgroundAwal1Layout);
        backgroundAwal1Layout.setHorizontalGroup(
            backgroundAwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundAwal1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(backgroundAwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelTransparanfJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTransparant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(backgroundAwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundAwal1Layout.createSequentialGroup()
                    .addContainerGap(947, Short.MAX_VALUE)
                    .addComponent(BuatAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)))
        );
        backgroundAwal1Layout.setVerticalGroup(
            backgroundAwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundAwal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTransparanfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundAwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelTransparant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(backgroundAwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundAwal1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(BuatAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(546, Short.MAX_VALUE)))
        );

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setForeground(new java.awt.Color(255, 255, 255));
        panel.setOpaque(false);
        panel.setPreferredSize(new java.awt.Dimension(938, 596));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("My Diary");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("\"Your Note is Your Memories\"");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Selamat Datang !");

        PanelLogin.setBackground(new java.awt.Color(0, 0, 0));
        PanelLogin.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username   :");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password    :");

        Jusername.setBackground(new java.awt.Color(0, 255, 255));
        Jusername.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Jusername.setForeground(new java.awt.Color(0, 0, 0));
        Jusername.setToolTipText("Masukan Username\n");
        Jusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JusernameActionPerformed(evt);
            }
        });
        Jusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JusernameKeyPressed(evt);
            }
        });

        Jpassword.setBackground(new java.awt.Color(0, 255, 255));
        Jpassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Jpassword.setForeground(new java.awt.Color(0, 0, 0));
        Jpassword.setToolTipText("Masukan Password");

        masuk.setBackground(new java.awt.Color(51, 204, 0));
        masuk.setForeground(new java.awt.Color(255, 255, 255));
        masuk.setText("Masuk");
        masuk.setPreferredSize(new java.awt.Dimension(70, 30));
        masuk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                masukFocusGained(evt);
            }
        });
        masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukActionPerformed(evt);
            }
        });
        masuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                masukKeyPressed(evt);
            }
        });

        batal.setBackground(new java.awt.Color(255, 51, 51));
        batal.setForeground(new java.awt.Color(255, 255, 255));
        batal.setText("Batal");
        batal.setPreferredSize(new java.awt.Dimension(70, 30));
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(72, 72, 72)
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jusername)
                            .addComponent(Jpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(0, 403, Short.MAX_VALUE)
                        .addComponent(masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Jusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelBuatAkun.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password         :");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username        :");

        JUsernameBaru.setBackground(new java.awt.Color(0, 255, 255));
        JUsernameBaru.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        JUsernameBaru.setForeground(new java.awt.Color(0, 0, 0));
        JUsernameBaru.setToolTipText("Masukan Username\n");
        JUsernameBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUsernameBaruActionPerformed(evt);
            }
        });
        JUsernameBaru.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JUsernameBaruKeyPressed(evt);
            }
        });

        JPasswordBaru.setBackground(new java.awt.Color(0, 255, 255));
        JPasswordBaru.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JPasswordBaru.setForeground(new java.awt.Color(0, 0, 0));
        JPasswordBaru.setToolTipText("Masukan Password");

        buat.setBackground(new java.awt.Color(51, 204, 0));
        buat.setForeground(new java.awt.Color(255, 255, 255));
        buat.setText("Buat");
        buat.setPreferredSize(new java.awt.Dimension(70, 30));
        buat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buatFocusGained(evt);
            }
        });
        buat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buatActionPerformed(evt);
            }
        });
        buat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buatKeyPressed(evt);
            }
        });

        batalBuat.setBackground(new java.awt.Color(255, 51, 51));
        batalBuat.setForeground(new java.awt.Color(255, 255, 255));
        batalBuat.setText("Batal");
        batalBuat.setPreferredSize(new java.awt.Dimension(70, 30));
        batalBuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalBuatActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Re-Password    :");

        JRePasswordBaru.setBackground(new java.awt.Color(0, 255, 255));
        JRePasswordBaru.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JRePasswordBaru.setForeground(new java.awt.Color(0, 0, 0));
        JRePasswordBaru.setToolTipText("Masukan Password");
        JRePasswordBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRePasswordBaruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBuatAkunLayout = new javax.swing.GroupLayout(PanelBuatAkun);
        PanelBuatAkun.setLayout(PanelBuatAkunLayout);
        PanelBuatAkunLayout.setHorizontalGroup(
            PanelBuatAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuatAkunLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuatAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuatAkunLayout.createSequentialGroup()
                        .addGap(0, 368, Short.MAX_VALUE)
                        .addComponent(buat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(batalBuat, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(PanelBuatAkunLayout.createSequentialGroup()
                        .addGroup(PanelBuatAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(72, 72, 72)
                        .addGroup(PanelBuatAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JUsernameBaru)
                            .addComponent(JPasswordBaru, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                            .addComponent(JRePasswordBaru))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelBuatAkunLayout.setVerticalGroup(
            PanelBuatAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuatAkunLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelBuatAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JUsernameBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(PanelBuatAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JPasswordBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(PanelBuatAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRePasswordBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(48, 48, 48)
                .addGroup(PanelBuatAkunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batalBuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(jLabel5))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(PanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(PanelBuatAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(152, Short.MAX_VALUE)))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addComponent(PanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(194, 194, 194)
                    .addComponent(PanelBuatAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundAwal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundAwal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1114, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------
    
    //event handling 
    private void LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginKeyPressed
        PanelLogin.setVisible(true);
        Jusername.requestFocus(true);
        ubahAkun.dispose();
    }//GEN-LAST:event_LoginKeyPressed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        PanelLogin.setVisible(true);
        PanelBuatAkun.setVisible(false);
        Jusername.setText("");
        Jpassword.setText("");
        Jusername.requestFocus(true);
        
    }//GEN-LAST:event_LoginActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        Login.setBackground(new java.awt.Color(0,204,0));
    }//GEN-LAST:event_LoginMouseExited
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        Login.setBackground(new java.awt.Color(0,51,153));
    }//GEN-LAST:event_LoginMouseEntered
    //-----------------------------------------------------------------------------------------------------
        
    //event handling
    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        PanelLogin.setVisible(false);
        Jusername.setText("");
        Jpassword.setText("");
    }//GEN-LAST:event_batalActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void masukKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_masukKeyPressed

        Connection c = Koneksi.getKoneksiUser();
        
        //mengecek username dan password
        try{

            String sql = "select * from user;";
            Statement state = c.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            if(result.next()){
            
                if(!Jusername.getText().equals(result.getString("user")) && !Jpassword.getText().equals(result.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Username dan Passowrd Salah !");
                }else if(!Jusername.getText().equals(result.getString("user"))){
                    JOptionPane.showMessageDialog(null, "Username Salah !");
                }else if(!Jpassword.getText().equals(result.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Password Salah !");
                }else{
                    //Jika username dan password sesuai dengan database, maka login berhasil 
                    JOptionPane.showMessageDialog(null, "Selamat Datang  "+getMainUser()+" !");
                    this.dispose();
                    main.show();
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }   
        
    }//GEN-LAST:event_masukKeyPressed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukActionPerformed

        Connection c = Koneksi.getKoneksiUser();
        
        //mengecek username dan password
        try{

            String sql = "select * from user;";
            Statement state = c.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            if(result.next()){
                if(!Jusername.getText().equals(result.getString("user")) && !Jpassword.getText().equals(result.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Username dan Passowrd Salah !");
                }else if(!Jusername.getText().equals(result.getString("user"))){
                    JOptionPane.showMessageDialog(null, "Username Salah !");
                }else if(!Jpassword.getText().equals(result.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Password Salah !");
                }else{
                    //Jika username dan password sesuai dengan database, maka login berhasil 
                    JOptionPane.showMessageDialog(null, "Selamat Datang  "+getMainUser()+" !");
                    this.dispose();
                    main.show();
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }   
        
    }//GEN-LAST:event_masukActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    private void masukFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_masukFocusGained

    }//GEN-LAST:event_masukFocusGained

    private void JusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JusernameKeyPressed

    }//GEN-LAST:event_JusernameKeyPressed

    private void JusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JusernameActionPerformed

    }//GEN-LAST:event_JusernameActionPerformed

    private void BuatAkunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuatAkunMouseEntered
        BuatAkun.setBackground(new java.awt.Color(0,51,153));
    }//GEN-LAST:event_BuatAkunMouseEntered

    private void BuatAkunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuatAkunMouseExited
        BuatAkun.setBackground(new java.awt.Color(51,102,255)); 
    }//GEN-LAST:event_BuatAkunMouseExited

    private void BuatAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuatAkunActionPerformed
        
        Connection c = Koneksi.getKoneksiUser();
        
        //mengecek username dan password
        try{

            String sql = "select * from user;";
            Statement state = c.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            if(result.next()){
                JOptionPane.showMessageDialog(null, "Username dan Password telah dibuat ! ");
            }else{
                PanelBuatAkun.setVisible(true);
                PanelLogin.setVisible(false);
                JUsernameBaru.setText("");
                JPasswordBaru.setText("");
                JRePasswordBaru.setText("");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_BuatAkunActionPerformed

    private void BuatAkunKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuatAkunKeyPressed
        PanelBuatAkun.setVisible(true);
        PanelLogin.setVisible(false);
        JUsernameBaru.setText("");
        JPasswordBaru.setText("");
        JRePasswordBaru.setText("");
    }//GEN-LAST:event_BuatAkunKeyPressed

    private void JUsernameBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUsernameBaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JUsernameBaruActionPerformed

    private void JUsernameBaruKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JUsernameBaruKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JUsernameBaruKeyPressed

    private void buatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buatFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_buatFocusGained

    private void buatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buatActionPerformed
        if(!getPassBaru().equals(JRePasswordBaru.getText())){
            JOptionPane.showMessageDialog(null, "Masukan kembali password baru pada kolom Re-Password dengan benar !");
        }else{
            try{
            Connection c = Koneksi.getKoneksiUser();
            
            PreparedStatement p = c.prepareStatement("insert into user value (?, ?);");
            
            p.setString(1, getUserBaru());
            p.setString(2, getPassBaru());

            p.executeUpdate();
            p.close();
            
            tutupPanelBuatAkun();
            
            JOptionPane.showMessageDialog(null, "Akun baru berhasil dibuat !");
            
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                JOptionPane.showMessageDialog(null, "Akun baru gagal dibuat !");
                
                tutupPanelBuatAkun();
            }
        }
    }//GEN-LAST:event_buatActionPerformed

    private void buatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buatKeyPressed
        if(!JPasswordBaru.getText().equals(JRePasswordBaru.getText())){
            JOptionPane.showMessageDialog(null, "Masukan kembali password baru pada kolom Re-Password dengan benar !");
        }else{
            
            try{
            Connection c = Koneksi.getKoneksiUser();
            
            PreparedStatement p = c.prepareStatement("insert into user value (?, ?);");
            
            p.setString(1, getUserBaru());
            p.setString(2, getPassBaru());

            p.executeUpdate();
            p.close();
            
            JOptionPane.showMessageDialog(null, "Akun baru berhasil dibuat !");
            
            tutupPanelBuatAkun();
            
            
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                JOptionPane.showMessageDialog(null, "Akun baru gagal dibuat !");
                tutupPanelBuatAkun();
            }
        }
    }//GEN-LAST:event_buatKeyPressed

    private void batalBuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalBuatActionPerformed
        tutupPanelBuatAkun();
    }//GEN-LAST:event_batalBuatActionPerformed

    private void JRePasswordBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRePasswordBaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRePasswordBaruActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuatAkun;
    private javax.swing.JPasswordField JPasswordBaru;
    private javax.swing.JPasswordField JRePasswordBaru;
    private javax.swing.JTextField JUsernameBaru;
    private javax.swing.JPasswordField Jpassword;
    private javax.swing.JTextField Jusername;
    private javax.swing.JButton Login;
    private javax.swing.JPanel PanelBuatAkun;
    private javax.swing.JPanel PanelLogin;
    private form.panelTransparant PanelTransparant;
    private form.backgroundAwal backgroundAwal1;
    private javax.swing.JButton batal;
    private javax.swing.JButton batalBuat;
    private javax.swing.JButton buat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton masuk;
    private javax.swing.JPanel panel;
    private form.panelTransparanfJudul panelTransparanfJudul;
    // End of variables declaration//GEN-END:variables
}
