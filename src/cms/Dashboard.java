/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author User
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    String filename = null;
    //private byte[] picture;
    byte[] person_image;

    DefaultTableModel model;

    public Dashboard() {
        initComponents();

        this.setLocationRelativeTo(null);
    }

    public void PoliceInfo() {
       

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

           /* DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            Police_Info.setDefaultRenderer(String.class, centerRenderer);
            Police_Info.setDefaultRenderer(Integer.class, centerRenderer);*/

            String query1 = "SELECT PoliceId,FirstName,Designation,Email FROM POLICE_INFO";
            PreparedStatement st = con.prepareStatement(query1);
            ResultSet rs = st.executeQuery();
            Police_Info.setModel(DbUtils.resultSetToTableModel(rs));

            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    
    public void CriminalInfo() {
        

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

           /* DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            Police_Info.setDefaultRenderer(String.class, centerRenderer);
            Police_Info.setDefaultRenderer(Integer.class, centerRenderer);*/

            String query1 = "SELECT CriminalId,FirstName,Age,FathersName,PreviousActs FROM CRIMINAL_INFO";
            PreparedStatement st = con.prepareStatement(query1);
            ResultSet rs = st.executeQuery();
            Criminal_Info.setModel(DbUtils.resultSetToTableModel(rs));

            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    
    
    public void CustodyInfo() {
        

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

           /* DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            Police_Info.setDefaultRenderer(String.class, centerRenderer);
            Police_Info.setDefaultRenderer(Integer.class, centerRenderer);*/

            String query1 = "SELECT CustodyNo,RemainingSeats,Capacity FROM CUSTODY_INFO";
            PreparedStatement st = con.prepareStatement(query1);
            ResultSet rs = st.executeQuery();
            Custody_Info.setModel(DbUtils.resultSetToTableModel(rs));

            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogAddPolice = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Salary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        District = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        PoliceStation = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        AddImage = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        PermanentAdd = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        LivingAdd = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        NID = new javax.swing.JTextField();
        img2 = new javax.swing.JLabel();
        PoliceIdNo = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelAddPoliceCross = new javax.swing.JPanel();
        labelAddPoliceCross = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        Save1 = new javax.swing.JButton();
        Designation = new javax.swing.JComboBox<>();
        JoiningDate = new com.toedter.calendar.JDateChooser();
        ResigningDate = new com.toedter.calendar.JDateChooser();
        DateOfBirth = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        buttonSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMini = new javax.swing.JPanel();
        labelMini = new javax.swing.JLabel();
        panelCross = new javax.swing.JPanel();
        labelCross = new javax.swing.JLabel();
        panelSlider1 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        panelComplaint = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        panelPoliceAdd3 = new javax.swing.JPanel();
        labelPoliceAdd3 = new javax.swing.JLabel();
        panelUpdatePolice3 = new javax.swing.JPanel();
        labelUpdatePolice3 = new javax.swing.JLabel();
        panelDeletePolice3 = new javax.swing.JPanel();
        labelDeletePolice3 = new javax.swing.JLabel();
        panelResetPolice3 = new javax.swing.JPanel();
        labelResetPolice3 = new javax.swing.JLabel();
        panelRefreshPolice3 = new javax.swing.JPanel();
        labelRefreshPolice3 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panelCustody = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        panelPoliceAdd2 = new javax.swing.JPanel();
        labelPoliceAdd2 = new javax.swing.JLabel();
        panelUpdatePolice2 = new javax.swing.JPanel();
        labelUpdatePolice2 = new javax.swing.JLabel();
        panelDeletePolice2 = new javax.swing.JPanel();
        labelDeletePolice2 = new javax.swing.JLabel();
        panelResetPolice2 = new javax.swing.JPanel();
        labelResetPolice2 = new javax.swing.JLabel();
        panelRefreshPolice2 = new javax.swing.JPanel();
        labelRefreshPolice2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Custody_Info = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        panelCriminal = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        panelPoliceAdd1 = new javax.swing.JPanel();
        labelPoliceAdd1 = new javax.swing.JLabel();
        panelUpdatePolice1 = new javax.swing.JPanel();
        labelUpdatePolice1 = new javax.swing.JLabel();
        panelDeletePolice1 = new javax.swing.JPanel();
        labelDeletePolice1 = new javax.swing.JLabel();
        panelResetPolice1 = new javax.swing.JPanel();
        labelResetPolice1 = new javax.swing.JLabel();
        panelRefreshPolice1 = new javax.swing.JPanel();
        labelRefreshPolice1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Criminal_Info = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelPolice = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        panelPoliceAdd = new javax.swing.JPanel();
        labelPoliceAdd = new javax.swing.JLabel();
        panelUpdatePolice = new javax.swing.JPanel();
        labelUpdatePolice = new javax.swing.JLabel();
        panelDeletePolice = new javax.swing.JPanel();
        labelDeletePolice = new javax.swing.JLabel();
        panelResetPolice = new javax.swing.JPanel();
        labelResetPolice = new javax.swing.JLabel();
        panelRefreshPolice = new javax.swing.JPanel();
        labelRefreshPolice = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Police_Info = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelPoliceInfo = new javax.swing.JPanel();
        labelPoliceInfo = new javax.swing.JLabel();
        panelCriminalInfo = new javax.swing.JPanel();
        labelCriminalInfo = new javax.swing.JLabel();
        panelCustodyInfo = new javax.swing.JPanel();
        labelCustodyInfo = new javax.swing.JLabel();
        panelComplain = new javax.swing.JPanel();
        labelComplain = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panelExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();

        dialogAddPolice.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAddPolice.setBackground(new java.awt.Color(204, 204, 204));
        dialogAddPolice.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogAddPolice.setLocationByPlatform(true);
        dialogAddPolice.setUndecorated(true);
        dialogAddPolice.setResizable(false);
        dialogAddPolice.setSize(new java.awt.Dimension(684, 470));
        dialogAddPolice.setType(java.awt.Window.Type.POPUP);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel10.setMaximumSize(new java.awt.Dimension(659, 455));
        jPanel10.setPreferredSize(new java.awt.Dimension(659, 455));

        jLabel5.setText("First Name");

        jLabel6.setText("Last Name");

        Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryActionPerformed(evt);
            }
        });

        jLabel7.setText("Age");

        jLabel9.setText("Gender");

        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });

        jLabel10.setText("Designation");

        jLabel12.setText("Phone");

        jLabel13.setText("District");

        District.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka" }));

        jLabel14.setText("Police Station");

        PoliceStation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adabor", "Airport", "Badda", "Banani" }));
        PoliceStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceStationActionPerformed(evt);
            }
        });

        jLabel15.setText("Date of Birth");

        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        jLabel16.setText("Date of Joining");

        jLabel17.setText("Date of Resigning");

        AddImage.setText("Add Image");
        AddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddImageActionPerformed(evt);
            }
        });

        jLabel18.setText("Salary");

        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        Save.setBackground(new java.awt.Color(51, 51, 51));
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("SAVE");
        Save.setBorder(null);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel19.setText("Permanent Address");

        jLabel20.setText("Living Address");

        jLabel21.setText("Email");

        jLabel22.setText("NID No");

        NID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIDActionPerformed(evt);
            }
        });

        img2.setBackground(new java.awt.Color(255, 255, 255));
        img2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Police Details - CMS");

        panelAddPoliceCross.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross.setText("X");
        labelAddPoliceCross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCrossMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCrossMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCrossMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCrossLayout = new javax.swing.GroupLayout(panelAddPoliceCross);
        panelAddPoliceCross.setLayout(panelAddPoliceCrossLayout);
        panelAddPoliceCrossLayout.setHorizontalGroup(
            panelAddPoliceCrossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCrossLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCrossLayout.setVerticalGroup(
            panelAddPoliceCrossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCrossLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 526, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Save1.setBackground(new java.awt.Color(51, 51, 51));
        Save1.setForeground(new java.awt.Color(255, 255, 255));
        Save1.setText("Cancel");
        Save1.setBorder(null);
        Save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save1ActionPerformed(evt);
            }
        });

        Designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IG", "DIG", "SP", "ASP", "SERGEANT" }));

        DateOfBirth.setName("DateOfBirth"); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(PoliceIdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addGap(23, 23, 23)
                                .addComponent(Designation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(46, 46, 46)
                                        .addComponent(District, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addGap(9, 9, 9)
                                        .addComponent(PoliceStation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(LivingAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(PermanentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                                        .addGap(140, 140, 140)
                                                        .addComponent(jLabel8))
                                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                                        .addGap(39, 39, 39)
                                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel21)
                                                    .addComponent(jLabel9)))
                                            .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7))
                                                .addGap(18, 18, 18)
                                                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Email)
                                            .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel22)
                                .addGap(35, 35, 35)
                                .addComponent(NID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(AddImage))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(Save1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JoiningDate, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(ResigningDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PoliceIdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(6, 6, 6))
                                    .addComponent(jLabel21))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(NID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13))
                            .addComponent(District, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(PoliceStation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20)
                        .addGap(6, 6, 6)
                        .addComponent(LivingAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel19)
                        .addGap(6, 6, 6)
                        .addComponent(PermanentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JoiningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResigningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(AddImage)
                        .addGap(72, 72, 72)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Save1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogAddPoliceLayout = new javax.swing.GroupLayout(dialogAddPolice.getContentPane());
        dialogAddPolice.getContentPane().setLayout(dialogAddPoliceLayout);
        dialogAddPoliceLayout.setHorizontalGroup(
            dialogAddPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogAddPoliceLayout.setVerticalGroup(
            dialogAddPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("CMS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 52));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 192, 10));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Complainant", "Criminal", "Police" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(109, 25));

        buttonSearch.setBackground(new java.awt.Color(51, 51, 51));
        buttonSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(buttonSearch))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, -1, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 34));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu(1).png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 38));

        panelMini.setBackground(new java.awt.Color(255, 255, 255));
        panelMini.setPreferredSize(new java.awt.Dimension(45, 35));

        labelMini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMini.setText("__");
        labelMini.setPreferredSize(new java.awt.Dimension(45, 35));
        labelMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMiniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMiniMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMiniLayout = new javax.swing.GroupLayout(panelMini);
        panelMini.setLayout(panelMiniLayout);
        panelMiniLayout.setHorizontalGroup(
            panelMiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMiniLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelMini, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMiniLayout.setVerticalGroup(
            panelMiniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMiniLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(panelMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, -1, 35));

        panelCross.setBackground(new java.awt.Color(255, 255, 255));

        labelCross.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        labelCross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCross.setText("X");
        labelCross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCrossMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCrossMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCrossMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCrossLayout = new javax.swing.GroupLayout(panelCross);
        panelCross.setLayout(panelCrossLayout);
        panelCrossLayout.setHorizontalGroup(
            panelCrossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrossLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCross, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCrossLayout.setVerticalGroup(
            panelCrossLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrossLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelCross, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(panelCross, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 50, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 35));

        panelComplaint.setBackground(new java.awt.Color(204, 204, 204));
        panelComplaint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelComplaint.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 950, 20));

        panelPoliceAdd3.setBackground(new java.awt.Color(204, 204, 204));

        labelPoliceAdd3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelPoliceAdd3.setForeground(new java.awt.Color(51, 51, 51));
        labelPoliceAdd3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPoliceAdd3.setText("Add");
        labelPoliceAdd3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPoliceAdd3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPoliceAdd3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPoliceAdd3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPoliceAdd3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPoliceAdd3Layout = new javax.swing.GroupLayout(panelPoliceAdd3);
        panelPoliceAdd3.setLayout(panelPoliceAdd3Layout);
        panelPoliceAdd3Layout.setHorizontalGroup(
            panelPoliceAdd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPoliceAdd3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelPoliceAdd3Layout.setVerticalGroup(
            panelPoliceAdd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPoliceAdd3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelPoliceAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComplaint.add(panelPoliceAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        panelUpdatePolice3.setBackground(new java.awt.Color(204, 204, 204));

        labelUpdatePolice3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelUpdatePolice3.setForeground(new java.awt.Color(51, 51, 51));
        labelUpdatePolice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUpdatePolice3.setText("Update");
        labelUpdatePolice3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelUpdatePolice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUpdatePolice3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUpdatePolice3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelUpdatePolice3Layout = new javax.swing.GroupLayout(panelUpdatePolice3);
        panelUpdatePolice3.setLayout(panelUpdatePolice3Layout);
        panelUpdatePolice3Layout.setHorizontalGroup(
            panelUpdatePolice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpdatePolice3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelUpdatePolice3Layout.setVerticalGroup(
            panelUpdatePolice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdatePolice3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelUpdatePolice3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComplaint.add(panelUpdatePolice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 30));

        panelDeletePolice3.setBackground(new java.awt.Color(204, 204, 204));

        labelDeletePolice3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelDeletePolice3.setForeground(new java.awt.Color(51, 51, 51));
        labelDeletePolice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDeletePolice3.setText("Delete");
        labelDeletePolice3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDeletePolice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDeletePolice3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDeletePolice3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDeletePolice3Layout = new javax.swing.GroupLayout(panelDeletePolice3);
        panelDeletePolice3.setLayout(panelDeletePolice3Layout);
        panelDeletePolice3Layout.setHorizontalGroup(
            panelDeletePolice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDeletePolice3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelDeletePolice3Layout.setVerticalGroup(
            panelDeletePolice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeletePolice3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelDeletePolice3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComplaint.add(panelDeletePolice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 70, 30));

        panelResetPolice3.setBackground(new java.awt.Color(204, 204, 204));

        labelResetPolice3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelResetPolice3.setForeground(new java.awt.Color(51, 51, 51));
        labelResetPolice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResetPolice3.setText("Reset");
        labelResetPolice3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelResetPolice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelResetPolice3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelResetPolice3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelResetPolice3Layout = new javax.swing.GroupLayout(panelResetPolice3);
        panelResetPolice3.setLayout(panelResetPolice3Layout);
        panelResetPolice3Layout.setHorizontalGroup(
            panelResetPolice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPolice3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResetPolice3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelResetPolice3Layout.setVerticalGroup(
            panelResetPolice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPolice3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResetPolice3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComplaint.add(panelResetPolice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 70, 30));

        panelRefreshPolice3.setBackground(new java.awt.Color(204, 204, 204));

        labelRefreshPolice3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelRefreshPolice3.setForeground(new java.awt.Color(51, 51, 51));
        labelRefreshPolice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRefreshPolice3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        labelRefreshPolice3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRefreshPolice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRefreshPolice3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRefreshPolice3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRefreshPolice3Layout = new javax.swing.GroupLayout(panelRefreshPolice3);
        panelRefreshPolice3.setLayout(panelRefreshPolice3Layout);
        panelRefreshPolice3Layout.setHorizontalGroup(
            panelRefreshPolice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefreshPolice3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelRefreshPolice3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRefreshPolice3Layout.setVerticalGroup(
            panelRefreshPolice3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefreshPolice3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelRefreshPolice3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComplaint.add(panelRefreshPolice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 50, 30));

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Complaint ID", "Complaint Type", "Complainant Name", "Complainant Type", "Date of Issue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable4.setFocusable(false);
        jTable4.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable4.setRowHeight(20);
        jTable4.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);

        jPanel19.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 490));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Preview");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.black));
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 335, 490));

        panelComplaint.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 490));

        panelSlider1.add(panelComplaint, "card2");

        panelCustody.setBackground(new java.awt.Color(204, 204, 204));
        panelCustody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCustody.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 780, 20));

        panelPoliceAdd2.setBackground(new java.awt.Color(204, 204, 204));

        labelPoliceAdd2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelPoliceAdd2.setForeground(new java.awt.Color(51, 51, 51));
        labelPoliceAdd2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPoliceAdd2.setText("Add");
        labelPoliceAdd2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPoliceAdd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPoliceAdd2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPoliceAdd2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPoliceAdd2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPoliceAdd2Layout = new javax.swing.GroupLayout(panelPoliceAdd2);
        panelPoliceAdd2.setLayout(panelPoliceAdd2Layout);
        panelPoliceAdd2Layout.setHorizontalGroup(
            panelPoliceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPoliceAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelPoliceAdd2Layout.setVerticalGroup(
            panelPoliceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPoliceAdd2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelPoliceAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCustody.add(panelPoliceAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        panelUpdatePolice2.setBackground(new java.awt.Color(204, 204, 204));

        labelUpdatePolice2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelUpdatePolice2.setForeground(new java.awt.Color(51, 51, 51));
        labelUpdatePolice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUpdatePolice2.setText("Update");
        labelUpdatePolice2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelUpdatePolice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUpdatePolice2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUpdatePolice2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelUpdatePolice2Layout = new javax.swing.GroupLayout(panelUpdatePolice2);
        panelUpdatePolice2.setLayout(panelUpdatePolice2Layout);
        panelUpdatePolice2Layout.setHorizontalGroup(
            panelUpdatePolice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpdatePolice2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelUpdatePolice2Layout.setVerticalGroup(
            panelUpdatePolice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdatePolice2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelUpdatePolice2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCustody.add(panelUpdatePolice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 30));

        panelDeletePolice2.setBackground(new java.awt.Color(204, 204, 204));

        labelDeletePolice2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelDeletePolice2.setForeground(new java.awt.Color(51, 51, 51));
        labelDeletePolice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDeletePolice2.setText("Delete");
        labelDeletePolice2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDeletePolice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDeletePolice2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDeletePolice2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDeletePolice2Layout = new javax.swing.GroupLayout(panelDeletePolice2);
        panelDeletePolice2.setLayout(panelDeletePolice2Layout);
        panelDeletePolice2Layout.setHorizontalGroup(
            panelDeletePolice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDeletePolice2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelDeletePolice2Layout.setVerticalGroup(
            panelDeletePolice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeletePolice2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelDeletePolice2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCustody.add(panelDeletePolice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 70, 30));

        panelResetPolice2.setBackground(new java.awt.Color(204, 204, 204));

        labelResetPolice2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelResetPolice2.setForeground(new java.awt.Color(51, 51, 51));
        labelResetPolice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResetPolice2.setText("Reset");
        labelResetPolice2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelResetPolice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelResetPolice2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelResetPolice2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelResetPolice2Layout = new javax.swing.GroupLayout(panelResetPolice2);
        panelResetPolice2.setLayout(panelResetPolice2Layout);
        panelResetPolice2Layout.setHorizontalGroup(
            panelResetPolice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelResetPolice2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelResetPolice2Layout.setVerticalGroup(
            panelResetPolice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPolice2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResetPolice2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCustody.add(panelResetPolice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 70, 30));

        panelRefreshPolice2.setBackground(new java.awt.Color(204, 204, 204));

        labelRefreshPolice2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelRefreshPolice2.setForeground(new java.awt.Color(51, 51, 51));
        labelRefreshPolice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRefreshPolice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        labelRefreshPolice2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRefreshPolice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRefreshPolice2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRefreshPolice2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRefreshPolice2Layout = new javax.swing.GroupLayout(panelRefreshPolice2);
        panelRefreshPolice2.setLayout(panelRefreshPolice2Layout);
        panelRefreshPolice2Layout.setHorizontalGroup(
            panelRefreshPolice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefreshPolice2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelRefreshPolice2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRefreshPolice2Layout.setVerticalGroup(
            panelRefreshPolice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefreshPolice2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelRefreshPolice2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCustody.add(panelRefreshPolice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 50, 30));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));

        Custody_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Custody No.", "Seats Remaining", "Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Custody_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Custody_Info.setFocusable(false);
        Custody_Info.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Custody_Info.setRowHeight(20);
        Custody_Info.setSelectionBackground(new java.awt.Color(51, 51, 51));
        Custody_Info.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Custody_Info);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));

        jLabel23.setBackground(new java.awt.Color(153, 153, 153));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Preview");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.black));
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCustody.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 790, 490));

        panelSlider1.add(panelCustody, "card2");

        panelCriminal.setBackground(new java.awt.Color(204, 204, 204));
        panelCriminal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCriminal.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 790, 20));

        panelPoliceAdd1.setBackground(new java.awt.Color(204, 204, 204));

        labelPoliceAdd1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelPoliceAdd1.setForeground(new java.awt.Color(51, 51, 51));
        labelPoliceAdd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPoliceAdd1.setText("Add");
        labelPoliceAdd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPoliceAdd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPoliceAdd1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPoliceAdd1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPoliceAdd1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPoliceAdd1Layout = new javax.swing.GroupLayout(panelPoliceAdd1);
        panelPoliceAdd1.setLayout(panelPoliceAdd1Layout);
        panelPoliceAdd1Layout.setHorizontalGroup(
            panelPoliceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPoliceAdd1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelPoliceAdd1Layout.setVerticalGroup(
            panelPoliceAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPoliceAdd1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelPoliceAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCriminal.add(panelPoliceAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        panelUpdatePolice1.setBackground(new java.awt.Color(204, 204, 204));

        labelUpdatePolice1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelUpdatePolice1.setForeground(new java.awt.Color(51, 51, 51));
        labelUpdatePolice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUpdatePolice1.setText("Update");
        labelUpdatePolice1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelUpdatePolice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUpdatePolice1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUpdatePolice1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelUpdatePolice1Layout = new javax.swing.GroupLayout(panelUpdatePolice1);
        panelUpdatePolice1.setLayout(panelUpdatePolice1Layout);
        panelUpdatePolice1Layout.setHorizontalGroup(
            panelUpdatePolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpdatePolice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelUpdatePolice1Layout.setVerticalGroup(
            panelUpdatePolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdatePolice1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelUpdatePolice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCriminal.add(panelUpdatePolice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 30));

        panelDeletePolice1.setBackground(new java.awt.Color(204, 204, 204));

        labelDeletePolice1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelDeletePolice1.setForeground(new java.awt.Color(51, 51, 51));
        labelDeletePolice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDeletePolice1.setText("Delete");
        labelDeletePolice1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDeletePolice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDeletePolice1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDeletePolice1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDeletePolice1Layout = new javax.swing.GroupLayout(panelDeletePolice1);
        panelDeletePolice1.setLayout(panelDeletePolice1Layout);
        panelDeletePolice1Layout.setHorizontalGroup(
            panelDeletePolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDeletePolice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelDeletePolice1Layout.setVerticalGroup(
            panelDeletePolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeletePolice1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelDeletePolice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCriminal.add(panelDeletePolice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 70, 30));

        panelResetPolice1.setBackground(new java.awt.Color(204, 204, 204));

        labelResetPolice1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelResetPolice1.setForeground(new java.awt.Color(51, 51, 51));
        labelResetPolice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResetPolice1.setText("Reset");
        labelResetPolice1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelResetPolice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelResetPolice1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelResetPolice1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelResetPolice1Layout = new javax.swing.GroupLayout(panelResetPolice1);
        panelResetPolice1.setLayout(panelResetPolice1Layout);
        panelResetPolice1Layout.setHorizontalGroup(
            panelResetPolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelResetPolice1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelResetPolice1Layout.setVerticalGroup(
            panelResetPolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPolice1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResetPolice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCriminal.add(panelResetPolice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 70, 30));

        panelRefreshPolice1.setBackground(new java.awt.Color(204, 204, 204));

        labelRefreshPolice1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelRefreshPolice1.setForeground(new java.awt.Color(51, 51, 51));
        labelRefreshPolice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRefreshPolice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        labelRefreshPolice1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRefreshPolice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRefreshPolice1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRefreshPolice1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRefreshPolice1Layout = new javax.swing.GroupLayout(panelRefreshPolice1);
        panelRefreshPolice1.setLayout(panelRefreshPolice1Layout);
        panelRefreshPolice1Layout.setHorizontalGroup(
            panelRefreshPolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefreshPolice1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelRefreshPolice1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRefreshPolice1Layout.setVerticalGroup(
            panelRefreshPolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefreshPolice1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelRefreshPolice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCriminal.add(panelRefreshPolice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 50, 30));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        Criminal_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Father's Name", "Previous Acts"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Criminal_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Criminal_Info.setFocusable(false);
        Criminal_Info.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Criminal_Info.setRowHeight(20);
        Criminal_Info.setSelectionBackground(new java.awt.Color(51, 51, 51));
        Criminal_Info.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Criminal_Info);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Preview");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.black));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCriminal.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 790, 490));

        panelSlider1.add(panelCriminal, "card2");

        panelPolice.setBackground(new java.awt.Color(204, 204, 204));
        panelPolice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelPolice.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 880, 20));

        panelPoliceAdd.setBackground(new java.awt.Color(204, 204, 204));

        labelPoliceAdd.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelPoliceAdd.setForeground(new java.awt.Color(51, 51, 51));
        labelPoliceAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPoliceAdd.setText("Add");
        labelPoliceAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPoliceAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPoliceAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPoliceAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPoliceAddMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPoliceAddLayout = new javax.swing.GroupLayout(panelPoliceAdd);
        panelPoliceAdd.setLayout(panelPoliceAddLayout);
        panelPoliceAddLayout.setHorizontalGroup(
            panelPoliceAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPoliceAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelPoliceAddLayout.setVerticalGroup(
            panelPoliceAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPoliceAddLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelPoliceAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPolice.add(panelPoliceAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        panelUpdatePolice.setBackground(new java.awt.Color(204, 204, 204));

        labelUpdatePolice.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelUpdatePolice.setForeground(new java.awt.Color(51, 51, 51));
        labelUpdatePolice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUpdatePolice.setText("Update");
        labelUpdatePolice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelUpdatePolice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUpdatePoliceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUpdatePoliceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelUpdatePoliceLayout = new javax.swing.GroupLayout(panelUpdatePolice);
        panelUpdatePolice.setLayout(panelUpdatePoliceLayout);
        panelUpdatePoliceLayout.setHorizontalGroup(
            panelUpdatePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpdatePolice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelUpdatePoliceLayout.setVerticalGroup(
            panelUpdatePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdatePoliceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelUpdatePolice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPolice.add(panelUpdatePolice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 30));

        panelDeletePolice.setBackground(new java.awt.Color(204, 204, 204));

        labelDeletePolice.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelDeletePolice.setForeground(new java.awt.Color(51, 51, 51));
        labelDeletePolice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDeletePolice.setText("Delete");
        labelDeletePolice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDeletePolice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDeletePoliceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDeletePoliceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDeletePoliceLayout = new javax.swing.GroupLayout(panelDeletePolice);
        panelDeletePolice.setLayout(panelDeletePoliceLayout);
        panelDeletePoliceLayout.setHorizontalGroup(
            panelDeletePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDeletePolice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelDeletePoliceLayout.setVerticalGroup(
            panelDeletePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeletePoliceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelDeletePolice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPolice.add(panelDeletePolice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 70, 30));

        panelResetPolice.setBackground(new java.awt.Color(204, 204, 204));

        labelResetPolice.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelResetPolice.setForeground(new java.awt.Color(51, 51, 51));
        labelResetPolice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResetPolice.setText("Reset");
        labelResetPolice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelResetPolice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelResetPoliceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelResetPoliceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelResetPoliceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelResetPoliceLayout = new javax.swing.GroupLayout(panelResetPolice);
        panelResetPolice.setLayout(panelResetPoliceLayout);
        panelResetPoliceLayout.setHorizontalGroup(
            panelResetPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPoliceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResetPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelResetPoliceLayout.setVerticalGroup(
            panelResetPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPoliceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResetPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPolice.add(panelResetPolice, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 70, 30));

        panelRefreshPolice.setBackground(new java.awt.Color(204, 204, 204));

        labelRefreshPolice.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelRefreshPolice.setForeground(new java.awt.Color(51, 51, 51));
        labelRefreshPolice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRefreshPolice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        labelRefreshPolice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRefreshPolice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRefreshPoliceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRefreshPoliceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRefreshPoliceLayout = new javax.swing.GroupLayout(panelRefreshPolice);
        panelRefreshPolice.setLayout(panelRefreshPoliceLayout);
        panelRefreshPoliceLayout.setHorizontalGroup(
            panelRefreshPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefreshPoliceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelRefreshPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRefreshPoliceLayout.setVerticalGroup(
            panelRefreshPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefreshPoliceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelRefreshPolice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelPolice.add(panelRefreshPolice, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 50, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        Police_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", "", null},
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
                "Police ID", "Name", "Designation", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Police_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Police_Info.setFocusable(false);
        Police_Info.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Police_Info.setRowHeight(20);
        Police_Info.setSelectionBackground(new java.awt.Color(51, 51, 51));
        Police_Info.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Police_Info);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Preview");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.black));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPolice.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 880, 490));

        panelSlider1.add(panelPolice, "card2");

        jPanel2.add(panelSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 980, 550));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 980, 590));

        panelPoliceInfo.setBackground(java.awt.Color.darkGray);
        panelPoliceInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPoliceInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPoliceInfoMouseExited(evt);
            }
        });

        labelPoliceInfo.setBackground(new java.awt.Color(51, 51, 51));
        labelPoliceInfo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        labelPoliceInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelPoliceInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPoliceInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/policeman(1).png"))); // NOI18N
        labelPoliceInfo.setText("Police Info");
        labelPoliceInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelPoliceInfo.setIconTextGap(10);
        labelPoliceInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPoliceInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPoliceInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPoliceInfoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPoliceInfoLayout = new javax.swing.GroupLayout(panelPoliceInfo);
        panelPoliceInfo.setLayout(panelPoliceInfoLayout);
        panelPoliceInfoLayout.setHorizontalGroup(
            panelPoliceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPoliceInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        panelPoliceInfoLayout.setVerticalGroup(
            panelPoliceInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPoliceInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelPoliceInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, 50));

        panelCriminalInfo.setBackground(new java.awt.Color(51, 51, 51));

        labelCriminalInfo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        labelCriminalInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelCriminalInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCriminalInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/criminal-record(1).png"))); // NOI18N
        labelCriminalInfo.setText("Criminal Info");
        labelCriminalInfo.setIconTextGap(10);
        labelCriminalInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCriminalInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCriminalInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCriminalInfoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCriminalInfoLayout = new javax.swing.GroupLayout(panelCriminalInfo);
        panelCriminalInfo.setLayout(panelCriminalInfoLayout);
        panelCriminalInfoLayout.setHorizontalGroup(
            panelCriminalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCriminalInfoLayout.createSequentialGroup()
                .addComponent(labelCriminalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCriminalInfoLayout.setVerticalGroup(
            panelCriminalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCriminalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelCriminalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 50));

        panelCustodyInfo.setBackground(new java.awt.Color(51, 51, 51));

        labelCustodyInfo.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        labelCustodyInfo.setForeground(new java.awt.Color(255, 255, 255));
        labelCustodyInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCustodyInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jail(1).png"))); // NOI18N
        labelCustodyInfo.setText("Custody Info");
        labelCustodyInfo.setIconTextGap(10);
        labelCustodyInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCustodyInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCustodyInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCustodyInfoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCustodyInfoLayout = new javax.swing.GroupLayout(panelCustodyInfo);
        panelCustodyInfo.setLayout(panelCustodyInfoLayout);
        panelCustodyInfoLayout.setHorizontalGroup(
            panelCustodyInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustodyInfoLayout.createSequentialGroup()
                .addComponent(labelCustodyInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCustodyInfoLayout.setVerticalGroup(
            panelCustodyInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCustodyInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelCustodyInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 230, 50));

        panelComplain.setBackground(new java.awt.Color(51, 51, 51));

        labelComplain.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        labelComplain.setForeground(new java.awt.Color(255, 255, 255));
        labelComplain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelComplain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit(1).png"))); // NOI18N
        labelComplain.setText("Complaint Info");
        labelComplain.setIconTextGap(10);
        labelComplain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelComplainMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelComplainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelComplainMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelComplainLayout = new javax.swing.GroupLayout(panelComplain);
        panelComplain.setLayout(panelComplainLayout);
        panelComplainLayout.setHorizontalGroup(
            panelComplainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComplainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelComplain, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelComplainLayout.setVerticalGroup(
            panelComplainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelComplain, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelComplain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 230, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 192, 10));

        panelExit.setBackground(new java.awt.Color(153, 153, 153));

        labelExit.setBackground(new java.awt.Color(102, 102, 102));
        labelExit.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        labelExit.setForeground(new java.awt.Color(51, 51, 51));
        labelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log-out.png"))); // NOI18N
        labelExit.setText("Log Out");
        labelExit.setIconTextGap(10);
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelExitLayout = new javax.swing.GroupLayout(panelExit);
        panelExit.setLayout(panelExitLayout);
        panelExitLayout.setHorizontalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        panelExitLayout.setVerticalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 230, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setColor(JPanel p, JLabel l) {
        p.setBackground(new Color(204, 204, 204));
        l.setForeground(new Color(51, 51, 51));
    }

    public void resetColor(JPanel p, JLabel l) {
        p.setBackground(new Color(51, 51, 51));
        l.setForeground(new Color(204, 204, 204));
    }

    private void labelPoliceInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceInfoMouseEntered
        setColor(panelPoliceInfo, labelPoliceInfo);
        labelPoliceInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/policeman.png")));
    }//GEN-LAST:event_labelPoliceInfoMouseEntered

    private void labelPoliceInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceInfoMouseClicked
        panelSlider1.nextPanel(20, panelPolice, panelSlider1.right);//rootPaneCheckingEnabled
        PoliceInfo();


    }//GEN-LAST:event_labelPoliceInfoMouseClicked

    private void panelPoliceInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPoliceInfoMouseEntered

    }//GEN-LAST:event_panelPoliceInfoMouseEntered

    private void panelPoliceInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPoliceInfoMouseExited

    }//GEN-LAST:event_panelPoliceInfoMouseExited

    private void labelPoliceInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceInfoMouseExited
        resetColor(panelPoliceInfo, labelPoliceInfo);
        labelPoliceInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/policeman(1).png")));
    }//GEN-LAST:event_labelPoliceInfoMouseExited

    private void labelCriminalInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCriminalInfoMouseEntered
        setColor(panelCriminalInfo, labelCriminalInfo);
        labelCriminalInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/criminal-record.png")));
    }//GEN-LAST:event_labelCriminalInfoMouseEntered

    private void labelCriminalInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCriminalInfoMouseExited
        resetColor(panelCriminalInfo, labelCriminalInfo);
        labelCriminalInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/criminal-record(1).png")));
    }//GEN-LAST:event_labelCriminalInfoMouseExited

    private void labelCustodyInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCustodyInfoMouseEntered
        setColor(panelCustodyInfo, labelCustodyInfo);
        labelCustodyInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jail.png")));
    }//GEN-LAST:event_labelCustodyInfoMouseEntered

    private void labelCustodyInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCustodyInfoMouseExited
        resetColor(panelCustodyInfo, labelCustodyInfo);
        labelCustodyInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jail(1).png")));
    }//GEN-LAST:event_labelCustodyInfoMouseExited

    private void labelComplainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelComplainMouseEntered
        setColor(panelComplain, labelComplain);
        labelComplain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png")));
    }//GEN-LAST:event_labelComplainMouseEntered

    private void labelComplainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelComplainMouseExited
        resetColor(panelComplain, labelComplain);
        labelComplain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit(1).png")));
    }//GEN-LAST:event_labelComplainMouseExited

    private void labelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseEntered
        panelExit.setBackground(new Color(102, 102, 102));
        labelExit.setForeground(new Color(204, 204, 204));
        labelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log-out(1).png")));
    }//GEN-LAST:event_labelExitMouseEntered

    private void labelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseExited
        panelExit.setBackground(new Color(153, 153, 153));
        labelExit.setForeground(new Color(51, 51, 51));
        labelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log-out.png")));
    }//GEN-LAST:event_labelExitMouseExited

    private void labelCrossMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrossMouseEntered
        panelCross.setBackground(new Color(204, 0, 0));
        labelCross.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelCrossMouseEntered

    private void labelCrossMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrossMouseExited
        panelCross.setBackground(new Color(255, 255, 255));
        labelCross.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_labelCrossMouseExited

    private void labelCrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrossMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelCrossMouseClicked

    private void labelMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_labelMiniMouseClicked

    private void labelMiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniMouseEntered
        panelMini.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_labelMiniMouseEntered

    private void labelMiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMiniMouseExited
        panelMini.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelMiniMouseExited

    static int xx, yy;

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void labelPoliceAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAddMouseEntered
        resetColor(panelPoliceAdd, labelPoliceAdd);

    }//GEN-LAST:event_labelPoliceAddMouseEntered

    private void labelPoliceAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAddMouseExited
        setColor(panelPoliceAdd, labelPoliceAdd);

        //add button on police info
    }//GEN-LAST:event_labelPoliceAddMouseExited

    private void labelUpdatePoliceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePoliceMouseEntered
        resetColor(panelUpdatePolice, labelUpdatePolice);
    }//GEN-LAST:event_labelUpdatePoliceMouseEntered

    private void labelUpdatePoliceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePoliceMouseExited
        setColor(panelUpdatePolice, labelUpdatePolice);
    }//GEN-LAST:event_labelUpdatePoliceMouseExited

    private void labelDeletePoliceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePoliceMouseEntered
        resetColor(panelDeletePolice, labelDeletePolice);
    }//GEN-LAST:event_labelDeletePoliceMouseEntered

    private void labelDeletePoliceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePoliceMouseExited
        setColor(panelDeletePolice, labelDeletePolice);
    }//GEN-LAST:event_labelDeletePoliceMouseExited

    private void labelResetPoliceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPoliceMouseEntered
        resetColor(panelResetPolice, labelResetPolice);
    }//GEN-LAST:event_labelResetPoliceMouseEntered

    private void labelRefreshPoliceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRefreshPoliceMouseEntered
        labelRefreshPolice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh(1).png")));
    }//GEN-LAST:event_labelRefreshPoliceMouseEntered

    private void labelRefreshPoliceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRefreshPoliceMouseExited
        labelRefreshPolice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png")));
    }//GEN-LAST:event_labelRefreshPoliceMouseExited

    private void labelResetPoliceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPoliceMouseExited
        setColor(panelResetPolice, labelResetPolice);
    }//GEN-LAST:event_labelResetPoliceMouseExited

    private void SalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalaryActionPerformed

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void PoliceStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceStationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoliceStationActionPerformed

    private void AddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_SMOOTH));
        img2.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AddImageActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query = "INSERT INTO POLICE_INFO(FirstName,LastName,Age,Gender,DateOfBirth,Phone,Designation,"
                    + "LivingAddress,PermanentAddress,Email,NID,District,PoliceStation,JoiningDate,ResigningDate,Salary,Image)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, FirstName.getText());
            pst.setString(2, LastName.getText());
            pst.setString(3, Age.getText());
            pst.setString(4, Gender.getSelectedItem().toString());

            Date dateofbirth = DateOfBirth.getDate();
            String strDate = DateFormat.getDateInstance().format(dateofbirth);

            pst.setString(5, strDate);
            pst.setString(6, Phone.getText());
            pst.setString(7, Designation.getSelectedItem().toString());
            pst.setString(8, LivingAdd.getText());
            pst.setString(9, PermanentAdd.getText());
            pst.setString(10, Email.getText());
            pst.setString(11, NID.getText());
            pst.setString(12, District.getSelectedItem().toString());
            pst.setString(13, PoliceStation.getSelectedItem().toString());

            Date date2 = JoiningDate.getDate();
            String strDateofJoining = DateFormat.getDateInstance().format(date2);
            pst.setString(14, strDateofJoining);

            Date date3 = JoiningDate.getDate();
            String strDateofResigning = DateFormat.getDateInstance().format(date3);
            pst.setString(14, strDateofResigning);

            pst.setString(15, strDateofResigning);
            pst.setString(16, Salary.getText());

            pst.setBytes(17, person_image);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Added Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void NIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIDActionPerformed

    private void Save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Save1ActionPerformed

    private void labelPoliceAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAddMouseClicked
        dialogAddPolice.setLocationRelativeTo(null);
        dialogAddPolice.setVisible(true);
    }//GEN-LAST:event_labelPoliceAddMouseClicked

    private void labelAddPoliceCrossMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCrossMouseEntered
        panelAddPoliceCross.setBackground(new Color(204, 0, 0));
        labelAddPoliceCross.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelAddPoliceCrossMouseEntered

    private void labelAddPoliceCrossMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCrossMouseExited
        panelAddPoliceCross.setBackground(new Color(51, 51, 51));
        labelAddPoliceCross.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelAddPoliceCrossMouseExited

    private void labelAddPoliceCrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCrossMouseClicked
        dialogAddPolice.dispose();
    }//GEN-LAST:event_labelAddPoliceCrossMouseClicked

    private void labelPoliceAdd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPoliceAdd1MouseClicked

    private void labelPoliceAdd1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPoliceAdd1MouseEntered

    private void labelPoliceAdd1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPoliceAdd1MouseExited

    private void labelUpdatePolice1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePolice1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelUpdatePolice1MouseEntered

    private void labelUpdatePolice1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePolice1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelUpdatePolice1MouseExited

    private void labelDeletePolice1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePolice1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDeletePolice1MouseEntered

    private void labelDeletePolice1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePolice1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDeletePolice1MouseExited

    private void labelResetPolice1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPolice1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelResetPolice1MouseEntered

    private void labelResetPolice1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPolice1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelResetPolice1MouseExited

    private void labelRefreshPolice1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRefreshPolice1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelRefreshPolice1MouseEntered

    private void labelRefreshPolice1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRefreshPolice1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelRefreshPolice1MouseExited

    private void labelPoliceAdd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPoliceAdd2MouseClicked

    private void labelPoliceAdd2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPoliceAdd2MouseEntered

    private void labelPoliceAdd2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPoliceAdd2MouseExited

    private void labelUpdatePolice2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePolice2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelUpdatePolice2MouseEntered

    private void labelUpdatePolice2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePolice2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelUpdatePolice2MouseExited

    private void labelDeletePolice2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePolice2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDeletePolice2MouseEntered

    private void labelDeletePolice2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePolice2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDeletePolice2MouseExited

    private void labelResetPolice2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPolice2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelResetPolice2MouseEntered

    private void labelResetPolice2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPolice2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelResetPolice2MouseExited

    private void labelRefreshPolice2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRefreshPolice2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelRefreshPolice2MouseEntered

    private void labelRefreshPolice2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRefreshPolice2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelRefreshPolice2MouseExited

    private void labelPoliceAdd3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd3MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_labelPoliceAdd3MouseClicked

    private void labelPoliceAdd3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPoliceAdd3MouseEntered

    private void labelPoliceAdd3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPoliceAdd3MouseExited

    private void labelUpdatePolice3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePolice3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelUpdatePolice3MouseEntered

    private void labelUpdatePolice3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePolice3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelUpdatePolice3MouseExited

    private void labelDeletePolice3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePolice3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDeletePolice3MouseEntered

    private void labelDeletePolice3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePolice3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDeletePolice3MouseExited

    private void labelResetPolice3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPolice3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelResetPolice3MouseEntered

    private void labelResetPolice3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPolice3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelResetPolice3MouseExited

    private void labelRefreshPolice3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRefreshPolice3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelRefreshPolice3MouseEntered

    private void labelRefreshPolice3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRefreshPolice3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelRefreshPolice3MouseExited

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed

    }//GEN-LAST:event_buttonSearchActionPerformed

    private void labelCriminalInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCriminalInfoMouseClicked
        panelSlider1.nextPanel(20, panelCriminal, rootPaneCheckingEnabled);
        CriminalInfo() ;
    }//GEN-LAST:event_labelCriminalInfoMouseClicked

    private void labelCustodyInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCustodyInfoMouseClicked
        panelSlider1.nextPanel(20, panelCustody, rootPaneCheckingEnabled);
        CustodyInfo();
    }//GEN-LAST:event_labelCustodyInfoMouseClicked

    private void labelComplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelComplainMouseClicked
        panelSlider1.nextPanel(20, panelComplaint, rootPaneCheckingEnabled);
        
        
    }//GEN-LAST:event_labelComplainMouseClicked

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void labelResetPoliceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPoliceMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_labelResetPoliceMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddImage;
    private javax.swing.JTextField Age;
    private javax.swing.JTable Criminal_Info;
    private javax.swing.JTable Custody_Info;
    private com.toedter.calendar.JDateChooser DateOfBirth;
    private javax.swing.JComboBox<String> Designation;
    private javax.swing.JComboBox<String> District;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FirstName;
    private javax.swing.JComboBox<String> Gender;
    private com.toedter.calendar.JDateChooser JoiningDate;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField LivingAdd;
    private javax.swing.JTextField NID;
    private javax.swing.JTextField PermanentAdd;
    private javax.swing.JTextField Phone;
    private javax.swing.JLabel PoliceIdNo;
    private javax.swing.JComboBox<String> PoliceStation;
    private javax.swing.JTable Police_Info;
    private com.toedter.calendar.JDateChooser ResigningDate;
    private javax.swing.JTextField Salary;
    private javax.swing.JButton Save;
    private javax.swing.JButton Save1;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JDialog dialogAddPolice;
    private javax.swing.JLabel img2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel labelAddPoliceCross;
    private javax.swing.JLabel labelComplain;
    private javax.swing.JLabel labelCriminalInfo;
    private javax.swing.JLabel labelCross;
    private javax.swing.JLabel labelCustodyInfo;
    private javax.swing.JLabel labelDeletePolice;
    private javax.swing.JLabel labelDeletePolice1;
    private javax.swing.JLabel labelDeletePolice2;
    private javax.swing.JLabel labelDeletePolice3;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel labelMini;
    private javax.swing.JLabel labelPoliceAdd;
    private javax.swing.JLabel labelPoliceAdd1;
    private javax.swing.JLabel labelPoliceAdd2;
    private javax.swing.JLabel labelPoliceAdd3;
    private javax.swing.JLabel labelPoliceInfo;
    private javax.swing.JLabel labelRefreshPolice;
    private javax.swing.JLabel labelRefreshPolice1;
    private javax.swing.JLabel labelRefreshPolice2;
    private javax.swing.JLabel labelRefreshPolice3;
    private javax.swing.JLabel labelResetPolice;
    private javax.swing.JLabel labelResetPolice1;
    private javax.swing.JLabel labelResetPolice2;
    private javax.swing.JLabel labelResetPolice3;
    private javax.swing.JLabel labelUpdatePolice;
    private javax.swing.JLabel labelUpdatePolice1;
    private javax.swing.JLabel labelUpdatePolice2;
    private javax.swing.JLabel labelUpdatePolice3;
    private javax.swing.JPanel panelAddPoliceCross;
    private javax.swing.JPanel panelComplain;
    private javax.swing.JPanel panelComplaint;
    private javax.swing.JPanel panelCriminal;
    private javax.swing.JPanel panelCriminalInfo;
    private javax.swing.JPanel panelCross;
    private javax.swing.JPanel panelCustody;
    private javax.swing.JPanel panelCustodyInfo;
    private javax.swing.JPanel panelDeletePolice;
    private javax.swing.JPanel panelDeletePolice1;
    private javax.swing.JPanel panelDeletePolice2;
    private javax.swing.JPanel panelDeletePolice3;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelMini;
    private javax.swing.JPanel panelPolice;
    private javax.swing.JPanel panelPoliceAdd;
    private javax.swing.JPanel panelPoliceAdd1;
    private javax.swing.JPanel panelPoliceAdd2;
    private javax.swing.JPanel panelPoliceAdd3;
    private javax.swing.JPanel panelPoliceInfo;
    private javax.swing.JPanel panelRefreshPolice;
    private javax.swing.JPanel panelRefreshPolice1;
    private javax.swing.JPanel panelRefreshPolice2;
    private javax.swing.JPanel panelRefreshPolice3;
    private javax.swing.JPanel panelResetPolice;
    private javax.swing.JPanel panelResetPolice1;
    private javax.swing.JPanel panelResetPolice2;
    private javax.swing.JPanel panelResetPolice3;
    private diu.swe.habib.JPanelSlider.JPanelSlider panelSlider1;
    private javax.swing.JPanel panelUpdatePolice;
    private javax.swing.JPanel panelUpdatePolice1;
    private javax.swing.JPanel panelUpdatePolice2;
    private javax.swing.JPanel panelUpdatePolice3;
    // End of variables declaration//GEN-END:variables
}
