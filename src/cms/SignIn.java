/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this SignIn file, choose Tools | Templates
 * and open the SignIn in the editor.
 */
package cms;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author User
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form template
     */
    public SignIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        SignInPS.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelCrossSignin = new javax.swing.JPanel();
        labelCrossSignin = new javax.swing.JLabel();
        panelMinSignin = new javax.swing.JPanel();
        labelMinSignin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SignInEmail = new javax.swing.JTextField();
        SignInDistrict = new javax.swing.JComboBox<>();
        SignInPS = new javax.swing.JComboBox<>();
        SignInPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In");
        setLocationByPlatform(true);
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CRIME");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANAGEMENT");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SYSTEM");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("(CMS)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelCrossSignin.setBackground(new java.awt.Color(51, 51, 51));

        labelCrossSignin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        labelCrossSignin.setForeground(new java.awt.Color(255, 255, 255));
        labelCrossSignin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrossSignin.setText("X");
        labelCrossSignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCrossSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCrossSigninMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCrossSigninMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCrossSigninMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCrossSigninLayout = new javax.swing.GroupLayout(panelCrossSignin);
        panelCrossSignin.setLayout(panelCrossSigninLayout);
        panelCrossSigninLayout.setHorizontalGroup(
            panelCrossSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrossSigninLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCrossSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCrossSigninLayout.setVerticalGroup(
            panelCrossSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrossSigninLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCrossSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelCrossSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, 30));

        panelMinSignin.setBackground(new java.awt.Color(51, 51, 51));
        panelMinSignin.setPreferredSize(new java.awt.Dimension(35, 30));

        labelMinSignin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        labelMinSignin.setForeground(new java.awt.Color(255, 255, 255));
        labelMinSignin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMinSignin.setText("_");
        labelMinSignin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelMinSignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMinSigninMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMinSigninMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMinSigninMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMinSigninLayout = new javax.swing.GroupLayout(panelMinSignin);
        panelMinSignin.setLayout(panelMinSigninLayout);
        panelMinSigninLayout.setHorizontalGroup(
            panelMinSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinSigninLayout.createSequentialGroup()
                .addComponent(labelMinSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        panelMinSigninLayout.setVerticalGroup(
            panelMinSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMinSignin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelMinSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 35, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign In");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 100, 30));

        SignInEmail.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        SignInEmail.setForeground(new java.awt.Color(51, 51, 51));
        SignInEmail.setToolTipText("");
        SignInEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        jPanel1.add(SignInEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 230, 30));

        SignInDistrict.setBackground(new java.awt.Color(51, 51, 51));
        SignInDistrict.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        SignInDistrict.setForeground(new java.awt.Color(204, 204, 204));
        SignInDistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Dhaka", "Faridpur", "Kushtia" }));
        SignInDistrict.setBorder(null);
        SignInDistrict.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SignInDistrictItemStateChanged(evt);
            }
        });
        SignInDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInDistrictActionPerformed(evt);
            }
        });
        jPanel1.add(SignInDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 110, 30));

        SignInPS.setBackground(new java.awt.Color(51, 51, 51));
        SignInPS.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        SignInPS.setForeground(new java.awt.Color(204, 204, 204));
        SignInPS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Item" }));
        SignInPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInPSActionPerformed(evt);
            }
        });
        jPanel1.add(SignInPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 110, 30));

        SignInPassword.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        SignInPassword.setForeground(new java.awt.Color(51, 51, 51));
        SignInPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        SignInPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(SignInPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 230, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Enter");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 230, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("District");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Police Station");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(936, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query = "SELECT * FROM USERS WHERE EMAIL=? AND PASSWORD=?";

            
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, SignInEmail.getText());
            pst.setString(2, SignInPassword.getText());

            ResultSet rs = pst.executeQuery();

            if (rs.next() && SignInDistrict.getSelectedIndex()!=0 ) {
                
                JOptionPane.showMessageDialog(this, "LOGIN SUCCESSFULL");
                dispose();
                Dashboard dashFrame = new Dashboard();
                dashFrame.setVisible(true);
            } else {
                //JOptionPane.showMessageDialog(this, "LOGIN FAILED");
                
                SignInEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
            
                SignInPassword.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

        /*dispose();
        Dashboard dashFrame=new Dashboard();
        dashFrame.setVisible(true);*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SignInPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInPasswordActionPerformed

    private void SignInPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInPSActionPerformed

    private void labelCrossSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrossSigninMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelCrossSigninMouseClicked

    private void labelMinSigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinSigninMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelMinSigninMouseClicked

    private void SignInDistrictItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SignInDistrictItemStateChanged
        ArrayList<String> array = new ArrayList<>();
        Iterator<String> itr;

        if (SignInDistrict.getSelectedItem().equals("Select...")) {

            SignInPS.setEnabled(false);
            SignInPS.removeAllItems();
            array.add("No Item");
        } else if (SignInDistrict.getSelectedItem().equals("Dhaka")) {

            SignInPS.setEnabled(true);
            SignInPS.removeAllItems();
            array.add("Adabor");
            array.add("Airport");
            array.add("Badda");
            array.add("Banani");

            itr = array.iterator();
            while (itr.hasNext()) {
                SignInPS.addItem(itr.next());
            }
        } else if (SignInDistrict.getSelectedItem().equals("Faridpur")) {

            SignInPS.setEnabled(true);
            SignInPS.removeAllItems();
            array.add("Kotwali");
            array.add("Modhukhali");
            array.add("Boalmari");
            array.add("Nagarkanda");

            itr = array.iterator();
            while (itr.hasNext()) {
                SignInPS.addItem(itr.next());
            }
        } else if (SignInDistrict.getSelectedItem().equals("Kushtia")) {

            SignInPS.setEnabled(true);
            SignInPS.removeAllItems();
            array.add("Kushtia sador");
            array.add("Kumarkhali");
            array.add("Khoksa");
            array.add("Veramara");

            itr = array.iterator();
            while (itr.hasNext()) {
                SignInPS.addItem(itr.next());
            }
        }
    }//GEN-LAST:event_SignInDistrictItemStateChanged

    private void SignInDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInDistrictActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInDistrictActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += .1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void labelCrossSigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrossSigninMouseEntered
        panelCrossSignin.setBackground(new Color(204, 0, 0));
        labelCrossSignin.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelCrossSigninMouseEntered

    private void labelCrossSigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrossSigninMouseExited
        panelCrossSignin.setBackground(new Color(51, 51, 51));
        labelCrossSignin.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelCrossSigninMouseExited

    private void labelMinSigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinSigninMouseEntered
        panelMinSignin.setBackground(new Color(240, 240, 240));
        labelMinSignin.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_labelMinSigninMouseEntered

    private void labelMinSigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMinSigninMouseExited
        panelMinSignin.setBackground(new Color(51, 51, 51));
        labelMinSignin.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelMinSigninMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SignInDistrict;
    private javax.swing.JTextField SignInEmail;
    private javax.swing.JComboBox<String> SignInPS;
    private javax.swing.JPasswordField SignInPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCrossSignin;
    private javax.swing.JLabel labelMinSignin;
    private javax.swing.JPanel panelCrossSignin;
    private javax.swing.JPanel panelMinSignin;
    // End of variables declaration//GEN-END:variables
}
