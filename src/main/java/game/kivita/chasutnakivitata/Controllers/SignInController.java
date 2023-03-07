package game.kivita.chasutnakivitata.Controllers;

import game.kivita.chasutnakivitata.DataBaseDetails;
import game.kivita.chasutnakivitata.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignInController {
    @FXML
    private TextField email;

    @FXML
    private Button login;

    @FXML
    private PasswordField password;

    @FXML
    private Button signup;

    @FXML
    private Text inputError;

    @FXML
    void goToSignUp(ActionEvent event) throws IOException {
        Methods.change(event,"SignUp.fxml",480,720);
    }


    @FXML
    void logIn(ActionEvent event) throws SQLException, IOException {

        Connection connection = DriverManager.getConnection(DataBaseDetails.DB_URL, DataBaseDetails.USER, DataBaseDetails.PASS);
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM register WHERE email = ? AND password = ?");

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email.getText());
        boolean matchFound = matcher.find();

        if (email.getText().isEmpty() || password.getText().isEmpty()){
            inputError.setText("Please fill all the fields.");
        }else if (!matchFound){
            inputError.setText("Not a valid email.");
        }else if (password.getText().length() < 8){
            inputError.setText("Password cannot be shorter than 8 characters.");
        }else {

            inputError.setText("");

            stmt.setString(1, email.getText());
            stmt.setString(2, password.getText());

            //TO-DO Проверка дали съществува такъв акаунт::
            ResultSet result = stmt.executeQuery();
            if (!result.next()) {
                inputError.setText("Email or password is incorrect.");
            } else {

                inputError.setFill(Color.BLACK);
                inputError.setText("LOG IN successful");

                //TO-DO Character selection screen and get player name
                Methods.change(event, "CharacterSelection.fxml",1280,720);

            }

        }
    }
}