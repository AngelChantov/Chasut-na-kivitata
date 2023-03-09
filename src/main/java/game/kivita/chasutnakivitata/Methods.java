package game.kivita.chasutnakivitata;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class Methods {

    public static void changeStage(ActionEvent event, String file, int width, int height) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Methods.class.getResource("/game/kivita/chasutnakivitata/fxml/" + file)));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, width,height);

        stage.setScene(scene);

        Rectangle2D resolution = Screen.getPrimary().getVisualBounds();
        stage.setX((resolution.getWidth() - stage.getWidth())/2);
        stage.setY((resolution.getHeight() - stage.getHeight())/2);

        stage.show();
    }

    /*public static void session() throws SQLException {


            final Connection connection = DriverManager.getConnection(DataBaseDetails.DB_URL, DataBaseDetails.USER, DataBaseDetails.PASS);
            final PreparedStatement stmt = connection.prepareStatement("INSERT INTO register ( `First name`, `Last name`, Email, Password) VALUES (?,?,?,?)");
            stmt.setString(1, firstName.getText());
            stmt.setString(2, lastName.getText());
            stmt.setString(3, email.getText().toLowerCase());
            stmt.setString(4, password.getText());
            int result = stmt.executeUpdate();




    }*/











}
