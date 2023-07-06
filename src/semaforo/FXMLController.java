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
        
        checkGameEnd(); // Check if the game has ended after each button click
    }
    
    private void checkGameEnd() {
        // Check for winning condition (line, column, or diagonal of only red buttons)
        if (// for red side
            // Lines
            (btn1.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn2.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn3.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn4.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn5.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn8.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn9.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn10.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            //Colunms
            (btn1.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn5.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn9.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn2.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn10.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn3.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn4.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn8.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            //Diagonals
            (btn1.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn2.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn3.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn9.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            (btn4.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: red; -fx-border-color: black;") &&
            btn10.getStyle().equals("-fx-background-color: red; -fx-border-color: black;")) ||
            //Yellow side
            // Lines
            (btn1.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn2.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn3.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn4.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            (btn5.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn8.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            (btn9.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn10.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            //Colunms
            (btn1.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn5.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn9.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            (btn2.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn10.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            (btn3.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            (btn4.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn8.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            //Diagonals
            (btn1.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            (btn2.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            (btn3.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn9.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            (btn4.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;") &&
            btn10.getStyle().equals("-fx-background-color: yellow; -fx-border-color: black;")) ||
            //Green side
            // Lines
            (btn1.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn2.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn3.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn4.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            (btn5.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn8.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            (btn9.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn10.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            //Colunms
            (btn1.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn5.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn9.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            (btn2.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn10.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            (btn3.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            (btn4.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn8.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            //Diagonals
            (btn1.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn11.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            (btn2.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn12.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            (btn3.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn6.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn9.getStyle().equals("-fx-background-color: green; -fx-border-color: black;")) ||
            (btn4.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn7.getStyle().equals("-fx-background-color: green; -fx-border-color: black;") &&
            btn10.getStyle().equals("-fx-background-color: green; -fx-border-color: black;"))
            )
        {
            openEndScene(); // Game has ended, open the end.fxml scene
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
