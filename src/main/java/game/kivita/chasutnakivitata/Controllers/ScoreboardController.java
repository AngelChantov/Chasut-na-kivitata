package game.kivita.chasutnakivitata.Controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ScoreboardController {

    @FXML
    private Button exit;

    public void exitApp() {
        Platform.exit();
    }
}
