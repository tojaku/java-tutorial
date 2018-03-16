package org.bsm.java.epizoda9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Osnove extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Pozdrav od JavaFX-a");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pozdrav od JavaFX-a");
            }
        });
        
        /*btn.setOnAction((ActionEvent event) -> {
            System.out.println("Pozdrav od JavaFX-a");
        });*/

        // moj gumb 1 - ne vidi se jer nije dodan u korijenski čvor
        Button gumb1 = new Button();
        gumb1.setText("Moj prvi gumb (koji se ne vidi)");

        // moj gumb 2 - vidi se, dodali smo ga u korijenski čvor
        Button gumb2 = new Button();
        gumb2.setText("Moj drugi gumb (koji se vidi) (:");

        // stvaranje korijenskog čvora
        StackPane root = new StackPane();
        //VBox root = new VBox();
        //FlowPane root = new FlowPane();
        //Group root = new Group();

        // punjenje korijenskog čvora
        root.getChildren().add(btn);

        // dodavanje gumba 2 u korijenski čvor
        root.getChildren().add(gumb2);
        gumb2.setLayoutX(100);
        gumb2.setLayoutY(100);

        // možemo dodati i više čvorova odjednom u korijenski čvor
        //root.getChildren().addAll(btn, gumb2);
        Scene scene = new Scene(root, 320, 240, Color.BLACK);

        primaryStage.setTitle("Prva JavaFX aplikacija");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
