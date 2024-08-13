/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.chat.e2e;

import javax.swing.*;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Objects;

/**
 *
 * @author Soubhik
 */
public class AboutSettingsPanel extends javax.swing.JPanel {

    private SettingsWindowDialog settingsFrameReference;

    /**
     * Creates new form AboutSettingsPanel
     */
    public AboutSettingsPanel(SettingsWindowDialog settingsFrame) {
        initComponents();
        settingsFrameReference = settingsFrame;
        refreshStatusButton.setEnabled(false);
        SwingWorker<Void, Void> networkStatusFinder = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                networkStatusField.setText(NetworkManager.isConnected()? "Connected":"Disconnected");
                if(NetworkManager.isConnected())
                {
                    //clientIpField.setText(NetworkManager.getConnectionSocket().getLocalAddress().getHostAddress());
                    try(final DatagramSocket socket = new DatagramSocket()){
                        socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
                        clientIpField.setText(socket.getLocalAddress().getHostAddress());
                    }
                    clientPortField.setText(String.valueOf(NetworkManager.getConnectionSocket().getLocalPort()));

                }
                else
                {
                    clientIpField.setText("unknown");
                    clientPortField.setText("unknown");
                }
                refreshStatusButton.setEnabled(true);
                return null;
            }
        };
        networkStatusFinder.execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        networkStatusLabel = new javax.swing.JLabel();
        networkStatusField = new javax.swing.JTextField();
        clientIpLabel = new javax.swing.JLabel();
        clientIpField = new javax.swing.JTextField();
        clientPortLabel = new javax.swing.JLabel();
        clientPortField = new javax.swing.JTextField();
        clientVersionLabel = new javax.swing.JLabel();
        clientVersionField = new javax.swing.JTextField();
        refreshStatusButton = new javax.swing.JButton();

        networkStatusLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        networkStatusLabel.setText("Network status");
        networkStatusLabel.setToolTipText("Shows connection status with server");

        networkStatusField.setEditable(false);
        // TODO: Get network status from network manager and directly use it to set field text below
        networkStatusField.setText("...");
        networkStatusField.setToolTipText("Shows connection status with server");
        networkStatusField.setFocusable(false);
        networkStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkStatusFieldActionPerformed(evt);
            }
        });

        clientIpLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clientIpLabel.setText("Client IP address");
        clientIpLabel.setToolTipText("Shows client's LOCAL IP Address");

        clientIpField.setEditable(false);
        // TODO: Get client's current IP from network manager and directly use it to set field text below
        clientIpField.setText("...");
        clientIpField.setToolTipText("Shows client's LOCAL IP Address");
        clientIpField.setFocusable(false);
        clientIpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientIpFieldActionPerformed(evt);
            }
        });

        clientPortLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clientPortLabel.setText("Client Port Address");
        clientPortLabel.setToolTipText("Shows client's Port Address");

        clientPortField.setEditable(false);
        // TODO: Get client's current port from network manager and directly use it to set field text below
        clientPortField.setText("...");
        clientPortField.setToolTipText("Shows client's Port Address");
        clientPortField.setFocusable(false);
        clientPortField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientPortFieldActionPerformed(evt);
            }
        });

        clientVersionLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clientVersionLabel.setText("Client Version");
        clientVersionLabel.setToolTipText("Shows client's app version");

        clientVersionField.setEditable(false);
        clientVersionField.setText(ConfigManager.getClientVersion());
        clientVersionField.setToolTipText("Shows client's app version");
        clientVersionField.setFocusable(false);
        clientVersionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientVersionFieldActionPerformed(evt);
            }
        });

        refreshStatusButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(AboutSettingsPanel.class.getClassLoader().getResource("refresh.png")))); // NOI18N
        refreshStatusButton.setToolTipText("Refresh status");
        refreshStatusButton.setFocusPainted(false);
        refreshStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshStatusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(clientPortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clientVersionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clientIpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(networkStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(clientVersionField)
                                                        .addComponent(clientPortField)
                                                        .addComponent(clientIpField))
                                                .addGap(37, 37, 37))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(networkStatusField, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(refreshStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(networkStatusLabel)
                                        .addComponent(networkStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(refreshStatusButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientIpLabel)
                                        .addComponent(clientIpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientPortLabel)
                                        .addComponent(clientPortField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(clientVersionLabel)
                                        .addComponent(clientVersionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void refreshStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //  Add functionality to refresh network status, and client IP and port if required
        refreshStatusButton.setEnabled(false);
        networkStatusField.setText("...");
        clientIpField.setText("...");
        clientPortField.setText("...");
        SwingWorker<Void, Void> networkStatusFinder = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                networkStatusField.setText(NetworkManager.isConnected()? "Connected":"Disconnected");
                if(NetworkManager.isConnected())
                {
                    //clientIpField.setText(NetworkManager.getConnectionSocket().getLocalAddress().getHostAddress());
                    try(final DatagramSocket socket = new DatagramSocket()){
                        socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
                        clientIpField.setText(socket.getLocalAddress().getHostAddress());
                    }
                    clientPortField.setText(String.valueOf(NetworkManager.getConnectionSocket().getLocalPort()));

                }
                else
                {
                    clientIpField.setText("unknown");
                    clientPortField.setText("unknown");
                }
                refreshStatusButton.setEnabled(true);
                return null;
            }
        };
        networkStatusFinder.execute();
    }

    private void networkStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void clientIpFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void clientPortFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void clientVersionFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JTextField clientIpField;
    private javax.swing.JLabel clientIpLabel;
    private javax.swing.JTextField clientPortField;
    private javax.swing.JLabel clientPortLabel;
    private javax.swing.JTextField clientVersionField;
    private javax.swing.JLabel clientVersionLabel;
    private javax.swing.JTextField networkStatusField;
    private javax.swing.JLabel networkStatusLabel;
    private javax.swing.JButton refreshStatusButton;
    // End of variables declaration

    public JTextField getNetworkStatusField()
    {
        return networkStatusField;
    }

    public JTextField getClientIpField()
    {
        return clientIpField;
    }

    public JTextField getClientPortField()
    {
        return clientPortField;
    }

    public JTextField getClientVersionField()
    {
        return clientVersionField;
    }
}
