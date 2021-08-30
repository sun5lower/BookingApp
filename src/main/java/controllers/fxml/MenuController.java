package controllers.fxml;


import javafx.event.ActionEvent;

import java.io.IOException;

public class MenuController {

    SceneController sceneController = new controllers.fxml.SceneController();

    public void booking(ActionEvent event) throws IOException {
        sceneController.switchToBooking(event);
    }

    public void view(ActionEvent event) throws IOException {
        sceneController.switchToView(event);
    }
}