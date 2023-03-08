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
    }}
