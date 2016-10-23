/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ulsp.DAO.Impl;

import com.leapfrog.ulsp.DAO.SupplierDAO;
import com.leapfrog.ulsp.constant.SqlConstant;
import com.leapfrog.ulsp.db.DbConnection;
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
public class SupplierDAOImpl implements SupplierDAO {
    private DbConnection db = new DbConnection();
    
    @Override
    public List<Supplier> getAll() throws SQLException, ClassNotFoundException {
        List<Supplier> supplierList = new ArrayList<>();
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.SUPPLIER_GETALL);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            Supplier supplier = new Supplier();
            supplier.setId(rs.getInt("supplier_id"));
            supplier.setName(rs.getString("supplier_name"));
            supplier.setAddress(rs.getString("address"));
            supplier.setEmail(rs.getString("email"));
            supplier.setContactNo(rs.getString("contact"));
            supplier.setStatus(rs.getBoolean("status"));
            supplierList.add(supplier);
        }
        db.close();
        return supplierList;
    }

    @Override
    public Supplier getByID(int id) throws SQLException, ClassNotFoundException {
        Supplier supplier = null;
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.SUPPLIER_GETBYID);
        stmt.setInt(1, id);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            supplier = new Supplier();
            supplier.setId(rs.getInt("supplier_id"));
            supplier.setName(rs.getString("supplier_name"));
            supplier.setAddress(rs.getString("address"));
            supplier.setEmail(rs.getString("email"));
            supplier.setContactNo(rs.getString("contact"));
            supplier.setStatus(rs.getBoolean("status"));
        }
        db.close();
        return supplier;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.SUPPLIER_DELETE);
        stmt.setInt(1, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int update(Supplier s) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.SUPPLIER_UPDATE);
        stmt.setString(1, s.getName());
        stmt.setString(2, s.getAddress());
        stmt.setString(3, s.getEmail());
        stmt.setString(4, s.getContactNo());
        stmt.setBoolean(5, s.isStatus());
        stmt.setInt(6, s.getId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int insert(Supplier s) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.SUPPLIER_INSERT);
        stmt.setString(1, s.getName());
        stmt.setString(2, s.getAddress());
        stmt.setString(3, s.getEmail());
        stmt.setString(4, s.getContactNo());
        stmt.setBoolean(5, s.isStatus());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public Supplier getByName(String name) throws SQLException, ClassNotFoundException {
        Supplier supplier = null;
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.SUPPLIER_GETBYNAME);
        stmt.setString(1, name);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            supplier = new Supplier();
            supplier.setId(rs.getInt("supplier_id"));
            supplier.setName(rs.getString("supplier_name"));
            supplier.setAddress(rs.getString("address"));
            supplier.setEmail(rs.getString("email"));
            supplier.setContactNo(rs.getString("contact"));
            supplier.setStatus(rs.getBoolean("status"));
        }
        db.close();
        return supplier;
    }
    
}
