package game.kivita.chasutnakivitata.Controllers;

import game.kivita.chasutnakivitata.Game.Content;
import game.kivita.chasutnakivitata.Game.ContentManagement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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
    void button1(ActionEvent event) throws IOException, SQLException {

        if (!Content.dialogs[Content.sceneNum].options[0].equals("")){

            Content.points += Content.dialogs[Content.sceneNum].bonusPoints[0];


            Content.sceneNum = Content.dialogs[Content.sceneNum].nextDialog[0];
            ContentManagement.scene(event,text,choice1,choice2,choice3,choice4,leftpic,rightpic,background);

        }

    }

    @FXML
    void button2(ActionEvent event) throws IOException, SQLException {

        if (!Content.dialogs[Content.sceneNum].options[1].equals("")){

            Content.points += Content.dialogs[Content.sceneNum].bonusPoints[1];


            Content.sceneNum = Content.dialogs[Content.sceneNum].nextDialog[1];
            ContentManagement.scene(event,text,choice1,choice2,choice3,choice4,leftpic,rightpic,background);
        }

    }

    @FXML
    void button3(ActionEvent event) throws IOException, SQLException {

        if (!Content.dialogs[Content.sceneNum].options[2].equals("")){

            Content.points += Content.dialogs[Content.sceneNum].bonusPoints[2];


            Content.sceneNum = Content.dialogs[Content.sceneNum].nextDialog[2];
            ContentManagement.scene(event,text,choice1,choice2,choice3,choice4,leftpic,rightpic,background);
        }

    }

    @FXML
    void button4(ActionEvent event) throws IOException, SQLException {

        if (!Content.dialogs[Content.sceneNum].options[3].equals("")){

            Content.points += Content.dialogs[Content.sceneNum].bonusPoints[3];


            Content.sceneNum = Content.dialogs[Content.sceneNum].nextDialog[3];
            ContentManagement.scene(event,text,choice1,choice2,choice3,choice4,leftpic,rightpic,background);

        }

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ActionEvent event = null;
        try {
            ContentManagement.scene(event,text,choice1,choice2,choice3,choice4,leftpic,rightpic,background);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }


}