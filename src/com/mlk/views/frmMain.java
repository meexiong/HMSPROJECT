
package com.mlk.views;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import javax.swing.UIManager;

public class frmMain extends javax.swing.JFrame {
    String img_background;
    public frmMain() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setVisible(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/mlk/images/Logo.png"))); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jocGroupPane1 = new com.xzq.osc.JocGroupPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaskPane1 = new com.l2fprod.common.swing.JTaskPane();
        jTaskPaneGroup1 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink1 = new com.xzq.osc.JocHyperlink();
        btnSMPatientList = new com.xzq.osc.JocHyperlink();
        jocHyperlink4 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup5 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink15 = new com.xzq.osc.JocHyperlink();
        jocHyperlink16 = new com.xzq.osc.JocHyperlink();
        jocHyperlink17 = new com.xzq.osc.JocHyperlink();
        jocHyperlink18 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup3 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink8 = new com.xzq.osc.JocHyperlink();
        jocHyperlink9 = new com.xzq.osc.JocHyperlink();
        jocHyperlink10 = new com.xzq.osc.JocHyperlink();
        jocHyperlink23 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup4 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink11 = new com.xzq.osc.JocHyperlink();
        jocHyperlink12 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup2 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink5 = new com.xzq.osc.JocHyperlink();
        jocHyperlink6 = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup6 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jocHyperlink21 = new com.xzq.osc.JocHyperlink();
        jocHyperlink24 = new com.xzq.osc.JocHyperlink();
        jocHyperlink22 = new com.xzq.osc.JocHyperlink();
        jocHyperlink25 = new com.xzq.osc.JocHyperlink();
        jocHyperlink20 = new com.xzq.osc.JocHyperlink();
        jocHyperlink19 = new com.xzq.osc.JocHyperlink();
        jPanel2 = new javax.swing.JPanel();
        img_background = "";
        ImageIcon icon = new ImageIcon(getClass().getResource(img_background));
        final Image img = icon.getImage();
        DeskTopControl = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HMS");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jocGroupPane1.setExpansionDirection(com.xzq.osc.JocGroupPane.ExpansionDirection.LEFT_TO_RIGHT);
        jocGroupPane1.setText("");
        jocGroupPane1.setLayout(new java.awt.BorderLayout());

        jTaskPaneGroup1.setTitle("ການລົງທະບຽນ");
        jTaskPaneGroup1.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        jocHyperlink1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/patient_history.png"))); // NOI18N
        jocHyperlink1.setText("ລົງທະບຽນຜູ້ເຈັບ");
        jocHyperlink1.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jocHyperlink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jocHyperlink1ActionPerformed(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(jocHyperlink1);

        btnSMPatientList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/patient.png"))); // NOI18N
        btnSMPatientList.setText("ເພີ່ມຜູ້ເຈັບ");
        btnSMPatientList.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSMPatientList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSMPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMPatientListActionPerformed(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(btnSMPatientList);

        jocHyperlink4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/report-icon-blue_247217.png"))); // NOI18N
        jocHyperlink4.setText("ລາຍງານການລົງທະບຽນ");
        jocHyperlink4.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup1.getContentPane().add(jocHyperlink4);

        jTaskPane1.add(jTaskPaneGroup1);

        jTaskPaneGroup5.setTitle("ຂະແໜງ");
        jTaskPaneGroup5.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        jocHyperlink15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/department-filled.png"))); // NOI18N
        jocHyperlink15.setText("ພາຍໃນ");
        jocHyperlink15.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink15);

        jocHyperlink16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/department-filled.png"))); // NOI18N
        jocHyperlink16.setText("ພະນອກ");
        jocHyperlink16.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink16);

        jocHyperlink17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Emc.png"))); // NOI18N
        jocHyperlink17.setText("ສຸກເສີນ");
        jocHyperlink17.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink17);

        jocHyperlink18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/EastTNChildrensHospitalLogo.png"))); // NOI18N
        jocHyperlink18.setText("ເດັກນ້ອຍ");
        jocHyperlink18.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(jocHyperlink18);

        jTaskPane1.add(jTaskPaneGroup5);

