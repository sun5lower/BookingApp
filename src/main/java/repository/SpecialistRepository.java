package repository;

import entity.Specialist;
import entity.Timeslot;
import types.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SpecialistRepository {

    private dbHandler dbHandler = new dbHandler();

    public void addSpecialistToDB(Specialist specialist) throws SQLException {
        Connection connection = dbHandler.getConnection();
        String query = "INSERT INTO timeslots (specialist)"
                + "VALUES(?);";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, specialist.getSpecialist());

        preparedStatement.execute();
    }

    public ArrayList<Specialist> getAllSpecialistsFromDB() throws SQLException {
        ArrayList<Specialist> specialistItems = new ArrayList<>();
        String query = "SELECT * FROM specialists";
        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery();

        while (result.next()){
            Specialist specialist = new Specialist(
                    result.getInt("id"),
                    result.getString("specialist")
            );
            specialistItems.add(specialist);
        }
        return specialistItems;
    }
}