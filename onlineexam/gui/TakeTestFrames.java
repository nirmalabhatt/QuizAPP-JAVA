
package onlineexam.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import onlineexam.dao.PerformanceDAO;
import onlineexam.dao.QuestionDAO;
import onlineexam.pojo.Answer;
import onlineexam.pojo.AnswereStore;
import onlineexam.pojo.Exam;
import onlineexam.pojo.Performance;
import onlineexam.pojo.Question;
import onlineexam.pojo.QuestionStore;
import onlineexam.pojo.UserProfile;


public class TakeTestFrames extends javax.swing.JFrame {

     private int qno, pos=0;
     private QuestionStore qstore;
     private AnswereStore astore;
     private Exam exam;
     
    public TakeTestFrames() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("hello "+UserProfile.getUsername());
        qstore=new QuestionStore();
        astore=new AnswereStore();
        qno=1;
        lblQno.setText(lblQno.getText()+qno);
    }
     public TakeTestFrames(Exam exam)
    {
      this();  
      this.exam=exam;
      lblTitle.setText( "FOR : "  +exam.getLanguage().toUpperCase()+  ":PAPER");
      loadQuestion();
      showQuestion();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JTextField();
        jrOption1 = new javax.swing.JRadioButton();
        jrOption2 = new javax.swing.JRadioButton();
        lblUsername = new javax.swing.JLabel();
        jrOption3 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jrOption4 = new javax.swing.JRadioButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Taketest.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Take Test Panel");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("GOOD");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("LUCK");

        lblQno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQno.setText("Question NO:");

        buttonGroup1.add(jrOption1);
        jrOption1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrOption1.setText("jRadioButton1");

        buttonGroup1.add(jrOption2);
        jrOption2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrOption2.setText("jRadioButton2");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        buttonGroup1.add(jrOption3);
        jrOption3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrOption3.setText("jRadioButton3");

        btnNext.setBackground(new java.awt.Color(51, 255, 204));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(51, 255, 204));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancle.setBackground(new java.awt.Color(51, 255, 204));
        btnCancle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancle.setText("Cancle");

        btnDone.setBackground(new java.awt.Color(51, 255, 204));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrOption4);
        jrOption4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrOption4.setText("jRadioButton4");

        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblQno)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrOption3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrOption4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jrOption1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrOption2)))
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(119, 119, 119)
                                        .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtQuestion))
                                .addGap(64, 64, 64))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(346, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 769, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption1)
                    .addComponent(jrOption2))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption3)
                    .addComponent(jrOption4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnCancle)
                    .addComponent(btnDone))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null)
        {
        Question quest=qstore.getQuestionByQno(qno);
        String correctAnswer=quest.getCorrectAnswer();
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else
        {
            String prevAnswer=answer.getChosenAnswer();
            if(prevAnswer.equals(chosenAnswer)==false)
            
            {
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos++;
        if(pos>=qstore.getCount())
        {
            pos=0;
        }
         qno++;         
        if(qno>qstore.getCount())
                qno=1;
        lblQno.setText("Question No:"+qno);
        showQuestion();
    }   
   public String getUserAnswer()
   {
        
        if(jrOption1.isSelected())
            return "Answer1";
        else if(jrOption2.isSelected())
            return "Answer2";
        else if(jrOption3.isSelected())
            return "Answer3";
        else if(jrOption4.isSelected())
            return "Answer4";
        else
            return null;

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
     String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null)
        {
        Question quest=qstore.getQuestionByQno(qno);
        String correctAnswer=quest.getCorrectAnswer();
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else
        {
            String prevAnswer=answer.getChosenAnswer();
            if(prevAnswer.equals(chosenAnswer)==false)
            {
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     } 
        pos--;
        if(pos<0)
        {
            pos=qstore.getCount()-1;
        }
         qno--;         
        if(qno<=0)
                qno=qstore.getCount();
        lblQno.setText("Question No:"+qno);
        showQuestion();
    
        
        
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
      String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null)
        {
        Question quest=qstore.getQuestionByQno(qno);
        String correctAnswer=quest.getCorrectAnswer();
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
        System.out.println(newanswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else
        {
            String prevAnswer=answer.getChosenAnswer();
            if(prevAnswer.equals(chosenAnswer)==false)
            {
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
              int right=0,wrong=0;
                for(Question question:qstore.getAlluestions())
                {
                    int qno=question.getQno();
                    Answer answer=astore.getAnswerByQno(qno);
                    if(answer==null)
                    continue;
            else
            {
                String chosenAnswer1=answer.getChosenAnswer();
                String correctAnswer=answer.getCorrectAnswer();
                if(chosenAnswer1.equals(correctAnswer))
                    ++right;
                else
                    ++wrong;
                    
            }
            
        }
        String reportCard="Total Questions:"+qstore.getCount();
        reportCard+="\nRight Answers:"+right;
        reportCard+="\nWrong Answers:"+wrong;
        reportCard+="\nUnAttempted  :"+(qstore.getCount()-(right+wrong));
        JOptionPane.showMessageDialog(null, reportCard,"Your Result!",JOptionPane.INFORMATION_MESSAGE);
        try
        {
            Performance performance=new Performance(UserProfile.getUsername(),exam.getExamId(),right,wrong,(qstore.getCount()-(right+wrong)),(double)right/qstore.getCount()*100,exam.getLanguage());

            PerformanceDAO.addPerformance(performance);
            JOptionPane.showMessageDialog(null, "Your performance has been successfully added to the database"," Performance Added!",JOptionPane.INFORMATION_MESSAGE);
            ChoosePaperFrame paperFrame=new ChoosePaperFrame();
            paperFrame.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        
    }//GEN-LAST:event_btnDoneActionPerformed

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
            java.util.logging.Logger.getLogger(TakeTestFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrOption1;
    private javax.swing.JRadioButton jrOption2;
    private javax.swing.JRadioButton jrOption3;
    private javax.swing.JRadioButton jrOption4;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables

    private void loadQuestion() 
    {
        
        try
        {
            ArrayList<Question>questionList=QuestionDAO.getQuestionsByExamId(exam.getExamId());
            for(Question q: questionList)
            {
                qstore.addQuestion(q);
            }
            
        }
        catch(SQLException ex)
           {
            JOptionPane.showMessageDialog(null, "Error in Database","edit Question error", JOptionPane.ERROR_MESSAGE); 
            ex.printStackTrace();
           }
        
    }

    private void showQuestion()
    {
        buttonGroup1.clearSelection();
        Question q=qstore.getQuestion(pos);
        txtQuestion.setText(q.getQuestion());
        jrOption1.setText(q.getAnswer1());
        jrOption2.setText(q.getAnswer2());
        jrOption3.setText(q.getAnswer3());
        jrOption4.setText(q.getAnswer4());
        Answer ans=astore.getAnswerByQno(qno);
        if(ans==null)
        {
            return;
        }
        String str=ans.getChosenAnswer();
        switch(str)
        {
            case "Answer1":
                jrOption1.setSelected(true);
                break;
            case "Answer2":
                jrOption2.setSelected(true);
                break;
            case "Answer3":
                jrOption3.setSelected(true);
                break;
            case "Answer4":
                jrOption4.setSelected(true);
                break;

        }
        
    }
    
}
