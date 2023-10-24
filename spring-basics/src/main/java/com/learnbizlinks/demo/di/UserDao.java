package com.learnbizlinks.demo.di;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    private DataSource dataSource;

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public User findById(Integer id){
        try (Connection connection = dataSource.getConnection()) { // (1)
            PreparedStatement selectStatement = connection.prepareStatement("select * from users where id =  ?");
            // TODO ejecutar select, manejar excepciones y retornar usuario
        } catch (SQLException ex){
            // TODO Manejo de Excepciones
        }
        return null;
    }

    public User findByFirstName(String first_name){
        try (Connection connection = dataSource.getConnection()) { // (2)
            PreparedStatement selectStatement = connection.prepareStatement("select * from users where first_name =  ?");
            // TODO ejecutar select, manejar excepciones y retornar usuario
        } catch (SQLException ex) {
            //TODO Manejo de excepciones
        }
        return null;
    }

//    private DataSource getNewDataSource() {
//        MysqlDataSource dataSource = new MysqlDataSource(); // (3)
//        dataSource.setURL("jdbc:mysql://localhost:3306/DBFE");
//        dataSource.setUser("jorge");
//        dataSource.setPassword("c0nTR4S3na_3nCr1pt4dAxd");
//        return dataSource;
//    }
}