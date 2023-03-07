package game.kivita.chasutnakivitata.Controllers;

import game.kivita.chasutnakivitata.Game.Content;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class GameController implements Initializable{
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
    private Text text;


    @FXML
    void button1() {

        if (!Content.dialogs[Content.sceneNum].options[0].equals("")){
            Content.dialogs[Content.sceneNum].choice = 0;
            Content.points = Content.points + Content.dialogs[Content.sceneNum].bonusPoints[0];


            Content.sceneNum = Content.dialogs[Content.sceneNum].nextDialog[0];
            Content.scene(text,choice1,choice2,choice3,choice4);
        }

        System.out.println("B1 works");
        System.out.println(Content.points);
    }

    @FXML
    void button2() {

        if (!Content.dialogs[Content.sceneNum].options[1].equals("")){
            Content.dialogs[Content.sceneNum].choice = 1;
            Content.points += Content.dialogs[Content.sceneNum].bonusPoints[1];


            Content.sceneNum = Content.dialogs[Content.sceneNum].nextDialog[1];
            Content.scene(text,choice1,choice2,choice3,choice4);
        }

        System.out.println("B2 works");
        System.out.println(Content.points);
    }

    @FXML
    void button3() {

        if (!Content.dialogs[Content.sceneNum].options[2].equals("")){
            Content.dialogs[Content.sceneNum].choice = 2;
            Content.points += Content.dialogs[Content.sceneNum].bonusPoints[2];


            Content.sceneNum = Content.dialogs[Content.sceneNum].nextDialog[2];
            Content.scene(text,choice1,choice2,choice3,choice4);
        }

        System.out.println("B3 works");
        System.out.println(Content.points);
    }

    @FXML
    void button4() {

        if (!Content.dialogs[Content.sceneNum].options[3].equals("")){
            Content.dialogs[Content.sceneNum].choice = 3;
            Content.points += Content.dialogs[Content.sceneNum].bonusPoints[3];


            Content.sceneNum = Content.dialogs[Content.sceneNum].nextDialog[3];
            Content.scene(text,choice1,choice2,choice3,choice4);

        }

        System.out.println("B4 works");
        System.out.println(Content.points);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File file = new File("src/main/resources/game/kivita/chasutnakivitata/pictures/krasi.png");
        Image image = new Image(file.toURI().toString());
        leftpic.setImage(image);
        Content.scene(text,choice1,choice2,choice3,choice4);
    }


}