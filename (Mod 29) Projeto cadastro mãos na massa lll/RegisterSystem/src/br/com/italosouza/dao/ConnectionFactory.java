package br.com.italosouza.dao;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author italo
 */

public class ConnectionFactory {
    private static Connection connection;


    public ConnectionFactory(Connection connection) {
    }

    public static Connection getConnection() throws SQLException {
        if(connection == null){
            connection = initConection();
        } else if (connection != null && connection.isClosed()) {
            connection = initConection();
        }
        return connection;
    }
    private static Connection initConection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/vendas_online_2", "postgres", "password"
            );
        } catch (SQLException e){
            throw new RuntimeException(e);

        }
    }
}
