package controllers.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.io.IOException;
import java.time.LocalDate;


public class ViewController {

    @FXML Label specialistLabel;
    @FXML Label yourNameLabel;
    @FXML Label yourNumberLabel;

    public void displayName(String name) {
        yourNameLabel.setText(name);
    }

    public void displayNumber(String number) {
        yourNumberLabel.setText(number);
    }

    public void displaySpecialist(String specialist) {
        specialistLabel.setText(specialist);
    }

    @FXML private DatePicker dateView;
    @FXML Label dateLabel;

    public void getDate(ActionEvent event) {

        LocalDate myDate = dateView.getValue();
        dateLabel.setText(myDate.toString());
    }

}