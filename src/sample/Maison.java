package sample;

import javafx.scene.Group;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Maison extends Group {

    Font font = Font.font("Arial");

    public Maison() {}

    public void creerMaisonJour() {
        Rectangle maison = new Rectangle(162,220,105,63);
        maison.setFill(Color.BEIGE);
        DropShadow shadowHouse = new DropShadow();
        shadowHouse.setBlurType(BlurType.ONE_PASS_BOX);
        shadowHouse.setColor(Color.GREY);
        shadowHouse.setOffsetX(-10);
        shadowHouse.setOffsetY(10);
        maison.setEffect(shadowHouse);
        getChildren().add(maison);
    }

    public void creerToitJour() {
        Polygon toit = new Polygon(154, 220, 275, 220, 214, 160);
        toit.setFill(Color.BROWN);
        getChildren().add(toit);
    }

    public void creerPorteJour() {
        Rectangle porte = new Rectangle(183, 246, 24, 37);
        porte.setFill(Color.SADDLEBROWN);
        Circle poignee = new Circle(200, 264, 5, Color.YELLOWGREEN);
        getChildren().add(porte);
        getChildren().add(poignee);
    }

    public void creerFenetreJour() {
        Rectangle fenetre = new Rectangle(223, 235, 35, 22);
        fenetre.setFill(Color.AQUA);
        fenetre.setStroke(Color.DARKGRAY);
        fenetre.setStrokeWidth(2);
        Line ligneFenetre1 = new Line(223, 246, 258, 246);
        ligneFenetre1.setStroke(Color.DARKGRAY);
        ligneFenetre1.setStrokeWidth(2);
        Line ligneFenetre2 = new Line(240, 235, 240, 257);
        ligneFenetre2.setStroke(Color.DARKGRAY);
        ligneFenetre2.setStrokeWidth(2);
        getChildren().add(fenetre);
        getChildren().add(ligneFenetre1);
        getChildren().add(ligneFenetre2);
    }

    public void creerRayonsSoleil() {
        Line ligne0 = new Line(342, 0, 342, 30);
        ligne0.setStroke(Color.YELLOW);
        getChildren().add(ligne0);
        Line ligne6 = new Line(342, 120, 342, 150);
        ligne6.setStroke(Color.YELLOW);
        getChildren().add(ligne6);
        Line ligne3 = new Line(387, 75, 417, 75);
        ligne3.setStroke(Color.YELLOW);
        getChildren().add(ligne3);
        Line ligne9 = new Line(267, 75, 297, 75);
        ligne9.setStroke(Color.YELLOW);
        getChildren().add(ligne9);

        Line ligne2 = new Line(400, 20, 377, 40);
        ligne2.setStroke(Color.YELLOW);
        getChildren().add(ligne2);
        Line ligne10 = new Line(284, 20, 307, 40);
        ligne10.setStroke(Color.YELLOW);
        getChildren().add(ligne10);
        Line ligne5 = new Line(400, 130, 377, 110);
        ligne5.setStroke(Color.YELLOW);
        getChildren().add(ligne5);
        Line ligne7 = new Line(284, 130, 307, 110);
        ligne7.setStroke(Color.YELLOW);
        getChildren().add(ligne7);
    }

    public void texteJour() {
        Text texteJour = new Text(192, 345, "Jour");
        texteJour.setScaleX(4);
        texteJour.setScaleY(4);
        texteJour.setFont(font);
        getChildren().add(texteJour);
    }

    public void creerMaisonNuit() {
        Rectangle maison2 = new Rectangle(587,220,105,63);
        maison2.setFill(Color.BEIGE);
        getChildren().add(maison2);
    }

    public void creerToitNuit() {
        Polygon toit2 = new Polygon(579, 220, 700, 220, 639, 160);
        toit2.setFill(Color.BROWN);
        getChildren().add(toit2);
    }

    public void creerPorteNuit() {
        Rectangle porte2 = new Rectangle(608, 246, 24, 37);
        porte2.setFill(Color.SADDLEBROWN);
        Circle poignee2 = new Circle(625, 264, 5, Color.YELLOWGREEN);
        getChildren().add(porte2);
        getChildren().add(poignee2);
    }

    public void creerFenetreNuit() {
        Rectangle fenetre = new Rectangle(648, 235, 35, 22);
        fenetre.setFill(Color.AQUA);
        fenetre.setStroke(Color.DARKGRAY);
        fenetre.setStrokeWidth(2);
        Line ligneFenetre1 = new Line(648, 246, 683, 246);
        ligneFenetre1.setStroke(Color.DARKGRAY);
        ligneFenetre1.setStrokeWidth(2);
        Line ligneFenetre2 = new Line(665, 235, 665, 257);
        ligneFenetre2.setStroke(Color.DARKGRAY);
        ligneFenetre2.setStrokeWidth(2);
        getChildren().add(fenetre);
        getChildren().add(ligneFenetre1);
        getChildren().add(ligneFenetre2);
    }

    public void texteNuit() {
        Text texteNuit = new Text(625, 345, "Jour");
        texteNuit.setScaleX(4);
        texteNuit.setScaleY(4);
        texteNuit.setFont(font);
        texteNuit.setFill(Color.WHITE);
        getChildren().add(texteNuit);
    }

    public void creerSceneDeJour() {
        creerMaisonJour();
        creerToitJour();
        creerPorteJour();
        creerFenetreJour();
        texteJour();
    }

    public void creerSceneDeNuit() {
        creerMaisonNuit();
        creerToitNuit();
        creerPorteNuit();
        creerFenetreNuit();
        texteNuit();
    }
}