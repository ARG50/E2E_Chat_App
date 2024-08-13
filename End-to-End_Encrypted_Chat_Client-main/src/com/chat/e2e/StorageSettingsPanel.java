/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package com.chat.e2e;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

/**
 *
 * @author Soubhik
 */
public class StorageSettingsPanel extends javax.swing.JPanel {

    private SettingsWindowDialog settingsFrameReference;

    /** Creates new form StorageSettingsPanel */
    public StorageSettingsPanel(SettingsWindowDialog settingsFrame) {
        initComponents();
        settingsFrameReference = settingsFrame;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        dataFolderChooser = new javax.swing.JFileChooser();
        appDataFolderLabel = new javax.swing.JLabel();
        appDataFolderField = new javax.swing.JTextField();
        appDataFolderBrowseButton = new javax.swing.JButton();
        appStorageUsedLabel = new javax.swing.JLabel();
        appStorageAvailableLabel = new javax.swing.JLabel();
        appStorageUsedField = new javax.swing.JTextField();
        appStorageAvailableField = new javax.swing.JTextField();
        openFolderButton = new javax.swing.JButton();

        dataFolderChooser.setApproveButtonText("Select");
        dataFolderChooser.setDialogTitle("Choose new app data folder");
        dataFolderChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        appDataFolderLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        appDataFolderLabel.setText("App data folder:");
        appDataFolderLabel.setToolTipText("Folder where app files such as config, databases, logs, etc. are stored");

        appDataFolderField.setText(ConfigManager.getAppDataFolder());
        appDataFolderField.setToolTipText("Folder where app files such as config, databases, logs, etc. are stored");
        appDataFolderField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        appDataFolderField.setEditable(false);
        appDataFolderField.setFocusable(false);
//        appDataFolderField.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                appDataFolderFieldActionPerformed();
//            }
//        });
        appDataFolderField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                appDataFolderFieldActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                appDataFolderFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                appDataFolderFieldActionPerformed();
            }
        });

        appDataFolderBrowseButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(StorageSettingsPanel.class.getClassLoader().getResource("folder (1).png")))); // NOI18N
        appDataFolderBrowseButton.setToolTipText("Open folder in file browser");
        appDataFolderBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appDataFolderBrowseButtonActionPerformed(evt);
            }
        });

        appStorageUsedLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        appStorageUsedLabel.setText("Storage used");
        appStorageUsedLabel.setToolTipText("Current amount of storage occupied by the app");

        appStorageAvailableLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        appStorageAvailableLabel.setText("Storage available");
        appStorageAvailableLabel.setToolTipText("Current amount of additional storage available to the app");

        File appFolder = new File(ConfigManager.getAppDataFolder());
        double storageAvailable = appFolder.getFreeSpace();
        int storageAvailableUnit = 0;
        String[] storageUnits = new String[]{"B", "KB", "MB", "GB", "TB", "PB"};
        while(storageAvailable >= 1024 && storageAvailableUnit <= 5)
        {
            storageAvailable = storageAvailable / 1024;
            storageAvailableUnit++;
        }
        Path appFolderPath = Paths.get(ConfigManager.getAppDataFolder());
        double storageUsed;
        int storageUsedUnit = 0;
        try
        {
            storageUsed = Files.walk(appFolderPath).filter(p -> p.toFile().isFile()).mapToLong(p -> p.toFile().length()).sum();
        }
        catch(IOException accessError)
        {
            storageUsed = 0;
        }
        while(storageUsed >= 1024 && storageUsedUnit <= 5)
        {
            storageUsed = storageUsed / 1024;
            storageUsedUnit++;
        }

        appStorageUsedField.setEditable(false);
        appStorageUsedField.setFocusable(false);
        appStorageUsedField.setText(String.format("%.2f", storageUsed) + " " + storageUnits[storageUsedUnit]);
        appStorageUsedField.setToolTipText("Current amount of storage occupied by the app");
        appStorageUsedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appStorageUsedFieldActionPerformed(evt);
            }
        });

        appStorageAvailableField.setEditable(false);
        appStorageAvailableField.setFocusable(false);
        appStorageAvailableField.setText(String.format("%.2f", storageAvailable) + " " + storageUnits[storageAvailableUnit]);
        appStorageAvailableField.setToolTipText("Current amount of additional storage available to the app");
        appStorageAvailableField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appStorageAvailableFieldActionPerformed(evt);
            }
        });

        openFolderButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(StorageSettingsPanel.class.getClassLoader().getResource("files-and-folders (1).png")))); // NOI18N
        openFolderButton.setFocusPainted(false);
        openFolderButton.setToolTipText("View folder");
        openFolderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAppFolderButtonClicked();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(appDataFolderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(appStorageUsedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(appStorageAvailableLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(appStorageAvailableField, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                                        .addComponent(appStorageUsedField)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(appDataFolderField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(openFolderButton)))
                                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(appDataFolderLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(appDataFolderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(openFolderButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(appStorageUsedLabel)
                                        .addComponent(appStorageUsedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(appStorageAvailableLabel)
                                        .addComponent(appStorageAvailableField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void appDataFolderFieldActionPerformed() {
        // TODO add your handling code here:
        settingsFrameReference.enableSaveAndResetButtons();
    }

    private void appDataFolderBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dataFolderChooser.setCurrentDirectory(new File(appDataFolderField.getText()));
        int chooseResult = dataFolderChooser.showOpenDialog(null);
        if(chooseResult == JFileChooser.APPROVE_OPTION)
        {
            appDataFolderField.setText(dataFolderChooser.getSelectedFile().toString());
        }
    }

    private void appStorageUsedFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void appStorageAvailableFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void openAppFolderButtonClicked()
    {
        try {
            Desktop.getDesktop().browse(new File(appDataFolderField.getText()).toURI());
        }
        catch (Exception e)
        {
            //System.out.println(e);
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton appDataFolderBrowseButton;
    private javax.swing.JTextField appDataFolderField;
    private javax.swing.JLabel appDataFolderLabel;
    private javax.swing.JTextField appStorageAvailableField;
    private javax.swing.JLabel appStorageAvailableLabel;
    private javax.swing.JTextField appStorageUsedField;
    private javax.swing.JLabel appStorageUsedLabel;
    private javax.swing.JFileChooser dataFolderChooser;
    private javax.swing.JButton openFolderButton;
    // End of variables declaration

    public JTextField getAppDataFolderField()
    {
        return appDataFolderField;
    }

    public JTextField getAppStorageUsedField()
    {
        return appStorageUsedField;
    }

    public JTextField getAppStorageAvailableField()
    {
        return appStorageAvailableField;
    }
}
