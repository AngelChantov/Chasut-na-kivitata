package game.kivita.chasutnakivitata;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private ImageView background;

    @FXML
    private Button choice1;

    @FXML
    private Button choice2;

    @FXML
    private Button choice3;

    @FXML
    private Button choice4;

    @FXML
    private ImageView leftpic;

    @FXML
    private ImageView rightpic;

    @FXML
    private TextArea text;

    @FXML
    void button1() {

        if (!Game.dialogs[Game.sceneNum].options[0].equals("")){
            Game.dialogs[Game.sceneNum].choice = 0;
            Game.points = Game.points + Game.dialogs[Game.sceneNum].bonusPoints[0];


            Game.sceneNum = Game.dialogs[Game.sceneNum].nextDialog[0];
            Game.scene(text,choice1,choice2,choice3,choice4);
        }

        System.out.println("B1 works");
        System.out.println(Game.points);
    }

    @FXML
    void button2() {

        if (!Game.dialogs[Game.sceneNum].options[1].equals("")){
            Game.dialogs[Game.sceneNum].choice = 1;
            Game.points += Game.dialogs[Game.sceneNum].bonusPoints[1];


            Game.sceneNum = Game.dialogs[Game.sceneNum].nextDialog[1];
            Game.scene(text,choice1,choice2,choice3,choice4);
        }

        System.out.println("B2 works");
        System.out.println(Game.points);
    }

    @FXML
    void button3() {

        if (!Game.dialogs[Game.sceneNum].options[2].equals("")){
            Game.dialogs[Game.sceneNum].choice = 2;
            Game.points += Game.dialogs[Game.sceneNum].bonusPoints[2];


            Game.sceneNum = Game.dialogs[Game.sceneNum].nextDialog[2];
            Game.scene(text,choice1,choice2,choice3,choice4);
        }

        System.out.println("B3 works");
        System.out.println(Game.points);
    }

    @FXML
    void button4() {

        if (!Game.dialogs[Game.sceneNum].options[3].equals("")){
            Game.dialogs[Game.sceneNum].choice = 3;
            Game.points += Game.dialogs[Game.sceneNum].bonusPoints[3];


            Game.sceneNum = Game.dialogs[Game.sceneNum].nextDialog[3];
            Game.scene(text,choice1,choice2,choice3,choice4);

        }

        System.out.println("B4 works");
        System.out.println(Game.points);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("src/main/resources/game/kivita/chasutnakivitata/pictures/krasi.png");
        Image image = new Image(file.toURI().toString());
        leftpic.setImage(image);
        Game.scene(text,choice1,choice2,choice3,choice4);
    }
}