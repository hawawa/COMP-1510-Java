/**
 * 
 */
package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;

/**
 * Face is a program to draw my face.
 * @author Chih-Hsi Chang
 * @version 2017-10-04
 */
public class Face extends Application {

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        /* draw a my face.
         * 
         */  
                
        //face
        Ellipse face = new Ellipse(175, 250, 110, 160);
        face.setFill(Color.rgb(255, 203, 129));
        
        //eyes
        Circle eye1 = new Circle(170, 220, 10);
        Circle eye2 = new Circle(240, 220, 10);
        Group eyes = new Group(eye1, eye2);
        
        //nose
        Polygon nose = new Polygon(190, 255, 190, 290, 210, 280);
        
        //ear
        Ellipse ear = new Ellipse(55, 235, 20, 30);
        
        //month
        Ellipse month1 = new Ellipse(195, 320, 60, 40);
        Ellipse month2 = new Ellipse(193, 310, 60, 40);
        month2.setFill(Color.rgb(255, 203, 129));
        Group month = new Group(month1, month2);
        
        //hat
        Polygon hat1 = new Polygon(125, 80, 225, 80, 280, 160, 70, 160);
        Rectangle hat2 = new Rectangle(70, 160, 270, 20);
        Group hat = new Group(hat1, hat2);
        hat.setTranslateX(5);
        
        //glasses
        Ellipse glasses1 = new Ellipse(170, 220, 25, 15);
        glasses1.setFill(null);
        glasses1.setStroke(Color.BLACK);
        glasses1.setStrokeWidth(2);
        Ellipse glasses2 = new Ellipse(240, 220, 25, 15);       
        glasses2.setFill(null);
        glasses2.setStroke(Color.BLACK);
        glasses2.setStrokeWidth(2);
        Line glasses3 = new Line(195, 220, 215, 220);
        glasses3.setFill(null);
        glasses3.setStroke(Color.BLACK);
        glasses3.setStrokeWidth(2);
        Line glasses4 = new Line(145, 220, 60, 217);
        glasses4.setFill(null);
        glasses4.setStroke(Color.BLACK);
        glasses4.setStrokeWidth(2);
        Line glasses5 = new Line(265, 220, 287, 215);
        glasses5.setFill(null);
        glasses5.setStroke(Color.BLACK);
        glasses5.setStrokeWidth(2);
        Group glasses = new Group(glasses1, glasses2,
                glasses3, glasses4, glasses5);
        glasses.setTranslateX(-5);
        
        //all
        Group all = new Group(ear, face, eyes, month, nose, glasses, hat);
        Scene scene = new Scene(all, 350, 500, Color.LIGHTBLUE);
        primaryStage.setTitle("My Self-Portrait!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        launch(args);

    }

}
