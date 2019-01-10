package Labb1GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Uppgift4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox layout = new HBox();
        layout.setAlignment(Pos.BASELINE_CENTER);



        Button tryck = new Button("PUSH ME!!!");

        Label count = new Label();

        tryck.setOnMousePressed(event -> {
            int summa = 0;
            summa++;
            count.setText(String.valueOf(summa));

        });




        layout.getChildren().addAll(tryck, count);

        Scene scene = new Scene(layout,200, 80);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Räknare");
        primaryStage.show();

    }
}
