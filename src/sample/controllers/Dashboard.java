package sample.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Dashboard  {

    @FXML
    private AnchorPane dashboard;

    @FXML
    private ImageView logo;

    @FXML
    private JFXButton browseButton;

    @FXML
    private JFXButton statusButton;

    @FXML
    private JFXButton accountButton;

    @FXML
    private AnchorPane display;

    @FXML
    private AnchorPane dashboardPane;

    @FXML
    private AnchorPane changeMe;

    @FXML
    public void loadLogin(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../FXML/LoginMain.fxml"));
        changeMe.getChildren().setAll(pane);
    }

    @FXML
    public void loadBrowse(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../FXML/Browse.fxml"));
        changeMe.getChildren().setAll(pane);
    }

    @FXML
    public void loadStatus(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../FXML/Status.fxml"));
        changeMe.getChildren().setAll(pane);
    }
}
