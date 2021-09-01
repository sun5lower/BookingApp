package controllers.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;

import java.io.IOException;


public class ViewController {


    @FXML Label dateLabel;
    @FXML Label specialistLabel;
    @FXML Label yourNameLabel;
    @FXML Label yourNumberLabel;

    public void displayName(String name) {
        yourNameLabel.setText("Hello: " + name);
    }

    public void displayNumber(String number) {
        yourNumberLabel.setText("Number: " + number);
    }

    public void displaySpecialist(String specialist) {
        specialistLabel.setText(specialist);
    }

}