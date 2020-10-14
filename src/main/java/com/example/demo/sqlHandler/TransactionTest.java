package com.example.demo.sqlHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;

@Repository
public class TransactionTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(propagation= Propagation.REQUIRED,rollbackFor= Exception.class)
    public void test1() throws Exception {

        System.out.println("数据源:"+jdbcTemplate.getDataSource().getConnection().hashCode());
        System.out.println("数据源:"+jdbcTemplate.getDataSource().getConnection().hashCode());
        Connection con =jdbcTemplate.getDataSource().getConnection();
        System.out.println("数据源:"+con.hashCode());
        System.out.println("数据源:"+con.hashCode());
        jdbcTemplate.execute("insert test2 values(1,1)");
        if (1==2)
        throw new Exception();
        jdbcTemplate.execute("insert test2 values(2,2)");
    }
}