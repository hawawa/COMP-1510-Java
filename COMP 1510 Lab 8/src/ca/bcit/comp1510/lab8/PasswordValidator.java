/**
 * 
 */
package ca.bcit.comp1510.lab8;

import java.io.IOException;
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
 * @version 2.0
 */
public class PasswordValidator extends Application {
    /** Holds the validation text. */
    private Text validationText = new Text();
    /** Holds the text field for enter password. */
    private TextField enterPWTextField = new TextField();
    /** Holds the text field for confirm password. */
    private TextField confirmPWTextField = new TextField();
    /** Holds the word list for forbidden words. */
    private ForbiddenWords wordlist;
    
    /**
     * Constructs a ForbiddenWords object reading from wordlist.txt file.
     * @throws IOException if there is an error reading the file.
     */
    public PasswordValidator() throws IOException {
        wordlist = new ForbiddenWords("src/ca/bcit/comp1510/lab8/wordlist.txt");
    }
    
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
     * <p>
     * Checks if the enter password equals to confirm password,
     * and if the password is good enough.
     * <p>
     * @param event invokes this method
     */    
    public void processButtonPress(ActionEvent event) {
        if (
                enterPWTextField.getText().equals(confirmPWTextField.getText()) 
                && ifOneCapital(enterPWTextField.getText())
                && ifOneLowerCase(enterPWTextField.getText())
                && ifOneNumber(enterPWTextField.getText())
                && ifOneSpecial(enterPWTextField.getText())
                && wordlist.containsWord(enterPWTextField.getText())
                        ) {
            validationText.setText("VALID");
        } else {
            validationText.setText("INVALID");
        }
        


        
    }
    
    /**
     * <p>
     * Checks if the password include least one capital.
     * <p>
     * @param password the password for checking
     * @return boolean if including least one capital
     */ 
    private boolean ifOneCapital(String password) {
        char ch;
        boolean result = false;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * <p>
     * Checks if the password include least one lower case letter.
     * <p>
     * @param password the password for checking
     * @return boolean if including least one lower case
     */ 
    private boolean ifOneLowerCase(String password) {
        char ch;
        boolean result = false;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isLowerCase(ch)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
    
    /**
     * <p>
     * Checks if the password include least one number.
     * <p>
     * @param password the password for checking
     * @return boolean if including least one number
     */ 
    private boolean ifOneNumber(String password) {
        char ch;
        boolean result = false;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
    
    /**
     * <p>
     * Checks if the password include least one special character.
     * <p>
     * @param password the password for checking
     * @return boolean if including least one cpecial character
     */ 
    private boolean ifOneSpecial(String password) {
        String ch;
        String special = "\"#$%&\'()*";
        boolean result = false;
        for (int i = 0; i < password.length(); i++) {
            ch = password.substring(i, i + 1);
            if (special.contains(ch)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
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
