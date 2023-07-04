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
    private Button btn10;
    @FXML
    private Button btn11;
    @FXML
    private Button btn12;
    @FXML
    private Button btn121;
    @FXML
    private Button btn122;
    @FXML
    private Button btn123;
    @FXML
    private MenuItem menuItemExit;

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
        } else if (clickedButton.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) {
            // Change red button back to white
            clickedButton.setStyle("-fx-background-color: white; -fx-border-color: black;");
        }
        
        checkGameEnd(); // Check if the game has ended after each button click
    }
    
    private void checkGameEnd() {
        // Check for winning condition (line, column, or diagonal of only red buttons)
        if ((btn1.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn2.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn3.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn4.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn5.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn10.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn121.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn122.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn123.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn1.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn5.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn123.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn3.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn5.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn121.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")))
        {
            openEndScene(); // Game has ended, open the end.fxml scene
        }
    }
    
    private void openEndScene() {
        try {
            Stage primaryStage = (Stage) btn1.getScene().getWindow();
            Parent endRoot = FXMLLoader.load(getClass().getResource("end.fxml"));
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
