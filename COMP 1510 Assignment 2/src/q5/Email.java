package q5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <p>
 * Creates an e-mail form.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class Email extends Application {

    /**
     * Launches the email application.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        final int appWidth = 700;
        final int appHeight = 500;
        Scene scene = new Scene(new EmailPane(), appWidth, appHeight);

        primaryStage.setTitle("Email");
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
