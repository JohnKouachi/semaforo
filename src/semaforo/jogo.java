/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import javafx.scene.control.Button;

public class jogo {

    private static final String RED_STYLE = "-fx-background-color: red; -fx-border-color: black;";
    private static final String YELLOW_STYLE = "-fx-background-color: yellow; -fx-border-color: black;";
    private static final String GREEN_STYLE = "-fx-background-color: green; -fx-border-color: black;";
    

    public static boolean checkGameEnd(Button[] buttons) {
        // Check for winning condition (line, column, or diagonal of only red buttons)
        // You can customize this logic as per your game's requirements
        if (
                
                //red 
            // Lines
            (buttons[0].getStyle().equals(RED_STYLE) &&
            buttons[1].getStyle().equals(RED_STYLE) &&
            buttons[2].getStyle().equals(RED_STYLE) &&
            buttons[3].getStyle().equals(RED_STYLE)) ||
            (buttons[4].getStyle().equals(RED_STYLE) &&
            buttons[5].getStyle().equals(RED_STYLE) &&
            buttons[6].getStyle().equals(RED_STYLE) &&
            buttons[7].getStyle().equals(RED_STYLE)) ||
            (buttons[8].getStyle().equals(RED_STYLE) &&
            buttons[9].getStyle().equals(RED_STYLE) &&
            buttons[10].getStyle().equals(RED_STYLE) &&
            buttons[11].getStyle().equals(RED_STYLE)) ||
            // Columns
            (buttons[0].getStyle().equals(RED_STYLE) &&
            buttons[4].getStyle().equals(RED_STYLE) &&
            buttons[8].getStyle().equals(RED_STYLE)) ||
            (buttons[1].getStyle().equals(RED_STYLE) &&
            buttons[5].getStyle().equals(RED_STYLE) &&
            buttons[9].getStyle().equals(RED_STYLE)) ||
            (buttons[2].getStyle().equals(RED_STYLE) &&
            buttons[6].getStyle().equals(RED_STYLE) &&
            buttons[10].getStyle().equals(RED_STYLE)) ||
            (buttons[3].getStyle().equals(RED_STYLE) &&
            buttons[7].getStyle().equals(RED_STYLE) &&
            buttons[11].getStyle().equals(RED_STYLE)) ||
            // Diagonals
            (buttons[0].getStyle().equals(RED_STYLE) &&
            buttons[5].getStyle().equals(RED_STYLE) &&
            buttons[10].getStyle().equals(RED_STYLE)) ||
            (buttons[1].getStyle().equals(RED_STYLE) &&
            buttons[6].getStyle().equals(RED_STYLE) &&
            buttons[11].getStyle().equals(RED_STYLE)) ||
            (buttons[2].getStyle().equals(RED_STYLE) &&
            buttons[5].getStyle().equals(RED_STYLE) &&
            buttons[8].getStyle().equals(RED_STYLE)) ||
            (buttons[3].getStyle().equals(RED_STYLE) &&
            buttons[6].getStyle().equals(RED_STYLE) &&
            buttons[9].getStyle().equals(RED_STYLE)) ||
                
                 //yellow
                // Lines
            (buttons[0].getStyle().equals(YELLOW_STYLE) &&
            buttons[1].getStyle().equals(YELLOW_STYLE) &&
            buttons[2].getStyle().equals(YELLOW_STYLE) &&
            buttons[3].getStyle().equals(YELLOW_STYLE)) ||
            (buttons[4].getStyle().equals(YELLOW_STYLE) &&
            buttons[5].getStyle().equals(YELLOW_STYLE) &&
            buttons[6].getStyle().equals(YELLOW_STYLE) &&
            buttons[7].getStyle().equals(YELLOW_STYLE)) ||
            (buttons[8].getStyle().equals(YELLOW_STYLE) &&
            buttons[9].getStyle().equals(YELLOW_STYLE) &&
            buttons[10].getStyle().equals(YELLOW_STYLE) &&
            buttons[11].getStyle().equals(YELLOW_STYLE)) ||
            // Columns
            (buttons[0].getStyle().equals(YELLOW_STYLE) &&
            buttons[4].getStyle().equals(YELLOW_STYLE) &&
            buttons[8].getStyle().equals(YELLOW_STYLE)) ||
            (buttons[1].getStyle().equals(YELLOW_STYLE) &&
            buttons[5].getStyle().equals(YELLOW_STYLE) &&
            buttons[9].getStyle().equals(YELLOW_STYLE)) ||
            (buttons[2].getStyle().equals(YELLOW_STYLE) &&
            buttons[6].getStyle().equals(YELLOW_STYLE) &&
            buttons[10].getStyle().equals(YELLOW_STYLE)) ||
            (buttons[3].getStyle().equals(YELLOW_STYLE) &&
            buttons[7].getStyle().equals(YELLOW_STYLE) &&
            buttons[11].getStyle().equals(YELLOW_STYLE)) ||
            // Diagonals
            (buttons[0].getStyle().equals(YELLOW_STYLE) &&
            buttons[5].getStyle().equals(YELLOW_STYLE) &&
            buttons[10].getStyle().equals(YELLOW_STYLE)) ||
            (buttons[1].getStyle().equals(YELLOW_STYLE) &&
            buttons[6].getStyle().equals(YELLOW_STYLE) &&
            buttons[11].getStyle().equals(YELLOW_STYLE)) ||
            (buttons[2].getStyle().equals(YELLOW_STYLE) &&
            buttons[5].getStyle().equals(YELLOW_STYLE) &&
            buttons[8].getStyle().equals(YELLOW_STYLE)) ||
            (buttons[3].getStyle().equals(YELLOW_STYLE) &&
            buttons[6].getStyle().equals(YELLOW_STYLE) &&
            buttons[9].getStyle().equals(YELLOW_STYLE))||
                
                     //Green
                // Lines
            (buttons[0].getStyle().equals(GREEN_STYLE) &&
            buttons[1].getStyle().equals(GREEN_STYLE) &&
            buttons[2].getStyle().equals(GREEN_STYLE) &&
            buttons[3].getStyle().equals(GREEN_STYLE)) ||
            (buttons[4].getStyle().equals(GREEN_STYLE) &&
            buttons[5].getStyle().equals(GREEN_STYLE) &&
            buttons[6].getStyle().equals(GREEN_STYLE) &&
            buttons[7].getStyle().equals(GREEN_STYLE)) ||
            (buttons[8].getStyle().equals(GREEN_STYLE) &&
            buttons[9].getStyle().equals(GREEN_STYLE) &&
            buttons[10].getStyle().equals(GREEN_STYLE) &&
            buttons[11].getStyle().equals(GREEN_STYLE)) ||
            // Columns
            (buttons[0].getStyle().equals(GREEN_STYLE) &&
            buttons[4].getStyle().equals(GREEN_STYLE) &&
            buttons[8].getStyle().equals(GREEN_STYLE)) ||
            (buttons[1].getStyle().equals(GREEN_STYLE) &&
            buttons[5].getStyle().equals(GREEN_STYLE) &&
            buttons[9].getStyle().equals(GREEN_STYLE)) ||
            (buttons[2].getStyle().equals(GREEN_STYLE) &&
            buttons[6].getStyle().equals(GREEN_STYLE) &&
            buttons[10].getStyle().equals(GREEN_STYLE)) ||
            (buttons[3].getStyle().equals(GREEN_STYLE) &&
            buttons[7].getStyle().equals(GREEN_STYLE) &&
            buttons[11].getStyle().equals(GREEN_STYLE)) ||
            // Diagonals
            (buttons[0].getStyle().equals(GREEN_STYLE) &&
            buttons[5].getStyle().equals(GREEN_STYLE) &&
            buttons[10].getStyle().equals(GREEN_STYLE)) ||
            (buttons[1].getStyle().equals(GREEN_STYLE) &&
            buttons[6].getStyle().equals(GREEN_STYLE) &&
            buttons[11].getStyle().equals(GREEN_STYLE)) ||
            (buttons[2].getStyle().equals(GREEN_STYLE) &&
            buttons[5].getStyle().equals(GREEN_STYLE) &&
            buttons[8].getStyle().equals(GREEN_STYLE)) ||
            (buttons[3].getStyle().equals(GREEN_STYLE) &&
            buttons[6].getStyle().equals(GREEN_STYLE) &&
            buttons[9].getStyle().equals(GREEN_STYLE))
                
        ) {
            return true; // Game has ended
        }

        return false; // Game has not ended
    }
}

