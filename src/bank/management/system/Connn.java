package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;

    public Connn() {
        try {
            String DATABASE_URL = "jdbc:postgresql://localhost:5432/bankSystem";
            String USER = "postgres";
            String PASSWORD = "test";

            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}