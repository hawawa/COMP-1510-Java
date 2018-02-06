package q5;

import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
/**
 * <p>
 * Creates an e-mail form.
 * </p>
 *
 * @author Chih-Hsi Chang
 * @version 1.0
 */
public class EmailPane extends GridPane {
    /** Contains a text field for to. */
    private TextField toField;
    /** Contains a text field for cc. */
    private TextField ccField;
    /** Contains a text field for bcc. */
    private TextField bccField;
    /** Contains a text field for subject. */
    private TextField subjectField;
    /** Contains a text area for message. */
    private TextArea messageArea;
    
    /**
     * Constructs this pane with some labels, test fields and a summit button.
     */   
    public EmailPane() {
        Label toLabel = new Label("To:");
        Label ccLabel = new Label("Cc:");
        Label bccLabel = new Label("Bcc:");
        Label subjectLabel = new Label("Subject:");
        Label messageLabel = new Label("Message:");
        
        toField = new TextField();
        ccField = new TextField();
        bccField = new TextField();
        subjectField = new TextField();
        messageArea = new TextArea();
        
        Button send = new Button("Send");
        send.setOnAction(this::processButtonPress);

        
        final int x0 = 0;
        final int x1 = 1;
        
        addColumn(x0, toLabel, ccLabel, bccLabel,
                subjectLabel, messageLabel);
        addColumn(x1, toField, ccField, bccField,
                subjectField, messageArea, send);
    }
    
    /**
     * Prints the all content of the e-mail.
     * @param event invoked this method
     */
    public void processButtonPress(ActionEvent event) {
            System.out.println("To:" + toField.getText());
            System.out.println("Cc:" + ccField.getText());
            System.out.println("Bcc:" + bccField.getText());
            System.out.println("Subject:" + subjectField.getText());
            System.out.println("Message:" + messageArea.getText());
            
    }
    
    
}
