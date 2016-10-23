/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ulsp.DAO.Impl;

import com.leapfrog.ulsp.DAO.CategoryDAO;
import com.leapfrog.ulsp.constant.SqlConstant;
import com.leapfrog.ulsp.db.DbConnection;
import com.leapfrog.ulsp.entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AM3ET
 */
public class CategoryDAOImpl implements CategoryDAO {
    private DbConnection db = new DbConnection();
    
    @Override
    public List<Category> getAll() throws SQLException, ClassNotFoundException {
        List<Category> categoryList = new ArrayList<>();
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.CATEGORY_GETALL);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            Category category = new Category();
            category.setId(rs.getInt("category_id"));
            category.setName(rs.getString("category_name"));
            category.setParentId(rs.getInt("parent_id"));
            categoryList.add(category);
        }
        db.close();
        return categoryList;
    }

    @Override
    public Category getByID(int id) throws SQLException, ClassNotFoundException {
        Category category = null;
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.CATEGORY_GETBYID);
        stmt.setInt(1, id);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            category = new Category();
            category.setId(rs.getInt("category_id"));
            category.setName(rs.getString("category_name"));
            category.setParentId(rs.getInt("parent_id"));
        }
        db.close();
        return category;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.CATEGORY_DELETE);
        stmt.setInt(1, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int update(Category c) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.CATEGORY_UPDATE);
        stmt.setString(1, c.getName());
        stmt.setInt(2, c.getParentId());
        stmt.setInt(3, c.getId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int insert(Category c) throws SQLException, ClassNotFoundException {
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.CATEGORY_INSERT);
        stmt.setString(1, c.getName());
        stmt.setInt(2, c.getParentId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public Category getByName(String name) throws SQLException, ClassNotFoundException {
        Category category = null;
        db.open();
        PreparedStatement stmt = db.initStatement(SqlConstant.CATEGORY_GETBYNAME);
        stmt.setString(1, name);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            category = new Category();
            category.setId(rs.getInt("category_id"));
            category.setName(rs.getString("category_name"));
            category.setParentId(rs.getInt("parent_id"));
        }
        db.close();
        return category;
    }
    
}
