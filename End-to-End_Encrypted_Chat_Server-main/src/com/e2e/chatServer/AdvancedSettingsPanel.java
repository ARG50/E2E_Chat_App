/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.e2e.chatServer;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Soubhik
 */
public class AdvancedSettingsPanel extends javax.swing.JPanel {

    SettingsDialog parent;

    /**
     * Creates new form AdvancedSettingsPanel
     */
    public AdvancedSettingsPanel(SettingsDialog parent) {
        initComponents();
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        serverPortLabel = new javax.swing.JLabel();
        clientTimeoutPeriodLabel = new javax.swing.JLabel();
        serverPortTextField = new javax.swing.JTextField(ConfigManager.getServerPort());
        clientTimeoutPeriodTextField = new javax.swing.JTextField(ConfigManager.getClientTimeoutInSeconds());

        serverPortLabel.setText("Server Port");

        clientTimeoutPeriodLabel.setText("<html>Client Timeout Period (in seconds)<html>");

        serverPortTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                serverPortTextFieldUpdated();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                serverPortTextFieldUpdated();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                serverPortTextFieldUpdated();
            }
        });

        clientTimeoutPeriodTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                clientTimeoutPeriodTextFieldUpdated();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                clientTimeoutPeriodTextFieldUpdated();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                clientTimeoutPeriodTextFieldUpdated();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(clientTimeoutPeriodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(serverPortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(serverPortTextField)
                                        .addComponent(clientTimeoutPeriodTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(serverPortTextField)
                                        .addComponent(serverPortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(clientTimeoutPeriodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(clientTimeoutPeriodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(178, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void serverPortTextFieldUpdated()
    {
        parent.advancedSettingsPanelFieldsUpdated();
    }

    private void clientTimeoutPeriodTextFieldUpdated()
    {
        parent.advancedSettingsPanelFieldsUpdated();
    }

    public String getServerPortText()
    {
        return serverPortTextField.getText();
    }

    public String getClientTimeoutText()
    {
        return clientTimeoutPeriodTextField.getText();
    }

    public void setServerPortText(String text)
    {
        serverPortTextField.setText(text);
    }

    public void setClientTimeoutText(String text)
    {
        clientTimeoutPeriodTextField.setText(text);
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel clientTimeoutPeriodLabel;
    private javax.swing.JTextField clientTimeoutPeriodTextField;
    private javax.swing.JLabel serverPortLabel;
    private javax.swing.JTextField serverPortTextField;
    // End of variables declaration
}
