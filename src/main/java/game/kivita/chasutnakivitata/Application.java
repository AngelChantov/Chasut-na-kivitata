package game.kivita.chasutnakivitata;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader login = new FXMLLoader(Application.class.getResource("fxml/Login.fxml"));
        FXMLLoader register = new FXMLLoader(Application.class.getResource("fxml/Register.fxml"));
        FXMLLoader game = new FXMLLoader(Application.class.getResource("fxml/MainGame.fxml"));
        Scene scene = new Scene(login.load(), 720, 480);
        stage.setResizable(false);
        stage.setTitle("Chasut na Kivitata");
        stage.getIcons().add(new Image(Objects.requireNonNull(Application.class.getResourceAsStream("/game/kivita/chasutnakivitata/pictures/Logo.png"))));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}