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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    byte[] person_image2;
    byte[] person_image5;
    byte[] person_image6;
    byte[] person_image7;
    byte[] person_image8;

    byte[] person_image9;
    byte[] person_image10;
    byte[] person_image11;
    byte[] person_image12;

    byte[] person_image20;

    DefaultTableModel model;

    public Dashboard() {
        initComponents();
        ComplaintInfo();

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
    
    
    public void CreateTable()
    {
        try{
            String sql="SELECT FirstName,LastName,Age FROM COMPLAINT_INFO";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            Complaint_Info.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
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
            String query1 = "SELECT CriminalId,FirstName,Age,FathersName,PreviousRecords FROM CRIMINAL_INFO";
            PreparedStatement st = con.prepareStatement(query1);
            ResultSet rs = st.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));

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

    public void ComplaintInfo() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            /* DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            Police_Info.setDefaultRenderer(String.class, centerRenderer);
            Police_Info.setDefaultRenderer(Integer.class, centerRenderer);*/
            String query1 = "SELECT ComplaintId,ComplaintType,FirstName,Occupation,DateOfFir FROM COMPLAINT_INFO";
            PreparedStatement st = con.prepareStatement(query1);
            ResultSet rs = st.executeQuery();
            Complaint_Info.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void UpdateCustodyTable() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String sql = "SELECT * FROM CUSTODY_INFO";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            Custody_Info.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogDeletePolice = new javax.swing.JDialog();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        panelAddPoliceCross4 = new javax.swing.JPanel();
        labelAddPoliceCross4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dialogAddPolice = new javax.swing.JDialog();
        jPanel28 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Salary1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        Age1 = new javax.swing.JTextField();
        Gender1 = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        Phone1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        District1 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        PoliceStation1 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        FirstName1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        AddImage1 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        LastName1 = new javax.swing.JTextField();
        Save5 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        PermanentAdd1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        LivingAdd1 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        Email1 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        NID1 = new javax.swing.JTextField();
        img3 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        panelAddPoliceCross5 = new javax.swing.JPanel();
        labelAddPoliceCross5 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        Save6 = new javax.swing.JButton();
        Designation1 = new javax.swing.JComboBox<>();
        JoiningDate1 = new com.toedter.calendar.JDateChooser();
        ResigningDate1 = new com.toedter.calendar.JDateChooser();
        DateOfBirth1 = new com.toedter.calendar.JDateChooser();
        dialogUpdatePolice = new javax.swing.JDialog();
        jPanel30 = new javax.swing.JPanel();
        Salary2 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        Age2 = new javax.swing.JTextField();
        Gender2 = new javax.swing.JComboBox<>();
        Phone2 = new javax.swing.JTextField();
        District2 = new javax.swing.JComboBox<>();
        PoliceStation2 = new javax.swing.JComboBox<>();
        FirstName2 = new javax.swing.JTextField();
        LastName2 = new javax.swing.JTextField();
        Save7 = new javax.swing.JButton();
        PermanentAdd2 = new javax.swing.JTextField();
        LivingAdd2 = new javax.swing.JTextField();
        Email2 = new javax.swing.JTextField();
        NID2 = new javax.swing.JTextField();
        img4 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        panelAddPoliceCross6 = new javax.swing.JPanel();
        labelAddPoliceCross6 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        Save8 = new javax.swing.JButton();
        Designation2 = new javax.swing.JComboBox<>();
        JoiningDate2 = new com.toedter.calendar.JDateChooser();
        ResigningDate2 = new com.toedter.calendar.JDateChooser();
        DateOfBirth2 = new com.toedter.calendar.JDateChooser();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        dialogAddCriminal = new javax.swing.JDialog();
        jPanel32 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        Age3 = new javax.swing.JTextField();
        Gender3 = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        Phone3 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        FirstName3 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        WorkAdd3 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        LivingAdd3 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        Email3 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        jPanel33 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        panelAddPoliceCross7 = new javax.swing.JPanel();
        labelAddPoliceCross7 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        DateOfBirth3 = new com.toedter.calendar.JDateChooser();
        jLabel73 = new javax.swing.JLabel();
        LastName3 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        FathersName3 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        EyeColor = new javax.swing.JComboBox<>();
        Tatoos = new javax.swing.JCheckBox();
        Glasses = new javax.swing.JCheckBox();
        Birthmarks = new javax.swing.JCheckBox();
        GoldTeeth = new javax.swing.JCheckBox();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        NID4 = new javax.swing.JTextField();
        Height = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        Gender5 = new javax.swing.JComboBox<>();
        jLabel79 = new javax.swing.JLabel();
        SkinColor = new javax.swing.JComboBox<>();
        jLabel80 = new javax.swing.JLabel();
        HairColor = new javax.swing.JComboBox<>();
        Beard = new javax.swing.JCheckBox();
        Mustache = new javax.swing.JCheckBox();
        MissingTeeth = new javax.swing.JCheckBox();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        scars = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        PermanentAdd3 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        OccurrenceId = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        PrevRec = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        CustodyNo = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        PoliceId = new javax.swing.JTextField();
        Gender9 = new javax.swing.JComboBox<>();
        img7 = new javax.swing.JLabel();
        img8 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Nationality = new com.toedter.components.JLocaleChooser();
        dialogDeleteCriminal = new javax.swing.JDialog();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        panelAddPoliceCross8 = new javax.swing.JPanel();
        labelAddPoliceCross8 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        dialogUpdateCriminal = new javax.swing.JDialog();
        jPanel36 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        Age5 = new javax.swing.JTextField();
        Gender10 = new javax.swing.JComboBox<>();
        Phone4 = new javax.swing.JTextField();
        CriminalId4 = new javax.swing.JTextField();
        PermanentAdd4 = new javax.swing.JTextField();
        LivingAdd5 = new javax.swing.JTextField();
        Email4 = new javax.swing.JTextField();
        Weight5 = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        panelAddPoliceCross9 = new javax.swing.JPanel();
        labelAddPoliceCross9 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        DateOfBirth4 = new com.toedter.calendar.JDateChooser();
        LastName5 = new javax.swing.JTextField();
        FathersName5 = new javax.swing.JTextField();
        Gender11 = new javax.swing.JComboBox<>();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        NID12 = new javax.swing.JTextField();
        Height5 = new javax.swing.JTextField();
        Gender12 = new javax.swing.JComboBox<>();
        Gender13 = new javax.swing.JComboBox<>();
        Gender14 = new javax.swing.JComboBox<>();
        jCheckBox30 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        Gender15 = new javax.swing.JComboBox<>();
        scars5 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        LivingAdd6 = new javax.swing.JTextField();
        NID15 = new javax.swing.JTextField();
        NID16 = new javax.swing.JTextField();
        NID17 = new javax.swing.JTextField();
        NID18 = new javax.swing.JTextField();
        Gender16 = new javax.swing.JComboBox<>();
        img11 = new javax.swing.JLabel();
        img12 = new javax.swing.JLabel();
        img10 = new javax.swing.JLabel();
        img9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jCheckBox53 = new javax.swing.JCheckBox();
        jCheckBox54 = new javax.swing.JCheckBox();
        jCheckBox55 = new javax.swing.JCheckBox();
        jCheckBox56 = new javax.swing.JCheckBox();
        jCheckBox57 = new javax.swing.JCheckBox();
        jCheckBox58 = new javax.swing.JCheckBox();
        jCheckBox59 = new javax.swing.JCheckBox();
        jCheckBox60 = new javax.swing.JCheckBox();
        jCheckBox61 = new javax.swing.JCheckBox();
        jCheckBox62 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        FirstName5 = new javax.swing.JTextField();
        jCheckBox63 = new javax.swing.JCheckBox();
        jSeparator25 = new javax.swing.JSeparator();
        dialogInsertComplaint = new javax.swing.JDialog();
        jPanel38 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        panelAddPoliceCross10 = new javax.swing.JPanel();
        labelAddPoliceCross10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator30 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jTimeChooser1 = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator32 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jTimeChooser2 = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jTimeChooser3 = new lu.tudor.santec.jtimechooser.JTimeChooser();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField7 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator34 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        dialogAccusedDetails = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        panelAddPoliceCross11 = new javax.swing.JPanel();
        labelAddPoliceCross11 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel92 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        img20 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        dialogAddComplainant = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        panelAddPoliceCross12 = new javax.swing.JPanel();
        labelAddPoliceCross12 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jTextField16 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField17 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        dialogDeleteComplaint = new javax.swing.JDialog();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        panelAddPoliceCross13 = new javax.swing.JPanel();
        labelAddPoliceCross13 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        dialogUpdateComplaint = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        panelAddPoliceCross14 = new javax.swing.JPanel();
        labelAddPoliceCross14 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        dialogAddCustody = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        panelAddPoliceCross15 = new javax.swing.JPanel();
        labelAddPoliceCross15 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        Capacity = new javax.swing.JTextField();
        CustodyType = new javax.swing.JComboBox<>();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        dialogUpdateCustody = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        panelAddPoliceCross16 = new javax.swing.JPanel();
        labelAddPoliceCross16 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jComboBox9 = new javax.swing.JComboBox<>();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jCheckBox46 = new javax.swing.JCheckBox();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel119 = new javax.swing.JLabel();
        CustodyNo2 = new javax.swing.JTextField();
        jCheckBox64 = new javax.swing.JCheckBox();
        dialogDeleteCustody = new javax.swing.JDialog();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        panelAddPoliceCross17 = new javax.swing.JPanel();
        labelAddPoliceCross17 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        CustodyNo3 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
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
        labelAddComplaint = new javax.swing.JLabel();
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
        Complaint_Info = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
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
        jTable2 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelCustody = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        panelPoliceAdd2 = new javax.swing.JPanel();
        labelAddCustody = new javax.swing.JLabel();
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
        panelSearchPolice5 = new javax.swing.JPanel();
        panelPolice6 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        Police_Info6 = new javax.swing.JTable();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jSeparator27 = new javax.swing.JSeparator();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jTextField20 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jTextField29 = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
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

        dialogDeletePolice.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogDeletePolice.setBackground(new java.awt.Color(204, 204, 204));
        dialogDeletePolice.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogDeletePolice.setLocationByPlatform(true);
        dialogDeletePolice.setUndecorated(true);
        dialogDeletePolice.setResizable(false);
        dialogDeletePolice.setSize(new java.awt.Dimension(218, 145));
        dialogDeletePolice.setType(java.awt.Window.Type.POPUP);

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel26.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel26AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));
        jPanel27.setForeground(new java.awt.Color(51, 51, 51));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Delete Police Info - CMS");

        panelAddPoliceCross4.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross4.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross4.setText("X");
        labelAddPoliceCross4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross4Layout = new javax.swing.GroupLayout(panelAddPoliceCross4);
        panelAddPoliceCross4.setLayout(panelAddPoliceCross4Layout);
        panelAddPoliceCross4Layout.setHorizontalGroup(
            panelAddPoliceCross4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross4Layout.setVerticalGroup(
            panelAddPoliceCross4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Police ID");
        jPanel26.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 28));

        jTextField1.setSelectionColor(new java.awt.Color(51, 51, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel26.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 50, 80, 28));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 30));

        javax.swing.GroupLayout dialogDeletePoliceLayout = new javax.swing.GroupLayout(dialogDeletePolice.getContentPane());
        dialogDeletePolice.getContentPane().setLayout(dialogDeletePoliceLayout);
        dialogDeletePoliceLayout.setHorizontalGroup(
            dialogDeletePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDeletePoliceLayout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dialogDeletePoliceLayout.setVerticalGroup(
            dialogDeletePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        dialogAddPolice.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAddPolice.setBackground(new java.awt.Color(204, 204, 204));
        dialogAddPolice.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogAddPolice.setLocationByPlatform(true);
        dialogAddPolice.setUndecorated(true);
        dialogAddPolice.setResizable(false);
        dialogAddPolice.setSize(new java.awt.Dimension(681, 465));
        dialogAddPolice.setType(java.awt.Window.Type.POPUP);
        dialogAddPolice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dialogAddPoliceMouseClicked(evt);
            }
        });

        jPanel28.setBackground(new java.awt.Color(204, 204, 204));
        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel28.setMaximumSize(new java.awt.Dimension(659, 455));
        jPanel28.setPreferredSize(new java.awt.Dimension(681, 465));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setText("First Name");
        jPanel28.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 53, -1, -1));

        jLabel38.setText("Last Name");
        jPanel28.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 53, -1, -1));

        Salary1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salary1ActionPerformed(evt);
            }
        });
        jPanel28.add(Salary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 219, 120, -1));

        jLabel39.setText("Age");
        jPanel28.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 83, -1, -1));
        jPanel28.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 129, -1, -1));

        jLabel41.setText("Gender");
        jPanel28.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 83, -1, -1));

        Age1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age1ActionPerformed(evt);
            }
        });
        jPanel28.add(Age1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 82, 120, -1));

        Gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender1ActionPerformed(evt);
            }
        });
        jPanel28.add(Gender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 82, 120, -1));

        jLabel45.setText("Designation");
        jPanel28.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 220, -1, 20));

        jLabel46.setText("Phone");
        jPanel28.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 113, -1, -1));
        jPanel28.add(Phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 112, 120, -1));

        jLabel47.setText("District");
        jPanel28.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 190, -1, -1));

        District1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka" }));
        jPanel28.add(District1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 190, 120, -1));

        jLabel48.setText("P. Station");
        jPanel28.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        PoliceStation1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adabor", "Airport", "Badda", "Banani" }));
        PoliceStation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceStation1ActionPerformed(evt);
            }
        });
        jPanel28.add(PoliceStation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 120, -1));

        jLabel49.setText("Date of Birth");
        jPanel28.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 143, -1, -1));

        FirstName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName1ActionPerformed(evt);
            }
        });
        jPanel28.add(FirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 52, 120, -1));

        jLabel50.setText("Date of Joining");
        jPanel28.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 53, -1, 20));

        jLabel51.setText("Date of Resigning");
        jPanel28.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 82, -1, 20));

        AddImage1.setText("Add Image");
        AddImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddImage1ActionPerformed(evt);
            }
        });
        jPanel28.add(AddImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 292, -1, -1));

        jLabel52.setText("Salary");
        jPanel28.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 50, -1));

        LastName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName1ActionPerformed(evt);
            }
        });
        jPanel28.add(LastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 52, 120, -1));

        Save5.setBackground(new java.awt.Color(51, 51, 51));
        Save5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save5.setForeground(new java.awt.Color(204, 204, 204));
        Save5.setText("Save");
        Save5.setBorder(null);
        Save5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save5ActionPerformed(evt);
            }
        });
        jPanel28.add(Save5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 354, 218, 30));

        jLabel53.setText("Permanent Address");
        jPanel28.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        jPanel28.add(PermanentAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 386, 54));

        jLabel54.setText("Living Address");
        jPanel28.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        jPanel28.add(LivingAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 386, 54));

        jLabel55.setText("Email");
        jPanel28.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 113, -1, -1));
        jPanel28.add(Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 112, 120, -1));

        jLabel56.setText("NID No");
        jPanel28.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 143, -1, -1));

        NID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NID1ActionPerformed(evt);
            }
        });
        jPanel28.add(NID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 142, 120, -1));

        img3.setBackground(new java.awt.Color(255, 255, 255));
        img3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel28.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 137, 220, 139));

        jPanel29.setBackground(new java.awt.Color(51, 51, 51));
        jPanel29.setForeground(new java.awt.Color(51, 51, 51));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Insert Police Details - CMS");

        panelAddPoliceCross5.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross5.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross5.setText("X");
        labelAddPoliceCross5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross5Layout = new javax.swing.GroupLayout(panelAddPoliceCross5);
        panelAddPoliceCross5.setLayout(panelAddPoliceCross5Layout);
        panelAddPoliceCross5Layout.setHorizontalGroup(
            panelAddPoliceCross5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross5Layout.setVerticalGroup(
            panelAddPoliceCross5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 487, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 680, -1));
        jPanel28.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 390, 10));
        jPanel28.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 390, 10));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel28.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 50, 13, 390));
        jPanel28.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 119, 218, 12));

        Save6.setBackground(new java.awt.Color(51, 51, 51));
        Save6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save6.setForeground(new java.awt.Color(204, 204, 204));
        Save6.setText("Cancel");
        Save6.setBorder(null);
        Save6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save6ActionPerformed(evt);
            }
        });
        jPanel28.add(Save6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 218, 30));

        Designation1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IG", "DIG", "SP", "ASP", "SERGEANT" }));
        jPanel28.add(Designation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 219, 120, -1));

        JoiningDate1.setDateFormatString("yyyy-m-dd");
        jPanel28.add(JoiningDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 52, 120, -1));

        ResigningDate1.setDateFormatString("yyyy,mm,dd");
        jPanel28.add(ResigningDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 81, 120, -1));

        DateOfBirth1.setDateFormatString("yyyy,mm,dd");
        DateOfBirth1.setName("DateOfBirth"); // NOI18N
        jPanel28.add(DateOfBirth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 142, 120, -1));

        javax.swing.GroupLayout dialogAddPoliceLayout = new javax.swing.GroupLayout(dialogAddPolice.getContentPane());
        dialogAddPolice.getContentPane().setLayout(dialogAddPoliceLayout);
        dialogAddPoliceLayout.setHorizontalGroup(
            dialogAddPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogAddPoliceLayout.setVerticalGroup(
            dialogAddPoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dialogUpdatePolice.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogUpdatePolice.setBackground(new java.awt.Color(204, 204, 204));
        dialogUpdatePolice.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogUpdatePolice.setLocationByPlatform(true);
        dialogUpdatePolice.setUndecorated(true);
        dialogUpdatePolice.setResizable(false);
        dialogUpdatePolice.setSize(new java.awt.Dimension(728, 523));
        dialogUpdatePolice.setType(java.awt.Window.Type.POPUP);

        jPanel30.setBackground(new java.awt.Color(204, 204, 204));
        jPanel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel30.setMaximumSize(new java.awt.Dimension(659, 455));
        jPanel30.setPreferredSize(new java.awt.Dimension(659, 455));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salary2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salary2ActionPerformed(evt);
            }
        });
        jPanel30.add(Salary2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 280, 120, -1));
        jPanel30.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 129, -1, -1));

        Age2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age2ActionPerformed(evt);
            }
        });
        jPanel30.add(Age2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, -1));

        Gender2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender2ActionPerformed(evt);
            }
        });
        jPanel30.add(Gender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 130, 120, -1));
        jPanel30.add(Phone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, -1));

        District2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka" }));
        jPanel30.add(District2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, -1));

        PoliceStation2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adabor", "Airport", "Badda", "Banani" }));
        PoliceStation2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceStation2ActionPerformed(evt);
            }
        });
        jPanel30.add(PoliceStation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 250, 120, -1));

        FirstName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName2ActionPerformed(evt);
            }
        });
        jPanel30.add(FirstName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 120, -1));

        LastName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName2ActionPerformed(evt);
            }
        });
        jPanel30.add(LastName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 100, 120, -1));

        Save7.setBackground(new java.awt.Color(51, 51, 51));
        Save7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save7.setForeground(new java.awt.Color(204, 204, 204));
        Save7.setText("Update");
        Save7.setBorder(null);
        Save7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save7ActionPerformed(evt);
            }
        });
        jPanel30.add(Save7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 218, 30));
        jPanel30.add(PermanentAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 442, 430, 54));
        jPanel30.add(LivingAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 352, 430, 54));
        jPanel30.add(Email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 160, 120, -1));

        NID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NID2ActionPerformed(evt);
            }
        });
        jPanel30.add(NID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 120, -1));

        img4.setBackground(new java.awt.Color(255, 255, 255));
        img4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel30.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 230, 150));

        jPanel31.setBackground(new java.awt.Color(51, 51, 51));
        jPanel31.setForeground(new java.awt.Color(51, 51, 51));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Update Police Details - CMS");
        jPanel31.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, -1, -1));

        panelAddPoliceCross6.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross6.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross6.setText("X");
        labelAddPoliceCross6.setPreferredSize(new java.awt.Dimension(35, 0));
        labelAddPoliceCross6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross6Layout = new javax.swing.GroupLayout(panelAddPoliceCross6);
        panelAddPoliceCross6.setLayout(panelAddPoliceCross6Layout);
        panelAddPoliceCross6Layout.setHorizontalGroup(
            panelAddPoliceCross6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross6Layout.setVerticalGroup(
            panelAddPoliceCross6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel31.add(panelAddPoliceCross6, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 0, -1, 25));

        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 728, -1));
        jPanel30.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 430, 10));
        jPanel30.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 430, 10));

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel30.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 100, 13, 400));
        jPanel30.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 235, 10));

        Save8.setBackground(new java.awt.Color(51, 51, 51));
        Save8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save8.setForeground(new java.awt.Color(204, 204, 204));
        Save8.setText("Cancel");
        Save8.setBorder(null);
        Save8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save8ActionPerformed(evt);
            }
        });
        jPanel30.add(Save8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 218, 30));

        Designation2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IG", "DIG", "SP", "ASP", "SERGEANT" }));
        jPanel30.add(Designation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 120, -1));

        JoiningDate2.setDateFormatString("yyyy-m-dd");
        jPanel30.add(JoiningDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 100, 120, -1));

        ResigningDate2.setDateFormatString("yyyy,mm,dd");
        jPanel30.add(ResigningDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 130, 120, -1));

        DateOfBirth2.setDateFormatString("yyyy,mm,dd");
        DateOfBirth2.setName("DateOfBirth"); // NOI18N
        jPanel30.add(DateOfBirth2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 190, 120, -1));

        jCheckBox1.setText("First Name");
        jCheckBox1.setContentAreaFilled(false);
        jPanel30.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, -1, 20));

        jCheckBox2.setText("Last Name");
        jCheckBox2.setContentAreaFilled(false);
        jPanel30.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 103, -1, 20));

        jCheckBox3.setText("Age");
        jCheckBox3.setContentAreaFilled(false);
        jPanel30.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, 20));

        jCheckBox4.setText("Gender");
        jCheckBox4.setContentAreaFilled(false);
        jPanel30.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 133, -1, 20));

        jCheckBox5.setText("Phone");
        jCheckBox5.setContentAreaFilled(false);
        jPanel30.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, -1, 20));

        jCheckBox6.setText("Email");
        jCheckBox6.setContentAreaFilled(false);
        jPanel30.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 163, -1, 20));

        jCheckBox7.setText("NID No");
        jCheckBox7.setContentAreaFilled(false);
        jPanel30.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, 80, 20));

        jCheckBox8.setText("Date of Birth");
        jCheckBox8.setContentAreaFilled(false);
        jPanel30.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 193, -1, 20));

        jCheckBox10.setText("Date of Resigning");
        jCheckBox10.setContentAreaFilled(false);
        jPanel30.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 130, -1, 20));

        jCheckBox11.setText("Change Image");
        jCheckBox11.setBorderPainted(true);
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        jPanel30.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        jCheckBox12.setText("District");
        jCheckBox12.setContentAreaFilled(false);
        jPanel30.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, -1, 20));

        jCheckBox13.setText("P. Station");
        jCheckBox13.setContentAreaFilled(false);
        jPanel30.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 253, -1, 20));

        jCheckBox14.setText("Designation");
        jCheckBox14.setContentAreaFilled(false);
        jPanel30.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 283, -1, 20));

        jCheckBox15.setText("Salary");
        jCheckBox15.setContentAreaFilled(false);
        jPanel30.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 283, -1, -1));

        jCheckBox16.setText("Living Address");
        jCheckBox16.setContentAreaFilled(false);
        jPanel30.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 20));

        jCheckBox17.setText("Permanent Address");
        jCheckBox17.setContentAreaFilled(false);
        jPanel30.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 20));

        jTextField2.setSelectionColor(new java.awt.Color(51, 51, 51));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel30.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 80, 28));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel60.setText("Police ID");
        jPanel30.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 60, 28));
        jPanel30.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 10));

        jCheckBox18.setText("Date of Joining");
        jCheckBox18.setContentAreaFilled(false);
        jPanel30.add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 100, -1, 20));

        jCheckBox9.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox9.setText("Select All");
        jCheckBox9.setToolTipText("Update all items");
        jCheckBox9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153), null, null));
        jPanel30.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 90, 28));

        javax.swing.GroupLayout dialogUpdatePoliceLayout = new javax.swing.GroupLayout(dialogUpdatePolice.getContentPane());
        dialogUpdatePolice.getContentPane().setLayout(dialogUpdatePoliceLayout);
        dialogUpdatePoliceLayout.setHorizontalGroup(
            dialogUpdatePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogUpdatePoliceLayout.setVerticalGroup(
            dialogUpdatePoliceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        dialogAddCriminal.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAddCriminal.setBackground(new java.awt.Color(204, 204, 204));
        dialogAddCriminal.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogAddCriminal.setLocationByPlatform(true);
        dialogAddCriminal.setUndecorated(true);
        dialogAddCriminal.setResizable(false);
        dialogAddCriminal.setSize(new java.awt.Dimension(911, 663));
        dialogAddCriminal.setType(java.awt.Window.Type.POPUP);

        jPanel32.setBackground(new java.awt.Color(204, 204, 204));
        jPanel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel32.setMaximumSize(new java.awt.Dimension(659, 455));
        jPanel32.setPreferredSize(new java.awt.Dimension(911, 663));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setText("First Name");
        jPanel32.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 54, -1, -1));

        jLabel62.setText("Last Name");
        jPanel32.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 54, -1, -1));

        jLabel63.setText("Age");
        jPanel32.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 84, -1, -1));
        jPanel32.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 129, -1, -1));

        jLabel65.setText("Marital Status");
        jPanel32.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 84, -1, -1));

        Age3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age3ActionPerformed(evt);
            }
        });
        jPanel32.add(Age3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 82, 120, -1));

        Gender3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Engineer", "Farmer", "Service", "BusinessMan", "Others" }));
        Gender3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender3ActionPerformed(evt);
            }
        });
        jPanel32.add(Gender3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 140, 120, -1));

        jLabel66.setText("Phone");
        jPanel32.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 114, -1, -1));
        jPanel32.add(Phone3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 112, 120, -1));

        jLabel67.setText("Date of Birth");
        jPanel32.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 144, -1, -1));

        FirstName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName3ActionPerformed(evt);
            }
        });
        jPanel32.add(FirstName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 52, 120, -1));

        jLabel68.setText("Work Address");
        jPanel32.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 360, -1, -1));
        jPanel32.add(WorkAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 380, 660, 54));

        jLabel69.setText("Living Address");
        jPanel32.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 280, -1, -1));

        LivingAdd3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LivingAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LivingAdd3ActionPerformed(evt);
            }
        });
        jPanel32.add(LivingAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 300, 660, 54));

        jLabel70.setText("Email");
        jPanel32.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 114, -1, -1));
        jPanel32.add(Email3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 120, -1));

        jLabel71.setText("Weight (kg)");
        jPanel32.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 233, -1, -1));

        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });
        jPanel32.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 230, 40, -1));

        jPanel33.setBackground(new java.awt.Color(51, 51, 51));
        jPanel33.setForeground(new java.awt.Color(51, 51, 51));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Insert Criminal Details - CMS");
        jPanel33.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, -1, -1));

        panelAddPoliceCross7.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross7.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross7.setText("X");
        labelAddPoliceCross7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross7Layout = new javax.swing.GroupLayout(panelAddPoliceCross7);
        panelAddPoliceCross7.setLayout(panelAddPoliceCross7Layout);
        panelAddPoliceCross7Layout.setHorizontalGroup(
            panelAddPoliceCross7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross7Layout.setVerticalGroup(
            panelAddPoliceCross7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel33.add(panelAddPoliceCross7, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 0, -1, 25));

        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 910, -1));
        jPanel32.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 660, 10));
        jPanel32.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 660, 10));

        DateOfBirth3.setDateFormatString("yyyy,mm,dd");
        DateOfBirth3.setName("DateOfBirth"); // NOI18N
        jPanel32.add(DateOfBirth3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 120, -1));

        jLabel73.setText("Father's Name");
        jPanel32.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 54, -1, -1));

        LastName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName3ActionPerformed(evt);
            }
        });
        jPanel32.add(LastName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 120, -1));

        jLabel74.setText("Gender");
        jPanel32.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 84, -1, -1));

        FathersName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FathersName3ActionPerformed(evt);
            }
        });
        jPanel32.add(FathersName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 50, 120, -1));

        jLabel75.setText("Nationality");
        jPanel32.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 114, -1, -1));

        EyeColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Brown", "Black", "Purple" }));
        EyeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EyeColorActionPerformed(evt);
            }
        });
        jPanel32.add(EyeColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 70, -1));

        Tatoos.setText("Tatoos");
        jPanel32.add(Tatoos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 203, -1, -1));

        Glasses.setText("Glasses");
        jPanel32.add(Glasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 203, -1, -1));

        Birthmarks.setText("Birthmarks");
        Birthmarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthmarksActionPerformed(evt);
            }
        });
        jPanel32.add(Birthmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 233, 90, -1));

        GoldTeeth.setText("Gold Teeth");
        jPanel32.add(GoldTeeth, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 233, 90, -1));

        jLabel76.setText("NID No");
        jPanel32.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 144, -1, -1));

        jLabel77.setText("Eye Color");
        jPanel32.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 203, -1, -1));

        NID4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NID4ActionPerformed(evt);
            }
        });
        jPanel32.add(NID4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 142, 120, -1));

        Height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightActionPerformed(evt);
            }
        });
        jPanel32.add(Height, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 200, 40, -1));

        jLabel78.setText("Height (inch)");
        jPanel32.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 203, -1, -1));

        Gender5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender5ActionPerformed(evt);
            }
        });
        jPanel32.add(Gender5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 120, -1));

        jLabel79.setText("Skin Color");
        jPanel32.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 233, -1, -1));

        SkinColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "White", "OffWhite", " " }));
        SkinColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkinColorActionPerformed(evt);
            }
        });
        jPanel32.add(SkinColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 70, -1));

        jLabel80.setText("Hair Color");
        jPanel32.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 203, -1, -1));

        HairColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "White", "OffWhite", " " }));
        HairColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HairColorActionPerformed(evt);
            }
        });
        jPanel32.add(HairColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 200, 70, -1));

        Beard.setText("Beard");
        jPanel32.add(Beard, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 203, -1, -1));

        Mustache.setText("Mustache");
        jPanel32.add(Mustache, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 203, -1, -1));

        MissingTeeth.setText("Missing Teeth");
        jPanel32.add(MissingTeeth, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 233, 100, -1));

        jLabel81.setText("Occupation");
        jPanel32.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 144, -1, -1));

        jLabel82.setText("Scars");
        jPanel32.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 233, -1, -1));

        scars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scarsActionPerformed(evt);
            }
        });
        jPanel32.add(scars, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 230, 70, -1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel32.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 40, 10, 540));
        jPanel32.add(PermanentAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 460, 660, 54));

        jLabel83.setText("Permanent Address");
        jPanel32.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 440, -1, -1));

        jLabel84.setText("Occurrence ID");
        jPanel32.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 553, -1, -1));

        OccurrenceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OccurrenceIdActionPerformed(evt);
            }
        });
        jPanel32.add(OccurrenceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 70, -1));

        jLabel85.setText("Previous Records");
        jPanel32.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 553, -1, -1));

        PrevRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevRecActionPerformed(evt);
            }
        });
        jPanel32.add(PrevRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 550, 70, -1));

        jLabel86.setText("Custody No");
        jPanel32.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 553, -1, -1));

        CustodyNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustodyNoActionPerformed(evt);
            }
        });
        jPanel32.add(CustodyNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 70, -1));

        jLabel87.setText("Police ID");
        jPanel32.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 553, -1, -1));

        PoliceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceIdActionPerformed(evt);
            }
        });
        jPanel32.add(PoliceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 70, -1));

        Gender9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Unmarried", "Devorced", "Widowed" }));
        Gender9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender9ActionPerformed(evt);
            }
        });
        jPanel32.add(Gender9, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 80, 120, -1));

        img7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel32.add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 319, 190, 100));

        img8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel32.add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 452, 190, 100));

        img6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel32.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 184, 190, 100));

        img5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel32.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 190, 100));
        jPanel32.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 660, 10));

        jButton2.setText("Back Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 552, -1, -1));

        jButton3.setText("Front Image");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, -1));

        jButton4.setText("Right Image");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 284, -1, -1));

        jButton5.setText("Left Image");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 419, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 620, 100, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel32.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 620, 100, 30));
        jPanel32.add(Nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 110, 120, -1));

        javax.swing.GroupLayout dialogAddCriminalLayout = new javax.swing.GroupLayout(dialogAddCriminal.getContentPane());
        dialogAddCriminal.getContentPane().setLayout(dialogAddCriminalLayout);
        dialogAddCriminalLayout.setHorizontalGroup(
            dialogAddCriminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogAddCriminalLayout.setVerticalGroup(
            dialogAddCriminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogDeleteCriminal.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogDeleteCriminal.setBackground(new java.awt.Color(204, 204, 204));
        dialogDeleteCriminal.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogDeleteCriminal.setLocationByPlatform(true);
        dialogDeleteCriminal.setUndecorated(true);
        dialogDeleteCriminal.setResizable(false);
        dialogDeleteCriminal.setSize(new java.awt.Dimension(234, 135));
        dialogDeleteCriminal.setType(java.awt.Window.Type.POPUP);

        jPanel34.setBackground(new java.awt.Color(204, 204, 204));
        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel34.setPreferredSize(new java.awt.Dimension(231, 135));
        jPanel34.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel34AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBackground(new java.awt.Color(51, 51, 51));
        jPanel35.setForeground(new java.awt.Color(51, 51, 51));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Delete Criminal Info - CMS");

        panelAddPoliceCross8.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross8.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross8.setText("X");
        labelAddPoliceCross8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross8Layout = new javax.swing.GroupLayout(panelAddPoliceCross8);
        panelAddPoliceCross8.setLayout(panelAddPoliceCross8Layout);
        panelAddPoliceCross8Layout.setHorizontalGroup(
            panelAddPoliceCross8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross8Layout.setVerticalGroup(
            panelAddPoliceCross8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel34.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 235, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("Criminal ID");
        jPanel34.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 28));

        jTextField3.setSelectionColor(new java.awt.Color(51, 51, 51));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel34.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 80, 28));

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(204, 204, 204));
        jButton8.setText("OK");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel34.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 97, 100, 30));

        javax.swing.GroupLayout dialogDeleteCriminalLayout = new javax.swing.GroupLayout(dialogDeleteCriminal.getContentPane());
        dialogDeleteCriminal.getContentPane().setLayout(dialogDeleteCriminalLayout);
        dialogDeleteCriminalLayout.setHorizontalGroup(
            dialogDeleteCriminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDeleteCriminalLayout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dialogDeleteCriminalLayout.setVerticalGroup(
            dialogDeleteCriminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDeleteCriminalLayout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogUpdateCriminal.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogUpdateCriminal.setBackground(new java.awt.Color(204, 204, 204));
        dialogUpdateCriminal.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogUpdateCriminal.setLocationByPlatform(true);
        dialogUpdateCriminal.setUndecorated(true);
        dialogUpdateCriminal.setResizable(false);
        dialogUpdateCriminal.setSize(new java.awt.Dimension(911, 708));
        dialogUpdateCriminal.setType(java.awt.Window.Type.POPUP);

        jPanel36.setBackground(new java.awt.Color(204, 204, 204));
        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel36.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel36.setMaximumSize(new java.awt.Dimension(659, 455));
        jPanel36.setPreferredSize(new java.awt.Dimension(911, 708));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel36.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 129, -1, -1));

        Age5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age5ActionPerformed(evt);
            }
        });
        jPanel36.add(Age5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 129, 120, -1));

        Gender10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender10ActionPerformed(evt);
            }
        });
        jPanel36.add(Gender10, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 189, 120, -1));
        jPanel36.add(Phone4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 159, 120, -1));

        CriminalId4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriminalId4ActionPerformed(evt);
            }
        });
        jPanel36.add(CriminalId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 45, 120, -1));
        jPanel36.add(PermanentAdd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 670, 54));

        LivingAdd5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LivingAdd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LivingAdd5ActionPerformed(evt);
            }
        });
        jPanel36.add(LivingAdd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 670, 54));
        jPanel36.add(Email4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 159, 120, -1));

        Weight5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Weight5ActionPerformed(evt);
            }
        });
        jPanel36.add(Weight5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 280, 40, -1));

        jPanel37.setBackground(new java.awt.Color(51, 51, 51));
        jPanel37.setForeground(new java.awt.Color(51, 51, 51));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setBackground(new java.awt.Color(255, 255, 255));
        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Update Criminal Details - CMS");
        jPanel37.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, -1, -1));

        panelAddPoliceCross9.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross9.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross9.setText("X");
        labelAddPoliceCross9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross9Layout = new javax.swing.GroupLayout(panelAddPoliceCross9);
        panelAddPoliceCross9.setLayout(panelAddPoliceCross9Layout);
        panelAddPoliceCross9Layout.setHorizontalGroup(
            panelAddPoliceCross9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross9Layout.setVerticalGroup(
            panelAddPoliceCross9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel37.add(panelAddPoliceCross9, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 0, -1, 25));

        jPanel36.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 910, -1));
        jPanel36.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 670, 10));
        jPanel36.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 660, 10));

        DateOfBirth4.setDateFormatString("yyyy,mm,dd");
        DateOfBirth4.setName("DateOfBirth"); // NOI18N
        jPanel36.add(DateOfBirth4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 189, 120, -1));

        LastName5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName5ActionPerformed(evt);
            }
        });
        jPanel36.add(LastName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 99, 120, -1));

        FathersName5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FathersName5ActionPerformed(evt);
            }
        });
        jPanel36.add(FathersName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 99, 120, -1));

        Gender11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender11ActionPerformed(evt);
            }
        });
        jPanel36.add(Gender11, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 250, 70, -1));

        jCheckBox21.setText("Tatoos");
        jPanel36.add(jCheckBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 253, -1, -1));

        jCheckBox27.setText("Glasses");
        jPanel36.add(jCheckBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 253, -1, -1));

        jCheckBox28.setText("Birthmarks");
        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });
        jPanel36.add(jCheckBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 283, -1, -1));

        jCheckBox29.setText("Gold Teeth");
        jPanel36.add(jCheckBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 283, -1, -1));

        NID12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NID12ActionPerformed(evt);
            }
        });
        jPanel36.add(NID12, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 189, 120, -1));

        Height5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Height5ActionPerformed(evt);
            }
        });
        jPanel36.add(Height5, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 250, 40, -1));

        Gender12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender12ActionPerformed(evt);
            }
        });
        jPanel36.add(Gender12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 129, 120, -1));

        Gender13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender13ActionPerformed(evt);
            }
        });
        jPanel36.add(Gender13, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 280, 70, -1));

        Gender14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender14ActionPerformed(evt);
            }
        });
        jPanel36.add(Gender14, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 250, 70, -1));

        jCheckBox30.setText("Beard");
        jPanel36.add(jCheckBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 253, -1, -1));

        jCheckBox31.setText("Mustache");
        jPanel36.add(jCheckBox31, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 253, -1, -1));

        jCheckBox32.setText("Missing Teeth");
        jPanel36.add(jCheckBox32, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 283, -1, -1));

        Gender15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender15ActionPerformed(evt);
            }
        });
        jPanel36.add(Gender15, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 159, 120, -1));

        scars5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scars5ActionPerformed(evt);
            }
        });
        jPanel36.add(scars5, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 280, 70, -1));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel36.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 10, 540));
        jPanel36.add(LivingAdd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 670, 54));

        NID15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NID15ActionPerformed(evt);
            }
        });
        jPanel36.add(NID15, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 600, 70, -1));

        NID16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NID16ActionPerformed(evt);
            }
        });
        jPanel36.add(NID16, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 600, 70, -1));

        NID17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NID17ActionPerformed(evt);
            }
        });
        jPanel36.add(NID17, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 600, 70, -1));

        NID18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NID18ActionPerformed(evt);
            }
        });
        jPanel36.add(NID18, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 600, 70, -1));

        Gender16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        Gender16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender16ActionPerformed(evt);
            }
        });
        jPanel36.add(Gender16, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 129, 120, -1));

        img11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.add(img11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 190, 100));

        img12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.add(img12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 190, 100));

        img10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.add(img10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 190, 100));

        img9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.add(img9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 190, 100));
        jPanel36.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 660, 10));

        jButton13.setBackground(new java.awt.Color(51, 51, 51));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(204, 204, 204));
        jButton13.setText("Update");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel36.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 665, 100, 30));

        jButton14.setBackground(new java.awt.Color(51, 51, 51));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(204, 204, 204));
        jButton14.setText("Cancel");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel36.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 665, 100, 30));

        jCheckBox33.setText("Back Image");
        jCheckBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox33ActionPerformed(evt);
            }
        });
        jPanel36.add(jCheckBox33, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 600, -1, -1));

        jCheckBox34.setText("First Name");
        jPanel36.add(jCheckBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jCheckBox35.setText("Last Name");
        jPanel36.add(jCheckBox35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jCheckBox36.setText("Father's Name");
        jPanel36.add(jCheckBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jCheckBox37.setText("Age");
        jPanel36.add(jCheckBox37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jCheckBox38.setText("Gender");
        jPanel36.add(jCheckBox38, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jCheckBox39.setText("Marital Status");
        jPanel36.add(jCheckBox39, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jCheckBox40.setText("Phone");
        jPanel36.add(jCheckBox40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jCheckBox41.setText("Email");
        jPanel36.add(jCheckBox41, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jCheckBox42.setText("Nationality");
        jPanel36.add(jCheckBox42, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jCheckBox43.setText("NID No");
        jPanel36.add(jCheckBox43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jCheckBox44.setText("Date of Birth");
        jPanel36.add(jCheckBox44, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jCheckBox45.setText("Occupation");
        jPanel36.add(jCheckBox45, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jCheckBox47.setText("Height (inch)");
        jPanel36.add(jCheckBox47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, -1, -1));

        jCheckBox48.setText("Weight (kg)");
        jPanel36.add(jCheckBox48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 282, -1, -1));

        jCheckBox49.setText("Eye Color");
        jPanel36.add(jCheckBox49, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 252, -1, -1));

        jCheckBox50.setText("Skin Color");
        jPanel36.add(jCheckBox50, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 282, -1, -1));

        jCheckBox51.setText("Hair Color");
        jPanel36.add(jCheckBox51, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 252, -1, -1));

        jCheckBox52.setText("Scars");
        jPanel36.add(jCheckBox52, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 282, -1, -1));

        jCheckBox53.setText("Living Address");
        jPanel36.add(jCheckBox53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jCheckBox54.setText("Work Address");
        jPanel36.add(jCheckBox54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jCheckBox55.setText("Permanent Address");
        jPanel36.add(jCheckBox55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jCheckBox56.setText("Occurrence ID");
        jPanel36.add(jCheckBox56, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 602, -1, -1));

        jCheckBox57.setText("Previous Records");
        jCheckBox57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox57ActionPerformed(evt);
            }
        });
        jPanel36.add(jCheckBox57, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 602, -1, -1));

        jCheckBox58.setText("Custody No");
        jPanel36.add(jCheckBox58, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 602, -1, -1));

        jCheckBox59.setText("Police ID");
        jPanel36.add(jCheckBox59, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 602, -1, -1));

        jCheckBox60.setText("Front Image");
        jCheckBox60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox60ActionPerformed(evt);
            }
        });
        jPanel36.add(jCheckBox60, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 200, -1, -1));

        jCheckBox61.setText("Right Image");
        jCheckBox61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox61ActionPerformed(evt);
            }
        });
        jPanel36.add(jCheckBox61, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 330, -1, -1));

        jCheckBox62.setText("Left Image");
        jCheckBox62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox62ActionPerformed(evt);
            }
        });
        jPanel36.add(jCheckBox62, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Criminal ID");
        jPanel36.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        FirstName5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName5ActionPerformed(evt);
            }
        });
        jPanel36.add(FirstName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 99, 120, -1));

        jCheckBox63.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCheckBox63.setText("Select All");
        jCheckBox63.setToolTipText("Update all items");
        jCheckBox63.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153), null, null));
        jPanel36.add(jCheckBox63, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 44, 90, 28));
        jPanel36.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 890, 10));

        javax.swing.GroupLayout dialogUpdateCriminalLayout = new javax.swing.GroupLayout(dialogUpdateCriminal.getContentPane());
        dialogUpdateCriminal.getContentPane().setLayout(dialogUpdateCriminalLayout);
        dialogUpdateCriminalLayout.setHorizontalGroup(
            dialogUpdateCriminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogUpdateCriminalLayout.setVerticalGroup(
            dialogUpdateCriminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogUpdateCriminalLayout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        dialogInsertComplaint.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogInsertComplaint.setBackground(new java.awt.Color(204, 204, 204));
        dialogInsertComplaint.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogInsertComplaint.setLocationByPlatform(true);
        dialogInsertComplaint.setUndecorated(true);
        dialogInsertComplaint.setResizable(false);
        dialogInsertComplaint.setSize(new java.awt.Dimension(681, 565));
        dialogInsertComplaint.setType(java.awt.Window.Type.POPUP);

        jPanel38.setBackground(new java.awt.Color(204, 204, 204));
        jPanel38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel38.setMaximumSize(new java.awt.Dimension(659, 455));
        jPanel38.setPreferredSize(new java.awt.Dimension(681, 564));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel38.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 129, -1, -1));

        jPanel39.setBackground(new java.awt.Color(51, 51, 51));
        jPanel39.setForeground(new java.awt.Color(51, 51, 51));

        jLabel106.setBackground(new java.awt.Color(255, 255, 255));
        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("Insert Complaint Details - CMS");

        panelAddPoliceCross10.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross10.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross10.setText("X");
        labelAddPoliceCross10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross10Layout = new javax.swing.GroupLayout(panelAddPoliceCross10);
        panelAddPoliceCross10.setLayout(panelAddPoliceCross10Layout);
        panelAddPoliceCross10Layout.setHorizontalGroup(
            panelAddPoliceCross10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross10Layout.setVerticalGroup(
            panelAddPoliceCross10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel38.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 680, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Occurrence Details");
        jPanel38.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel38.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 64, 55, -1));
        jPanel38.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 480, 10));
        jPanel38.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 10));

        jLabel15.setText("Time");
        jPanel38.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 68, -1, -1));

        jLabel16.setText("FIR No");
        jPanel38.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 68, -1, -1));
        jPanel38.add(jYearChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 64, 55, -1));
        jPanel38.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 64, -1, -1));

        jLabel17.setText("Year");
        jPanel38.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 68, -1, -1));

        jTimeChooser1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel38.add(jTimeChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 64, -1, -1));

        jLabel18.setText("Date");
        jPanel38.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 68, -1, -1));

        jLabel19.setText("Act");
        jPanel38.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 68, -1, -1));

        jLabel20.setText("Section");
        jPanel38.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 68, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel38.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 66, 70, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel38.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 66, 70, -1));
        jPanel38.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 60, 10));
        jPanel38.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 60, 10));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("FIR Info");
        jPanel38.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));
        jPanel38.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 540, 10));
        jPanel38.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 135, -1, -1));
        jPanel38.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 135, -1, -1));
        jPanel38.add(jTimeChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 135, -1, -1));
        jPanel38.add(jTimeChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 135, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel38.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 165, 80, -1));
        jPanel38.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 165, 65, -1));
        jPanel38.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 220, 660, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jPanel38.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 290, 660, -1));
        jPanel38.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 165, 75, -1));

        jLabel22.setText("Date From");
        jPanel38.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 140, -1, -1));

        jLabel25.setText("Date To");
        jPanel38.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel26.setText("Time From");
        jPanel38.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 140, -1, -1));

        jLabel27.setText("Time To");
        jPanel38.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 140, -1, -1));

        jLabel28.setText("Direction from PS");
        jPanel38.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 170, -1, -1));

        jLabel29.setText("Distance from PS");
        jPanel38.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel30.setText("Address");
        jPanel38.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 200, -1, -1));

        jLabel31.setText("Details");
        jPanel38.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 270, -1, -1));

        jLabel32.setText("Damaged Properties (taka)");
        jPanel38.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 170, -1, -1));
        jPanel38.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 60, 10));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Accused Info");
        jPanel38.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));
        jPanel38.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 510, 10));

        jButton9.setText("Insert Accused Details");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel38.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList1);

        jPanel38.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 470, 70));

        jLabel34.setText("Total Accused:");
        jPanel38.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 465, 50, 20));

        jButton28.setBackground(new java.awt.Color(51, 51, 51));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton28.setForeground(new java.awt.Color(204, 204, 204));
        jButton28.setText("OK");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel38.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 525, 100, 30));

        jButton29.setBackground(new java.awt.Color(51, 51, 51));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton29.setForeground(new java.awt.Color(204, 204, 204));
        jButton29.setText("Cancel");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel38.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 525, 100, 30));

        javax.swing.GroupLayout dialogInsertComplaintLayout = new javax.swing.GroupLayout(dialogInsertComplaint.getContentPane());
        dialogInsertComplaint.getContentPane().setLayout(dialogInsertComplaintLayout);
        dialogInsertComplaintLayout.setHorizontalGroup(
            dialogInsertComplaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogInsertComplaintLayout.setVerticalGroup(
            dialogInsertComplaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogInsertComplaintLayout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        dialogAccusedDetails.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAccusedDetails.setLocationByPlatform(true);
        dialogAccusedDetails.setUndecorated(true);
        dialogAccusedDetails.setResizable(false);
        dialogAccusedDetails.setSize(new java.awt.Dimension(551, 277));
        dialogAccusedDetails.setType(java.awt.Window.Type.POPUP);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(551, 277));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setBackground(new java.awt.Color(51, 51, 51));
        jPanel40.setForeground(new java.awt.Color(51, 51, 51));

        jLabel107.setBackground(new java.awt.Color(255, 255, 255));
        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("Insert Accused Details - CMS");

        panelAddPoliceCross11.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross11.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross11.setText("X");
        labelAddPoliceCross11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross11Layout = new javax.swing.GroupLayout(panelAddPoliceCross11);
        panelAddPoliceCross11.setLayout(panelAddPoliceCross11Layout);
        panelAddPoliceCross11Layout.setHorizontalGroup(
            panelAddPoliceCross11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross11Layout.setVerticalGroup(
            panelAddPoliceCross11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 550, -1));

        jLabel88.setText("First Name");
        jPanel5.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 45, -1, -1));

        jLabel89.setText("Last Name");
        jPanel5.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 40, 120, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 70, 120, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane7.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 300, -1));

        jLabel92.setText("Details");
        jPanel5.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 105, -1, -1));

        jSeparator24.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 10, 180));

        img20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(img20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 190, 130));

        jButton10.setText("Add Image");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 185, -1, -1));

        jButton11.setBackground(new java.awt.Color(51, 51, 51));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(204, 204, 204));
        jButton11.setText("OK");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 100, 30));

        jButton12.setBackground(new java.awt.Color(51, 51, 51));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(204, 204, 204));
        jButton12.setText("Cancel");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 100, 30));

        javax.swing.GroupLayout dialogAccusedDetailsLayout = new javax.swing.GroupLayout(dialogAccusedDetails.getContentPane());
        dialogAccusedDetails.getContentPane().setLayout(dialogAccusedDetailsLayout);
        dialogAccusedDetailsLayout.setHorizontalGroup(
            dialogAccusedDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAccusedDetailsLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dialogAccusedDetailsLayout.setVerticalGroup(
            dialogAccusedDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAccusedDetailsLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogAddComplainant.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAddComplainant.setLocationByPlatform(true);
        dialogAddComplainant.setUndecorated(true);
        dialogAddComplainant.setResizable(false);
        dialogAddComplainant.setSize(new java.awt.Dimension(471, 346));
        dialogAddComplainant.setType(java.awt.Window.Type.POPUP);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(471, 346));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel41.setBackground(new java.awt.Color(51, 51, 51));
        jPanel41.setForeground(new java.awt.Color(51, 51, 51));

        jLabel108.setBackground(new java.awt.Color(255, 255, 255));
        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("Insert Complainant Details - CMS");

        panelAddPoliceCross12.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross12.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross12.setText("X");
        labelAddPoliceCross12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross12Layout = new javax.swing.GroupLayout(panelAddPoliceCross12);
        panelAddPoliceCross12.setLayout(panelAddPoliceCross12Layout);
        panelAddPoliceCross12Layout.setHorizontalGroup(
            panelAddPoliceCross12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross12Layout.setVerticalGroup(
            panelAddPoliceCross12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 470, -1));

        jLabel95.setText("Father's Name");
        jPanel9.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 192, -1, -1));

        jLabel96.setText("Age");
        jPanel9.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 72, -1, -1));

        jLabel97.setText("Occupation");
        jPanel9.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 72, -1, -1));

        jLabel98.setText("Nationality");
        jPanel9.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 162, -1, -1));

        jLabel100.setText("Phone");
        jPanel9.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 102, -1, -1));

        jLabel101.setText("Email");
        jPanel9.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 102, -1, -1));

        jLabel102.setText("Date of Birth");
        jPanel9.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 132, -1, -1));

        jLabel103.setText("Address");
        jPanel9.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 220, -1, -1));

        jLabel104.setText("NID No");
        jPanel9.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 132, -1, -1));

        jLabel105.setText("Complainant Type");
        jPanel9.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 162, -1, -1));

        jLabel109.setText("First Name");
        jPanel9.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 42, -1, -1));

        jLabel110.setText("Last Name");
        jPanel9.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 42, -1, -1));
        jPanel9.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 130, 120, -1));
        jPanel9.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 120, -1));
        jPanel9.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 190, 120, -1));
        jPanel9.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 40, 120, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel9.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 120, -1));
        jPanel9.add(jLocaleChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 160, 120, -1));

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 70, 120, -1));
        jPanel9.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 120, -1));
        jPanel9.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, -1));
        jPanel9.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 100, 120, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel9.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 120, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 240, 450, 40));

        jButton15.setText("Insert Complaint Details");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 220, -1));

        jButton26.setBackground(new java.awt.Color(51, 51, 51));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.setForeground(new java.awt.Color(204, 204, 204));
        jButton26.setText("Save");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 100, 30));

        jButton27.setBackground(new java.awt.Color(51, 51, 51));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setForeground(new java.awt.Color(204, 204, 204));
        jButton27.setText("Cancel");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 100, 30));

        javax.swing.GroupLayout dialogAddComplainantLayout = new javax.swing.GroupLayout(dialogAddComplainant.getContentPane());
        dialogAddComplainant.getContentPane().setLayout(dialogAddComplainantLayout);
        dialogAddComplainantLayout.setHorizontalGroup(
            dialogAddComplainantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogAddComplainantLayout.setVerticalGroup(
            dialogAddComplainantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAddComplainantLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogDeleteComplaint.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogDeleteComplaint.setBackground(new java.awt.Color(204, 204, 204));
        dialogDeleteComplaint.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogDeleteComplaint.setLocationByPlatform(true);
        dialogDeleteComplaint.setUndecorated(true);
        dialogDeleteComplaint.setResizable(false);
        dialogDeleteComplaint.setSize(new java.awt.Dimension(245, 145));
        dialogDeleteComplaint.setType(java.awt.Window.Type.POPUP);

        jPanel42.setBackground(new java.awt.Color(204, 204, 204));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel42.setPreferredSize(new java.awt.Dimension(245, 145));
        jPanel42.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel42AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel43.setBackground(new java.awt.Color(51, 51, 51));
        jPanel43.setForeground(new java.awt.Color(51, 51, 51));

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Delete Complaint Info - CMS");

        panelAddPoliceCross13.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross13.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross13.setText("X");
        labelAddPoliceCross13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross13Layout = new javax.swing.GroupLayout(panelAddPoliceCross13);
        panelAddPoliceCross13.setLayout(panelAddPoliceCross13Layout);
        panelAddPoliceCross13Layout.setHorizontalGroup(
            panelAddPoliceCross13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross13Layout.setVerticalGroup(
            panelAddPoliceCross13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel42.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 245, -1));

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel111.setText("Complaint ID");
        jPanel42.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 48, -1, 28));

        jTextField18.setSelectionColor(new java.awt.Color(51, 51, 51));
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel42.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, 28));

        jButton16.setBackground(new java.awt.Color(51, 51, 51));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(204, 204, 204));
        jButton16.setText("OK");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel42.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 100, 30));

        javax.swing.GroupLayout dialogDeleteComplaintLayout = new javax.swing.GroupLayout(dialogDeleteComplaint.getContentPane());
        dialogDeleteComplaint.getContentPane().setLayout(dialogDeleteComplaintLayout);
        dialogDeleteComplaintLayout.setHorizontalGroup(
            dialogDeleteComplaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDeleteComplaintLayout.createSequentialGroup()
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dialogDeleteComplaintLayout.setVerticalGroup(
            dialogDeleteComplaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogUpdateComplaint.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogUpdateComplaint.setLocationByPlatform(true);
        dialogUpdateComplaint.setUndecorated(true);
        dialogUpdateComplaint.setResizable(false);
        dialogUpdateComplaint.setSize(new java.awt.Dimension(241, 158));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setPreferredSize(new java.awt.Dimension(241, 158));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel44.setBackground(new java.awt.Color(51, 51, 51));
        jPanel44.setForeground(new java.awt.Color(51, 51, 51));

        jLabel112.setBackground(new java.awt.Color(255, 255, 255));
        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Update Complaint Details - CMS");

        panelAddPoliceCross14.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross14.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross14.setText("X");
        labelAddPoliceCross14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross14MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross14Layout = new javax.swing.GroupLayout(panelAddPoliceCross14);
        panelAddPoliceCross14.setLayout(panelAddPoliceCross14Layout);
        panelAddPoliceCross14Layout.setHorizontalGroup(
            panelAddPoliceCross14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross14Layout.setVerticalGroup(
            panelAddPoliceCross14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 240, -1));

        jLabel113.setText("Complaint ID");
        jPanel10.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 45, -1, -1));
        jPanel10.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 40, 80, -1));

        jLabel114.setText("Status");
        jPanel10.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 75, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel10.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 70, 80, -1));

        jButton17.setBackground(new java.awt.Color(51, 51, 51));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(204, 204, 204));
        jButton17.setText("Update");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 100, 30));

        jButton18.setBackground(new java.awt.Color(51, 51, 51));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(204, 204, 204));
        jButton18.setText("Cancel");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 120, 100, 30));

        javax.swing.GroupLayout dialogUpdateComplaintLayout = new javax.swing.GroupLayout(dialogUpdateComplaint.getContentPane());
        dialogUpdateComplaint.getContentPane().setLayout(dialogUpdateComplaintLayout);
        dialogUpdateComplaintLayout.setHorizontalGroup(
            dialogUpdateComplaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogUpdateComplaintLayout.setVerticalGroup(
            dialogUpdateComplaintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogAddCustody.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogAddCustody.setLocationByPlatform(true);
        dialogAddCustody.setUndecorated(true);
        dialogAddCustody.setResizable(false);
        dialogAddCustody.setSize(new java.awt.Dimension(241, 183));
        dialogAddCustody.setType(java.awt.Window.Type.POPUP);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel45.setBackground(new java.awt.Color(51, 51, 51));
        jPanel45.setForeground(new java.awt.Color(51, 51, 51));

        jLabel115.setBackground(new java.awt.Color(255, 255, 255));
        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Add New Custody - CMS");

        panelAddPoliceCross15.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross15.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross15.setText("X");
        labelAddPoliceCross15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross15MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross15Layout = new javax.swing.GroupLayout(panelAddPoliceCross15);
        panelAddPoliceCross15.setLayout(panelAddPoliceCross15Layout);
        panelAddPoliceCross15Layout.setHorizontalGroup(
            panelAddPoliceCross15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross15Layout.setVerticalGroup(
            panelAddPoliceCross15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 240, -1));

        jLabel116.setText("Custody Type");
        jPanel11.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 54, -1, -1));

        jLabel117.setText("Total Seats");
        jPanel11.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        Capacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapacityActionPerformed(evt);
            }
        });
        jPanel11.add(Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 90, 110, -1));

        CustodyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physical", "Legal", "Sole", "Joint", "Child" }));
        jPanel11.add(CustodyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 50, 110, -1));

        jButton19.setBackground(new java.awt.Color(51, 51, 51));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(204, 204, 204));
        jButton19.setText("Cancel");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 140, 100, 30));

        jButton20.setBackground(new java.awt.Color(51, 51, 51));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(204, 204, 204));
        jButton20.setText("Save");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 140, 100, 30));

        javax.swing.GroupLayout dialogAddCustodyLayout = new javax.swing.GroupLayout(dialogAddCustody.getContentPane());
        dialogAddCustody.getContentPane().setLayout(dialogAddCustodyLayout);
        dialogAddCustodyLayout.setHorizontalGroup(
            dialogAddCustodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogAddCustodyLayout.setVerticalGroup(
            dialogAddCustodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dialogUpdateCustody.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogUpdateCustody.setLocationByPlatform(true);
        dialogUpdateCustody.setUndecorated(true);
        dialogUpdateCustody.setResizable(false);
        dialogUpdateCustody.setSize(new java.awt.Dimension(219, 195));
        dialogUpdateCustody.setType(java.awt.Window.Type.POPUP);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel46.setBackground(new java.awt.Color(51, 51, 51));
        jPanel46.setForeground(new java.awt.Color(51, 51, 51));

        jLabel118.setBackground(new java.awt.Color(255, 255, 255));
        jLabel118.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("Update Custody Info - CMS");

        panelAddPoliceCross16.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross16.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross16.setText("X");
        labelAddPoliceCross16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross16MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross16Layout = new javax.swing.GroupLayout(panelAddPoliceCross16);
        panelAddPoliceCross16.setLayout(panelAddPoliceCross16Layout);
        panelAddPoliceCross16Layout.setHorizontalGroup(
            panelAddPoliceCross16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross16Layout.setVerticalGroup(
            panelAddPoliceCross16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 220, -1));
        jPanel12.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 79, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physical", "Legal", "Sole", "Joint", "Child" }));
        jPanel12.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jButton21.setBackground(new java.awt.Color(51, 51, 51));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.setForeground(new java.awt.Color(204, 204, 204));
        jButton21.setText("Cancel");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 155, 100, 30));

        jButton22.setBackground(new java.awt.Color(51, 51, 51));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton22.setForeground(new java.awt.Color(204, 204, 204));
        jButton22.setText("Update");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 155, 100, 30));

        jCheckBox46.setText("Custody Type");
        jPanel12.add(jCheckBox46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 81, -1, -1));
        jPanel12.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 10));

        jLabel119.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel119.setText("Custody No");
        jPanel12.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel12.add(CustodyNo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 36, 70, -1));

        jCheckBox64.setText("Total Seats");
        jPanel12.add(jCheckBox64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 111, -1, -1));

        javax.swing.GroupLayout dialogUpdateCustodyLayout = new javax.swing.GroupLayout(dialogUpdateCustody.getContentPane());
        dialogUpdateCustody.getContentPane().setLayout(dialogUpdateCustodyLayout);
        dialogUpdateCustodyLayout.setHorizontalGroup(
            dialogUpdateCustodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogUpdateCustodyLayout.setVerticalGroup(
            dialogUpdateCustodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogUpdateCustodyLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogDeleteCustody.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogDeleteCustody.setBackground(new java.awt.Color(204, 204, 204));
        dialogDeleteCustody.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        dialogDeleteCustody.setLocationByPlatform(true);
        dialogDeleteCustody.setUndecorated(true);
        dialogDeleteCustody.setResizable(false);
        dialogDeleteCustody.setSize(new java.awt.Dimension(230, 145));
        dialogDeleteCustody.setType(java.awt.Window.Type.POPUP);

        jPanel47.setBackground(new java.awt.Color(204, 204, 204));
        jPanel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel47.setPreferredSize(new java.awt.Dimension(230, 145));
        jPanel47.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel47AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel48.setBackground(new java.awt.Color(51, 51, 51));
        jPanel48.setForeground(new java.awt.Color(51, 51, 51));

        jLabel120.setBackground(new java.awt.Color(255, 255, 255));
        jLabel120.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("Delete Custody Info - CMS");

        panelAddPoliceCross17.setBackground(new java.awt.Color(51, 51, 51));

        labelAddPoliceCross17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelAddPoliceCross17.setForeground(new java.awt.Color(255, 255, 255));
        labelAddPoliceCross17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddPoliceCross17.setText("X");
        labelAddPoliceCross17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddPoliceCross17MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAddPoliceCross17Layout = new javax.swing.GroupLayout(panelAddPoliceCross17);
        panelAddPoliceCross17.setLayout(panelAddPoliceCross17Layout);
        panelAddPoliceCross17Layout.setHorizontalGroup(
            panelAddPoliceCross17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelAddPoliceCross17Layout.setVerticalGroup(
            panelAddPoliceCross17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddPoliceCross17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddPoliceCross17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(panelAddPoliceCross17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddPoliceCross17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel47.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jLabel121.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel121.setText("Custody No");
        jPanel47.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 50, -1, 28));

        CustodyNo3.setSelectionColor(new java.awt.Color(51, 51, 51));
        CustodyNo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustodyNo3ActionPerformed(evt);
            }
        });
        jPanel47.add(CustodyNo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 50, 80, 28));

        jButton23.setBackground(new java.awt.Color(51, 51, 51));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton23.setForeground(new java.awt.Color(204, 204, 204));
        jButton23.setText("OK");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel47.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 100, 100, 30));

        javax.swing.GroupLayout dialogDeleteCustodyLayout = new javax.swing.GroupLayout(dialogDeleteCustody.getContentPane());
        dialogDeleteCustody.getContentPane().setLayout(dialogDeleteCustodyLayout);
        dialogDeleteCustodyLayout.setHorizontalGroup(
            dialogDeleteCustodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogDeleteCustodyLayout.createSequentialGroup()
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dialogDeleteCustodyLayout.setVerticalGroup(
            dialogDeleteCustodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        labelAddComplaint.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelAddComplaint.setForeground(new java.awt.Color(51, 51, 51));
        labelAddComplaint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddComplaint.setText("Add");
        labelAddComplaint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAddComplaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddComplaintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddComplaintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddComplaintMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPoliceAdd3Layout = new javax.swing.GroupLayout(panelPoliceAdd3);
        panelPoliceAdd3.setLayout(panelPoliceAdd3Layout);
        panelPoliceAdd3Layout.setHorizontalGroup(
            panelPoliceAdd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddComplaint, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelPoliceAdd3Layout.setVerticalGroup(
            panelPoliceAdd3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPoliceAdd3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddComplaint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelComplaint.add(panelPoliceAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        panelUpdatePolice3.setBackground(new java.awt.Color(204, 204, 204));

        labelUpdatePolice3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelUpdatePolice3.setForeground(new java.awt.Color(51, 51, 51));
        labelUpdatePolice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUpdatePolice3.setText("Update");
        labelUpdatePolice3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelUpdatePolice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUpdatePolice3MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDeletePolice3MouseClicked(evt);
            }
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

        Complaint_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Complaint ID", "Complaint Type", "Complainant Name", "Complainant Type", "Date of Issue", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Complaint_Info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Complaint_Info.setFocusable(false);
        Complaint_Info.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Complaint_Info.setRowHeight(20);
        Complaint_Info.setSelectionBackground(new java.awt.Color(51, 51, 51));
        Complaint_Info.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(Complaint_Info);

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

        panelCriminal.setBackground(new java.awt.Color(204, 204, 204));
        panelCriminal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCriminal.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 950, 20));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUpdatePolice1MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDeletePolice1MouseClicked(evt);
            }
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPolice1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResetPolice1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelResetPolice1Layout.setVerticalGroup(
            panelResetPolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPolice1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResetPolice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCriminal.add(panelResetPolice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 70, 30));

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
            .addGroup(panelRefreshPolice1Layout.createSequentialGroup()
                .addComponent(labelRefreshPolice1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRefreshPolice1Layout.setVerticalGroup(
            panelRefreshPolice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefreshPolice1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelRefreshPolice1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCriminal.add(panelRefreshPolice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 50, 30));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Name", "Age", "Father's Name", "Previous Records"
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
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setFocusable(false);
        jTable2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable2.setRowHeight(20);
        jTable2.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCriminal.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 950, 490));

        panelSlider1.add(panelCriminal, "card2");

        panelCustody.setBackground(new java.awt.Color(204, 204, 204));
        panelCustody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCustody.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 950, 20));

        panelPoliceAdd2.setBackground(new java.awt.Color(204, 204, 204));

        labelAddCustody.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelAddCustody.setForeground(new java.awt.Color(51, 51, 51));
        labelAddCustody.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAddCustody.setText("Add");
        labelAddCustody.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAddCustody.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAddCustodyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAddCustodyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAddCustodyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPoliceAdd2Layout = new javax.swing.GroupLayout(panelPoliceAdd2);
        panelPoliceAdd2.setLayout(panelPoliceAdd2Layout);
        panelPoliceAdd2Layout.setHorizontalGroup(
            panelPoliceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddCustody, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        panelPoliceAdd2Layout.setVerticalGroup(
            panelPoliceAdd2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPoliceAdd2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelAddCustody, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCustody.add(panelPoliceAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        panelUpdatePolice2.setBackground(new java.awt.Color(204, 204, 204));

        labelUpdatePolice2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 13)); // NOI18N
        labelUpdatePolice2.setForeground(new java.awt.Color(51, 51, 51));
        labelUpdatePolice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUpdatePolice2.setText("Update");
        labelUpdatePolice2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelUpdatePolice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUpdatePolice2MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDeletePolice2MouseClicked(evt);
            }
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
            .addGroup(panelResetPolice2Layout.createSequentialGroup()
                .addComponent(labelResetPolice2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelResetPolice2Layout.setVerticalGroup(
            panelResetPolice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetPolice2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelResetPolice2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelCustody.add(panelResetPolice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 70, 30));

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

        panelCustody.add(panelRefreshPolice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 50, 30));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));

        Custody_Info.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Custody No.", "Seats Remaining", "Capacity", "Custody Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCustody.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 950, 490));

        panelSlider1.add(panelCustody, "card2");

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUpdatePoliceMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDeletePoliceMouseClicked(evt);
            }
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
        Police_Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Police_InfoMouseClicked(evt);
            }
        });
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

        panelPolice6.setBackground(new java.awt.Color(204, 204, 204));
        panelPolice6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel51.setBackground(new java.awt.Color(204, 204, 204));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Police_Info6.setModel(new javax.swing.table.DefaultTableModel(
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
        Police_Info6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Police_Info6.setFocusable(false);
        Police_Info6.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Police_Info6.setRowHeight(20);
        Police_Info6.setSelectionBackground(new java.awt.Color(51, 51, 51));
        Police_Info6.getTableHeader().setReorderingAllowed(false);
        Police_Info6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Police_Info6MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(Police_Info6);

        jPanel51.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 540, 210));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel53.setBackground(new java.awt.Color(51, 51, 51));

        jLabel93.setBackground(new java.awt.Color(153, 153, 153));
        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(204, 204, 204));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("Preview");
        jLabel93.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.black));
        jLabel93.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel52.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jPanel51.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 390, 490));

        jRadioButton1.setText("ID");
        jPanel51.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jRadioButton2.setText("Name");
        jPanel51.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jRadioButton3.setText("Police Station");
        jPanel51.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jRadioButton4.setText("District");
        jPanel51.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jRadioButton5.setText("Gender");
        jPanel51.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jRadioButton6.setText("Phone");
        jPanel51.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jRadioButton7.setText("Age");
        jPanel51.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jSeparator27.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel51.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 10, 150));

        jRadioButton8.setText("Joining Date");
        jPanel51.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jRadioButton9.setText("Salary");
        jPanel51.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jRadioButton10.setText("Arrested Criminals");
        jPanel51.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));
        jPanel51.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 60, -1));
        jPanel51.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 60, -1));
        jPanel51.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 60, -1));
        jPanel51.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 150, -1));
        jPanel51.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 60, -1));
        jPanel51.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 60, -1));
        jPanel51.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 60, -1));
        jPanel51.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 60, -1));

        jLabel122.setText("to");
        jPanel51.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 20));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel51.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 150, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel51.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 150, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel51.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, -1));
        jPanel51.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 150, -1));

        jLabel123.setText("to");
        jPanel51.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 20));

        jLabel124.setText("to");
        jPanel51.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 20));
        jPanel51.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 60, -1));
        jPanel51.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 60, -1));
        jPanel51.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 60, -1));

        jLabel125.setText("to");
        jPanel51.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, 20));

        jLabel126.setText("to");
        jPanel51.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, 20));

        jButton24.setBackground(new java.awt.Color(51, 51, 51));
        jButton24.setForeground(new java.awt.Color(204, 204, 204));
        jButton24.setText("Reset");
        jPanel51.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 100, 30));

        jButton25.setBackground(new java.awt.Color(51, 51, 51));
        jButton25.setForeground(new java.awt.Color(204, 204, 204));
        jButton25.setText("Cancel");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel51.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 100, 30));

        jButton30.setBackground(new java.awt.Color(51, 51, 51));
        jButton30.setForeground(new java.awt.Color(204, 204, 204));
        jButton30.setText("Search");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel51.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 100, 30));

        jLabel127.setText("Results:");
        jPanel51.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));
        jPanel51.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 180, 30, 15));

        panelPolice6.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 950, 490));

        jLabel129.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("Search || Police Info ");
        jLabel129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPolice6.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, -1));

        javax.swing.GroupLayout panelSearchPolice5Layout = new javax.swing.GroupLayout(panelSearchPolice5);
        panelSearchPolice5.setLayout(panelSearchPolice5Layout);
        panelSearchPolice5Layout.setHorizontalGroup(
            panelSearchPolice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPolice6, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        panelSearchPolice5Layout.setVerticalGroup(
            panelSearchPolice5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchPolice5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPolice6, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelSlider1.add(panelSearchPolice5, "card6");

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
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

    private void labelPoliceAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAddMouseClicked
        dialogAddPolice.setLocationRelativeTo(null);
        dialogAddPolice.setVisible(true);
    }//GEN-LAST:event_labelPoliceAddMouseClicked

    private void labelAddCustodyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddCustodyMouseClicked
        dialogAddCustody.setLocationRelativeTo(null);
        dialogAddCustody.setVisible(true);
    }//GEN-LAST:event_labelAddCustodyMouseClicked

    private void labelAddCustodyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddCustodyMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddCustodyMouseEntered

    private void labelAddCustodyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddCustodyMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddCustodyMouseExited

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

    private void labelAddComplaintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddComplaintMouseClicked
        // TODO add your handling code here:

        dialogAddComplainant.setLocationRelativeTo(null);
        dialogAddComplainant.setVisible(true);

    }//GEN-LAST:event_labelAddComplaintMouseClicked

    private void labelAddComplaintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddComplaintMouseEntered
        // TODO add your handling code here:
        resetColor(panelPoliceAdd, labelPoliceAdd);
    }//GEN-LAST:event_labelAddComplaintMouseEntered

    private void labelAddComplaintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddComplaintMouseExited
        // TODO add your handling code here:
        setColor(panelPoliceAdd, labelPoliceAdd);
    }//GEN-LAST:event_labelAddComplaintMouseExited

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

       
           panelSlider1.nextPanel(20, panelSearchPolice5, panelSlider1.right);
       
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void labelCriminalInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCriminalInfoMouseClicked
        panelSlider1.nextPanel(20, panelCriminal, rootPaneCheckingEnabled);
        CriminalInfo();
    }//GEN-LAST:event_labelCriminalInfoMouseClicked

    private void labelCustodyInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCustodyInfoMouseClicked
        panelSlider1.nextPanel(20, panelCustody, rootPaneCheckingEnabled);
        CustodyInfo();
    }//GEN-LAST:event_labelCustodyInfoMouseClicked

    private void labelComplainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelComplainMouseClicked
        panelSlider1.nextPanel(20, panelComplaint, rootPaneCheckingEnabled);

        ComplaintInfo();


    }//GEN-LAST:event_labelComplainMouseClicked

    private void labelResetPoliceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelResetPoliceMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_labelResetPoliceMouseClicked

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        // TODO add your handling code here:

        dispose();
        SignIn sn = new SignIn();
        sn.setVisible(true);


    }//GEN-LAST:event_labelExitMouseClicked

    private void labelAddPoliceCross4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross4MouseClicked
        // TODO add your handling code here:
        dialogDeletePolice.dispose();
    }//GEN-LAST:event_labelAddPoliceCross4MouseClicked

    private void labelAddPoliceCross4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross4MouseEntered

    private void labelAddPoliceCross4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross4MouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            String PID = jTextField1.getText();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query1 = "DELETE FROM POLICE_INFO WHERE PoliceId = " + PID;

            PreparedStatement st = con.prepareStatement(query1);
            int rs = st.executeUpdate();

            Police_Info.revalidate();

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //Police_Info.setModel(DbUtils.resultSetToTableModel(rs));
        //String s=JOptionPane.showInputDialog("Confirm Password", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel26AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel26AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel26AncestorAdded

    private void Salary1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salary1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Salary1ActionPerformed

    private void Age1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age1ActionPerformed

    private void Gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender1ActionPerformed

    private void PoliceStation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceStation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoliceStation1ActionPerformed

    private void FirstName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName1ActionPerformed

    private void AddImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddImage1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img3.getWidth(), img3.getHeight(), Image.SCALE_SMOOTH));
        img3.setIcon(imageIcon);

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
    }//GEN-LAST:event_AddImage1ActionPerformed

    private void LastName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastName1ActionPerformed

    private void Save5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save5ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query = "INSERT INTO POLICE_INFO(FirstName,LastName,Age,Gender,DateOfBirth,Phone,Designation,"
                    + "LivingAddress,PermanentAddress,Email,NID,District,PoliceStation,JoiningDate,ResigningDate,Salary,Image)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, FirstName1.getText());
            pst.setString(2, LastName1.getText());
            pst.setString(3, Age1.getText());
            pst.setString(4, Gender1.getSelectedItem().toString());

            Date dateofbirth = DateOfBirth1.getDate();
            String strDate = DateFormat.getDateInstance().format(dateofbirth);

            pst.setString(5, strDate);
            pst.setString(6, Phone1.getText());
            pst.setString(7, Designation1.getSelectedItem().toString());
            pst.setString(8, LivingAdd1.getText());
            pst.setString(9, PermanentAdd1.getText());
            pst.setString(10, Email1.getText());
            pst.setString(11, NID1.getText());
            pst.setString(12, District1.getSelectedItem().toString());
            pst.setString(13, PoliceStation1.getSelectedItem().toString());

            Date date2 = JoiningDate1.getDate();
            String strDateofJoining = DateFormat.getDateInstance().format(date2);
            pst.setString(14, strDateofJoining);

            Date date3 = JoiningDate1.getDate();
            String strDateofResigning = DateFormat.getDateInstance().format(date3);
            pst.setString(14, strDateofResigning);

            pst.setString(15, strDateofResigning);
            pst.setString(16, Salary1.getText());

            pst.setBytes(17, person_image);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Added Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_Save5ActionPerformed

    private void NID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NID1ActionPerformed

    private void labelAddPoliceCross5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross5MouseClicked
        dialogAddPolice.dispose();
    }//GEN-LAST:event_labelAddPoliceCross5MouseClicked

    private void labelAddPoliceCross5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross5MouseEntered
        panelAddPoliceCross5.setBackground(new Color(204, 0, 0));
        labelAddPoliceCross5.setForeground(new Color(255, 255, 255));


    }//GEN-LAST:event_labelAddPoliceCross5MouseEntered

    private void labelAddPoliceCross5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross5MouseExited
        panelAddPoliceCross5.setBackground(new Color(51, 51, 51));
        labelAddPoliceCross5.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelAddPoliceCross5MouseExited

    private void Save6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save6ActionPerformed
        // TODO add your handling code here:
        dialogAddPolice.dispose();
    }//GEN-LAST:event_Save6ActionPerformed

    private void Salary2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salary2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Salary2ActionPerformed

    private void Age2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age2ActionPerformed

    private void Gender2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender2ActionPerformed

    private void PoliceStation2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceStation2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoliceStation2ActionPerformed

    private void FirstName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName2ActionPerformed

    private void LastName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastName2ActionPerformed

    private void Save7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save7ActionPerformed

        String fname = null;
        String lname = null;
        String age = null;
        String gender = null;
        String phone = null;
        String PID = jTextField2.getText();

        if (jCheckBox1.isSelected()) {
            fname = FirstName2.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET FirstName=" + "\'" + fname + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox2.isSelected()) {
            lname = LastName2.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET LastName=" + "\'" + lname + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (jCheckBox3.isSelected()) {
            age = Age2.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET Age=" + "\'" + age + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (jCheckBox4.isSelected()) {
            gender = Gender2.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET Gender=" + "\'" + gender + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (jCheckBox5.isSelected()) {
            phone = Phone2.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET Phone=" + "\'" + phone + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox6.isSelected()) {
            String Email = Email2.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET Email=" + "\'" + Email + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox7.isSelected()) {
            String NID = NID2.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET NID=" + "\'" + NID + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox8.isSelected()) {
            Date dateofbirth = DateOfBirth2.getDate();
            String DateOfBirth = DateFormat.getDateInstance().format(dateofbirth);

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET DateOfBirth=" + "\'" + DateOfBirth + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox12.isSelected()) {
            String District = District2.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET District=" + "\'" + District + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox13.isSelected()) {
            String PoliceStation = PoliceStation2.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET PoliceStation=" + "\'" + PoliceStation + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox14.isSelected()) {
            String Designation = Designation2.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET Designation=" + "\'" + Designation + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox15.isSelected()) {
            String Salary = Salary2.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET Salary=" + "\'" + Salary + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox16.isSelected()) {
            String LivingAdd = LivingAdd2.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET LivingAddress=" + "\'" + LivingAdd + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox17.isSelected()) {
            String PermanentAddress = PermanentAdd2.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET PermanentAddress=" + "\'" + PermanentAddress + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox18.isSelected()) {
            Date dateofjoining = JoiningDate2.getDate();
            String DateOfJoining = DateFormat.getDateInstance().format(dateofjoining);

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET JoiningDate=" + "\'" + DateOfJoining + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox10.isSelected()) {
            Date dateofresigning = ResigningDate2.getDate();
            String DateOfResigning = DateFormat.getDateInstance().format(dateofresigning);

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE POLICE_INFO SET ResigningDate=" + "\'" + DateOfResigning + "\'" + " WHERE PoliceId=" + PID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox11.isSelected()) {

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query = "UPDATE POLICE_INFO SET IMAGE=?";
                PreparedStatement pst = connection.prepareStatement(query);

                pst.setBytes(1, person_image2);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Added Successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }


    }//GEN-LAST:event_Save7ActionPerformed

    private void NID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NID2ActionPerformed

    private void labelAddPoliceCross6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross6MouseClicked

    private void labelAddPoliceCross6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross6MouseEntered

    private void labelAddPoliceCross6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross6MouseExited

    private void Save8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save8ActionPerformed
        // TODO add your handling code here:
        dialogUpdatePolice.dispose();
    }//GEN-LAST:event_Save8ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void Age3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age3ActionPerformed

    private void Gender3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender3ActionPerformed

    private void FirstName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName3ActionPerformed

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void labelAddPoliceCross7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross7MouseClicked

    private void labelAddPoliceCross7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross7MouseEntered

    private void labelAddPoliceCross7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross7MouseExited

    private void LastName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastName3ActionPerformed

    private void FathersName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FathersName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FathersName3ActionPerformed

    private void EyeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EyeColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EyeColorActionPerformed

    private void BirthmarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthmarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthmarksActionPerformed

    private void NID4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NID4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NID4ActionPerformed

    private void HeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeightActionPerformed

    private void Gender5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender5ActionPerformed

    private void SkinColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkinColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SkinColorActionPerformed

    private void HairColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HairColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HairColorActionPerformed

    private void labelUpdatePoliceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePoliceMouseClicked
        dialogUpdatePolice.setLocationRelativeTo(null);
        dialogUpdatePolice.setVisible(true);
    }//GEN-LAST:event_labelUpdatePoliceMouseClicked

    private void labelDeletePoliceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePoliceMouseClicked
        dialogDeletePolice.setLocationRelativeTo(null);
        dialogDeletePolice.setVisible(true);
    }//GEN-LAST:event_labelDeletePoliceMouseClicked

    private void labelPoliceAdd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPoliceAdd1MouseClicked
        dialogAddCriminal.setLocationRelativeTo(null);
        dialogAddCriminal.setVisible(true);
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

    private void scarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scarsActionPerformed

    private void OccurrenceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OccurrenceIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OccurrenceIdActionPerformed

    private void PrevRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrevRecActionPerformed

    private void CustodyNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustodyNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustodyNoActionPerformed

    private void PoliceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoliceIdActionPerformed

    private void Gender9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender9ActionPerformed

    private void LivingAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LivingAdd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LivingAdd3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img6.getWidth(), img6.getHeight(), Image.SCALE_SMOOTH));
        img6.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image6 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void labelAddPoliceCross8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross8MouseClicked
        // TODO add your handling code here:
        dialogDeleteCriminal.dispose();
    }//GEN-LAST:event_labelAddPoliceCross8MouseClicked

    private void labelAddPoliceCross8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross8MouseEntered

    private void labelAddPoliceCross8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross8MouseExited

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

        try {

            String CID = jTextField3.getText();

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query1 = "DELETE FROM CRIMINAL_INFO WHERE CriminalId = " + CID;

            PreparedStatement st = con.prepareStatement(query1);
            int rs = st.executeUpdate();

            jTable2.revalidate();

            dialogDeleteCriminal.dispose();

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jPanel34AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel34AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel34AncestorAdded

    private void Age5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age5ActionPerformed

    private void Gender10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender10ActionPerformed

    private void CriminalId4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalId4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriminalId4ActionPerformed

    private void LivingAdd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LivingAdd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LivingAdd5ActionPerformed

    private void Weight5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Weight5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Weight5ActionPerformed

    private void labelAddPoliceCross9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross9MouseClicked

    private void labelAddPoliceCross9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross9MouseEntered

    private void labelAddPoliceCross9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross9MouseExited

    private void LastName5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastName5ActionPerformed

    private void FathersName5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FathersName5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FathersName5ActionPerformed

    private void Gender11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender11ActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox28ActionPerformed

    private void NID12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NID12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NID12ActionPerformed

    private void Height5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Height5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Height5ActionPerformed

    private void Gender12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender12ActionPerformed

    private void Gender13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender13ActionPerformed

    private void Gender14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender14ActionPerformed

    private void Gender15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender15ActionPerformed

    private void scars5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scars5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scars5ActionPerformed

    private void NID15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NID15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NID15ActionPerformed

    private void NID16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NID16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NID16ActionPerformed

    private void NID17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NID17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NID17ActionPerformed

    private void NID18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NID18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NID18ActionPerformed

    private void Gender16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender16ActionPerformed

    private void jCheckBox57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox57ActionPerformed

    private void FirstName5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName5ActionPerformed

    private void labelAddPoliceCross10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross10MouseClicked

    private void labelAddPoliceCross10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross10MouseEntered

    private void labelAddPoliceCross10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross10MouseExited

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void labelAddPoliceCross11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross11MouseClicked

    private void labelAddPoliceCross11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross11MouseEntered

    private void labelAddPoliceCross11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross11MouseExited

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void labelAddPoliceCross12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross12MouseClicked

    private void labelAddPoliceCross12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross12MouseEntered

    private void labelAddPoliceCross12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross12MouseExited

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void labelAddPoliceCross13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross13MouseClicked
        // TODO add your handling code here:
        dialogDeleteComplaint.dispose();
    }//GEN-LAST:event_labelAddPoliceCross13MouseClicked

    private void labelAddPoliceCross13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross13MouseEntered

    private void labelAddPoliceCross13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross13MouseExited

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:

        try {

            String CID = jTextField18.getText();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query1 = "DELETE FROM COMPLAINT_INFO WHERE ComplaintId = " + CID;

            PreparedStatement st = con.prepareStatement(query1);
            int rs = st.executeUpdate();

            Complaint_Info.revalidate();
            JOptionPane.showMessageDialog(this, "Delete Successful!");
            dialogDeleteComplaint.dispose();

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jPanel42AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel42AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel42AncestorAdded

    private void labelAddPoliceCross14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross14MouseClicked

    private void labelAddPoliceCross14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross14MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross14MouseEntered

    private void labelAddPoliceCross14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross14MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross14MouseExited

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:

        String CID = jTextField19.getText();

        String status = jComboBox7.getSelectedItem().toString();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query = "UPDATE COMPLAINT_INFO SET Status=? WHERE ComplaintId=" + CID;
            PreparedStatement pst = connection.prepareStatement(query);

            pst.setString(1, status);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Update Successful!");

            dialogUpdateComplaint.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }


    }//GEN-LAST:event_jButton17ActionPerformed

    private void dialogAddPoliceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dialogAddPoliceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dialogAddPoliceMouseClicked

    private void labelDeletePolice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePolice1MouseClicked
        dialogDeleteCriminal.setLocationRelativeTo(null);
        dialogDeleteCriminal.setVisible(true);
    }//GEN-LAST:event_labelDeletePolice1MouseClicked

    private void labelDeletePolice2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePolice2MouseClicked

        dialogDeleteCustody.setLocationRelativeTo(null);
        dialogDeleteCustody.setVisible(true);

        try {

            String PID = jTextField1.getText();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query1 = "DELETE FROM CUSTODY_INFO WHERE CustodyNo=2";

            PreparedStatement st = con.prepareStatement(query1);
            st.executeUpdate();

            UpdateCustodyTable();

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_labelDeletePolice2MouseClicked

    private void labelAddPoliceCross15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross15MouseClicked

    private void labelAddPoliceCross15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross15MouseEntered

    private void labelAddPoliceCross15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross15MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross15MouseExited

    private void labelAddPoliceCross16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross16MouseClicked

    private void labelAddPoliceCross16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross16MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross16MouseEntered

    private void labelAddPoliceCross16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross16MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross16MouseExited

    private void labelAddPoliceCross17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross17MouseClicked
        // TODO add your handling code here:
        dialogDeleteCustody.dispose();

    }//GEN-LAST:event_labelAddPoliceCross17MouseClicked

    private void labelAddPoliceCross17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross17MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross17MouseEntered

    private void labelAddPoliceCross17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAddPoliceCross17MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelAddPoliceCross17MouseExited

    private void CustodyNo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustodyNo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustodyNo3ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:

        try {

            String CustodyNo = CustodyNo3.getText();

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query1 = "DELETE FROM CUSTODY_INFO WHERE CustodyNo = " + CustodyNo;

            PreparedStatement st = con.prepareStatement(query1);
            int rs = st.executeUpdate();

            Custody_Info.revalidate();

            dialogDeleteCustody.dispose();

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton23ActionPerformed

    private void jPanel47AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel47AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel47AncestorAdded

    private void labelUpdatePolice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePolice1MouseClicked
        dialogUpdateCriminal.setLocationRelativeTo(null);
        dialogUpdateCriminal.setVisible(true);
    }//GEN-LAST:event_labelUpdatePolice1MouseClicked

    private void labelUpdatePolice2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePolice2MouseClicked
        dialogUpdateCustody.setLocationRelativeTo(null);
        dialogUpdateCustody.setVisible(true);
    }//GEN-LAST:event_labelUpdatePolice2MouseClicked

    private void labelUpdatePolice3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUpdatePolice3MouseClicked
        dialogUpdateComplaint.setLocationRelativeTo(null);
        dialogUpdateComplaint.setVisible(true);
    }//GEN-LAST:event_labelUpdatePolice3MouseClicked

    private void labelDeletePolice3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeletePolice3MouseClicked
        dialogDeleteComplaint.setLocationRelativeTo(null);
        dialogDeleteComplaint.setVisible(true);
    }//GEN-LAST:event_labelDeletePolice3MouseClicked

    private void CapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapacityActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        dialogInsertComplaint.setLocationRelativeTo(null);
        dialogInsertComplaint.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dialogAccusedDetails.setLocationRelativeTo(null);
        dialogAccusedDetails.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        dialogAddCriminal.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        dialogUpdateCriminal.dispose();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:

        dialogInsertComplaint.dispose();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:

        dialogAccusedDetails.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        dialogAddComplainant.dispose();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        dialogUpdateComplaint.dispose();

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:

        dialogAddCustody.dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        dialogUpdateCustody.dispose();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img4.getWidth(), img4.getHeight(), Image.SCALE_SMOOTH));
        img4.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image2 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void Police_InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Police_InfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Police_InfoMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        String beard = null;
        String mustache = null;
        String glasses = null;
        String tatoos = null;
        String birthmarks = null;
        String goldTeeth = null;
        String missingTeeth = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query = "INSERT INTO CRIMINAL_INFO(FirstName,LastName,FathersName,Age,Gender,Marital_Status,"
                    + "Phone,Email,Nationality,NID,DateOfBirth,Occupation,Height,Eye_Color,Hair_Color,Beard,Mustache,Glasses,Tatoos,Weight,Skin_Color,Scars,Birthmarks,Gold_Teeth,Missing_Teeth,LivingAddress,WordAddress,PermanentAddress,OccurrenceId,PreviousRecords,CustodyNo,PoliceId,FrontImage,RightImage,LeftImage,BackImage)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, FirstName3.getText());
            pst.setString(2, LastName3.getText());
            pst.setString(3, FathersName3.getText());

            pst.setString(4, Age3.getText());
            pst.setString(5, Gender5.getSelectedItem().toString());
            pst.setString(6, Gender9.getSelectedItem().toString());
            pst.setString(7, Phone3.getText());
            pst.setString(8, Email3.getText());
            pst.setString(9, Nationality.getSelectedItem().toString());
            pst.setString(10, NID4.getText());

            Date dateofbirth = DateOfBirth3.getDate();
            String strDate = DateFormat.getDateInstance().format(dateofbirth);
            pst.setString(11, strDate);

            pst.setString(12, Gender3.getSelectedItem().toString());
            pst.setString(13, Height.getText());

            pst.setString(14, EyeColor.getSelectedItem().toString());
            pst.setString(15, HairColor.getSelectedItem().toString());

            if (Beard.isSelected()) {
                beard = "YES";

            } else {
                beard = "NO";
            }

            if (Mustache.isSelected()) {
                mustache = "YES";
            } else {
                mustache = "NO";
            }

            if (Glasses.isSelected()) {
                glasses = "YES";
            } else {
                glasses = "NO";
            }

            if (Tatoos.isSelected()) {
                tatoos = "YES";
            } else {
                tatoos = "NO";
            }

            pst.setString(16, beard);
            pst.setString(17, mustache);
            pst.setString(18, glasses);
            pst.setString(19, tatoos);

            pst.setString(20, weight.getText());

            pst.setString(21, SkinColor.getSelectedItem().toString());
            pst.setString(22, scars.getText());

            if (Birthmarks.isSelected()) {
                birthmarks = "YES";
            } else {
                birthmarks = "NO";
            }

            if (GoldTeeth.isSelected()) {
                goldTeeth = "YES";
            } else {
                goldTeeth = "NO";
            }

            if (MissingTeeth.isSelected()) {
                missingTeeth = "YES";
            } else {
                missingTeeth = "NO";
            }

            pst.setString(23, birthmarks);
            pst.setString(24, goldTeeth);
            pst.setString(25, missingTeeth);

            pst.setString(26, LivingAdd3.getText());
            pst.setString(27, WorkAdd3.getText());
            pst.setString(28, PermanentAdd3.getText());
            pst.setString(29, OccurrenceId.getText());
            pst.setString(30, PrevRec.getText());
            pst.setString(31, CustodyNo.getText());
            pst.setString(32, PoliceId.getText());

            pst.setBytes(33, person_image5);
            pst.setBytes(34, person_image6);
            pst.setBytes(35, person_image7);
            pst.setBytes(36, person_image8);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Added Successfully!");

            dialogAddCriminal.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img5.getWidth(), img5.getHeight(), Image.SCALE_SMOOTH));
        img5.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image5 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img7.getWidth(), img7.getHeight(), Image.SCALE_SMOOTH));
        img7.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image7 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img8.getWidth(), img8.getHeight(), Image.SCALE_SMOOTH));
        img8.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image8 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String CID = CriminalId4.getText();

        if (jCheckBox34.isSelected()) {
            String fname = FirstName5.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET FirstName=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox35.isSelected()) {
            String lname = LastName5.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET LastName=" + "\'" + lname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox36.isSelected()) {
            String fname = FathersName5.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET FathersName=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox37.isSelected()) {
            String fname = Age5.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Age=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox38.isSelected()) {
            String fname = Gender12.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Gender=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox39.isSelected()) {
            String fname = Gender16.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Marital_Status=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox40.isSelected()) {
            String fname = Phone4.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Phone=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox41.isSelected()) {
            String fname = Email4.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Email=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox42.isSelected()) {
            String fname = Gender15.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Nationality=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox43.isSelected()) {
            String fname = NID12.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET NID=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox44.isSelected()) {
            Date dateofbirth = DateOfBirth4.getDate();
            String DateOfbirth = DateFormat.getDateInstance().format(dateofbirth);

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET DateOfbirth=" + "\'" + DateOfbirth + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox45.isSelected()) {
            String fname = Gender10.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Occupation=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox47.isSelected()) {
            String fname = Height5.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Height=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox49.isSelected()) {
            String fname = Gender11.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Eye_Color=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox51.isSelected()) {
            String fname = Gender14.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Hair_Color=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox30.isSelected()) {
            String beard = "YES";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Beard=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            String beard = "NO";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Beard=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        if (jCheckBox31.isSelected()) {
            String mustache = "YES";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Mustache=" + "\'" + mustache + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            String mustache = "NO";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Mustache=" + "\'" + mustache + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        if (jCheckBox27.isSelected()) {
            String beard = "YES";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Glasses=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            String beard = "NO";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Glasses=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        if (jCheckBox21.isSelected()) {
            String beard = "YES";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Tatoos=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            String beard = "NO";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Tatoos=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        if (jCheckBox48.isSelected()) {
            String fname = Weight5.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Weight=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox50.isSelected()) {
            String fname = Gender13.getSelectedItem().toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Skin_Color=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox52.isSelected()) {
            String fname = scars5.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Scars=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox28.isSelected()) {
            String beard = "YES";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Birthmarks=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            String beard = "NO";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Birthmarks=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        if (jCheckBox29.isSelected()) {
            String beard = "YES";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Gold_Teeth=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            String beard = "NO";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Gold_Teeth=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        if (jCheckBox32.isSelected()) {
            String beard = "YES";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Missing_Teeth=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            String beard = "NO";

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET Missing_Teeth=" + "\'" + beard + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

        if (jCheckBox53.isSelected()) {
            String fname = LivingAdd5.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET LivingAddress=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox54.isSelected()) {
            String fname = PermanentAdd4.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET WordAddress=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox55.isSelected()) {
            String fname = LivingAdd6.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET PermanentAddress=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox56.isSelected()) {
            String fname = NID15.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET OccurrenceId=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox57.isSelected()) {
            String fname = NID16.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET PreviousRecords=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox58.isSelected()) {
            String fname = NID17.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET CustodyNo=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox59.isSelected()) {
            String fname = NID18.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query1 = "UPDATE CRIMINAL_INFO SET PoliceId=" + "\'" + fname + "\'" + " WHERE CriminalId=" + CID;

                PreparedStatement st = con.prepareStatement(query1);
                st.executeUpdate();

                JOptionPane.showMessageDialog(this, "Update Successfull");

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        if (jCheckBox60.isSelected()) {

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query = "UPDATE CRIMINAL_INFO SET FrontImage=?";
                PreparedStatement pst = connection.prepareStatement(query);

                pst.setBytes(1, person_image9);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Image Added Successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

        if (jCheckBox61.isSelected()) {

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query = "UPDATE CRIMINAL_INFO SET RightImage=?";
                PreparedStatement pst = connection.prepareStatement(query);

                pst.setBytes(1, person_image10);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Added Successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

        if (jCheckBox62.isSelected()) {

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query = "UPDATE CRIMINAL_INFO SET LeftImage=?";
                PreparedStatement pst = connection.prepareStatement(query);

                pst.setBytes(1, person_image11);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Added Successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

        if (jCheckBox33.isSelected()) {

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query = "UPDATE CRIMINAL_INFO SET BackImage=?";
                PreparedStatement pst = connection.prepareStatement(query);

                pst.setBytes(1, person_image12);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Added Successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jCheckBox60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox60ActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img9.getWidth(), img9.getHeight(), Image.SCALE_SMOOTH));
        img9.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image9 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jCheckBox60ActionPerformed

    private void jCheckBox61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox61ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img10.getWidth(), img10.getHeight(), Image.SCALE_SMOOTH));
        img10.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image10 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jCheckBox61ActionPerformed

    private void jCheckBox62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox62ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img11.getWidth(), img11.getHeight(), Image.SCALE_SMOOTH));
        img11.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image11 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jCheckBox62ActionPerformed

    private void jCheckBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox33ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img12.getWidth(), img12.getHeight(), Image.SCALE_SMOOTH));
        img12.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image12 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jCheckBox33ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query = "INSERT INTO CUSTODY_INFO(CustodyType,Capacity,RemainingSeats"
                    + ")"
                    + "VALUES(?,?,?)";
            PreparedStatement pst = connection.prepareStatement(query);

            pst.setString(1, CustodyType.getSelectedItem().toString());
            pst.setString(2, Capacity.getText());
            pst.setString(3, Capacity.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Added Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:

        String CNO = CustodyNo2.getText();
        String CType;
        String capacity;

        if (jCheckBox46.isSelected()) {
            CType = jComboBox9.getSelectedItem().toString();
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query = "UPDATE CUSTODY_INFO SET CustodyType=? WHERE CustodyNo=" + CNO;
                PreparedStatement pst = connection.prepareStatement(query);

                pst.setString(1, CType);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Added Successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        if (jCheckBox64.isSelected()) {
            capacity = jTextField21.getText();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

                String query = "UPDATE CUSTODY_INFO SET Capacity=?,RemainingSeats=? WHERE CustodyNo=" + CNO;
                PreparedStatement pst = connection.prepareStatement(query);

                pst.setString(1, capacity);
                pst.setString(2, capacity);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Added Successfully!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }


    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=CMS;selectMethod=cursor", "sa", "123456");

            String query = "INSERT INTO COMPLAINT_INFO(FirstName,LastName,Age,Occupation,"
                    + "Email,Phone,NID,DateOfBirth,Nationality,ComplaintType,FathersName,Address,FirNo,YearOfFir,DateOfFir,TimeOfFir,Act,Section,DateFrom,DateTo,TimeFrom,TimeTo,DirectionFromPS,DistanceFromPS,DamagedProperties,AddressComplaint,Details,TotalAccused,AccusedFirstName,AccusedLastName,AccusedDetails,AccusedImage,Status)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,NULL)";

            //ComplainantDetails
            PreparedStatement pst = connection.prepareStatement(query);

            pst.setString(1, jTextField13.getText());
            pst.setString(2, jTextField11.getText());
            pst.setString(3, jTextField14.getText());
            pst.setString(4, jComboBox6.getSelectedItem().toString());
            pst.setString(5, jTextField16.getText());
            pst.setString(6, jTextField15.getText());
            pst.setString(7, jTextField10.getText());

            Date date2 = jDateChooser4.getDate();
            String strDateofJoining = DateFormat.getDateInstance().format(date2);
            pst.setString(8, strDateofJoining);

            pst.setString(9, jLocaleChooser1.getSelectedItem().toString());
            pst.setString(10, jComboBox5.getSelectedItem().toString());
            pst.setString(11, jTextField12.getText());
            pst.setString(12, jTextField17.getText());

            //ComplaintDetails
            pst.setString(13, jTextField4.getText());

            int year = jYearChooser1.getYear();
            String y = String.valueOf(year);
            pst.setString(14, y);

            Date date3 = jDateChooser1.getDate();
            String strDateofResigning = DateFormat.getDateInstance().format(date3);
            pst.setString(15, strDateofResigning);

            String time = jTimeChooser1.getFormatedTime();
            pst.setString(16, time);

            pst.setString(17, jComboBox3.getSelectedItem().toString());
            pst.setString(18, jComboBox2.getSelectedItem().toString());

            Date date4 = jDateChooser2.getDate();
            String d4 = DateFormat.getDateInstance().format(date4);
            pst.setString(19, d4);

            Date date5 = jDateChooser3.getDate();
            String d5 = DateFormat.getDateInstance().format(date5);
            pst.setString(20, d5);

            String time2 = jTimeChooser2.getFormatedTime();
            pst.setString(21, time2);

            String time3 = jTimeChooser3.getFormatedTime();
            pst.setString(22, time3);

            pst.setString(23, jComboBox4.getSelectedItem().toString());

            pst.setString(24, jTextField5.getText());
            pst.setString(25, jTextField7.getText());
            pst.setString(26, jTextField6.getText());
            pst.setString(27, jTextArea1.getText());

            String selected = jList1.getSelectedValue().toString();

            pst.setString(28, selected);

            //AccusedDetails
            pst.setString(29, jTextField8.getText());

            pst.setString(30, jTextField9.getText());
            pst.setString(31, jTextArea2.getText());

            pst.setBytes(32, person_image20);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Added Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }


    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img20.getWidth(), img20.getHeight(), Image.SCALE_SMOOTH));
        img20.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image20 = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        dialogInsertComplaint.dispose();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        dialogAccusedDetails.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void Police_Info6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Police_Info6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Police_Info6MouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        if(!jRadioButton2.isSelected())
        {
            JOptionPane.showMessageDialog(this, "Hello");
        }
        
             
    }//GEN-LAST:event_jButton30ActionPerformed

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
    private javax.swing.JButton AddImage1;
    private javax.swing.JTextField Age1;
    private javax.swing.JTextField Age2;
    private javax.swing.JTextField Age3;
    private javax.swing.JTextField Age5;
    private javax.swing.JCheckBox Beard;
    private javax.swing.JCheckBox Birthmarks;
    private javax.swing.JTextField Capacity;
    private javax.swing.JTable Complaint_Info;
    private javax.swing.JTextField CriminalId4;
    private javax.swing.JTextField CustodyNo;
    private javax.swing.JTextField CustodyNo2;
    private javax.swing.JTextField CustodyNo3;
    private javax.swing.JComboBox<String> CustodyType;
    private javax.swing.JTable Custody_Info;
    private com.toedter.calendar.JDateChooser DateOfBirth1;
    private com.toedter.calendar.JDateChooser DateOfBirth2;
    private com.toedter.calendar.JDateChooser DateOfBirth3;
    private com.toedter.calendar.JDateChooser DateOfBirth4;
    private javax.swing.JComboBox<String> Designation1;
    private javax.swing.JComboBox<String> Designation2;
    private javax.swing.JComboBox<String> District1;
    private javax.swing.JComboBox<String> District2;
    private javax.swing.JTextField Email1;
    private javax.swing.JTextField Email2;
    private javax.swing.JTextField Email3;
    private javax.swing.JTextField Email4;
    private javax.swing.JComboBox<String> EyeColor;
    private javax.swing.JTextField FathersName3;
    private javax.swing.JTextField FathersName5;
    private javax.swing.JTextField FirstName1;
    private javax.swing.JTextField FirstName2;
    private javax.swing.JTextField FirstName3;
    private javax.swing.JTextField FirstName5;
    private javax.swing.JComboBox<String> Gender1;
    private javax.swing.JComboBox<String> Gender10;
    private javax.swing.JComboBox<String> Gender11;
    private javax.swing.JComboBox<String> Gender12;
    private javax.swing.JComboBox<String> Gender13;
    private javax.swing.JComboBox<String> Gender14;
    private javax.swing.JComboBox<String> Gender15;
    private javax.swing.JComboBox<String> Gender16;
    private javax.swing.JComboBox<String> Gender2;
    private javax.swing.JComboBox<String> Gender3;
    private javax.swing.JComboBox<String> Gender5;
    private javax.swing.JComboBox<String> Gender9;
    private javax.swing.JCheckBox Glasses;
    private javax.swing.JCheckBox GoldTeeth;
    private javax.swing.JComboBox<String> HairColor;
    private javax.swing.JTextField Height;
    private javax.swing.JTextField Height5;
    private com.toedter.calendar.JDateChooser JoiningDate1;
    private com.toedter.calendar.JDateChooser JoiningDate2;
    private javax.swing.JTextField LastName1;
    private javax.swing.JTextField LastName2;
    private javax.swing.JTextField LastName3;
    private javax.swing.JTextField LastName5;
    private javax.swing.JTextField LivingAdd1;
    private javax.swing.JTextField LivingAdd2;
    private javax.swing.JTextField LivingAdd3;
    private javax.swing.JTextField LivingAdd5;
    private javax.swing.JTextField LivingAdd6;
    private javax.swing.JCheckBox MissingTeeth;
    private javax.swing.JCheckBox Mustache;
    private javax.swing.JTextField NID1;
    private javax.swing.JTextField NID12;
    private javax.swing.JTextField NID15;
    private javax.swing.JTextField NID16;
    private javax.swing.JTextField NID17;
    private javax.swing.JTextField NID18;
    private javax.swing.JTextField NID2;
    private javax.swing.JTextField NID4;
    private com.toedter.components.JLocaleChooser Nationality;
    private javax.swing.JTextField OccurrenceId;
    private javax.swing.JTextField PermanentAdd1;
    private javax.swing.JTextField PermanentAdd2;
    private javax.swing.JTextField PermanentAdd3;
    private javax.swing.JTextField PermanentAdd4;
    private javax.swing.JTextField Phone1;
    private javax.swing.JTextField Phone2;
    private javax.swing.JTextField Phone3;
    private javax.swing.JTextField Phone4;
    private javax.swing.JTextField PoliceId;
    private javax.swing.JComboBox<String> PoliceStation1;
    private javax.swing.JComboBox<String> PoliceStation2;
    private javax.swing.JTable Police_Info;
    private javax.swing.JTable Police_Info6;
    private javax.swing.JTextField PrevRec;
    private com.toedter.calendar.JDateChooser ResigningDate1;
    private com.toedter.calendar.JDateChooser ResigningDate2;
    private javax.swing.JTextField Salary1;
    private javax.swing.JTextField Salary2;
    private javax.swing.JButton Save5;
    private javax.swing.JButton Save6;
    private javax.swing.JButton Save7;
    private javax.swing.JButton Save8;
    private javax.swing.JComboBox<String> SkinColor;
    private javax.swing.JCheckBox Tatoos;
    private javax.swing.JTextField Weight5;
    private javax.swing.JTextField WorkAdd3;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JDialog dialogAccusedDetails;
    private javax.swing.JDialog dialogAddComplainant;
    private javax.swing.JDialog dialogAddCriminal;
    private javax.swing.JDialog dialogAddCustody;
    private javax.swing.JDialog dialogAddPolice;
    private javax.swing.JDialog dialogDeleteComplaint;
    private javax.swing.JDialog dialogDeleteCriminal;
    private javax.swing.JDialog dialogDeleteCustody;
    private javax.swing.JDialog dialogDeletePolice;
    private javax.swing.JDialog dialogInsertComplaint;
    private javax.swing.JDialog dialogUpdateComplaint;
    private javax.swing.JDialog dialogUpdateCriminal;
    private javax.swing.JDialog dialogUpdateCustody;
    private javax.swing.JDialog dialogUpdatePolice;
    private javax.swing.JLabel img10;
    private javax.swing.JLabel img11;
    private javax.swing.JLabel img12;
    private javax.swing.JLabel img20;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList<String> jList1;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
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
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private lu.tudor.santec.jtimechooser.JTimeChooser jTimeChooser1;
    private lu.tudor.santec.jtimechooser.JTimeChooser jTimeChooser2;
    private lu.tudor.santec.jtimechooser.JTimeChooser jTimeChooser3;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JLabel labelAddComplaint;
    private javax.swing.JLabel labelAddCustody;
    private javax.swing.JLabel labelAddPoliceCross10;
    private javax.swing.JLabel labelAddPoliceCross11;
    private javax.swing.JLabel labelAddPoliceCross12;
    private javax.swing.JLabel labelAddPoliceCross13;
    private javax.swing.JLabel labelAddPoliceCross14;
    private javax.swing.JLabel labelAddPoliceCross15;
    private javax.swing.JLabel labelAddPoliceCross16;
    private javax.swing.JLabel labelAddPoliceCross17;
    private javax.swing.JLabel labelAddPoliceCross4;
    private javax.swing.JLabel labelAddPoliceCross5;
    private javax.swing.JLabel labelAddPoliceCross6;
    private javax.swing.JLabel labelAddPoliceCross7;
    private javax.swing.JLabel labelAddPoliceCross8;
    private javax.swing.JLabel labelAddPoliceCross9;
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
    private javax.swing.JPanel panelAddPoliceCross10;
    private javax.swing.JPanel panelAddPoliceCross11;
    private javax.swing.JPanel panelAddPoliceCross12;
    private javax.swing.JPanel panelAddPoliceCross13;
    private javax.swing.JPanel panelAddPoliceCross14;
    private javax.swing.JPanel panelAddPoliceCross15;
    private javax.swing.JPanel panelAddPoliceCross16;
    private javax.swing.JPanel panelAddPoliceCross17;
    private javax.swing.JPanel panelAddPoliceCross4;
    private javax.swing.JPanel panelAddPoliceCross5;
    private javax.swing.JPanel panelAddPoliceCross6;
    private javax.swing.JPanel panelAddPoliceCross7;
    private javax.swing.JPanel panelAddPoliceCross8;
    private javax.swing.JPanel panelAddPoliceCross9;
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
    private javax.swing.JPanel panelPolice6;
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
    private javax.swing.JPanel panelSearchPolice5;
    private diu.swe.habib.JPanelSlider.JPanelSlider panelSlider1;
    private javax.swing.JPanel panelUpdatePolice;
    private javax.swing.JPanel panelUpdatePolice1;
    private javax.swing.JPanel panelUpdatePolice2;
    private javax.swing.JPanel panelUpdatePolice3;
    private javax.swing.JTextField scars;
    private javax.swing.JTextField scars5;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
