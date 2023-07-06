/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
       
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        
            Scene scene = new Scene(root);
        
            stage.setScene(scene);
            stage.setTitle("Jogo do Semafro");
            stage.show();         
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    
}
