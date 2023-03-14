package game.kivita.chasutnakivitata.Controllers;

import game.kivita.chasutnakivitata.Game.Content;
import game.kivita.chasutnakivitata.Methods;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ResultController implements Initializable {
    @FXML
    private Button exit;

    @FXML
    private Button scoreboard;

    @FXML
    private Text text;

    @FXML
    private ImageView img;

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

        if(Content.points >= 100){          //Poveche ot perfekten
            text.setText("Краси е смаян от работата ти, той смята че имаш голям потенциал като програмист.\n" +
                    "Точки:" + Content.points);

        }else if(Content.points >= 92){     //otlichen
            text.setText("Краси смята че си се справил страхотно, продължавай все така.\n" +
                    "Points:" + Content.points);

        }else if(Content.points >= 75){     //mn dobur
            text.setText("Краси смята че имаш малки пропуски по проекта, но това няма да пречи на твоето бъдещо развитие.\n" +
                    "Точки:" + Content.points);

        }else if(Content.points >= 59){     //dobur
            text.setText("Краси смята че не си покрил много от изискванията по проекта и се надява следващият път да положиш повече усилия.\n" +
                    "Точки:" + Content.points);

        }else if(Content.points >= 50){     //sreden
            text.setText("Краси се радва че си скалъпил поне нещо, за да не те вижда лятото.\n" +
                    "Точки:" + Content.points);

        }else if(Content.points >= 0){      //slab
            text.setText("Краси смята че ще се видите отново през лятото.\n" +
                    "Точки:" + Content.points);

        }else{                              //yjas
            text.setText("Краси е потресeн, не знае как си успял да изкараш отрицателен брой точки, никога не е срещал такъв балък като теб в живота си. Даже не се и опита.\n" +
                    "Точки:" + Content.points);
        }

        if (Content.points >=59){
            img.setImage(new Image(Objects.requireNonNull(Content.class.getResourceAsStream(
                    "/game/kivita/chasutnakivitata/pictures/Characters/FinalKrasiThumbsUp.png"))));
        }else {
            img.setImage(new Image(Objects.requireNonNull(Content.class.getResourceAsStream(
                    "/game/kivita/chasutnakivitata/pictures/Characters/FinalKrasiNotHappy.png"))));
        }

    }
}
