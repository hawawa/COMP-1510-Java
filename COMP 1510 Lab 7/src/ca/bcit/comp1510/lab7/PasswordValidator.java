/**
 * 
 */
package ca.bcit.comp1510.lab7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * <p>
 * Checks the password's validation.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class PasswordValidator extends Application {
    /** Holds the validation text. */
    private Text validationText = new Text();
    /** Holds the text field for enter password. */
    private TextField enterPWTextField = new TextField();
    /** Holds the text field for confirm password. */
    private TextField confirmPWTextField = new TextField();
    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label enterPWLabel = new Label("Enter Password:");
        Label confirmPWLabel = new Label("Confirm Password:");
        Button submitButton = new Button("Submit");
        
        
        submitButton.setOnAction(this::processButtonPress);
        
        
        final int appWidth = 300;
        final int appHeight = 100;
        
        
        GridPane pane = new GridPane();
        
        pane.add(enterPWLabel, 0, 0);
        pane.add(confirmPWLabel, 0, 1);
        pane.add(enterPWTextField, 1, 0);
        pane.add(confirmPWTextField, 1, 1);
        pane.add(submitButton, 0, 2);
        pane.add(validationText, 1, 2);
        
        Scene scene = new Scene(pane, appWidth, appHeight);

        primaryStage.setTitle("Email");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    
    /**
     * <p>Checks if the enter password equals to confirm password.<p>
     * @param event invokes this method
     */    
    public void processButtonPress(ActionEvent event) {
        if (enterPWTextField.getText().equals(confirmPWTextField.getText())) {
            validationText.setText("VALID");
        } else {
            validationText.setText("INVALID");
        }
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
