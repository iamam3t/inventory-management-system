/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.ulsp.constant;

/**
 *
 * @author AM3ET
 */
public class SqlConstant {
    public final static String USER_INSERT = "INSERT INTO "+TableConstant.USER_TABLE+"(user_name,password,email,status) VALUES(?,?,?,?)";
    public final static String USER_UPDATE = "UPDATE "+TableConstant.USER_TABLE+" SET user_name=?,password=?,email=?,status=? WHERE user_id=?";
    public final static String USER_DELETE = "DELETE FROM "+TableConstant.USER_TABLE+" WHERE user_id=?";
    public final static String USER_GETBYID = "SELECT * FROM "+TableConstant.USER_TABLE+" WHERE user_id=?";
    public final static String USER_GETBYNAME = "SELECT * FROM "+TableConstant.USER_TABLE+" WHERE user_name=?";
    public final static String USER_GETALL = "SELECT * FROM "+TableConstant.USER_TABLE;
    
    public final static String PRODUCTS_INSERT = "INSERT INTO "+TableConstant.PRODUCTS_TABLE+"(product_name,product_description,quantity,cost_price,selling_price,status,category_id,supplier_id) VALUES(?,?,?,?,?,?,?,?)";
    public final static String PRODUCTS_UPDATE = "UPDATE "+TableConstant.PRODUCTS_TABLE+" SET product_name=?,product_description=?,quantity=?,cost_price=?,selling_price=?,status=?,category_id=?,supplier_id=? WHERE product_id=?";
    public final static String PRODUCTS_DELETE = "DELETE FROM "+TableConstant.PRODUCTS_TABLE+" WHERE product_id=?";
    public final static String PRODUCTS_GETBYID = "SELECT * FROM "+TableConstant.PRODUCTS_TABLE+" WHERE product_id=?";
    public final static String PRODUCTS_GETBYNAME = "SELECT * FROM "+TableConstant.PRODUCTS_TABLE+" WHERE product_name=?";
    public final static String PRODUCTS_GETALL = "SELECT * FROM "+TableConstant.PRODUCTS_TABLE;
    
    public final static String SUPPLIER_INSERT = "INSERT INTO "+TableConstant.SUPPLIERS_TABLE+"(supplier_name,address,email,contact,status) VALUES(?,?,?,?,?)";
    public final static String SUPPLIER_UPDATE = "UPDATE "+TableConstant.SUPPLIERS_TABLE+" SET supplier_name=?,address=?,email=?,contact=?,status=? WHERE supplier_id=? ";
    public final static String SUPPLIER_DELETE = "DELETE FROM "+TableConstant.SUPPLIERS_TABLE+" WHERE supplier_id=? ";
    public final static String SUPPLIER_GETBYID = "SELECT * FROM "+TableConstant.SUPPLIERS_TABLE+" WHERE supplier_id=? ";
    public final static String SUPPLIER_GETBYNAME = "SELECT * FROM "+TableConstant.SUPPLIERS_TABLE+" WHERE supplier_name=?";
    public final static String SUPPLIER_GETALL = "SELECT * FROM "+TableConstant.SUPPLIERS_TABLE;
    
    public final static String CATEGORY_INSERT = "INSERT INTO "+TableConstant.CATEGORIES_TABLE+"(category_name,parent_id) VALUES(?,?)";
    public final static String CATEGORY_UPDATE = "UPDATE "+TableConstant.CATEGORIES_TABLE+" SET category_name=?,parent_id=? WHERE category_id=? ";
    public final static String CATEGORY_DELETE = "DELETE FROM "+TableConstant.CATEGORIES_TABLE+" WHERE category_id=? ";
    public final static String CATEGORY_GETBYID = "SELECT * FROM "+TableConstant.CATEGORIES_TABLE+" WHERE category_id=? ";
    public final static String CATEGORY_GETBYNAME = "SELECT * FROM "+TableConstant.CATEGORIES_TABLE+" WHERE category_name=?";
    public final static String CATEGORY_GETALL = "SELECT * FROM "+TableConstant.CATEGORIES_TABLE;
}
