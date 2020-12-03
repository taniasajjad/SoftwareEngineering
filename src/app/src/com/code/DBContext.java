package com.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBContext {

    //define environment variables
    private final String DB_URL       = "MYSQL_URL";
    private final String DB_USER_ID   = "MYSQL_USER";
    private final String DB_USER_PASS = "MYSQL_PASSWORD";

    private String url = System.getenv(DB_URL);
    private String userID     = System.getenv(DB_USER_ID);
    private String password   = System.getenv(DB_USER_PASS);

    private Connection connection;
    private ResultSet rs;
    private Statement statement;

    public DBContext() {
    }

    public void getconnection() throws Exception {
        connection = DriverManager.getConnection(url, userID, password);
    }

    public ResultSet getConnectionStatement(String query) throws Exception {
        getconnection();
        statement = connection.createStatement();
        rs = statement.executeQuery(query);
        return rs;
    }
    public void closeConnection() throws SQLException{
        rs.close();
        statement.close();
        connection.close();
        
        
    }

    //If i > 0 Success, else fail
    public int preStatement(String query) throws SQLException, Exception {
        getconnection();
        PreparedStatement preStatement = connection.prepareStatement(query);
        int i = preStatement.executeUpdate();
        connection.close();
        preStatement.close();
        return i;
    }
}
