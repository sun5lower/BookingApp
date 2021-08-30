package repository;

import entity.Specialist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.Timeslot;
import types.Status;

public class TimeslotRepository {
    private dbHandler dbHandler = new dbHandler();

    public void addTimeslotToDB(Timeslot timeslot) throws SQLException {
        Connection connection = dbHandler.getConnection();
        String query = "INSERT INTO timeslots (date, time, status)"
                + "VALUES(?, ?, ?);";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setDate(1, timeslot.getDate());
        preparedStatement.setTime(2, timeslot.getTime());
        preparedStatement.setString(3, timeslot.getStatus().toString());

        preparedStatement.execute();
    }

    public ArrayList<Timeslot> getAllTimeslotsFromDB() throws SQLException {
        ArrayList<Timeslot> timeslotItems = new ArrayList<>();
        String query = "SELECT * FROM timeslots";
        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery();

        while (result.next()){
            Timeslot timeslot = new Timeslot(
                    result.getInt("id"),
                    result.getDate("date"),
                    result.getTime("time"),
                    Status.valueOf(result.getString("status"))
            );
            timeslotItems.add(timeslot);
        }
        return timeslotItems;
    }
}