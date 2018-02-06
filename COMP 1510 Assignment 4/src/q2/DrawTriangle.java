package q2;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * <p>
 * Draws an equilateral triangle using a rubber banding technique.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class DrawTriangle extends Application {
        
    /** The contents of the application scene. */
    private Group root;

    /** center point. */
    private Point2D center;
    /** circle to move to first mouse click location. */
    private Circle atCenter;
    
    /** First point of the equilateral triangle.*/
    private Point2D point1;
    /** Second point of the equilateral triangle.*/
    private Point2D point2;
    /** Third point of the equilateral triangle.*/
    private Point2D point3;
    
    /** First line of the equilateral triangle.*/
    private Line line1;
    /** Second line of the equilateral triangle.*/
    private Line line2;
    /** Third line of the equilateral triangle.*/
    private Line line3;
   
    /**
     * Displays an initially empty scene, waiting for the user to draw lines
     * with the mouse.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        root = new Group();
        

        final int appWidth = 800;
        final int appHeight = 500;
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);
        
        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseDragged(this::processMouseDrag);

        primaryStage.setTitle("Equilateral Triangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * Adds a new equilateral triangle 
     * to the scene when the mouse button is pressed.
     * 
     * @param event
     *            invoked this method
     */
    public void processMousePress(MouseEvent event) {
        final int radius = 3;
        atCenter = new Circle(event.getX(), event.getY(), radius);
        atCenter.setFill(Color.CYAN);
        root.getChildren().add(atCenter);
        
        center = new Point2D(event.getX(), event.getY());
        line1 = new Line(event.getX(), event.getY(),
                event.getX(), event.getY());
        line1.setStroke(Color.CYAN);
        final int strokeWidth = 3;
        line1.setStrokeWidth(strokeWidth);
        root.getChildren().add(line1);
        
        line2 = new Line(event.getX(), event.getY(),
                event.getX(), event.getY());
        line2.setStroke(Color.CYAN);
        line2.setStrokeWidth(strokeWidth);
        root.getChildren().add(line2);
        
        line3 = new Line(event.getX(), event.getY(),
                event.getX(), event.getY());
        line3.setStroke(Color.CYAN);
        line3.setStrokeWidth(strokeWidth);
        root.getChildren().add(line3);

    }
    
    /**
     * Updates the size and orientation of 
     * the current equilateral triangle as the mouse is dragged,
     * creating the rubber band effect.
     * 
     * @param event
     *            invoked this method
     */
    public void processMouseDrag(MouseEvent event) {
        point1 = new Point2D(event.getX(), event.getY());
        Point2D point1Move = point1.subtract(center);
        
        double angle = point1Move.angle(1, 0);
        if (point1Move.getY() < 0) {
            angle = -point1Move.angle(1, 0);
        }
        
        
        double distance =  center.distance(point1);
        final int changeAngle1 = 120;
        final int changeAngle2 = 240;
        final int piAngle = 180;
        double x2 = distance 
                * Math.cos((angle + changeAngle1) / piAngle * Math.PI);
        double y2 = distance 
                * Math.sin((angle + changeAngle1) / piAngle * Math.PI);
        double x3 = distance 
                * Math.cos((angle + changeAngle2) / piAngle * Math.PI);
        double y3 = distance 
                * Math.sin((angle + changeAngle2) / piAngle * Math.PI);
        point2 = new Point2D(x2 + center.getX(), y2 + center.getY());
        point3 = new Point2D(x3 + center.getX(), y3 + center.getY());
        
        line1.setStartX(point1.getX());
        line1.setStartY(point1.getY());
        line1.setEndX(point2.getX());
        line1.setEndY(point2.getY());
        
        line2.setStartX(point2.getX());
        line2.setStartY(point2.getY());
        line2.setEndX(point3.getX());
        line2.setEndY(point3.getY());
        
        line3.setStartX(point3.getX());
        line3.setStartY(point3.getY());
        line3.setEndX(point1.getX());
        line3.setEndY(point1.getY());
        

    }


    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

