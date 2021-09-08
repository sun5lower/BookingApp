package controllers.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import javax.swing.*;
import java.io.IOException;
import java.time.LocalDate;


public class ViewController {

    @FXML Label specialistLabel;
    @FXML Label yourNameLabel;
    @FXML Label yourNumberLabel;
    @FXML Label dateLabel;

    public void displayName(String name) {
        yourNameLabel.setText("Your name: " + name);
    }

    public void displayNumber(String number) {
        yourNumberLabel.setText("Your number: " + number);
    }

    public void displaySpecialist(String specialist) {
        specialistLabel.setText(specialist);
    }


    public void displayDate(LocalDate date) {
        dateLabel.setText(date.toString());
    }


    SceneController sceneController = new SceneController();

    public void menu(ActionEvent event) throws IOException {
        sceneController.switchToMenu(event);
    }

}