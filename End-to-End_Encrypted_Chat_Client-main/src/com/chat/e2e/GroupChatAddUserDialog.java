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
public class GroupChatAddUserDialog extends javax.swing.JDialog {

    ChatMainPanel parentPanel;

    /**
     * Creates new form GroupChatAddUserDialog
     */
    public GroupChatAddUserDialog(JFrame parent, boolean modal, ChatMainPanel parentPanel) {
        super(parent, modal);
        initComponents();

        this.parentPanel = parentPanel;

        setTitle("Select new user");
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

        accountIdLabel = new javax.swing.JLabel();
        accountIdField = new javax.swing.JTextField();
        savedUsersButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        numberOfCharactersLeftLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeDialog();
            }
        });

        accountIdLabel.setText("Enter the account ID of new participant:");

        accountIdField.setToolTipText("Enter 16-digit account ID");
        accountIdField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                accountIdFieldActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                accountIdFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                accountIdFieldActionPerformed();
            }
        });

        savedUsersButton.setToolTipText("Choose from saved users");
        savedUsersButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(NewChatCreateDialog.class.getClassLoader().getResource("contact-book (1).png"))));
        savedUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedUsersButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addUserButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addUserButton.setText("Add user");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        numberOfCharactersLeftLabel.setText("0/16 characters");
        numberOfCharactersLeftLabel.setForeground(Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(numberOfCharactersLeftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(accountIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(accountIdField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(savedUsersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(accountIdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(accountIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(savedUsersButton))
                                .addGap(2, 2, 2)
                                .addComponent(numberOfCharactersLeftLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelButton)
                                        .addComponent(addUserButton))
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void accountIdFieldActionPerformed() {
        // TODO add your handling code here:
        accountIdField.setBackground((new JTextField()).getBackground());
        int fieldTextLength = accountIdField.getText().length();
        numberOfCharactersLeftLabel.setText(fieldTextLength + "/16 characters");
        if(fieldTextLength == 16)
        {
            numberOfCharactersLeftLabel.setForeground(Color.green);
        }
        else
        {
            numberOfCharactersLeftLabel.setForeground(Color.red);
        }
    }

    private void savedUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String[][] savedUsers = DatabaseManager.makeQuery("select display_name, account_id from savedUsers;", null);
        if(savedUsers != null && savedUsers.length > 0) {
            new SelectFromSavedUsersDialog(this, true, savedUsers, SelectFromSavedUsersDialog.SINGLE_SELECTION_MODE);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No saved users were found.", "No saved users", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        closeDialog();
    }

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        startAddUserButtonAnimation();
        accountIdField.setBackground((new JTextField()).getBackground());

        SwingWorker<Void, Void> newUserAddButtonProcessor = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                boolean errorPresent = false;
                String accountID = accountIdField.getText();
                if(accountID.length() != 16)
                {
                    errorPresent = true;
                }
                for(int i = 0; !errorPresent && i < accountID.length(); i++)
                {
                    if(((int)accountID.charAt(i)) < 48 || ((int)accountID.charAt(i)) > 57)
                    {
                        errorPresent = true;
                    }
                }
                if(errorPresent)
                {
                    accountIdField.setBackground(new Color(255, 94, 116, 131));
                    JOptionPane.showMessageDialog(getSelfReference(), "Please enter a single valid account ID of length 16\nand containing only digits.", "Invalid account ID", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }

                String[][] chatParticipants = DatabaseManager.makeQuery("select chat_participants from chat where chat_id = " + parentPanel.getActiveChatComponentReference().getChatID() + ";", null);
                if(chatParticipants!= null && chatParticipants.length > 0 && chatParticipants[0][0].contains(accountIdField.getText()))
                {
                    accountIdField.setBackground(new Color(255, 94, 116, 131));
                    JOptionPane.showMessageDialog(getSelfReference(), "The given user is already part of the group.", "User already present", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }

                if(!NetworkManager.isConnected())
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently unavailable.\nPlease check your connection or try again later.",
                            "Server unavailable", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }
                if(!NetworkManager.isLoggedIn())
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "User is currently not logged in with the server.\nPlease try again a little later.",
                            "User not logged in", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }
                if(NetworkManager.isBusy())
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently busy.\nPlease try again later.",
                            "Server busy", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }

                NetworkManager.setBusy(true);
                Boolean success = NetworkManager.checkAccountIdValid(accountIdField.getText());
                if(success == null)
                {
                    NetworkManager.setBusy(false);
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently unavailable.\nPlease check your connection or try again later.",
                            "Server unavailable", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }
                if(!success)
                {
                    NetworkManager.setBusy(false);
                    accountIdField.setBackground(new Color(255, 94, 116, 131));
                    JOptionPane.showMessageDialog(getSelfReference(), "The given account ID " + accountIdField.getText() + " is invalid.", "Invalid account ID", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }

                success = NetworkManager.checkIfNewGroupChatAllowed(accountIdField.getText());
                if(success == null)
                {
                    NetworkManager.setBusy(false);
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently unavailable.\nPlease check your connection or try again later.",
                            "Server unavailable", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }
                if(!success)
                {
                    NetworkManager.setBusy(false);
                    accountIdField.setBackground(new Color(255, 94, 116, 131));
                    JOptionPane.showMessageDialog(getSelfReference(), "The given account ID " + accountIdField.getText() + " has turned off new group chat requests.\nThis user cannot be added to group chats.", "New chat not allowed", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }

                success = NetworkManager.addNewUserToGroupChat(parentPanel.getActiveChatComponentReference().getChatID(), accountIdField.getText());
                NetworkManager.setBusy(false);
                if(success == null)
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server is currently unavailable.\nPlease check your connection or try again later.",
                            "Server unavailable", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }
                if(!success)
                {
                    JOptionPane.showMessageDialog(getSelfReference(), "The server faced an internal error.\nPlease try again later.",
                            "Server error", JOptionPane.ERROR_MESSAGE);
                    stopAddUserButtonAnimation();
                    return null;
                }

                parentPanel.updateFromDB(ChatMainPanel.KEEP_MESSAGE_LIST_AT_CURRENT_SCROLL_POSITION_WHEN_REFRESHING_FOR_ANY_REASON);
                JOptionPane.showMessageDialog(getSelfReference(), "The user has been successfully added to the group chat.", "User added", JOptionPane.INFORMATION_MESSAGE);
                getSelfReference().dispose();
                return null;
            }
        };
        newUserAddButtonProcessor.execute();
    }

    private void startAddUserButtonAnimation()
    {
        accountIdField.setEnabled(false);
        savedUsersButton.setEnabled(false);
        cancelButton.setEnabled(false);
        addUserButton.setEnabled(false);
        ImageIcon adduserButtonIcon = new ImageIcon(Objects.requireNonNull(NewChatCreateDialog.class.getClassLoader().getResource("Spinner-1s-20px (1).gif")));
        addUserButton.setIcon(adduserButtonIcon);
        adduserButtonIcon.setImageObserver(addUserButton);
    }

    private void stopAddUserButtonAnimation()
    {
        addUserButton.setIcon(null);
        addUserButton.setEnabled(true);
        cancelButton.setEnabled(true);
        accountIdField.setEnabled(true);
        savedUsersButton.setEnabled(true);
    }

    private GroupChatAddUserDialog getSelfReference()
    {
        return this;
    }

    private void closeDialog()
    {
        if(cancelButton.isEnabled())
            this.dispose();
    }

    public void setAccountIdFieldText(String newText)
    {
        accountIdField.setText(newText);
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
//            java.util.logging.Logger.getLogger(GroupChatAddUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GroupChatAddUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GroupChatAddUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GroupChatAddUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                GroupChatAddUserDialog dialog = new GroupChatAddUserDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField accountIdField;
    private javax.swing.JLabel accountIdLabel;
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel numberOfCharactersLeftLabel;
    private javax.swing.JButton savedUsersButton;
    // End of variables declaration
}
