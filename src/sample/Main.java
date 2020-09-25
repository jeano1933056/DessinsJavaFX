package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        window.setWidth(850);
        window.setHeight(425);
        window.setTitle("Dessins!");
        window.setResizable(false);

        //JOUR
        Oiseau oiseau1 = new Oiseau();
        Oiseau oiseau2 = new Oiseau();
        Maison maisonjour = new Maison();
        Maison maisonNuit = new Maison();
        Maison lesRayonsMdr = new Maison();
        maisonjour.creerSceneDeJour();
        maisonNuit.creerSceneDeNuit();

        Circle soleil = new Circle(342, 75,35);
        soleil.setFill(Color.YELLOW);

        Rectangle nuit = new Rectangle(425,0 ,425,425);

        Timeline tempsSoleil = new Timeline();
        tempsSoleil.setCycleCount(Timeline.INDEFINITE);
        KeyValue key1 = new KeyValue(soleil.fillProperty(), Color.YELLOW, Interpolator.EASE_IN);
        KeyFrame keyf1 = new KeyFrame(Duration.seconds(1.5), key1);
        KeyValue key2 = new KeyValue(soleil.fillProperty(), Color.ORANGE, Interpolator.EASE_IN);
        KeyFrame keyf2 = new KeyFrame(Duration.seconds(4), key2);
        KeyValue key3 = new KeyValue(soleil.fillProperty(), Color.YELLOW, Interpolator.EASE_BOTH);
        KeyFrame keyf3 = new KeyFrame(Duration.seconds(8), key3);

        tempsSoleil.getKeyFrames().addAll(keyf1,keyf2, keyf3);
        tempsSoleil.play();

        lesRayonsMdr.creerRayonsSoleil();

        RotateTransition rt = new RotateTransition(Duration.seconds(5), lesRayonsMdr);
        rt.setToAngle(720);
        rt.setInterpolator(Interpolator.LINEAR);
        rt.setCycleCount(Animation.INDEFINITE);
        rt.setAutoReverse(false);
        rt.play();

        oiseau1.creerOiseau1();
        oiseau2.creerOiseau2();

        TranslateTransition bougeAile = new TranslateTransition(Duration.seconds(3), oiseau1);
        bougeAile.setByY(35);
        bougeAile.setInterpolator(Interpolator.EASE_IN);
        bougeAile.setCycleCount(Timeline.INDEFINITE);
        bougeAile.setAutoReverse(true);
        bougeAile.play();

        TranslateTransition bougeAile2 = new TranslateTransition(Duration.seconds(2), oiseau2);
        bougeAile2.setByY(35);
        bougeAile2.setInterpolator(Interpolator.EASE_IN);
        bougeAile2.setCycleCount(Timeline.INDEFINITE);
        bougeAile2.setAutoReverse(true);
        bougeAile2.play();

        //NUIT
        Circle lune = new Circle(767, 75,35);
        Stop []stops2 = new Stop[]{
                new Stop(0, Color.WHITE),
                new Stop(1, Color.BLACK),
        };
        LinearGradient luneGradue = new LinearGradient(
                0,0,
                1,1,
                true,
                CycleMethod.NO_CYCLE,
                stops2
        );
        lune.setFill(luneGradue);

        Polygon etoile1 = new Polygon(475, 50, 493, 50, 500, 32, 507, 50, 525, 50, 513, 63, 517, 80,
                500, 70, 483, 80, 487, 63);
        etoile1.setFill(Color.YELLOW);

        Timeline tempsEtoile = new Timeline();
        tempsEtoile.setCycleCount(Timeline.INDEFINITE);
        KeyValue key4 = new KeyValue(etoile1.fillProperty(), Color.YELLOW, Interpolator.EASE_IN);
        KeyFrame keyf4 = new KeyFrame(Duration.seconds(1.5), key4);
        KeyValue key5 = new KeyValue(etoile1.fillProperty(), Color.BLACK, Interpolator.EASE_IN);
        KeyFrame keyf5 = new KeyFrame(Duration.seconds(4), key5);
        KeyValue key6 = new KeyValue(etoile1.fillProperty(), Color.YELLOW, Interpolator.EASE_BOTH);
        KeyFrame keyf6 = new KeyFrame(Duration.seconds(8), key6);

        tempsEtoile.getKeyFrames().addAll(keyf4,keyf5, keyf6);
        tempsEtoile.play();

        // window.
        Group root = new Group(maisonjour, nuit, maisonNuit, soleil, lesRayonsMdr, oiseau1, oiseau2, lune, etoile1);
        Scene scene = new Scene(root, window.getWidth(), window.getHeight(), Color.LIGHTGRAY);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}