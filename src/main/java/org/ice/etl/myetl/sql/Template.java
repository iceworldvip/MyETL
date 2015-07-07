/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ice.etl.myetl.sql;

import java.util.Map;

/**
 *
 * @author ice
 */
public interface Template {
    public int save(Object object);
    
    public int update(Object object);
    
    public int delete(Object object);
    
    public int query(String sql, Map<String, Object> params);
}
