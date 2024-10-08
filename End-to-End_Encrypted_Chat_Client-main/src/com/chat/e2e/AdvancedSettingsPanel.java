/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.chat.e2e;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.DefaultFormatter;

/**
 *
 * @author Soubhik
 */
public class AdvancedSettingsPanel extends javax.swing.JPanel {

    SettingsWindowDialog settingsFrameReference;

    /**
     * Creates new form AdvancedSettingsPanel
     */
    public AdvancedSettingsPanel(SettingsWindowDialog settingsFrame) {
        initComponents();
        settingsFrameReference = settingsFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        serverIpLabel = new javax.swing.JLabel();
        serverIpField = new javax.swing.JTextField();
        serverPortField = new javax.swing.JTextField();
        serverPortLabel = new javax.swing.JLabel();
        clientPortLabel = new javax.swing.JLabel();
        clientPortDynamicButton = new javax.swing.JRadioButton();
        clientPortCustomButton = new javax.swing.JRadioButton();
        clientPortCustomField = new javax.swing.JTextField();
        probeTimeLabel = new javax.swing.JLabel();
        probeTimeSpinnerField = new javax.swing.JSpinner();
        clientPortTypeGroupButton = new ButtonGroup();

        serverIpLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        serverIpLabel.setText("Server IP Address");
        serverIpLabel.setToolTipText("IP address of the server to connect to");

        serverIpField.setText(ConfigManager.getServerIpAddress());
        serverIpField.setToolTipText("IP address of the server to connect to");
        serverIpField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                serverIpFieldActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                serverIpFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                serverIpFieldActionPerformed();
            }
        });

        serverPortField.setText(ConfigManager.getServerPortAddress());
        serverPortField.setToolTipText("Port address of the server to connect to");
        serverPortField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                serverPortFieldActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                serverPortFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                serverPortFieldActionPerformed();
            }
        });

        serverPortLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        serverPortLabel.setText("Server Port Address");
        serverPortLabel.setToolTipText("Port address of the server to connect to");

        clientPortLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clientPortLabel.setText("Client Port Address");
        clientPortLabel.setToolTipText("Port address on which client opens its socket");

        clientPortDynamicButton.setText("Dynamic");
        clientPortDynamicButton.setToolTipText("Takes any port available");

        clientPortCustomButton.setText("Custom");
        clientPortCustomButton.setToolTipText("Takes the specific port given");

        if(ConfigManager.getClientPortAddressType().equals("Dynamic")) {
            clientPortDynamicButton.setSelected(true);
            clientPortCustomField.setEnabled(false);
            clientPortCustomField.setFocusable(false);
        }
        else if(ConfigManager.getClientPortAddressType().equals("Custom")) {
            clientPortCustomButton.setSelected(true);
            clientPortCustomField.setEnabled(true);
            clientPortCustomField.setFocusable(true);
        }

        clientPortDynamicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientPortDynamicButtonActionPerformed(evt);
            }
        });
        clientPortCustomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientPortCustomButtonActionPerformed(evt);
            }
        });

        clientPortTypeGroupButton.add(clientPortDynamicButton);
        clientPortTypeGroupButton.add(clientPortCustomButton);

        clientPortCustomField.setText(ConfigManager.getClientPortAddress());
        clientPortCustomField.setToolTipText("Custom port address to open socket on");
//        clientPortCustomField.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                clientPortCustomFieldActionPerformed();
//            }
//        });
        clientPortCustomField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                clientPortCustomFieldActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                clientPortCustomFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                clientPortCustomFieldActionPerformed();
            }
        });

        probeTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        probeTimeLabel.setText("Connection probe time period (in seconds)");
        probeTimeLabel.setToolTipText("How often to check if connection to server is still alive");

        probeTimeSpinnerField.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(ConfigManager.getConnectionProbeTimePeriod()), 5, 60, 1));
        probeTimeSpinnerField.setToolTipText("Probe in between time in seconds\nMinimum - 5\nMaximum - 60\nRecommended - 10");
        probeTimeSpinnerField.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                probeTimeSpinnerFieldStateChanged(evt);
            }
        });
        ((DefaultFormatter)(((JFormattedTextField)(probeTimeSpinnerField.getEditor().getComponent(0))).getFormatter())).setCommitsOnValidEdit(true);


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(probeTimeLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(probeTimeSpinnerField))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(clientPortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(serverPortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(serverIpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(serverIpField)
                                                        .addComponent(serverPortField)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(clientPortCustomButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(clientPortDynamicButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(clientPortCustomField, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))))
                                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(serverIpLabel)
                                        .addComponent(serverIpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(serverPortLabel)
                                        .addComponent(serverPortField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientPortLabel)
                                        .addComponent(clientPortDynamicButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientPortCustomButton)
                                        .addComponent(clientPortCustomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(probeTimeLabel)
                                        .addComponent(probeTimeSpinnerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void serverIpFieldActionPerformed() {
        // TODO add your handling code here:
        settingsFrameReference.enableSaveAndResetButtons();
    }

    private void serverPortFieldActionPerformed() {
        // TODO add your handling code here:
        settingsFrameReference.enableSaveAndResetButtons();
    }

    private void clientPortDynamicButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        clientPortCustomField.setEnabled(false);
        clientPortCustomField.setFocusable(false);
        settingsFrameReference.enableSaveAndResetButtons();
    }

    private void clientPortCustomButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        clientPortCustomField.setEnabled(true);
        clientPortCustomField.setFocusable(true);
        settingsFrameReference.enableSaveAndResetButtons();
    }

    private void clientPortCustomFieldActionPerformed() {
        // TODO add your handling code here:
        settingsFrameReference.enableSaveAndResetButtons();
    }

    private void probeTimeSpinnerFieldStateChanged(javax.swing.event.ChangeEvent evt) {
        // TODO add your handling code here:
        settingsFrameReference.enableSaveAndResetButtons();
    }


    // Variables declaration - do not modify
    private javax.swing.JRadioButton clientPortCustomButton;
    private javax.swing.JTextField clientPortCustomField;
    private javax.swing.JRadioButton clientPortDynamicButton;
    private javax.swing.ButtonGroup clientPortTypeGroupButton;
    private javax.swing.JLabel clientPortLabel;
    private javax.swing.JSpinner probeTimeSpinnerField;
    private javax.swing.JLabel probeTimeLabel;
    private javax.swing.JTextField serverIpField;
    private javax.swing.JLabel serverIpLabel;
    private javax.swing.JTextField serverPortField;
    private javax.swing.JLabel serverPortLabel;
    // End of variables declaration

    public JTextField getServerIpField()
    {
        return serverIpField;
    }

    public JTextField getServerPortField()
    {
        return serverPortField;
    }

    public JRadioButton getClientPortDynamicButton()
    {
        return clientPortDynamicButton;
    }

    public JRadioButton getClientPortCustomButton()
    {
        return clientPortCustomButton;
    }

    public JTextField getClientPortCustomField()
    {
        return clientPortCustomField;
    }

    public JSpinner getProbeTimeSpinnerField()
    {
        return probeTimeSpinnerField;
    }
}
