/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ice.etl.myetl.sql;

import java.util.Map;

/**
 * 测试类
 *
 * @author ice
 * @version 1.0
 */
public interface Template {

    /**
     * 变量
     */
    public String abc = "";

    /**
     * 方法
     *
     * @param object 参数
     * @return
     */
    public int save(Object object);

    public int update(Object object);

    public int delete(Object object);

    public int query(String sql, Map<String, Object> params);
}
