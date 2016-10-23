/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ulsp.DAO.Impl;

import com.leapfrog.ulsp.DAO.UserDAO;
import com.leapfrog.ulsp.constant.SqlConstant;
import com.leapfrog.ulsp.db.DbConnection;
import com.leapfrog.ulsp.entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AM3ET
 */
public class UserDAOImpl implements UserDAO {
    private DbConnection db = new DbConnection();
    private PreparedStatement stmt = null;
    @Override
    public List<User> getAll() throws SQLException, ClassNotFoundException {
        List<User> userList = new ArrayList<>();
        db.open();
        stmt = db.initStatement(SqlConstant.USER_GETALL);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            User user = new User();
            user.setId(rs.getInt("user_id"));
            user.setName(rs.getString("user_name"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setCreatedDate(rs.getDate("created_date"));
            user.setStatus(rs.getBoolean("status"));
            userList.add(user);
        }
        db.close();
        return userList;
    }

    @Override
    public User getByID(int id) throws SQLException, ClassNotFoundException {
        User user = null;
        db.open();
        stmt = db.initStatement(SqlConstant.USER_GETBYID);
        stmt.setInt(1, id);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            user = new User();
            user.setId(rs.getInt("user_id"));
            user.setName(rs.getString("user_name"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setCreatedDate(rs.getDate("created_date"));
            user.setStatus(rs.getBoolean("status"));
        }
        db.close();
        return user;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        db.open();
        stmt = db.initStatement(SqlConstant.USER_DELETE);
        stmt.setInt(1, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int update(User u) throws SQLException, ClassNotFoundException {
        db.open();
        stmt = db.initStatement(SqlConstant.USER_UPDATE);
        stmt.setString(1, u.getName());
        stmt.setString(2, u.getPassword());
        stmt.setString(3, u.getEmail());
        stmt.setBoolean(4, u.isStatus());
        stmt.setInt(5, u.getId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int insert(User u) throws SQLException, ClassNotFoundException {
        db.open();
        stmt = db.initStatement(SqlConstant.USER_INSERT);
        stmt.setString(1, u.getName());
        stmt.setString(2, u.getPassword());
        stmt.setString(3, u.getEmail());
        stmt.setBoolean(4, u.isStatus());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public User getByName(String name) throws SQLException, ClassNotFoundException {
        User user = null;
        db.open();
        stmt = db.initStatement(SqlConstant.USER_GETBYNAME);
        stmt.setString(1, name);
        ResultSet rs = db.exeucteQuery();
        while(rs.next()){
            user = new User();
            user.setId(rs.getInt("user_id"));
            user.setName(rs.getString("user_name"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setCreatedDate(rs.getDate("created_date"));
            user.setStatus(rs.getBoolean("status"));
        }
        db.close();
        return user;
    }
    
}
