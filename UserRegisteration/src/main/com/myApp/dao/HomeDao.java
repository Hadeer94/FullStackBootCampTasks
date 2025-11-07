package main.com.myApp.dao;

import main.com.myApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
@Component
public class HomeDao {
    @Autowired
    public DatabaseOperation databaseOperations;

    public void saveUser(User user) throws SQLException {
        databaseOperations.save(user);
    }
}
