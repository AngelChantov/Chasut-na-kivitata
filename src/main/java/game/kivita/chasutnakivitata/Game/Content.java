package game.kivita.chasutnakivitata.Game;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class Content {
    static Dialog dialog1 = new Dialog(
            "Otivash na daskalo?",
            new String[]{"da", "ne", "", ""},
            new int[]{1,0},
            new int[]{10,0}
            );


    static Dialog dialog2 = new Dialog(
            "nesho2",
            new String[]{"da", "ne", "moje bi", "ne znam"},
            new int[]{2,2,2,2},
            new int[]{0,0,12,3}
            );


    static Dialog dialog3 = new Dialog(
            "nesgo3",
            new String[]{"da", "ne", "mhm", ""},
            new int[]{0,0,0,0},
            new int[]{17,0,30,1}
            );


    public static Dialog[] dialogs = {dialog1,dialog2,dialog3};
    public static int points = 0;
    public static int sceneNum = 0;
    public static String character;

    public static void scene(Text text, Button choice1, Button choice2, Button choice3, Button choice4){
        text.setText(dialogs[sceneNum].text);
        choice1.setText(dialogs[sceneNum].options[0]);
        choice2.setText(dialogs[sceneNum].options[1]);
        choice3.setText(dialogs[sceneNum].options[2]);
        choice4.setText(dialogs[sceneNum].options[3]);
    }

    //background changing by sceneNum
    //sceneNum > 100 obshak
    // 100 < sceneNum < 200 v daskalo
    // 200 < sceneNum < 300 v daskalo s krasi



}
