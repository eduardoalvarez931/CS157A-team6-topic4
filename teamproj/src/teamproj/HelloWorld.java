package teamproj;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Main Screen");
        Button audioBtn = new Button();
        audioBtn.setText("Audiology");
        audioBtn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed Audiology button");
            }
        });
        
        StackPane layout = new StackPane();
        layout.getChildren().add(audioBtn);
        
        Scene audioScene = new Scene(layout, 300,250);
        primaryStage.setScene(audioScene);
        primaryStage.show();
        
        Button pharmaBtn = new Button();
        pharmaBtn.setText("Pharmacology");
        pharmaBtn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed Pharmacology button");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(audioBtn);
        root.getChildren().add(pharmaBtn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}