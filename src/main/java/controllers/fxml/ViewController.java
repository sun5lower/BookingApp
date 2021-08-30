package controllers.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;

public class ViewController {

    controllers.fxml.BookingController bookingController;

    @FXML private Label dateLabel;
    @FXML private Label specialistLabel;


    public void initialize() {
        bookingController = new BookingController();
        ArrayList specialistInfo = bookingController.getSpecialistInfo();
        System.out.println(specialistInfo);
    }


    SceneController sceneController = new SceneController();

    public void menu(ActionEvent event) throws IOException {
        sceneController.switchToMenu(event);
    }
}