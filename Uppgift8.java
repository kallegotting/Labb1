package Labb1;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Uppgift8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ArrayList<Image> tomteSpringer = new ArrayList<>();
        tomteSpringer.add(new Image("file:images/Run (1).png"));
        tomteSpringer.add(new Image("file:images/Run (2).png"));
        tomteSpringer.add(new Image("file:images/Run (3).png"));
        tomteSpringer.add(new Image("file:images/Run (4).png"));
        tomteSpringer.add(new Image("file:images/Run (5).png"));
        tomteSpringer.add(new Image("file:images/Run (6).png"));
        tomteSpringer.add(new Image("file:images/Run (7).png"));
        tomteSpringer.add(new Image("file:images/Run (8).png"));
        tomteSpringer.add(new Image("file:images/Run (9).png"));
        tomteSpringer.add(new Image("file:images/Run (10).png"));
        tomteSpringer.add(new Image("file:images/Run (11).png"));

        ImageView tomten = new ImageView();
        tomten.setImage(tomteSpringer.get(0));
        tomten.setFitHeight(170);
        tomten.setFitWidth(170);
        tomten.setX(90);

        Group root = new Group();

        Image bg = new Image("file:images/BG.png");
        ImageView imageView = new ImageView(bg);
        imageView.setPreserveRatio(true);

        Image left = new Image("file:images/1.png");
        ImageView ivLeft = new ImageView(left);
        ivLeft.setX(0);
        ivLeft.setY(670);

        Image center1 = new Image("file:images/2.png");
        ImageView ivCenter1 = new ImageView(center1);
        ivCenter1.setX(120);
        ivCenter1.setY(670);

        Image center2 = new Image("file:images/2.png");
        ImageView ivCenter2 = new ImageView(center2);
        ivCenter2.setX(240);
        ivCenter2.setY(670);

        Image center3 = new Image("file:images/2.png");
        ImageView ivCenter3 = new ImageView(center3);
        ivCenter3.setX(360);
        ivCenter3.setY(670);

        Image center4 = new Image("file:images/2.png");
        ImageView ivCenter4 = new ImageView(center4);
        ivCenter4.setX(480);
        ivCenter4.setY(670);

        Image center5 = new Image("file:images/2.png");
        ImageView ivCenter5 = new ImageView(center5);
        ivCenter5.setX(600);
        ivCenter5.setY(670);

        Image center6 = new Image("file:images/2.png");
        ImageView ivCenter6 = new ImageView(center6);
        ivCenter6.setX(720);
        ivCenter6.setY(670);

        Image center7 = new Image("file:images/2.png");
        ImageView ivCenter7 = new ImageView(center7);
        ivCenter7.setX(840);
        ivCenter7.setY(670);

        Image center8 = new Image("file:images/2.png");
        ImageView ivCenter8 = new ImageView(center8);
        ivCenter8.setX(960);
        ivCenter8.setY(670);

        Image right = new Image("file:images/3.png");
        ImageView ivRight = new ImageView(right);
        ivRight.setX(1085);
        ivRight.setY(670);

        Image Snogubbe = new Image("file:images/SnowMan.png");
        ImageView ivSnogubbe = new ImageView(Snogubbe);
        ivSnogubbe.setX(5);
        ivSnogubbe.setY(470);

        Image Igloo = new Image("file:images/Igloo.png");
        ImageView ivIgloo = new ImageView(Igloo);
        ivIgloo.setX(950);
        ivIgloo.setY(470);

        root.getChildren().addAll(imageView, ivLeft, ivCenter1, ivCenter2, ivCenter3, ivCenter4, ivCenter5, ivCenter6, ivCenter7, ivCenter8, ivRight, ivSnogubbe, ivIgloo, tomten);

        Scene scene = new Scene(root, 1210, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tomten springer som om det inte finns en morgondag!");
        primaryStage.show();


        new AnimationTimer(){
            boolean right = true;
            int x = 0;
            int y = 525;

            @Override
            public void handle(long arg0) {
                if (right){
                    tomten.setScaleX(1);
                    if (x <= 820)
                        x += 5;
                    else if (x >= 820)
                        right = false;
                    }else {
                        tomten.setScaleX(-1);
                        if (x >= 0)
                            x -=5;
                        else if (x <= 0)
                            right = true;

                    }

                tomten.setTranslateX(x);
                tomten.setTranslateY(y);

                }
            } .start();

        new AnimationTimer(){
            int x;

            @Override
            public void handle(long arg0) {
                x = (x + 1) % 11;
                tomten.setImage(tomteSpringer.get(x));
            }
        } .start();





    }
}
