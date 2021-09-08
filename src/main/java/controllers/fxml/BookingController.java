package controllers.fxml;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BookingController implements Initializable {

    @FXML
    private ListView<String> myListView;
    @FXML
    private Label specialistLabel;

    String[] specialists = {"Masseuse", "Hairdresser", "Beauty Therapist"};

    public String currentSpec;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myListView.getItems().addAll(specialists);

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                currentSpec = myListView.getSelectionModel().getSelectedItem();
                specialistLabel.setText("You chose: " + currentSpec);
            }
        });
    }


    @FXML
    private TextField enterNameField;
    @FXML
    private TextField enterNumberField;
    @FXML
    private DatePicker dateView;


    private Stage stage;
    private Scene scene;
    private Parent root;

    public void book(ActionEvent event) throws IOException, InterruptedException {

        String name = enterNameField.getText();
        String number = enterNumberField.getText();
        LocalDate date = dateView.getValue();
        String specialist = currentSpec;


        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                currentSpec = myListView.getSelectionModel().getSelectedItem();
                specialistLabel.setText(currentSpec);
            }
        });


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View.fxml"));
        root = loader.load();


        ViewController viewController = loader.getController();
        viewController.displayName(name);
        viewController.displayNumber(number);
        viewController.displayDate(date);
        viewController.displaySpecialist(specialist);

        validation(event);

    }

    @FXML
    Label errorLabel;

    public void validation(ActionEvent event) throws InterruptedException {

        String name = enterNameField.getText();
        String number = enterNumberField.getText();

        if (!name.equals("") && !number.equals("") && number.length() == 11) {
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            errorLabel.setText("Either fields are empty or the number entered was not 11 characters!");
            errorLabel.setStyle("-fx-text-fill:red");
        }
    }

    @FXML MenuButton selectTimeMenu;
    public void setTime() {
//        selectTimeMenu.selectedItemProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
//                currentSpec = myListView.getSelectionModel().getSelectedItem();
//                specialistLabel.setText("You chose: " + currentSpec);
//            }
//        });
    }

}