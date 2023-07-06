package semaforo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class FXMLController {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn10;
    @FXML
    private Button btn11;
    @FXML
    private Button btn12;
    @FXML
    private MenuItem menuItemExit;
    
    private Button[] buttons; // Array to hold all the buttons

    @FXML
    private void initialize() {
        buttons = new Button[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12};
    }

    @FXML
    private void handleButtonClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();

        if (clickedButton.getStyle().equals("-fx-background-color: white; -fx-border-color: black;")) {
            // Change white button to green
            clickedButton.setStyle("-fx-background-color: green; -fx-border-color: black;");
        } else if (clickedButton.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) {
            // Change green button to yellow
            clickedButton.setStyle("-fx-background-color: yellow; -fx-border-color: black;");
        } else if (clickedButton.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) {
            // Change yellow button to red
            clickedButton.setStyle("-fx-background-color: red; -fx-border-color: black;");
        }
        
        if (jogo.checkGameEnd(buttons)) {
            // Game has ended, handle the logic accordingly
            openEndScene();
        }
    }
    
   
    
    private void openEndScene() {
        try {
            Stage primaryStage = (Stage) btn1.getScene().getWindow();
            Parent endRoot = FXMLLoader.load(getClass().getResource("End.fxml"));
            Scene endScene = new Scene(endRoot);
            primaryStage.setScene(endScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void handleExitAction() {
        Stage stage = (Stage) menuItemExit.getParentPopup().getOwnerWindow();
        stage.close();
    }
}
