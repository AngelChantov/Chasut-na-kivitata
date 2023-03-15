package game.kivita.chasutnakivitata;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class ApplicationStart extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/SignIn.fxml")));
        Scene scene = new Scene(root, 480, 720);
        stage.setResizable(false);
        stage.setTitle("Chasut na Kivitata");
        stage.getIcons().add(new Image(Objects.requireNonNull(ApplicationStart.class.getResourceAsStream("/game/kivita/chasutnakivitata/pictures/Logo.png"))));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}