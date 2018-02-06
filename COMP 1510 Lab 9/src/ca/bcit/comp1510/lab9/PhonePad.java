/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * <p>
 * Creates a phone pad.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class PhonePad extends Application {
    /** Holds the result for showing. */
    private String result = "";
    /** Holds a label of the result. */
    private Label numberLabel = new Label(result);
    /** Holds an ArrayList for Buttons. */
    private ArrayList<Button> buttonList = new ArrayList<Button>();

    /**
     * Presents a GUI containing 12 buttons and
     * a label that displays the buttons are pressed.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        String allPadNumber = "123456789*0#";
        String padNumber;
        GridPane paneGrid = new GridPane();
        paneGrid.setAlignment(Pos.CENTER);
        VBox pane = new VBox(numberLabel, paneGrid);
        pane.setAlignment(Pos.CENTER);
        
        final int buttonNumber = 12;
        final int buttonNumberARow = 3;
        
        for (int i = 0; i < buttonNumber; i++) {
            padNumber = allPadNumber.substring(i, i + 1);
            buttonList.add(i, new Button(padNumber));
            paneGrid.add(buttonList.get(i), i % buttonNumberARow,
                    i / buttonNumberARow + 1);
            buttonList.get(i).setOnAction((event) -> {
                result = result + ((Button) event.getSource()).getText();
                numberLabel.setText(result);
            });
        }
                
        final int appWidth = 300;
        final int appHeight = 200;
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("PhonePad");
        primaryStage.setScene(scene);
        primaryStage.show();
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
