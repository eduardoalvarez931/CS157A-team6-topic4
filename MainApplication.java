package jdbcTutorial;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.control.*; 
import javafx.geometry.Insets; 
  
public class MainApplication extends Application {

    // launch the application
    public void start(Stage stage) { 

        // set title for the stage 
        stage.setTitle("Team 6 Project Topic 4"); 
  
        // add a stack pane to add multiple panes to the same scene
        ScrollPane rootPane = new ScrollPane();
        
        // create a tab pane 
        TabPane tabPane = new TabPane(); 
  
        // create audiological and pharmacology tabs
        AudiologicalTab audiologicalTab = new AudiologicalTab("Audiological"); // diego
        PharmacologyTab pharmacologyTab = new PharmacologyTab("Pharmacology");
        
        // add tabs to tab pane
        tabPane.getTabs().add(audiologicalTab);
        tabPane.getTabs().add(pharmacologyTab);
  
        // add all the child panes to the root pane        
        //rootPane.getChildren().addAll(tabPane);  // **ONLY tabPane ADDED HERE?**
        rootPane.setContent(tabPane);
        
        // create a scene
        Scene scene = new Scene(rootPane, 850, 700);
        // set the scene
        stage.setScene(scene); 
        stage.show(); 
        
        pharmacologyTab.passStage(stage);
    } 
  
    // Main Method 
    public static void main(String args[]) 
    { 
  
        // launch the application 
        launch(args); 
    } 
} 

