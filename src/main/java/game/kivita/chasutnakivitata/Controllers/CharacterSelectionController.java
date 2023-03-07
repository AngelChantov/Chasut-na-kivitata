package game.kivita.chasutnakivitata.Controllers;

import game.kivita.chasutnakivitata.Game.Content;
import game.kivita.chasutnakivitata.Methods;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;


public class CharacterSelectionController {
    @FXML
    void selectCharacterOne(ActionEvent event) throws IOException {

        Content.character = "one";

        Methods.change(event, "MainGame.fxml",1280,720);
    }

    @FXML
    void selectCharacterTwo(ActionEvent event) throws IOException {

        Content.character = "two";

        Methods.change(event, "MainGame.fxml",1280,720);
    }


}
