/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormUpPuyuh;

import Controller.KandangController;

import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Aulia
 */
public class FormInputKandang extends javax.swing.JFrame {

    /**
     * Creates new form FormInputKandang
     */
    
    KandangController controller;
    public FormInputKandang() {
        initComponents();
        controller = new KandangController(this);
    }
    
    public JTextField getTxtIdKandang() {
        return TxtIdKandang;
    }
    
    public JTextField getTxtLabelKandang() {
        return TxtLabelKandang;
    }
    
    public JTextField getTxtBlokKandang() {
        return TxtBlokKandang;
    }
    
    public JTable getTblDataKandang() {
        return TblDataKandang;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubMenu = new javax.swing.JPanel();
        jDashboard = new javax.swing.JLabel();
        Tab1 = new javax.swing.JPanel();
        jUser = new javax.swing.JLabel();
        Tab2 = new javax.swing.JPanel();
        jJadwal = new javax.swing.JLabel();
        Tab3 = new javax.swing.JPanel();
        jReport = new javax.swing.JLabel();
        Tab4 = new javax.swing.JPanel();
        jLogout = new javax.swing.JLabel();
        MainMenu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        MenuInputData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JspDataKandang = new javax.swing.JScrollPane();
        TblDataKandang = new javax.swing.JTable();
        BtnSimpan = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        TxtIdKandang = new javax.swing.JTextField();
        TxtLabelKandang = new javax.swing.JTextField();
        TxtBlokKandang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnClear = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jDashboard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDashboard.setText("Dashboard");

        Tab1.setBackground(new java.awt.Color(204, 204, 204));

        jUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jUser.setText("User");

        javax.swing.GroupLayout Tab1Layout = new javax.swing.GroupLayout(Tab1);
        Tab1.setLayout(Tab1Layout);
        Tab1Layout.setHorizontalGroup(
            Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab1Layout.setVerticalGroup(
            Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jUser)
                .addContainerGap())
        );

        Tab2.setBackground(new java.awt.Color(204, 204, 204));

        jJadwal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jJadwal.setText("Jadwal");

        javax.swing.GroupLayout Tab2Layout = new javax.swing.GroupLayout(Tab2);
        Tab2.setLayout(Tab2Layout);
        Tab2Layout.setHorizontalGroup(
            Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jJadwal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab2Layout.setVerticalGroup(
            Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jJadwal)
                .addContainerGap())
        );

        Tab3.setBackground(new java.awt.Color(204, 204, 204));

        jReport.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jReport.setText("Laporan");

        javax.swing.GroupLayout Tab3Layout = new javax.swing.GroupLayout(Tab3);
        Tab3.setLayout(Tab3Layout);
        Tab3Layout.setHorizontalGroup(
            Tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab3Layout.setVerticalGroup(
            Tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jReport)
                .addContainerGap())
        );

        Tab4.setBackground(new java.awt.Color(204, 204, 204));

        jLogout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLogout.setText("LogOut");

        javax.swing.GroupLayout Tab4Layout = new javax.swing.GroupLayout(Tab4);
        Tab4.setLayout(Tab4Layout);
        Tab4Layout.setHorizontalGroup(
            Tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab4Layout.setVerticalGroup(
            Tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLogout)
                .addContainerGap())
        );

        javax.swing.GroupLayout SubMenuLayout = new javax.swing.GroupLayout(SubMenu);
        SubMenu.setLayout(SubMenuLayout);
        SubMenuLayout.setHorizontalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jDashboard)
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(Tab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SubMenuLayout.setVerticalGroup(
            SubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenuLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(Tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(Tab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        getContentPane().add(SubMenu);
        SubMenu.setBounds(0, 0, 160, 720);

        MainMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("2021 Perternakan Burung Puyuh");

        MenuInputData.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID Kandang");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Label Kandang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Blok Kandang");

        TblDataKandang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TblDataKandang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Kandang", "Nama", "Blok Kandang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblDataKandang.setRowHeight(32);
        TblDataKandang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblDataKandangMouseClicked(evt);
            }
        });
        JspDataKandang.setViewportView(TblDataKandang);

        BtnSimpan.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnDelete.setText("Hapus");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        TxtIdKandang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtIdKandang.setText("jTextField1");

        TxtLabelKandang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtLabelKandang.setText("jTextField1");

        TxtBlokKandang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtBlokKandang.setText("jTextField1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Input Data Kandang");

        BtnClear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuInputDataLayout = new javax.swing.GroupLayout(MenuInputData);
        MenuInputData.setLayout(MenuInputDataLayout);
        MenuInputDataLayout.setHorizontalGroup(
            MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputDataLayout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MenuInputDataLayout.createSequentialGroup()
                .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInputDataLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtLabelKandang))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuInputDataLayout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtIdKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MenuInputDataLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtBlokKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(JspDataKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuInputDataLayout.setVerticalGroup(
            MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuInputDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtIdKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtLabelKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtBlokKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(MenuInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MenuInputDataLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(JspDataKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        BtnKembali.setText("Kembali");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainMenuLayout.createSequentialGroup()
                                .addGap(408, 408, 408)
                                .addComponent(jLabel6))
                            .addGroup(MainMenuLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(BtnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MenuInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BtnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(MenuInputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(MainMenu);
        MainMenu.setBounds(160, 0, 1120, 720);

        setSize(new java.awt.Dimension(1298, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        // TODO add your handling code here:
        FormDataKandang formDataKandang = new FormDataKandang();
        formDataKandang.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.clearForm();
        controller.viewTableInput();
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.clearForm();
        controller.viewTableInput();
        BtnSimpan.setEnabled(true);
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
        controller.clearForm();
        controller.viewTableInput();
        BtnSimpan.setEnabled(true);
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void TblDataKandangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDataKandangMouseClicked
        // TODO add your handling code here:
        controller.onClickTabel();
        BtnSimpan.setEnabled(false);
    }//GEN-LAST:event_TblDataKandangMouseClicked

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        // TODO add your handling code here:
        controller.clearForm();
        BtnSimpan.setEnabled(true);
    }//GEN-LAST:event_BtnClearActionPerformed

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
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormInputKandang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInputKandang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInputKandang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInputKandang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInputKandang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JScrollPane JspDataKandang;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JPanel MenuInputData;
    private javax.swing.JPanel SubMenu;
    private javax.swing.JPanel Tab1;
    private javax.swing.JPanel Tab2;
    private javax.swing.JPanel Tab3;
    private javax.swing.JPanel Tab4;
    private javax.swing.JTable TblDataKandang;
    private javax.swing.JTextField TxtBlokKandang;
    private javax.swing.JTextField TxtIdKandang;
    private javax.swing.JTextField TxtLabelKandang;
    private javax.swing.JLabel jDashboard;
    private javax.swing.JLabel jJadwal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLogout;
    private javax.swing.JLabel jReport;
    private javax.swing.JLabel jUser;
    // End of variables declaration//GEN-END:variables
}