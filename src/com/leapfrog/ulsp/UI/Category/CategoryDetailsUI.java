/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ulsp.UI.Category;

import com.leapfrog.ulsp.DAO.CategoryDAO;
import com.leapfrog.ulsp.DAO.Impl.CategoryDAOImpl;
import com.leapfrog.ulsp.UI.Supplier.*;
import com.leapfrog.ulsp.entity.Category;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AM3ET
 */
public class CategoryDetailsUI extends javax.swing.JFrame {

    private CategoryDAO categoryDAO = new CategoryDAOImpl();

    /**
     * Creates new form UserDetailsUI
     */
    public CategoryDetailsUI() {
        initComponents();
        String[] columns = {"ID", "Name","Parent Id"};
        try {
            tblUser.setModel(new userDetailsModule(columns, categoryDAO.getAll()));
        } catch (SQLException | ClassNotFoundException sc) {
            JOptionPane.showMessageDialog(null, sc.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblName.setText("Name:");

        txtName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        btnEdit.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 153, 0));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/edit.png"))); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonClick(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(102, 153, 0));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/Add.png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonClick(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 204, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/delete.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonClick(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 204, 102));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/leapfrog/ulsp/resources/refresh.png"))); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonClick
        new CategoryDetailAddUI().setVisible(true);
    }//GEN-LAST:event_addButtonClick

    private void editButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonClick
        int index = tblUser.getSelectedRow();
        Integer id = (Integer) tblUser.getModel().getValueAt(index, 0);
        new CategoryUpdateUI(id).setVisible(true);
        
    }//GEN-LAST:event_editButtonClick

    private void searchButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonClick
        String name = txtName.getText();
        new CategorySearchUI(name).setVisible(true);
    }//GEN-LAST:event_searchButtonClick

    private void deleteButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonClick
        int Index = tblUser.getSelectedRow();
        Integer Id = (Integer) tblUser.getModel().getValueAt(Index, 0);
        try {
            categoryDAO.delete(Id);
        } catch (SQLException | ClassNotFoundException sc) {
            JOptionPane.showMessageDialog(null, sc.getMessage());
        }
        String[] columns = {"ID", "Name","Parent Id"};
        try {
            tblUser.setModel(new userDetailsModule(columns, categoryDAO.getAll()));
        } catch (SQLException | ClassNotFoundException sc) {
            JOptionPane.showMessageDialog(null, sc.getMessage());
        }
    }//GEN-LAST:event_deleteButtonClick

    private void refreshButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonClick
        String[] columns = {"ID", "Name","Parent Id"};
        try {
            tblUser.setModel(new userDetailsModule(columns, categoryDAO.getAll()));
        } catch (SQLException | ClassNotFoundException sc) {
            JOptionPane.showMessageDialog(null, sc.getMessage());
        }
    }//GEN-LAST:event_refreshButtonClick

    private class userDetailsModule extends AbstractTableModel {

        private String[] columns;
        private List<Category> categoryList;

        public userDetailsModule(String[] columns, List<Category> categoryList) {
            this.columns = columns;
            this.categoryList = categoryList;
        }

        @Override
        public int getRowCount() {
            return categoryList.size();
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Category category = categoryList.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return category.getId();
                case 1:
                    return category.getName();
                case 2:
                    return category.getParentId();
            }
            return null;
        }

        public String getColumnName(int columnIndex) {
            return columns[columnIndex];
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
