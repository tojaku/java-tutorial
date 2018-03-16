package org.bsm.java.epizoda9;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class GrafikaAudioMis extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        Image slika1 = new Image(getClass().getResource("avion.png").toString());
        ImageView iw1 = new ImageView(slika1);

        // skaliranje slike
        iw1.setPreserveRatio(true);
        iw1.setFitWidth(200);
        root.getChildren().add(iw1);

        Image slika2 = new Image(getClass().getResource("oblaci.png").toString());
        ImageView iw2 = new ImageView(slika2);
        iw2.setPreserveRatio(true);
        iw2.setFitWidth(125);
        root.getChildren().add(iw2);

        iw2.toBack();

        iw1.setOnMousePressed((event) -> {
            AudioClip audio = new AudioClip(getClass().getResource("avion.mp3").toString());
            audio.play();

            System.out.println("Pritisnuli ste koordinatu u aplikaciji: "
                    + event.getSceneX() + ", " + event.getSceneY());
            System.out.println("Pritisnuli ste koordinatu na ekranu: "
                    + event.getScreenX() + ", " + event.getScreenY());
        });

        Scene scene = new Scene(root, 320, 240);

        primaryStage.setTitle("Grafika, zvuk i miš");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
