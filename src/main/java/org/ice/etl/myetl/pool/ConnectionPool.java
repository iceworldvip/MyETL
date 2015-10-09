/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ice.etl.myetl.pool;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import org.ice.etl.myetl.pool.connection.MyConnection;

/**
 *
 * @author ice
 */
public class ConnectionPool {

    private static List<MyConnection> connections;

    private static Integer MAX_CONNECTION_AMOUNT = 50;
    private static Integer DEFAULT_CONNECTION_AMOUNT = 10;
    private static Integer KEEP_ALIVE_CONNECTION_AMOUNT = 5;

    private ConnectionPool(Integer connectionAmount) {
        Integer createAmount = connectionAmount > MAX_CONNECTION_AMOUNT ? MAX_CONNECTION_AMOUNT : connectionAmount;
        connections = new ArrayList<MyConnection>();
    }

    public MyConnection getConnection() {
        return connections.get(0);
    }

}
