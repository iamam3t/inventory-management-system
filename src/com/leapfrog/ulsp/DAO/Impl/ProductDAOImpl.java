/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ulsp.DAO.Impl;

import com.leapfrog.ulsp.DAO.ProductDAO;
import com.leapfrog.ulsp.constant.SqlConstant;
import com.leapfrog.ulsp.db.DbConnection;
import com.leapfrog.ulsp.entity.Category;
import com.leapfrog.ulsp.entity.Product;
import com.leapfrog.ulsp.entity.Supplier;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AM3ET
 */
public class ProductDAOImpl implements ProductDAO {
    private DbConnection db = new DbConnection();
    
    @Override
    public List<Product> getAll() throws SQLException, ClassNotFoundException {
        List<Product> productList = new ArrayList<>();
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.PRODUCTS_GETALL);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            Product product = new Product();
            product.setId(rs.getInt("product_id"));
            product.setName(rs.getString("product_name"));
            product.setDescription(rs.getString("product_description"));
            product.setQuantity(rs.getInt("quantity"));
            product.setCostPrice(rs.getInt("cost_price"));
            product.setSellingPrice(rs.getInt("selling_price"));
            product.setStatus(rs.getBoolean("status"));
            productList.add(product);
        }
        db.close();
        return productList;
    }

    @Override
    public Product getByID(int id) throws SQLException, ClassNotFoundException {
        Product product = null;
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.PRODUCTS_GETBYID);
        stmt.setInt(1, id);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            product = new Product();
            product.setId(rs.getInt("product_id"));
            product.setName(rs.getString("product_name"));
            product.setDescription(rs.getString("product_description"));
            product.setQuantity(rs.getInt("quantity"));
            product.setCostPrice(rs.getInt("cost_price"));
            product.setSellingPrice(rs.getInt("selling_price"));
            product.setStatus(rs.getBoolean("status"));
        }
        db.close();
        return product;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.PRODUCTS_DELETE);
        stmt.setInt(1, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int update(Product p) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.PRODUCTS_UPDATE);
        stmt.setString(1, p.getName());
        stmt.setString(2, p.getDescription());
        stmt.setInt(3, p.getQuantity());
        stmt.setInt(4, p.getCostPrice());
        stmt.setInt(5, p.getSellingPrice());
        stmt.setBoolean(6, p.isStatus());
        stmt.setObject(7, new Category().getId());
        stmt.setObject(8, new Supplier().getId());
        stmt.setInt(9, p.getId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int insert(Product p) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.PRODUCTS_INSERT);
        stmt.setString(1, p.getName());
        stmt.setString(2, p.getDescription());
        stmt.setInt(3, p.getQuantity());
        stmt.setInt(4, p.getCostPrice());
        stmt.setInt(5, p.getSellingPrice());
        stmt.setBoolean(6, p.isStatus());
        stmt.setObject(7, new Category().getId());
        stmt.setObject(8, new Supplier().getId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public Product getByName(String name) throws SQLException, ClassNotFoundException {
        Product product = null;
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.PRODUCTS_GETBYNAME);
        stmt.setString(1, name);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            product = new Product();
            product.setId(rs.getInt("product_id"));
            product.setName(rs.getString("product_name"));
            product.setDescription(rs.getString("product_description"));
            product.setQuantity(rs.getInt("quantity"));
            product.setCostPrice(rs.getInt("cost_price"));
            product.setSellingPrice(rs.getInt("selling_price"));
            product.setStatus(rs.getBoolean("status"));
        }
        db.close();
        return product;
    }
    
}
