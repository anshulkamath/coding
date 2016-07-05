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
import javafx.stage.Stage;


/**
 *
 * @author anshulkamath
 */
public class GuiTutorial2 extends Application{

    Stage window;
    
    Scene scene1, scene2;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        window = primaryStage;
        
        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(eh -> window.setScene(scene2));
        
        
        Button confirm = new Button("Click me!");
        confirm.setOnAction(eh -> {
            boolean answer = ConfirmBox.display("Confirming", "Would you like to drink some tea?");
            System.out.println(answer);
        });
        
        //Layout 1 (Vertical box)
        VBox layout1 = new VBox(30);
        layout1.getChildren().addAll(label1, button1, confirm);
        layout1.setAlignment(Pos.CENTER);
        
        scene1 = new Scene(layout1, 900, 900);
        
        //Scene 2
        Label label2 = new Label("Welcome to the second scene");
        Button button2 = new Button("Go back to scene 1");
        button2.setOnAction(eh -> window.setScene(scene1));
        
        //Layout 2 (Vertical box)
        VBox layout2 = new VBox(30);
        layout2.getChildren().addAll(label2, button2, confirm);
        layout2.setAlignment(Pos.CENTER);
        
        scene2 = new Scene(layout2, 900, 900);
        
        window.setScene(scene1);
        window.show();
    }
}
