/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

/**
 *
 * @author santi
 */
public class AdminFunctionSelect extends javax.swing.JFrame {

    /**
     * Creates new form AdminFunctionSelect
     */
    public AdminFunctionSelect() {
        initComponents();
        setSize(900,700);
        setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1_logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Adding_Removing_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.pink);
        setName("Adding_Removing_Label"); // NOI18N

        jButton1_logout.setText("Logout");
        jButton1_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_logoutActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_Button_ActionPerformed(evt);
            }
        });

        Adding_Removing_Label.setBackground(new java.awt.Color(255, 209, 220));
        Adding_Removing_Label.setForeground(new java.awt.Color(0, 0, 0));
        Adding_Removing_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smallpawprint.png"))); // NOI18N
        Adding_Removing_Label.setText("Adding and removing dogs or cats");
        Adding_Removing_Label.setToolTipText("Add or remove dogs or cats from being avaliable from being adopted, walked, fostered,");
        Adding_Removing_Label.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(191, 191, 191), 1, true));
        Adding_Removing_Label.setIconTextGap(9);
        Adding_Removing_Label.setMaximumSize(new java.awt.Dimension(218, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton1_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Adding_Removing_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Adding_Removing_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 635, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_logout)
                    .addComponent(jButton1))
                .addGap(233, 233, 233))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        Login Info = new Login();
        Info.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1_logoutActionPerformed

    private void Back_Button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Button_ActionPerformed
        // TODO add your handling code here:
        dispose();  //this statement gets rid of the current window
        Login Info = new Login();   //this statement gives us another instance of another window, in our case Login
        Info.setVisible(true);      //after creating this new instance of the object, we set the visbility to true so we can now visually
                                    //see the Login window. 
        /*NOTE: What if we want to go back to a previous window with the same saved data that was previously there before? Data would be 
                     potentially stored in database so would we use that to retrieve data or would we save the data locally and then load
                     the data from there?
        */
    }//GEN-LAST:event_Back_Button_ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminFunctionSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFunctionSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFunctionSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFunctionSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFunctionSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adding_Removing_Label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_logout;
    // End of variables declaration//GEN-END:variables
}
