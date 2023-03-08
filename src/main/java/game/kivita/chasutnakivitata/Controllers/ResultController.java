package game.kivita.chasutnakivitata.Controllers;

import game.kivita.chasutnakivitata.Game.Content;
import game.kivita.chasutnakivitata.Methods;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ResultController implements Initializable {
    @FXML
    private Button exit;

    @FXML
    private Button scoreboard;

    @FXML
    private Text text;

    @FXML
    void goToScoreboard(ActionEvent event) throws IOException {
        Methods.changeStage(event, "Scoreboard.fxml", 480, 720);
    }
    @FXML
    void exitApp(ActionEvent event) {
        Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if(Content.points >= 7){ //Poveche ot perfekten
            text.setText("Poveche ot perfekten");

        }else if(Content.points >= 6){ //otlichen
            text.setText("otlichen");

        }else if(Content.points >= 5){ //mn dobur
            text.setText("mn dobur");

        }else if(Content.points >= 4){ //dobur
            text.setText("dobur");

        }else if(Content.points >= 3){ //sreden
            text.setText("sreden");

        }else if(Content.points >= 2){ //slab
            text.setText("slab");

        }else if(Content.points >= 0){ //yjas
            text.setText("yjas");
        }

    }
}
