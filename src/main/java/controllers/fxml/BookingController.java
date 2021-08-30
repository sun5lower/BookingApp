package controllers.fxml;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BookingController implements Initializable {

    SceneController sceneController = new controllers.fxml.SceneController();

    public void view(ActionEvent event) throws IOException {
        sceneController.switchToView(event);
    }

    @FXML private ListView<String> myListView;
    @FXML private Label specialistLabel;

    String[] specialists = {"Lorem", "Ipsum", "Dolor"};

    String currentSpec;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myListView.getItems().addAll(specialists);

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                currentSpec = myListView.getSelectionModel().getSelectedItem();
                specialistLabel.setText(currentSpec);
            }
        });
    }

    @FXML
    private TextField enterNameField;
    @FXML
    private TextField enterNumberField;
    @FXML
    private Button bookButton;

    private ArrayList<String> userInfo;
    private ArrayList<String> specialistInfo;

    public void getInfo(ActionEvent event) throws IOException {
        bookButton.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {

            }

            @SneakyThrows
            public void handle(ActionEvent event) {
                String name = enterNameField.getText();
                String number = enterNumberField.getText();
//                userInfo.add(number);
//                userInfo.add(name);
//                specialistInfo.add(currentSpec);
                setSpecialistInfo(specialistInfo);

                view(event);
            }
        });
    }

    public ArrayList<String> getUserInfo() {
        return userInfo;
    }

    public void setSpecialistInfo(ArrayList<String> specialistInfo) {
        this.specialistInfo = specialistInfo;
    }

    public ArrayList<String> getSpecialistInfo() {
        return specialistInfo;
    }
}