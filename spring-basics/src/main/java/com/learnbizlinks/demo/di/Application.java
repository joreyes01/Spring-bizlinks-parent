package com.learnbizlinks.demo.di;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;

public enum Application {
    INSTANCE;

    private DataSource dataSource;

    public DataSource dataSource() {
        if (dataSource == null) {
            MysqlDataSource newDataSource = new MysqlDataSource(); // (3)
            newDataSource.setURL("jdbc:mysql://localhost:3306/DBFE");
            newDataSource.setUser("jorge");
            newDataSource.setPassword("c0nTR4S3na_3nCr1pt4dAxd");
            this.dataSource = newDataSource;
        }
        return dataSource;
    }
}
