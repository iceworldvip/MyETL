/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ice.etl.myetl.pool;

import java.sql.Connection;
import org.ice.etl.myetl.pool.connection.MyConnection;

/**
 *
 * @author ice
 */
public class ConnectionPool {

    private static MyConnection connections[];

    private static Integer MAX_CONNECTION_AMOUNT = 50;

    private ConnectionPool(Integer connectionAmount) {
        Integer createAmount = connectionAmount > MAX_CONNECTION_AMOUNT ? MAX_CONNECTION_AMOUNT : connectionAmount;
        connections = new MyConnection[createAmount];
    }
    
    

}
