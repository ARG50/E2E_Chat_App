/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.chat.e2e;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Objects;

/**
 *
 * @author Soubhik
 */

public class ForgotPasswordSecurityQsDialog extends javax.swing.JDialog {

    private JFrame parentFrame;
    private JPanel parentPanel;
    private String username;
    /**
     * Creates new form ForgotPasswordDialog
     */
    public ForgotPasswordSecurityQsDialog(java.awt.Frame parentFrame, boolean modal, JPanel parentPanel, String[] securityQuestions, String username) {
        super(parentFrame, modal);
        this.parentFrame = (JFrame) parentFrame;
        this.parentPanel = parentPanel;
        initComponents();
        for(int i = 0; i < securityQuestions.length; i++)
        {
            securityQsChooseBox.addItem(securityQuestions[i]);
        }
        securityAnsField.setEnabled(false);
        this.username = username;
        setLocationRelativeTo(parentFrame);
        setTitle("Security check");
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        recoveryUsernameLabel = new javax.swing.JLabel();
        securityQsChooseBox = new javax.swing.JComboBox<>();
        securityAnsField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        proceedButton = new javax.swing.JButton();
        recoveryInfoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cancelPasswordReset();
            }
        });

        recoveryUsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        recoveryUsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recoveryUsernameLabel.setText("Recover Account");

        securityQsChooseBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------" }));
        securityQsChooseBox.setToolTipText("Select any one security question previously answered");
        securityQsChooseBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityQsChooseBoxActionPerformed(evt);
            }
        });

        securityAnsField.setToolTipText("Answer to the selected security question");
        securityAnsField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                securityAnsFieldActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                securityAnsFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                securityAnsFieldActionPerformed();
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        proceedButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        proceedButton.setText("Proceed");
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });

        recoveryInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        recoveryInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recoveryInfoLabel.setText("Select any one security question and answer it correctly to reset password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(32, 32, 32)
                                                .addComponent(proceedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(recoveryUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(recoveryInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                                        .addComponent(securityQsChooseBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(securityAnsField))
                                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(recoveryUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recoveryInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(securityQsChooseBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(securityAnsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton)
                                        .addComponent(proceedButton))
                                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>

    private void securityQsChooseBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        securityQsChooseBox.setBackground((new JComboBox<>()).getBackground());
        if(((String)securityQsChooseBox.getSelectedItem()).equals("----------"))
            securityAnsField.setEnabled(false);
        else
            securityAnsField.setEnabled(true);

        securityAnsField.setBackground((new JTextField()).getBackground());
        securityAnsField.setText("");
    }

    private void securityAnsFieldActionPerformed() {
        // TODO add your handling code here:
        securityAnsField.setBackground((new JTextField()).getBackground());
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        cancelPasswordReset();
    }

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        startProceedButtonAnimation();
        securityQsChooseBox.setBackground((new JComboBox<>()).getBackground());
        securityAnsField.setBackground((new JTextField()).getBackground());

        SwingWorker<Void, Void> securityQsChecker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                if(((String)(securityQsChooseBox.getSelectedItem())).equals("----------"))
                {
                    securityQsChooseBox.setBackground(new Color(255, 94, 116, 131));
                    JOptionPane.showMessageDialog(getSelfReference(), "Please select a security question and answer it.",
                            "Invalid question", JOptionPane.ERROR_MESSAGE);
                    stopProceedButtonAnimation();
                    return null;
                }
                else if(securityAnsField.getText().isEmpty())
                {
                    securityAnsField.setBackground(new Color(255, 94, 116, 131));
                    JOptionPane.showMessageDialog(getSelfReference(), "The answer cannot be empty.",
                            "Invalid answer", JOptionPane.ERROR_MESSAGE);
                    stopProceedButtonAnimation();
                    return null;
                }

                if(!NetworkManager.isConnected())
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently unavailable.\nPlease check your connection or try again later.",
                            "Server unavailable", JOptionPane.ERROR_MESSAGE);
                    stopProceedButtonAnimation();
                    return null;
                }
                if(NetworkManager.isBusy())
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently busy.\nPlease try again later.",
                            "Server busy", JOptionPane.ERROR_MESSAGE);
                    stopProceedButtonAnimation();
                    return null;
                }

                NetworkManager.setBusy(true);
                Boolean answerValid = NetworkManager.checkSecurityQsAnswer(username, (String)securityQsChooseBox.getSelectedItem(), securityAnsField.getText());
                NetworkManager.setBusy(false);
                if(answerValid == null)
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently unavailable.\nPlease check your connection or try again later.",
                            "Server unavailable", JOptionPane.ERROR_MESSAGE);
                    stopProceedButtonAnimation();
                    return null;
                }
                if(!answerValid)
                {
                    securityAnsField.setBackground(new Color(255, 94, 116, 131));
                    JOptionPane.showMessageDialog(getSelfReference(), "The answer for the selected question is wrong.\nPlease check and try again.",
                            "Invalid answer", JOptionPane.ERROR_MESSAGE);
                    stopProceedButtonAnimation();
                    return null;
                }

                ((UserLoginPanel)parentPanel).switchFromSecQsToReset(username, getSelfReference());
                return null;
            }
        };
        securityQsChecker.execute();
    }

    private ForgotPasswordSecurityQsDialog getSelfReference()
    {
        return this;
    }

    private void cancelPasswordReset()
    {
        if(!cancelButton.isEnabled())
        {
            return;
        }
        SwingWorker<Void, Void> cancelNotifier = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                ((UserLoginPanel)parentPanel).stopForgotPasswordButtonAnimation();
                return null;
            }
        };
        cancelNotifier.execute();
        dispose();
    }

    private void startProceedButtonAnimation()
    {
        ImageIcon proceedButtonIcon = new ImageIcon(Objects.requireNonNull(ForgotPasswordSecurityQsDialog.class.getClassLoader().getResource("Spinner-1s-20px (1).gif")));
        proceedButton.setIcon(proceedButtonIcon);
        proceedButtonIcon.setImageObserver(proceedButton);
        proceedButton.setEnabled(false);
        securityQsChooseBox.setEnabled(false);
        securityAnsField.setFocusable(false);
        cancelButton.setEnabled(false);
        repaint();
        revalidate();
    }

    private void stopProceedButtonAnimation()
    {
        proceedButton.setIcon(null);
        proceedButton.setEnabled(true);
        securityQsChooseBox.setEnabled(true);
        securityAnsField.setFocusable(true);
        cancelButton.setEnabled(true);
        repaint();
        revalidate();
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ForgotPasswordSecurityQsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ForgotPasswordSecurityQsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ForgotPasswordSecurityQsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ForgotPasswordSecurityQsDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ForgotPasswordSecurityQsDialog dialog = new ForgotPasswordSecurityQsDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton proceedButton;
    private javax.swing.JLabel recoveryInfoLabel;
    private javax.swing.JLabel recoveryUsernameLabel;
    private javax.swing.JTextField securityAnsField;
    private javax.swing.JComboBox<String> securityQsChooseBox;
    // End of variables declaration
}
