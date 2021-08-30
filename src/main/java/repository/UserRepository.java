package repository;

import entity.Timeslot;
import entity.User;
import types.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserRepository {

    private dbHandler dbHandler = new dbHandler();

    public void addUserToDB(User user) throws SQLException {
        Connection connection = dbHandler.getConnection();
        String query = "INSERT INTO users (name, phoneNumber)"
                + "VALUES(?, ?);";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setInt(2, user.getPhoneNumber());

        preparedStatement.execute();
    }

    public ArrayList<User> getAllUsersFromDB() throws SQLException {
        ArrayList<User> userItems = new ArrayList<>();
        String query = "SELECT * FROM users";
        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery();

        while (result.next()){
            User user = new User(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("phoneNumber")
            );
            userItems.add(user);
        }
        return userItems;
    }
}