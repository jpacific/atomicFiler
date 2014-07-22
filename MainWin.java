// Name: AtomicFiler
// Desc: Creates a text file with student's name, email, and class period.
// Date: 09/04/13
// Author: John Pacific

package atomicfiler;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MainWin extends javax.swing.JFrame {
    File period, OutDir;
    
    public MainWin() {
        setTitle("AtomicFiler");
        setLocationRelativeTo(null);
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        periodDir = new javax.swing.JTextField();
        lblPeriod = new javax.swing.JLabel();
        btnSelectPeriod = new javax.swing.JButton();
        txtOutDir = new javax.swing.JTextField();
        lblOutDir = new javax.swing.JLabel();
        btnSelectOutDir = new javax.swing.JButton();
        btnFile = new javax.swing.JButton();
        AtomicMenuBar = new javax.swing.JMenuBar();
        AtomicFile = new javax.swing.JMenu();
        AtomicExit = new javax.swing.JMenuItem();
        AtomicAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPeriod.setText("Period");

        btnSelectPeriod.setText("Select Period");
        btnSelectPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectPeriodActionPerformed(evt);
            }
        });

        lblOutDir.setText("Output Directory");

        btnSelectOutDir.setText("Select Output Directory");
        btnSelectOutDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectOutDirActionPerformed(evt);
            }
        });

        btnFile.setText("Gather Info!");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        AtomicFile.setText("File");

        AtomicExit.setText("Exit");
        AtomicExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtomicExitActionPerformed(evt);
            }
        });
        AtomicFile.add(AtomicExit);

        AtomicMenuBar.add(AtomicFile);

        AtomicAbout.setText("About");
        AtomicAbout.setName("About AtomicFiler"); // NOI18N
        AtomicAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtomicAboutMouseClicked(evt);
            }
        });
        AtomicAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtomicAboutActionPerformed(evt);
            }
        });
        AtomicMenuBar.add(AtomicAbout);

        setJMenuBar(AtomicMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOutDir)
                            .addComponent(lblPeriod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOutDir, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(periodDir)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSelectPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelectOutDir, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutDir)
                    .addComponent(txtOutDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectPeriod)
                    .addComponent(btnSelectOutDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFile)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectPeriodActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        
        period = fc.getSelectedFile();
        periodDir.setText(period.getAbsolutePath());
                
    }//GEN-LAST:event_btnSelectPeriodActionPerformed

    private void AtomicAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtomicAboutMouseClicked
        JOptionPane.showMessageDialog(null, "Version: 1.0.0.0\nCopyright © 2013 John Pacific", "About", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_AtomicAboutMouseClicked

    private void btnSelectOutDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectOutDirActionPerformed
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(fc);
        
        OutDir = fc.getSelectedFile();
        txtOutDir.setText(OutDir.getAbsolutePath());
    }//GEN-LAST:event_btnSelectOutDirActionPerformed

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        if(period == null || OutDir == null) {
            JOptionPane.showMessageDialog(null, "Please select a Period Directory and an Output Directory.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        GatherInfo();
    }//GEN-LAST:event_btnFileActionPerformed
    
    // Gather text info.
    private void GatherInfo() {
        ArrayList<File> FileList = new ArrayList<File>(Arrays.asList(period.listFiles()));
        
        File emailFile = null;
        String periodNum = period.getName();    // Get the period number.
        String studentName = "";
        String studentEmail = "";
        PrintWriter atomFile = null;
        
        for(File derp : FileList) {
            // Get the Student Name.
            studentName = derp.getName();
            
            // Get all the files containing the email.
            ArrayList<File> chldList = new ArrayList<File>(Arrays.asList(derp.listFiles()));
            for(File leedle : chldList) {
                if(leedle.getName().contains(".txt"))
                    emailFile = leedle; // Set emailFile to the file containing the email.
            }
            
            try {
                atomFile = new PrintWriter(new BufferedWriter(new FileWriter(OutDir.getAbsolutePath() + "/EmailList.txt", true)));
                
                Scanner fileScanner = new Scanner(emailFile);
                studentEmail = fileScanner.nextLine();
                
                // Write the line.   
                atomFile.println(studentName + "," + studentEmail + "," + periodNum);
                atomFile.close();
            }
            catch(IOException e) {
                JOptionPane.showMessageDialog(null, e, "ERROR!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void AtomicExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtomicExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_AtomicExitActionPerformed

    private void AtomicAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtomicAboutActionPerformed
        
    }//GEN-LAST:event_AtomicAboutActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AtomicAbout;
    private javax.swing.JMenuItem AtomicExit;
    private javax.swing.JMenu AtomicFile;
    private javax.swing.JMenuBar AtomicMenuBar;
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnSelectOutDir;
    private javax.swing.JButton btnSelectPeriod;
    private javax.swing.JLabel lblOutDir;
    private javax.swing.JLabel lblPeriod;
    private javax.swing.JTextField periodDir;
    private javax.swing.JTextField txtOutDir;
    // End of variables declaration//GEN-END:variables
}
