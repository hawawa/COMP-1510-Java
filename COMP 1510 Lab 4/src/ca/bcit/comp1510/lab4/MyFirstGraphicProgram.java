/**
 * 
 */
package ca.bcit.comp1510.lab4;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 * MyFirstGraphicProgram is a program for practice JavaFX.
 * @author Chih-Hsi Chang
 * @version 2017-10-04
 */
public class MyFirstGraphicProgram extends Application {

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        final int circle1x = 250;
        final int circle1y = 250;
        final int circle1r = 100;
        final int myNamex = 230;
        final int myNamey = 250;
        final int scenex = 500;
        final int sceney = 500;
        
        Circle circle1 = new Circle(circle1x, circle1y, circle1r);
        circle1.setFill(Color.GREEN);
        Text myName = new Text(myNamex, myNamey, "Chih-Hsi");
        myName.setFill(Color.WHITE);
        Group group1 = new Group(circle1, myName);
        Scene scene = new Scene(group1, scenex, sceney);

        primaryStage.setTitle("My first JavaFX program");
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
