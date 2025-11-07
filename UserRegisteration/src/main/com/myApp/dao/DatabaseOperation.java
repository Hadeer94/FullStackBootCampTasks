package main.com.myApp.dao;

import main.com.myApp.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.*;

@Component
public class DatabaseOperation {
    @Value("${database.url}")
    private String url;
    @Value("${database.username}")
    private String userName;
    @Value("${database.password}")
    private String password;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    String sql;
    @PostConstruct
    public void connectToDatabase () throws SQLException {
        System.out.println("connect to database established ");
        connection = DriverManager.getConnection(
                url,userName,password);

    }
    public void save(User user) throws SQLException {

        sql = "INSERT INTO user (fName, lName, email, city,date) VALUES (?, ?, ?, ? ,?)";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getfName());
        preparedStatement.setString(2, user.getlName());
        preparedStatement.setString(3, user.getEmail());
        preparedStatement.setString(4, user.getCity());
        preparedStatement.setDate(5, Date.valueOf(user.getDate()));
        preparedStatement.executeUpdate();
        System.out.println("User saved successfully!");

    }

}
