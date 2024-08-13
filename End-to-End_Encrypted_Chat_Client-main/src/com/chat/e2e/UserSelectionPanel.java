/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.chat.e2e;

/**
 *
 * @author Soubhik
 */
public class UserSelectionPanel extends javax.swing.JPanel {


    /**
     * Creates new form userSelectionPanel
     */
    public UserSelectionPanel() {
        initComponents();
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        newUserButton = new javax.swing.JButton();
        existingUserButton = new javax.swing.JButton();

        newUserButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newUserButton.setText("New User");
        newUserButton.setFocusPainted(false);
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });

        existingUserButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        existingUserButton.setText("Existing User");
        existingUserButton.setFocusPainted(false);
        existingUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existingUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(230, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(newUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(existingUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(265, Short.MAX_VALUE)
                                .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(existingUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
        );
    }// </editor-fold>

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        WindowManager.changeFromSelectionToRegister();
    }

    private void existingUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        WindowManager.changeFromSelectionToLogin();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton existingUserButton;
    private javax.swing.JButton newUserButton;
    // End of variables declaration
}