        jTaskPaneGroup3.setExpanded(false);
        jTaskPaneGroup3.setTitle("ຫ້ອງ Lab & ຜ່າຕັດ");
        jTaskPaneGroup3.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        jocHyperlink8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Medical-19-512.png"))); // NOI18N
        jocHyperlink8.setText("ຫ້ອງ X-Ray");
        jocHyperlink8.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink8);

        jocHyperlink9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/icon_imaging_tests.png"))); // NOI18N
        jocHyperlink9.setText("ຫ້ອງເອໂກ");
        jocHyperlink9.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink9);

        jocHyperlink10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Icon2-1.png"))); // NOI18N
        jocHyperlink10.setText("ຫ້ອງວິເຄາະ");
        jocHyperlink10.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink10);

        jocHyperlink23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/mfch - surgery.png"))); // NOI18N
        jocHyperlink23.setText("ຫ້ອງຜ່າຕັດ");
        jocHyperlink23.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup3.getContentPane().add(jocHyperlink23);

        jTaskPane1.add(jTaskPaneGroup3);

        jTaskPaneGroup4.setExpanded(false);
        jTaskPaneGroup4.setTitle("ການຢາ & ການເງິນ");
        jTaskPaneGroup4.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        jocHyperlink11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Pills-blue-icon.png"))); // NOI18N
        jocHyperlink11.setText("ລາຍການໃບສັ່ງຢາ");
        jocHyperlink11.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink11);

        jocHyperlink12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/23_xbolt-save-time-money-icon.png"))); // NOI18N
        jocHyperlink12.setText("ຈ່າຍຄ່າຢາ");
        jocHyperlink12.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(jocHyperlink12);

        jTaskPane1.add(jTaskPaneGroup4);

        jTaskPaneGroup2.setExpanded(false);
        jTaskPaneGroup2.setTitle("ຂໍ້ມູນທ່ານໝໍ");
        jTaskPaneGroup2.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        jocHyperlink5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/doctor.png"))); // NOI18N
        jocHyperlink5.setText("ເພີ່ມທ່ານໝໍ");
        jocHyperlink5.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink5);

        jocHyperlink6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/p-1000x750.png"))); // NOI18N
        jocHyperlink6.setText("ຕຳແໜ່ງ");
        jocHyperlink6.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup2.getContentPane().add(jocHyperlink6);

        jTaskPane1.add(jTaskPaneGroup2);

        jTaskPaneGroup6.setExpanded(false);
        jTaskPaneGroup6.setTitle("ຕັ້ງຄ່າລະບົບ");
        jTaskPaneGroup6.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        jocHyperlink21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Hospital-blue-icon.png"))); // NOI18N
        jocHyperlink21.setText("ຂໍມູນໂຮງໝໍ");
        jocHyperlink21.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup6.getContentPane().add(jocHyperlink21);

        jocHyperlink24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/425_-_Door-512.png"))); // NOI18N
        jocHyperlink24.setText("ຫ້ອງນອນ");
        jocHyperlink24.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup6.getContentPane().add(jocHyperlink24);

        jocHyperlink22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/Icon_inpatient.png"))); // NOI18N
        jocHyperlink22.setText("ຂໍ້ມຕຽງນອນ");
        jocHyperlink22.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup6.getContentPane().add(jocHyperlink22);

        jocHyperlink25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/flag_icon2.png"))); // NOI18N
        jocHyperlink25.setText("ສັນຊາດ");
        jocHyperlink25.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup6.getContentPane().add(jocHyperlink25);

        jocHyperlink20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/regional-integration.png"))); // NOI18N
        jocHyperlink20.setText("ແຂວງ");
        jocHyperlink20.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup6.getContentPane().add(jocHyperlink20);

        jocHyperlink19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mlk/icons/District.png"))); // NOI18N
        jocHyperlink19.setText("ເມືອງ");
        jocHyperlink19.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jocHyperlink19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup6.getContentPane().add(jocHyperlink19);

        jTaskPane1.add(jTaskPaneGroup6);

        jScrollPane1.setViewportView(jTaskPane1);

        jocGroupPane1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jocGroupPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3));
        jPanel2.setLayout(new java.awt.BorderLayout());

        DeskTopControl.setBackground(java.awt.SystemColor.control);

        javax.swing.GroupLayout DeskTopControlLayout = new javax.swing.GroupLayout(DeskTopControl);
        DeskTopControl.setLayout(DeskTopControlLayout);
        DeskTopControlLayout.setHorizontalGroup(
            DeskTopControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        DeskTopControlLayout.setVerticalGroup(
            DeskTopControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );

        jPanel2.add(DeskTopControl, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu1.setText("ລະບົບຈັດການໂຮງໝໍ");
        jMenu1.setEnabled(false);
        jMenu1.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSMPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMPatientListActionPerformed
        frmPatientList patientObject = new frmPatientList();
        DeskTopControl.add(patientObject);
        patientObject.setVisible(true);
        try {
          patientObject.setMaximum(true);
        } catch (PropertyVetoException e) {
            JOptionPane.showConfirmDialog(null,"Can not be maximized!");
        }
    }//GEN-LAST:event_btnSMPatientListActionPerformed

    private void jocHyperlink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jocHyperlink1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jocHyperlink1ActionPerformed

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
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
                //SwingUtilities.updateComponentTreeUI(this);
                    break;
                }
                
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskTopControl;
    private com.xzq.osc.JocHyperlink btnSMPatientList;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.l2fprod.common.swing.JTaskPane jTaskPane1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup2;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup3;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup4;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup5;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup6;
    private com.xzq.osc.JocGroupPane jocGroupPane1;
    private com.xzq.osc.JocHyperlink jocHyperlink1;
    private com.xzq.osc.JocHyperlink jocHyperlink10;
    private com.xzq.osc.JocHyperlink jocHyperlink11;
    private com.xzq.osc.JocHyperlink jocHyperlink12;
    private com.xzq.osc.JocHyperlink jocHyperlink15;
    private com.xzq.osc.JocHyperlink jocHyperlink16;
    private com.xzq.osc.JocHyperlink jocHyperlink17;
    private com.xzq.osc.JocHyperlink jocHyperlink18;
    private com.xzq.osc.JocHyperlink jocHyperlink19;
    private com.xzq.osc.JocHyperlink jocHyperlink20;
    private com.xzq.osc.JocHyperlink jocHyperlink21;
    private com.xzq.osc.JocHyperlink jocHyperlink22;
    private com.xzq.osc.JocHyperlink jocHyperlink23;
    private com.xzq.osc.JocHyperlink jocHyperlink24;
    private com.xzq.osc.JocHyperlink jocHyperlink25;
    private com.xzq.osc.JocHyperlink jocHyperlink4;
    private com.xzq.osc.JocHyperlink jocHyperlink5;
    private com.xzq.osc.JocHyperlink jocHyperlink6;
    private com.xzq.osc.JocHyperlink jocHyperlink8;
    private com.xzq.osc.JocHyperlink jocHyperlink9;
    // End of variables declaration//GEN-END:variables
}
