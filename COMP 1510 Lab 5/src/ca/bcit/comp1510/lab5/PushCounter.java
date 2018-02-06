package ca.bcit.comp1510.lab5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * <p>Creates YES and NO counters.</p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class PushCounter extends Application {
    
    /** Holds the number of time the YES button is pressed. */
    private int countY;
    /** Holds the number of time the NO button is pressed. */
    private int countN;
    
    /** Displays the number of times the YES button is pressed. */
    private Text countTextY;
    /** Displays the number of times the NO button is pressed. */
    private Text countTextN;

    /** Holds a string representing the count number you enter. */
    private TextField setCounter;
    
    
    /**
     * Presents a GUI containing four buttons and texts that display
     * how many times the YES and NO button are pushed.
     * @param primaryStage as a Stage
     */
    public void start(Stage primaryStage) {        
        //YES counter
        countY = 0;
        countTextY = new Text("YES: 0");
        //add
        Button pushY = new Button("YES");
        pushY.setOnAction(this::processButtonPressY); // Wow!
        //minus
        Button decrementY = new Button("-");
        decrementY.setOnAction(this::processButtonPressYMinus); // Wow!

        //NO counter
        countN = 0;
        countTextN = new Text("NO: 0");
        //add
        Button pushN = new Button("NO");
        pushN.setOnAction(this::processButtonPressN); // Wow!
        //minus
        Button decrementN = new Button("-");
        decrementN.setOnAction(this::processButtonPressNMinus); // Wow!
        
        //sets the text you can enter
        setCounter = new TextField();
        setCounter.setOnAction(this::processReturn); // Wow!
        //a label for description of setting function
        Label setCounterLable = new Label("Set the Counters:");
        
        //display all buttons and a text field
        FlowPane pane = new FlowPane(pushY, decrementY, countTextY,
                pushN, decrementN, countTextN, setCounterLable, setCounter);
        pane.setAlignment(Pos.CENTER);

        final int horizontalGap = 20;
        pane.setHgap(horizontalGap);
        pane.setStyle("-fx-background-color: cyan");

        final int appWidth = 350;
        final int appHeight = 100;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Updates the counter and text when the YES button is pushed.
     * @param event invokes this method
     */
    public void processButtonPressY(ActionEvent event) {
        countY++;
        countTextY.setText("YES: " + countY);
    }
    /**
     * Updates the counter and text when the minus of YES button is pushed.
     * @param event invokes this method
     */
    public void processButtonPressYMinus(ActionEvent event) {
        countY--;
        countTextY.setText("YES: " + countY);
    }
    
    /**
     * Updates the counter and text when the NO button is pushed.
     * @param event invokes this method
     */    
    public void processButtonPressN(ActionEvent event) {
        countN++;
        countTextN.setText("NO: " + countN);
    }
    /**
     * Updates the counter and text when the minus of NO button is pushed.
     * @param event invokes this method
     */
    public void processButtonPressNMinus(ActionEvent event) {
        countN--;
        countTextN.setText("NO: " + countN);
    }
    /**
     * Updates the counter and text when the YES button is pushed.
     * @param event invokes this method
     */
    /**
     * Display the specific count numbers for YES and NO 
     * when user enter in the text field.
     * 
     * @param event invokes this method
     */
    public void processReturn(ActionEvent event) {
        countY = Integer.parseInt(setCounter.getText());
        countN = Integer.parseInt(setCounter.getText());
        setCounter.setText(null);
        countTextN.setText("NO: " + countN);
        countTextY.setText("YES: " + countY);
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

