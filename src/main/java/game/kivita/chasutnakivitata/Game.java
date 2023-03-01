package game.kivita.chasutnakivitata;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Game {
    static Dialog dialog1 = new Dialog("Otivash na daskalo?", new String[]{"da", "ne", "", ""});
    static Dialog dialog2 = new Dialog("nesho2", new String[]{"da", "ne", "moje bi", "ne znam"});
    static Dialog dialog3 = new Dialog("nesgo3", new String[]{"da", "ne", "mhm", ""});


    static Dialog[] dialogs = {dialog1,dialog2,dialog3};

    static int sceneNum = 0;

    static void scene(TextArea text, Button choice1, Button choice2, Button choice3, Button choice4){
        text.setText(dialogs[sceneNum].text);
        choice1.setText(dialogs[sceneNum].options[0]);
        choice2.setText(dialogs[sceneNum].options[1]);
        choice3.setText(dialogs[sceneNum].options[2]);
        choice4.setText(dialogs[sceneNum].options[3]);


    }


}
