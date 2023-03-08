package game.kivita.chasutnakivitata.Game;

import game.kivita.chasutnakivitata.Methods;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Objects;

import static game.kivita.chasutnakivitata.Game.Content.*;

public class ContentManagement {
    public static void scene(ActionEvent event,Text text, Button choice1, Button choice2, Button choice3, Button choice4, ImageView leftPic, ImageView rightPic, ImageView background) throws IOException {

        if (sceneNum == 99999){
            Methods.changeStage(event, "Result.fxml", 1280,720);
            return;
        }

        text.setText(dialogs[sceneNum].text);
        choice1.setText(dialogs[sceneNum].options[0]);
        choice2.setText(dialogs[sceneNum].options[1]);
        choice3.setText(dialogs[sceneNum].options[2]);
        choice4.setText(dialogs[sceneNum].options[3]);


        if (dialogs[sceneNum].leftPic.equals("null.png")){
            leftPic.setImage(new Image(Objects.requireNonNull(Content.class.getResourceAsStream(
                    "/game/kivita/chasutnakivitata/pictures/Characters/null.png"))));
        }else {
            leftPic.setImage(new Image(Objects.requireNonNull(Content.class.getResourceAsStream(
                    "/game/kivita/chasutnakivitata/pictures/Characters/" + character + dialogs[sceneNum].leftPic))));
        }
        rightPic.setImage(new Image(Objects.requireNonNull(Content.class.getResourceAsStream(
                "/game/kivita/chasutnakivitata/pictures/Characters/" + dialogs[sceneNum].rightPic))));

        background.setImage(new Image(Objects.requireNonNull(Content.class.getResourceAsStream(
                "/game/kivita/chasutnakivitata/pictures/Backgrounds/" + dialogs[sceneNum].background + ".jpg"))));

    }
}
