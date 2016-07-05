/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitutorial2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author anshulkamath
 */
public class ConfirmBox 
{
    private static boolean answer;
    
    public static boolean display(String title, String message)
    {
        Stage window = new Stage();
        
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(240);
        Label text = new Label(message);
        
        //Buttons
        Button yes = new Button("Yes I would");
        Button no = new Button("No I would not");
        
        yes.setOnAction(eh -> {
            answer = true;
            window.close();
        });
        no.setOnAction(eh -> {
            answer = false;
            window.close();
        });
              
        VBox layout = new VBox(10);
        layout.getChildren().addAll(text, yes, no);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout, 500, 500);
        window.setScene(scene);
        window.showAndWait();
        
        return answer;
    }
    
}
