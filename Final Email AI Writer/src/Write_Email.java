
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author wahee
 */
public class Write_Email extends javax.swing.JFrame implements ChangeListener{

    /**
     * Creates new form Write_Email
     */
    public Write_Email() {
        initComponents();
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
        Desc = new javax.swing.JTextField();
        Sender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Recepient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ToneBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        LanguageBox = new javax.swing.JComboBox<>();
        WelcomeLabel = new javax.swing.JLabel();
        Slider = new javax.swing.JSlider(3, 150, 50);
        Limit = new javax.swing.JLabel(String.valueOf(Slider.getValue()) + "/" + String.valueOf(Slider.getMaximum()));
        jLabel8 = new javax.swing.JLabel();
        Recepient1 = new javax.swing.JTextField();
        Generate = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Email = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("1. What is the email about?");

        Desc.setToolTipText("What do you want to send?");
        Desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescActionPerformed(evt);
            }
        });

        Sender.setToolTipText("");
        Sender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenderActionPerformed(evt);
            }
        });

        jLabel3.setText("2. Your Name");

        Recepient.setToolTipText("");
        Recepient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecepientActionPerformed(evt);
            }
        });

        jLabel4.setText("3. Recepient Name");

        jLabel5.setText("5. Length");

        jLabel6.setText("6. Tone");

        ToneBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funny", "Sarcastic", "Serious", "Witty", "Casual", "Persuassive", "Dismissive", "Angry", "Worried", "Helpful", "Professional"}));
        ToneBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToneBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("7. Language");

        LanguageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Italian", "French", "German", "Arabic" }));
        LanguageBox.setSelectedItem("English");

        WelcomeLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        WelcomeLabel.setText("Email AI Helper");

        Slider.addChangeListener(this);

        jLabel8.setText("4. Relationship with Recepient");

        Recepient1.setToolTipText("");
        Recepient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Recepient1ActionPerformed(evt);
            }
        });

        Generate.setText("Generate Email");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });

        Email.setColumns(20);
        Email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Email.setLineWrap(true);
        Email.setRows(5);
        Email.setWrapStyleWord(true);
        jScrollPane2.setViewportView(Email);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(WelcomeLabel)
                .addGap(18, 18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Recepient1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(Recepient, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(Sender, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ToneBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGap(90, 90, 90)
                                    .addComponent(Generate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Limit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(WelcomeLabel)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(Sender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Recepient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Recepient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Limit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ToneBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LanguageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Generate))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenderActionPerformed

    private void RecepientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecepientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecepientActionPerformed

    private void DescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescActionPerformed

    private void Recepient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Recepient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Recepient1ActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
         String description = Desc.getText();
         String sender = Sender.getText();
         String recipient = Recepient.getText();
         String recipientrel = Recepient1.getText();
         String tone = ToneBox.getSelectedItem().toString();
         String language = LanguageBox.getSelectedItem().toString();
         String limit = String.valueOf(Slider.getValue());
         if (description.isEmpty() || sender.isEmpty() ||
                        recipient.isEmpty() || limit.isEmpty()) {
                    JOptionPane.showMessageDialog(Write_Email.this,
                            "Please fill in all required fields (marked with *)",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // All fields are filled, proceed with email generation or further actions
                    System.out.println("Description: " + description);
                    System.out.println("Sender: " + sender);
                    System.out.println("Recipient: " + recipient);
                    System.out.println("Recipient: " + recipientrel);
                    System.out.println("Tone: " + tone);
                    System.out.println("Language: " + language);
                    System.out.println("Limit: " + limit);
                    String message = "I want to send an email to " + recipient +
                            " who is my " + recipientrel + " about " + description +
                            ". Use a " + tone + " tone and write it in " + language +
                            " no more than " + limit + " words. My name is " + sender;
                    ChatGPTAPI chat = null;
                    Email.setText(chat.chatGPT(message).replace("\\n", "\n"));
                }
    }//GEN-LAST:event_GenerateActionPerformed

    private void ToneBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToneBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToneBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Write_Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Write_Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Write_Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Write_Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Write_Email().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Desc;
    private javax.swing.JTextArea Email;
    private javax.swing.JToggleButton Generate;
    private javax.swing.JComboBox<String> LanguageBox;
    private javax.swing.JLabel Limit;
    private javax.swing.JTextField Recepient;
    private javax.swing.JTextField Recepient1;
    private javax.swing.JTextField Sender;
    private javax.swing.JSlider Slider;
    private javax.swing.JComboBox<String> ToneBox;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void stateChanged(ChangeEvent e) {
        Limit.setText(String.valueOf(Slider.getValue()) + "/" + String.valueOf(Slider.getMaximum())); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
