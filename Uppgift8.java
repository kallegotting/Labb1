package Labb1GUI;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;

public class Uppgift8 extends Application {

    private ImageView tomte;
    private double x_speed = 10;
    private int width = 1800;
    private int height = 893;
    private int theSize = 100;


    public static void main(String[] args) {
        launch(args);
    }
    ArrayList<Image> tomteSpring = new ArrayList<>(567);

    @Override
    public void start(Stage primaryStage) {
        ArrayList<TOMTEFAR> tomtar = new ArrayList<>();

        Group root = new Group();


        for(int i = 0; i < 11; i++){
            tomtar.add(new TOMTEFAR(tomtar));
        }
        HBox vb1 = new HBox();
        //vb1.setAlignment(Pos.BASELINE_LEFT);
        vb1.getChildren().addAll(tomtar);



        tomteSpring.add(new Image("file:images/Run(1).png"));
        tomteSpring.add(new Image("file:images/Run(2).png"));
        tomteSpring.add(new Image("file:images/Run(3).png"));
        tomteSpring.add(new Image("file:images/Run(4).png"));
        tomteSpring.add(new Image("file:images/Run(5).png"));
        tomteSpring.add(new Image("file:images/Run(6).png"));
        tomteSpring.add(new Image("file:images/Run(7).png"));
        tomteSpring.add(new Image("file:images/Run(8).png"));
        tomteSpring.add(new Image("file:images/Run(9).png"));
        tomteSpring.add(new Image("file:images/Run(10).png"));
        tomteSpring.add(new Image("file:images/Run(11).png"));



        tomte = new ImageView(new Image("file:images/Run (1).png"));
        tomte.setFitWidth(200);
        tomte.setPreserveRatio(true);



        tomte.setX(100);
        tomte.setY(630);


        Image bakgrund = new Image("file:images/BG.png");
        ImageView theBakgrund = new ImageView(bakgrund);



        Image igloo = new Image("file:images/Igloo.png");
        ImageView theIgloo = new ImageView(igloo);
        theIgloo.setFitHeight(100);
        theIgloo.setFitWidth(175);
        theIgloo.setX(1620);
        theIgloo.setY(650);

        Image skylt = new Image("file:images/Sign_2.png");
        ImageView theSkylt = new ImageView(skylt);
        theSkylt.setY(660);

        Image vanster = new Image("file:images/1.png");
        ImageView theVanster = new ImageView(vanster);
        theVanster.setFitWidth(625);
        theVanster.setFitHeight(150);
        theVanster.setX(0);
        theVanster.setY(749);


        Image mitten = new Image("file:images/2.png");
        ImageView theMitten = new ImageView(mitten);
        theMitten.setFitWidth(600);
        theMitten.setFitHeight(150);
        theMitten.setX(625);
        theMitten.setY(749);

        Image hoger = new Image("file:images/3.png");
        ImageView theHoger = new ImageView(hoger);
        theHoger.setFitWidth(600);
        theHoger.setFitHeight(150);
        theHoger.setX(1225);
        theHoger.setY(749);


        root.getChildren().addAll(theBakgrund, theIgloo, theSkylt, theVanster, theMitten, theHoger, vb1);
        //root.getChildren().addAll(tomtar);

        Scene scene = new Scene(root, 1800, 893);
        primaryStage.setTitle("Tomten");
        primaryStage.setScene(scene);
        primaryStage.show();

        //KeyFrame k = new KeyFrame(Duration.millis(10), event -> {
        //            for(TOMTEFAR t: tomtar){
        //                t.move();
        //            }
        //        });


        KeyFrame k = new KeyFrame(Duration.millis(10), event -> {
                    for (int i = 0; i < tomteSpring.size(); i++){
                        tomte.setX(tomte.getX() + x_speed);
                        if (tomte.getX() <= 0  || tomte.getX() >= width - theSize*2) {
                            x_speed = - x_speed;
                            tomte.setScaleX(-1);
                        }

                    }

               });
        Timeline t = new Timeline(k);
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();

    }
}

//root.setBackground(new Background(new BackgroundImage(new Image("file:images/BG.png"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
//                BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false))));
//        root.setAlignment(Pos.TOP_LEFT);