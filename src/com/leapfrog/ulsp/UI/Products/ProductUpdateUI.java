/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ulsp.UI.Products;

import com.leapfrog.ulsp.DAO.Impl.ProductDAOImpl;
import com.leapfrog.ulsp.DAO.ProductDAO;
import com.leapfrog.ulsp.entity.Category;
import com.leapfrog.ulsp.entity.Product;
import com.leapfrog.ulsp.entity.Supplier;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AM3ET
 */
public class ProductUpdateUI extends javax.swing.JFrame {

    private ProductDAO productDAO = new ProductDAOImpl();
    //private ProductDetailsUI productDetailsUI = new ProductDetailsUI();
    int id = 0;

    /**
     * Creates new form AddUserDetailUI
     */
    public ProductUpdateUI() {
        initComponents();
    }

    public ProductUpdateUI(int id) {
        initComponents();
        this.id = id;
        try {
            Product product = productDAO.getByID(id);
            txtProductName.setText(product.getName());
            txtDescription.setText(product.getDescription());
            txtQuantity.setText(Integer.toString(product.getQuantity()));
            txtCostPrice.setText(Integer.toString(product.getCostPrice()));
            txtSellingPrice.setText(Integer.toString(product.getSellingPrice()));
            txtCategory.setText(Integer.toString(new Category().getId()));
            txtSupplier.setText(Integer.toString(new Supplier().getId()));
            chkStatus.setSelected(product.isStatus());
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProductName = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblNewUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblCostPrice = new javax.swing.JLabel();
        txtCostPrice = new javax.swing.JTextField();
        lblSellingPrice = new javax.swing.JLabel();
        txtSellingPrice = new javax.swing.JTextField();
        lblSellingPrice1 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        lblSellingPrice2 = new javax.swing.JLabel();
        txtSupplier = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        chkStatus = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblProductName.setText("Product Name:");

        lblDescription.setText("Description:");

        lblQuantity.setText("Quantity:");

        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonClick(evt);
            }
        });

        lblNewUser.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        lblNewUser.setText("Edit Details of Product");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        lblCostPrice.setText("Cost Price:");

        lblSellingPrice.setText("Selling Price:");

        lblSellingPrice1.setText("Category Id:");

        lblSellingPrice2.setText("Supplier Id:");

        lblStatus.setText("Status:");

        chkStatus.setText("Active");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lblNewUser)
                .addGap(0, 127, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQuantity)
                            .addComponent(lblDescription)
                            .addComponent(lblProductName)
                            .addComponent(lblCostPrice)
                            .addComponent(lblSellingPrice)
                            .addComponent(lblSellingPrice1)
                            .addComponent(lblSellingPrice2)
                            .addComponent(lblStatus))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtQuantity)
                            .addComponent(txtCostPrice)
                            .addComponent(txtSellingPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategory, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSupplier)
                            .addComponent(chkStatus, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblNewUser)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescription)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantity)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCostPrice)
                    .addComponent(txtCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSellingPrice)
                    .addComponent(txtSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSellingPrice1)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSellingPrice2)
                    .addComponent(txtSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(chkStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonClick
        Product product = new Product();
        product.setName(txtProductName.getText());
        product.setDescription(txtDescription.getText());
        product.setQuantity(Integer.parseInt(txtQuantity.getText()));
        product.setCostPrice(Integer.parseInt(txtCostPrice.getText()));
        product.setSellingPrice(Integer.parseInt(txtSellingPrice.getText()));
        product.setCategory(new Category(Integer.parseInt(txtCategory.getText()), 0, null));
        product.setSupplier(new Supplier(Integer.parseInt(txtSupplier.getText()), null, null, null, null, false));
        product.setStatus(chkStatus.isSelected());
        product.setId(id);
        try {
            productDAO.update(product);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        dispose();
    }//GEN-LAST:event_updateButtonClick


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCostPrice;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblNewUser;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSellingPrice;
    private javax.swing.JLabel lblSellingPrice1;
    private javax.swing.JLabel lblSellingPrice2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCostPrice;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSellingPrice;
    private javax.swing.JTextField txtSupplier;
    // End of variables declaration//GEN-END:variables
}
