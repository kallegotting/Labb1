package Labb1GUI;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class TOMTEFAR extends ImageView {
    private double x_speed = 10;
    private int width = 1800;
    private int height = 893;
    private int theSize = 100;
    private ArrayList<TOMTEFAR> others;

    public TOMTEFAR(ArrayList<TOMTEFAR> others){
        super();
        this.setImage(new Image("file:images/Run (1).png"));
        this.setFitWidth(200);
        this.setPreserveRatio(true);
        this.others = others;

        super.setX(600);
    }

    public void move(){
        super.setX(super.getX() + this.x_speed);

        if (super.getX() <= 0){
            super.setX(0);
            this.x_speed = -this.x_speed;
        }
        if (super.getX() >= 1800 - this.getFitWidth()){
            super.setX(1800 - this.getFitWidth());
            this.x_speed = - this.x_speed;
        }

        for(TOMTEFAR t: others) {
            if(t != this && t.intersects(super.getLayoutBounds())) {
                double tempx = this.x_speed;
                this.x_speed = t.x_speed;
                t.x_speed = tempx;
                break;
            }
        }

        }
    }

