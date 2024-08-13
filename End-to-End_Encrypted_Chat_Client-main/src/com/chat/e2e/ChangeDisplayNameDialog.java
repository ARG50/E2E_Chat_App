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
public class ChangeDisplayNameDialog extends javax.swing.JDialog {

    AccountSettingsPanel parentPanel;
    /**
     * Creates new form ChangeDisplayNameDialog
     */
    public ChangeDisplayNameDialog(java.awt.Dialog parent, boolean modal, AccountSettingsPanel parentPanel) {
        super(parent, modal);
        this.parentPanel = parentPanel;
        initComponents();
        setTitle("Change name");
        setLocationRelativeTo(parent);
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

        newDisplayNameLabel = new javax.swing.JLabel();
        newDisplayNameField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        confirmChangeButton = new javax.swing.JButton();
        oldDisplayNameLabel = new javax.swing.JLabel();
        changeDisplayNameLabel = new javax.swing.JLabel();
        oldDisplayNameField = new javax.swing.JTextField();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if(confirmChangeButton.isEnabled())
                {
                    if(newDisplayNameField.getText().isEmpty())
                    {
                        dispose();
                        return;
                    }
                    else
                    {
                        int response = JOptionPane.showConfirmDialog(getSelfReference(), "Do you want to cancel changing display name?", "Cancel changes", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        if(response == JOptionPane.NO_OPTION)
                        {
                            return;
                        }
                        else if(response == JOptionPane.YES_OPTION)
                        {
                            dispose();
                            return;
                        }
                    }
                }
            }
        });

        newDisplayNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newDisplayNameLabel.setText("New Display Name");

        newDisplayNameField.setToolTipText("New display name");
        newDisplayNameField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                newDisplayNameFieldActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                newDisplayNameFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                newDisplayNameFieldActionPerformed();
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        confirmChangeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmChangeButton.setText("Confirm and change");
        confirmChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmChangeButtonActionPerformed(evt);
            }
        });

        oldDisplayNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        oldDisplayNameLabel.setText("Old Display Name");

        changeDisplayNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        changeDisplayNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeDisplayNameLabel.setText("Change Display Name");

        oldDisplayNameField.setText(ConfigManager.getAccountDisplayName());
        oldDisplayNameField.setToolTipText("Previous display name");
        oldDisplayNameField.setEnabled(false);
        oldDisplayNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldDisplayNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(changeDisplayNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(oldDisplayNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(newDisplayNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(oldDisplayNameField)
                                                        .addComponent(newDisplayNameField)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(confirmChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(changeDisplayNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(oldDisplayNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oldDisplayNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(newDisplayNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(newDisplayNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton)
                                        .addComponent(confirmChangeButton))
                                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>

    private void newDisplayNameFieldActionPerformed() {
        // TODO add your handling code here:
        newDisplayNameField.setBackground((new JTextField()).getBackground());
    }

    private JDialog getSelfReference()
    {
        return this;
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(newDisplayNameField.getText().isEmpty())
        {
            dispose();
            return;
        }
        else
        {
            int response = JOptionPane.showConfirmDialog(getSelfReference(), "Do you want to cancel changing display name?", "Cancel changes", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(response == JOptionPane.NO_OPTION)
            {
                return;
            }
            else if(response == JOptionPane.YES_OPTION)
            {
                dispose();
                return;
            }
        }
    }

    private void confirmChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        startConfirmButtonAnimation();
        newDisplayNameField.setBackground((new JTextField()).getBackground());

        SwingWorker<Void, Void> displayNameChanger = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                String newDisplayName = newDisplayNameField.getText();
                if(newDisplayName.isEmpty())
                {
                    newDisplayNameField.setBackground(new Color(255, 94, 116, 131));
                    JOptionPane.showMessageDialog(getSelfReference(), "The new display name cannot be empty.", "Invalid name", JOptionPane.ERROR_MESSAGE);
                    stopConfirmButtonAnimation();
                    return null;
                }

                if(!NetworkManager.isConnected())
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently unavailable.\nPlease check your connection or try again later.",
                            "Server unavailable", JOptionPane.ERROR_MESSAGE);
                    stopConfirmButtonAnimation();
                    return null;
                }
                if(!NetworkManager.isLoggedIn())
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "User is currently not logged in with the server.\nPlease try again a little later.",
                            "User not logged in", JOptionPane.ERROR_MESSAGE);
                    stopConfirmButtonAnimation();
                    return null;
                }
                if(NetworkManager.isBusy())
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently busy.\nPlease try again later.",
                            "Server busy", JOptionPane.ERROR_MESSAGE);
                    stopConfirmButtonAnimation();
                    return null;
                }

                NetworkManager.setBusy(true);
                Boolean changeSuccess = NetworkManager.changeDisplayName(newDisplayName);
                NetworkManager.setBusy(false);
                if(changeSuccess == null)
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently unavailable.\nPlease check your connection or try again later.",
                            "Server unavailable", JOptionPane.ERROR_MESSAGE);
                    stopConfirmButtonAnimation();
                    return null;
                }
                if(!changeSuccess)
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server faced an internal error.\nPlease try again later.",
                            "Server error", JOptionPane.ERROR_MESSAGE);
                    stopConfirmButtonAnimation();
                    return null;
                }

                parentPanel.getDisplayNameField().setText(ConfigManager.getAccountDisplayName());
                JOptionPane.showMessageDialog(getSelfReference(), "Your display name has been successfully changed.",
                        "Change successful", JOptionPane.INFORMATION_MESSAGE);
                dispose();

                return null;
            }
        };
        displayNameChanger.execute();
    }

    private void startConfirmButtonAnimation()
    {
        ImageIcon confirmButtonIcon = new ImageIcon(Objects.requireNonNull(ChangeDisplayNameDialog.class.getClassLoader().getResource("Spinner-1s-20px (1).gif")));
        confirmChangeButton.setIcon(confirmButtonIcon);
        confirmButtonIcon.setImageObserver(confirmChangeButton);
        confirmChangeButton.setEnabled(false);
        cancelButton.setEnabled(false);
        newDisplayNameField.setEnabled(false);
    }

    private void stopConfirmButtonAnimation()
    {
        confirmChangeButton.setIcon(null);
        confirmChangeButton.setEnabled(true);
        cancelButton.setEnabled(true);
        newDisplayNameField.setEnabled(true);
    }

    private void oldDisplayNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(ChangeDisplayNameDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ChangeDisplayNameDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ChangeDisplayNameDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ChangeDisplayNameDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ChangeDisplayNameDialog dialog = new ChangeDisplayNameDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel changeDisplayNameLabel;
    private javax.swing.JButton confirmChangeButton;
    private javax.swing.JTextField newDisplayNameField;
    private javax.swing.JLabel newDisplayNameLabel;
    private javax.swing.JTextField oldDisplayNameField;
    private javax.swing.JLabel oldDisplayNameLabel;
    // End of variables declaration
}
