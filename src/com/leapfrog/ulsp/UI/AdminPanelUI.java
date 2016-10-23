/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ulsp.UI;

import com.leapfrog.ulsp.UI.Category.CategoryDetailsUI;
import com.leapfrog.ulsp.UI.Products.ProductDetailsUI;
import com.leapfrog.ulsp.UI.Supplier.SupplierDetailsUI;
import com.leapfrog.ulsp.UI.Users.UserDetailsUI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AM3ET
 */
public class AdminPanelUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanelUI
     */
    public AdminPanelUI() {
        initComponents();
    }
    public AdminPanelUI(String name){
        initComponents();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        txtDate.setText(dateFormat.format(date).toString());
        lblUserName.setText(name.toUpperCase());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblUserName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSystem = new javax.swing.JMenu();
        subMenuUsers = new javax.swing.JMenuItem();
        subMenuUsers1 = new javax.swing.JMenuItem();
        menuEntry = new javax.swing.JMenu();
        subMenuCategories = new javax.swing.JMenuItem();
        subMenuProducts = new javax.swing.JMenuItem();
        subMenuSuppliers = new javax.swing.JMenuItem();
        subMenuCustomers = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenu();
        subMenuExit = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lblUserName.setFont(new java.awt.Font("Lucida Grande", 2, 30)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 102, 153));
        lblUserName.setText("Admin");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Welcome!");

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/administratorcool.png"))); // NOI18N

        txtDate.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Date:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setToolTipText("");

        menuSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/system.png"))); // NOI18N
        menuSystem.setText("System");
        menuSystem.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        subMenuUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/users_new.png"))); // NOI18N
        subMenuUsers.setText("Users");
        subMenuUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuUsersActionPerformed(evt);
            }
        });
        menuSystem.add(subMenuUsers);

        subMenuUsers1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/settings_new.png"))); // NOI18N
        subMenuUsers1.setText("Settings");
        subMenuUsers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuUsers1ActionPerformed(evt);
            }
        });
        menuSystem.add(subMenuUsers1);

        jMenuBar1.add(menuSystem);

        menuEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/entry2.png"))); // NOI18N
        menuEntry.setText("Entry");
        menuEntry.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        subMenuCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/categories_new.png"))); // NOI18N
        subMenuCategories.setText("Categories");
        subMenuCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCategoriesActionPerformed(evt);
            }
        });
        menuEntry.add(subMenuCategories);

        subMenuProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/products_new.png"))); // NOI18N
        subMenuProducts.setText("Products");
        subMenuProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProductsActionPerformed(evt);
            }
        });
        menuEntry.add(subMenuProducts);

        subMenuSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/suppliers_new.png"))); // NOI18N
        subMenuSuppliers.setText("Suppliers");
        subMenuSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSuppliersActionPerformed(evt);
            }
        });
        menuEntry.add(subMenuSuppliers);

        subMenuCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/customer_new.png"))); // NOI18N
        subMenuCustomers.setText("Customers");
        subMenuCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCustomersActionPerformed(evt);
            }
        });
        menuEntry.add(subMenuCustomers);

        jMenuBar1.add(menuEntry);

        menuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/logout3.png"))); // NOI18N
        menuLogout.setText("Logout");
        menuLogout.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        subMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/SignOut.png"))); // NOI18N
        subMenuExit.setText("Exit");
        subMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonClick(evt);
            }
        });
        menuLogout.add(subMenuExit);

        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUserName))
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCategoriesActionPerformed
        new CategoryDetailsUI().setVisible(true);
    }//GEN-LAST:event_subMenuCategoriesActionPerformed

    private void subMenuProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProductsActionPerformed
        new ProductDetailsUI().setVisible(true);
    }//GEN-LAST:event_subMenuProductsActionPerformed

    private void subMenuSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSuppliersActionPerformed
        new SupplierDetailsUI().setVisible(true);
    }//GEN-LAST:event_subMenuSuppliersActionPerformed

    private void subMenuCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuCustomersActionPerformed

    private void subMenuUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuUsersActionPerformed
        new UserDetailsUI().setVisible(true);
    }//GEN-LAST:event_subMenuUsersActionPerformed

    private void subMenuUsers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuUsers1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuUsers1ActionPerformed

    private void exitButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonClick
        new LogoutUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_exitButtonClick


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JMenu menuEntry;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenu menuSystem;
    private javax.swing.JMenuItem subMenuCategories;
    private javax.swing.JMenuItem subMenuCustomers;
    private javax.swing.JMenuItem subMenuExit;
    private javax.swing.JMenuItem subMenuProducts;
    private javax.swing.JMenuItem subMenuSuppliers;
    private javax.swing.JMenuItem subMenuUsers;
    private javax.swing.JMenuItem subMenuUsers1;
    private javax.swing.JLabel txtDate;
    // End of variables declaration//GEN-END:variables
}