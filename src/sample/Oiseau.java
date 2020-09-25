package sample;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;

public class Oiseau extends Group {

    public void creerAile1() {
        QuadCurve aile1 = new QuadCurve(50,100,65,75,72,100);
        aile1.setStroke(Color.BLACK);
        aile1.setFill(Color.LIGHTGREY);
        aile1.setStrokeWidth(1);
        getChildren().add(aile1);
    }

    public void creerAile2() {
        QuadCurve aile2 = new QuadCurve(72,100,79,75,94,100);
        aile2.setStroke(Color.BLACK);
        aile2.setFill(Color.LIGHTGREY);
        aile2.setStrokeWidth(1);
        getChildren().add(aile2);
    }

    public void creerAile3() {
        QuadCurve aile3 = new QuadCurve(120,75,135,60,142,75);
        aile3.setStroke(Color.BLACK);
        aile3.setFill(Color.LIGHTGREY);
        aile3.setStrokeWidth(1);
        getChildren().add(aile3);
    }

    public void creerAile4() {
        QuadCurve aile4 = new QuadCurve(142,75,149,60,164,75);
        aile4.setStroke(Color.BLACK);
        aile4.setFill(Color.LIGHTGREY);
        aile4.setStrokeWidth(1);
        getChildren().add(aile4);
    }

    public void creerOiseau1(){
        creerAile1();
        creerAile2();
    }

    public void creerOiseau2() {
        creerAile3();
        creerAile4();
    }
}