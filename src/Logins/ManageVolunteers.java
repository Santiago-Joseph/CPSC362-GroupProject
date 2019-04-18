/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;
import Logins.Register;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Logins.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author santi
 */
public class ManageVolunteers extends javax.swing.JFrame {

    /**
     * Creates new form ManageVolunteers
     */
    Register reg = new Register();
    public ManageVolunteers() {
        initComponents();
        setSize(1250,660);
        setLocationRelativeTo(null); 
        reg.fillStudentJtable(jTable1, "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxt_fname = new javax.swing.JTextField();
        jtxt_lname = new javax.swing.JTextField();
        jtxt_username = new javax.swing.JTextField();
        jtxt_bYear = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxt_address = new javax.swing.JTextArea();
        jLabel_address = new javax.swing.JLabel();
        jLabel_bYear = new javax.swing.JLabel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_lname = new javax.swing.JLabel();
        jLabel_fname = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jtxt_ID = new javax.swing.JTextField();
        jButton2_edit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2_delete = new javax.swing.JButton();
        jLabel_search = new javax.swing.JLabel();
        jtxt_search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Manage Volunteers");

        jtxt_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jtxt_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jtxt_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jtxt_bYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jtxt_address.setColumns(20);
        jtxt_address.setRows(5);
        jtxt_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jScrollPane1.setViewportView(jtxt_address);

        jLabel_address.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel_address.setText("Address:");

        jLabel_bYear.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel_bYear.setText("Birthday (YYYY-MM-DD)");

        jLabel_username.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel_username.setText("Username:");

        jLabel_lname.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel_lname.setText("Last Name:");

        jLabel_fname.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel_fname.setText("First Name:");

        jLabel_ID.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel_ID.setText("ID:");

        jtxt_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jButton2_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/001-pencil-striped-symbol-for-interface-edit-buttons.png"))); // NOI18N
        jButton2_edit.setText("edit");
        jButton2_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_editActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "First Name", "Last name", "Address", "Birthday"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton2_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/003-delete.png"))); // NOI18N
        jButton2_delete.setText("Delete");
        jButton2_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_deleteActionPerformed(evt);
            }
        });

        jLabel_search.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel_search.setText("Search");

        jtxt_search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jtxt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_searchActionPerformed(evt);
            }
        });
        jtxt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxt_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_searchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_fname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                                        .addGap(98, 98, 98)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_bYear)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel_address, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtxt_bYear, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(jButton2_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_search, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxt_search))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(711, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ID)
                    .addComponent(jLabel_search)
                    .addComponent(jtxt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_fname)
                            .addComponent(jtxt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_lname)
                            .addComponent(jtxt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_username)
                            .addComponent(jtxt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_bYear)
                            .addComponent(jtxt_bYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_address)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(216, 216, 216))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_editActionPerformed
        // TODO add your handling code here:
        String fname = jtxt_fname.getText();
        String lname = jtxt_lname.getText();
        String uname = jtxt_username.getText();
        String bdate = jtxt_bYear.getText();
        String address = jtxt_address.getText();
        int ID = Integer.valueOf(jtxt_ID.getText());
                
        if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Username");
        }
        else if(checkUsername(uname,ID))
        {
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }
        
        else{
        PreparedStatement ps;
        String query = "UPDATE `login` SET `username`= ?, `fname`= ?, `lname`= ?, `address`= ?, `birthday`= ? WHERE `ID`= ?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            
            
            ps.setString(1, uname);
            ps.setString(2, fname);
            ps.setString(3, lname);
            ps.setInt(6, ID);
            
            if(bdate != null)
            {
             ps.setString(5, bdate);
            }else{
                ps.setNull(5, 0);
            }
            ps.setString(4, address);
            
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "User Updated");
            }
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID","First Name","Last Name","Username","Birthday","Address"}));
            reg.fillStudentJtable(jTable1,"");
     
            
        } catch (SQLException ex) {
         //  Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton2_editActionPerformed

    private void jButton2_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int rowIndex = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        jtxt_ID.setText(model.getValueAt(rowIndex,0).toString());
        jtxt_username.setText(model.getValueAt(rowIndex,1).toString());
        jtxt_fname.setText(model.getValueAt(rowIndex,2).toString());
        jtxt_lname.setText(model.getValueAt(rowIndex,3).toString());
        jtxt_address.setText(model.getValueAt(rowIndex,4).toString());
        jtxt_bYear.setText(model.getValueAt(rowIndex,5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jtxt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_searchActionPerformed

    private void jtxt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_searchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_searchKeyTyped

    private void jtxt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_searchKeyReleased
        // TODO add your handling code here:
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID","First Name","Last Name","Username","Birthday","Address"}));
        reg.fillStudentJtable(jTable1, jtxt_search.getText());
    }//GEN-LAST:event_jtxt_searchKeyReleased

    public boolean checkUsername(String username,int id)
    { 
        
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        
        String query = "SELECT * FROM `login` WHERE `username` =? AND `ID` !=?";
       
        try {
            
                
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            ps.setInt(2,id);
            rs = ps.executeQuery();
            
            
            
            
            if(rs.next())
            {
                checkUser = true;
            }
            
        } catch (SQLException ex) {
          //FIX THIS*****  //Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
         return checkUser;
    }
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
            java.util.logging.Logger.getLogger(ManageVolunteers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageVolunteers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageVolunteers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageVolunteers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageVolunteers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2_delete;
    private javax.swing.JButton jButton2_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_address;
    private javax.swing.JLabel jLabel_bYear;
    private javax.swing.JLabel jLabel_fname;
    private javax.swing.JLabel jLabel_lname;
    private javax.swing.JLabel jLabel_search;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxt_ID;
    private javax.swing.JTextArea jtxt_address;
    private javax.swing.JTextField jtxt_bYear;
    private javax.swing.JTextField jtxt_fname;
    private javax.swing.JTextField jtxt_lname;
    private javax.swing.JTextField jtxt_search;
    private javax.swing.JTextField jtxt_username;
    // End of variables declaration//GEN-END:variables
}
