/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ice.etl.myetl.pool.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ice
 */
public class MyConnection {
    private Connection connection;

    public MyConnection() throws SQLException {
        connection = DriverManager.getConnection("url", "username", "password");
    }
    
}
