
package onlineexam.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import onlineexam.pojo.UserProfile;

public class AdminOptionFrame extends javax.swing.JFrame {

    Color oldColor;
    public AdminOptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("hello "+UserProfile.getUsername());
        oldColor=lblLogout.getForeground();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jrbAddStudent = new javax.swing.JRadioButton();
        jrbSetPaper = new javax.swing.JRadioButton();
        jrbEditPaper = new javax.swing.JRadioButton();
        jrbViewScore = new javax.swing.JRadioButton();
        jrbDeleteStudent = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Examination System Administration  Panel");

        jrbAddStudent.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup1.add(jrbAddStudent);
        jrbAddStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbAddStudent.setText("Register A Student");

        jrbSetPaper.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup1.add(jrbSetPaper);
        jrbSetPaper.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbSetPaper.setText("Set A paper");

        jrbEditPaper.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup1.add(jrbEditPaper);
        jrbEditPaper.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbEditPaper.setText("Edit Paper");
        jrbEditPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEditPaperActionPerformed(evt);
            }
        });

        jrbViewScore.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup1.add(jrbViewScore);
        jrbViewScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbViewScore.setText("View Scores");
        jrbViewScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbViewScoreActionPerformed(evt);
            }
        });

        jrbDeleteStudent.setBackground(new java.awt.Color(0, 255, 255));
        buttonGroup1.add(jrbDeleteStudent);
        jrbDeleteStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbDeleteStudent.setText("Remove a Student");

        btnDoTask.setBackground(new java.awt.Color(0, 255, 255));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(102, 102, 102));
        lblLogout.setText("LOGOUT");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 153, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Adminopt.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbSetPaper)
                                    .addComponent(jrbAddStudent)
                                    .addComponent(jrbEditPaper)
                                    .addComponent(jrbViewScore)
                                    .addComponent(jrbDeleteStudent)
                                    .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblLogout)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jrbAddStudent)
                        .addGap(18, 18, 18)
                        .addComponent(jrbSetPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrbEditPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrbViewScore)))
                .addGap(18, 18, 18)
                .addComponent(jrbDeleteStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnDoTask)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.red);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
       lblLogout.setForeground(oldColor);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jrbViewScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbViewScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbViewScoreActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        if(jrbAddStudent.isSelected())
        {
            StudentRegistrationFrame stdadd=new StudentRegistrationFrame();
            stdadd.setVisible(true);
            }
        else if(jrbDeleteStudent.isSelected()){
            DltStudentFrame dltstd=new DltStudentFrame();
            dltstd.setVisible(true);
        }
        else if(jrbSetPaper.isSelected()){
            SetPaper setp=new SetPaper();
            setp.setVisible(true);
        }
        else if(jrbEditPaper.isSelected())
        {
            EditPaperFrame edit=new EditPaperFrame();
            edit.setVisible(true);
            
            
        }
        else if(jrbViewScore.isSelected()){
            ViewScoreFrame view= new ViewScoreFrame();
            view.setVisible(true);
            
        }
        else{
            JOptionPane.showConfirmDialog(null, "Please select an option", "NO Selection", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.dispose();
        
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void jrbEditPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEditPaperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEditPaperActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbAddStudent;
    private javax.swing.JRadioButton jrbDeleteStudent;
    private javax.swing.JRadioButton jrbEditPaper;
    private javax.swing.JRadioButton jrbSetPaper;
    private javax.swing.JRadioButton jrbViewScore;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
