package rc.project.controllers;

import com.jfoenix.controls.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
// Login button
// Forget Password button
// Sign in JFXButton
// Remember Me JFXCheckbox

public class LoginController {
    @FXML
    private Text loginMessage;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private Button login;

    @FXML
    private Button forgetPassword;

    @FXML
    private JFXButton registerButton;

    @FXML
    private JFXCheckBox rememberMe;

    @FXML
    private AnchorPane loginPane;

    @FXML
    public void loginButtonAction(){
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username == null || username.isEmpty()) {
            loginMessage.setText("Please type in a username!");
            return;
        }

        if (password == null || password.isEmpty()) {
            loginMessage.setText("Password cannot be empty");
            return;
        }
    }

    @FXML
    public void loadRegister(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../FXML/SignUp.fxml"));
        loginPane.getChildren().setAll(pane);
    }
}
