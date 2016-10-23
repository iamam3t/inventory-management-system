/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ulsp.DAO;

import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author AM3ET
 */
public interface GenericDAO<T>{
   List<T> getAll() throws SQLException,ClassNotFoundException;
   T getByID(int id) throws SQLException,ClassNotFoundException;
   T getByName(String name) throws SQLException,ClassNotFoundException;
   int delete(int id) throws SQLException,ClassNotFoundException;
   int update(T t) throws SQLException,ClassNotFoundException;
   int insert(T t) throws SQLException,ClassNotFoundException;
    
}
