/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ice.etl.myetl.pool.connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbutils.BaseResultSetHandler;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ice
 */
public class MyConnectionTest {

    @Before
    public void setUp() {
        System.out.println("before");
    }

    @Test
    public void testGetConnection() throws SQLException, ClassNotFoundException, PropertyVetoException {
//        MyConnection connection = new MyConnection();
//        Connection c = connection.getConnection();
//        PreparedStatement ps = c.prepareStatement("select count(1) from test.soccer;");
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()) {
//            System.out.println(rs.getString(1));
//        }

        ResultSetHandler<Object[]> rsh = new ResultSetHandler<Object[]>() {

            @Override
            public Object[] handle(ResultSet rs) throws SQLException {
                if (!rs.next()) {
                    return null;
                }
                ResultSetMetaData meta = rs.getMetaData();
                int cols = meta.getColumnCount();
                Object[] objs = new Object[cols];

                for (int i = 0; i < cols; i++) {
                    objs[i] = rs.getObject(i + 1);
                }
                return objs;
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost");
        dataSource.setUser("root");
        dataSource.setPassword("");
        QueryRunner qr = new QueryRunner(dataSource);
        Object[] result = qr.query(
                "SELECT count(1) FROM test.soccer", rsh);
        System.out.println(result[0]);
    }

    @After
    public void setDown() {
        System.out.println("after");
    }

}
