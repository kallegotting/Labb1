package Labb1GUI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Uppgift3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Image theImage = new Image("file:images/stallet.png");
        ImageView theIV = new ImageView(theImage);

        Group root = new Group();
        root.getChildren().addAll(theIV);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Slottsstallarna");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
