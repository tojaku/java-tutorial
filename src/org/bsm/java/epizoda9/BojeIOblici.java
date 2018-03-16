package org.bsm.java.epizoda9;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BojeIOblici extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        /* stvaramo oblik - pravokutnik na koordinate (20, 20) širine 100 i
           visine 200 */
        Rectangle pravokutnik1 = new Rectangle(20, 20, 100, 200);

        // definiramo boje kao varijable
        Color bojaIspune = Color.rgb(100, 200, 175, 0.5);
        Color bojaObruba = Color.BLUEVIOLET;

        // postavljamo ispunu i obrub pravokutnika
        pravokutnik1.setFill(bojaIspune);
        pravokutnik1.setStroke(bojaObruba);
        pravokutnik1.setStrokeWidth(10);

        // mijenjamo položaj pravokutnika
        pravokutnik1.setX(100);
        pravokutnik1.setY(50);
        root.getChildren().add(pravokutnik1);

        // linearni gradijent
        LinearGradient gradient1 = new LinearGradient(0, 0, 1, 0, true,
                CycleMethod.NO_CYCLE, new Stop[]{
                    new Stop(0, Color.RED),
                    new Stop(1, Color.ORANGE)
                });

        // trokut
        Polygon trokut1 = new Polygon(new double[]{
            45, 10,
            10, 80,
            80, 80,});
        trokut1.setFill(gradient1);
        
        // dodavanje trokuta u korjenski čvor
        root.getChildren().add(trokut1);
        
        // promjena položaja trokuta
        //trokut1.setX(200);
        //trokut1.setY(200);
        trokut1.setLayoutX(100);
        trokut1.setLayoutY(100);

        Scene scene = new Scene(root, 320, 240);

        primaryStage.setTitle("Boje i oblici");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
