/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jrafa
 */
public class EndController implements Initializable {

  
     @FXML
    private Button btnSair;
    @FXML
    private Button btnJogar;
    @FXML
    private Text txtWinner;

    private String winner;

    public void setWinner(String winner) {
        this.winner = winner;
        txtWinner.setText(winner);
    }
    
    @FXML
    private void handleJogarButton(ActionEvent event) throws IOException {
        Parent jogadorRoot = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene jogadorScene = new Scene(jogadorRoot);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(jogadorScene);
    }
     @FXML
    private void handleSairButton(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
