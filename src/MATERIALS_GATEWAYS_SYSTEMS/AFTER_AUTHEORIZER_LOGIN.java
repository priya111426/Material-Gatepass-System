/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MATERIALS_GATEWAYS_SYSTEMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import  net.proteanit.sql.DbUtils;
import org.omg.CORBA.SystemException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AFTER_AUTHEORIZER_LOGIN extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst=null;
    ResultSet rs ,rs1,r3,r4;
    Statement st=null;
       
      private  String GPN;
      private  String dateIsuee;
      private  String MDd;
      private  String GPT;
      private  String iss;
      private  String authh;
   
    
    
    /**
     * Creates new form AFTER_AUTHEORIZER_LOGIN
     */
    @SuppressWarnings("empty-statement")
    public AFTER_AUTHEORIZER_LOGIN() {
        initComponents();

        try{Class.forName("com.mysql.jdbc.Driver");  

 con=(Connection)DriverManager.getConnection( "jdbc:mysql://localhost:3306/gpddb","root","1998");  
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, "error in connection....?");
        }
        fetch();
          
  //  auther();
    }
    
 public void fetch(){
     
     try {
         String query="select*from gpd;";
         pst=con.prepareStatement(query);
         rs=pst.executeQuery();
         jTable2.setModel(DbUtils.resultSetToTableModel(rs));
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "errerreor");
     }
     
     
     
 }
 
 public void auther(){
     try{
     String authQuery=" update  gpd set  authorised_status='No';";
   
     Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gpddb","root","1998");
      st=conn.createStatement();
     rs1 =st.executeQuery(authQuery);
         while (rs1.next()) {
                       
         
     jTable2.setModel(DbUtils.resultSetToTableModel(rs));
     }}
     catch(Exception ea){
         
         JOptionPane.showMessageDialog(null, "Error in Auto-upgradation !");
     }
     
 } 
          

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(0, 153, 153));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Gatepass number.", "Date of issue", "Mat. Disc", "Gatepass type", "issuer", "Auth_status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable2.setGridColor(new java.awt.Color(0, 153, 153));
        jTable2.setRowSelectionAllowed(false);
        jTable2.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jTable2.setSelectionForeground(new java.awt.Color(0, 255, 0));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 940, 350));

        jButton1.setBackground(new java.awt.Color(255, 51, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Authorised");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 120, 30));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 110, 30));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setText("X");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 40, 20));

        jButton4.setBackground(new java.awt.Color(255, 255, 51));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Logout");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 90, 30));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 330, 30));

        jButton5.setBackground(new java.awt.Color(102, 255, 51));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Update");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 90, 30));

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 330, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
        System.exit(0);
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        String search=jTextField2.getText();
        String query3="select*from gpd where  Gatepass_number like '%"+search+"%';";
        //try {
          
     try {
       
         pst=con.prepareStatement(query3);
         r3=pst.executeQuery();
         jTable2.setModel(DbUtils.resultSetToTableModel(r3));
         
         if(jTable2.getRowCount()==0){
fetch();
jTextField1.setText(" ");
JOptionPane.showMessageDialog(this, "NO ROW FOUND.");
         }
     
     }
     catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Search Functionalty is under maintance.!");
     }
  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
           String as1=jTextField1.getText();
           String as2=jTextField2.getText();
        String query4="update  gpd "
                + " set  authorised_status='"+as1+"'  where  Gatepass_number='"+as2+"';";
        
        try
        {
     
              Connection con8=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/gpddb","root","1998");
  
              Statement stt=con8.createStatement();
 
               int   rp=stt.executeUpdate(query4);
      
        
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
fetch();
jTextField1.setText(" ");
jTextField2.setText(" ");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       
        
        
        
        
        
        
        
        try{
            
            int comonent=jTable2.getSelectedRow();
  
            TableModel mo=jTable2.getModel();
        
            String Gpnn=mo.getValueAt(comonent, 0).toString();
            jTextField2.setText(Gpnn);
            String as=mo.getValueAt(comonent, 8).toString();

              jTextField1.setText(as);
              
              
           // String query4=" update  gpd set  authorised_status=' NO';";
            
         //pst=con.prepareStatement(query4);
         //r4=pst.executeQuery();
         //jTable2.setModel(DbUtils.resultSetToTableModel(r4));
         
         
    
            
            
        }
        catch(Exception e){
            
        }
       
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(AFTER_AUTHEORIZER_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AFTER_AUTHEORIZER_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AFTER_AUTHEORIZER_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AFTER_AUTHEORIZER_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AFTER_AUTHEORIZER_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
