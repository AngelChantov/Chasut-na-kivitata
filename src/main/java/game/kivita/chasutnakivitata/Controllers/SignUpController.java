package game.kivita.chasutnakivitata.Controllers;

import game.kivita.chasutnakivitata.DataBaseDetails;
import game.kivita.chasutnakivitata.Game.Content;
import game.kivita.chasutnakivitata.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpController {
    @FXML
    private TextField email;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private PasswordField password;

    @FXML
    private Button signIn;

    @FXML
    private Button signUp;

    @FXML
    private Text inputError;

    @FXML
    void goToSignIn(ActionEvent event) throws IOException {
        Methods.changeStage(event, "SignIn.fxml", 480, 720);
    }

    @FXML
    void signUp(ActionEvent event) throws SQLException, IOException {

        final Connection connection = DriverManager.getConnection(DataBaseDetails.DB_URL, DataBaseDetails.USER, DataBaseDetails.PASS);
        final PreparedStatement stmt = connection.prepareStatement("INSERT INTO register ( `First name`, `Last name`, Email, Password) VALUES (?,?,?,?)");

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email.getText());
        boolean matchFound = matcher.find();

        if (firstName.getText().isEmpty() || lastName.getText().isEmpty() || email.getText().isEmpty() || password.getText().isEmpty()){
            inputError.setText("Please fill all the fields.");
        }else if (firstName.getText().length() < 3){
            inputError.setText("First name cannot be shorter than 3 characters.");
        }else if (lastName.getText().length() < 3){
            inputError.setText("Last name cannot be shorter than 3 characters.");
        }else if (!matchFound){
            inputError.setText("Not a valid email.");
        }else if (password.getText().length() < 8){
            inputError.setText("Password cannot be shorter than 8 characters.");
        }else {

            inputError.setText("");

            stmt.setString(1, firstName.getText());
            stmt.setString(2, lastName.getText());
            stmt.setString(3, email.getText().toLowerCase());
            stmt.setString(4, password.getText());

            int result = stmt.executeUpdate();

            if (result > 0){

                Methods.changeStage(event, "SignIn.fxml",480,720);

            }else {

                inputError.setText("Unsuccessful registration, please try again.");

            }
        }

    }
}
