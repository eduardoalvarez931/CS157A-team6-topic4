package teamproj;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.control.*; 
import javafx.geometry.Insets; 
  
public class HelloWorld extends Application { 
  
    // launch the application 
    public void start(Stage stage) 
    { 
  
        // set title for the stage 
        stage.setTitle("Team 6 Project Topic 4"); 
  
        // add a stack pane to add multiple panes to the same scene
        StackPane rootPane = new StackPane();
        
        
        // create a tabpane 
        TabPane tabPane = new TabPane(); 
  
        // create audiological grid
        GridPane audiologicalGridPane = new GridPane();
        audiologicalGridPane.setPadding(new Insets(10, 10, 10, 10)); 
        audiologicalGridPane.setVgap(10); 
        audiologicalGridPane.setHgap(20); 
        
        // create audiological tab
        Tab audiologicalTab = new Tab("Audiological");
        Label patientNameLabel = new Label("Patient name: ");
        Label thcNumLabel = new Label("THC #: ");
        Label pureToneAudiogramLabel = new Label("Puretone Audiogram Tests: ");
        Label tinnitusLabel = new Label("Tinnitus Tests: ");
        
        // right ear
        CheckBox r25CheckBox = new CheckBox("R25");
        CheckBox r50CheckBox = new CheckBox("R50");
        CheckBox r1CheckBox = new CheckBox("R1");
        CheckBox r2CheckBox = new CheckBox("R2");
        CheckBox r3CheckBox = new CheckBox("R3");
        CheckBox r4CheckBox = new CheckBox("R4");
        CheckBox r5CheckBox = new CheckBox("R5");
        CheckBox r6CheckBox = new CheckBox("R6");
        CheckBox r8CheckBox = new CheckBox("R8");
        CheckBox r10CheckBox = new CheckBox("R10");
        CheckBox r12CheckBox = new CheckBox("R12");
        
        // left ear
        CheckBox l25CheckBox = new CheckBox("L25");
        CheckBox l50CheckBox = new CheckBox("L50");
        CheckBox l1CheckBox = new CheckBox("L1");
        CheckBox l2CheckBox = new CheckBox("L2");
        CheckBox l3CheckBox = new CheckBox("L3");
        CheckBox l4CheckBox = new CheckBox("L4");
        CheckBox l5CheckBox = new CheckBox("L5");
        CheckBox l6CheckBox = new CheckBox("L6");
        CheckBox l8CheckBox = new CheckBox("L8");
        CheckBox l10CheckBox = new CheckBox("L10");
        CheckBox l12CheckBox = new CheckBox("L12");
        
        // add components to grid
        audiologicalGridPane.add(patientNameLabel, 0, 0);
        audiologicalGridPane.add(thcNumLabel, 1, 0);
        audiologicalGridPane.add(pureToneAudiogramLabel, 0, 2);
        audiologicalGridPane.add(tinnitusLabel, 0, 13);
        
        audiologicalGridPane.add(r25CheckBox, 1, 2);
        audiologicalGridPane.add(r50CheckBox, 2, 2);
        audiologicalGridPane.add(r1CheckBox, 3, 2);
        audiologicalGridPane.add(r2CheckBox, 4, 2);
        audiologicalGridPane.add(r3CheckBox, 1, 4);
        audiologicalGridPane.add(r4CheckBox, 2, 4);
        audiologicalGridPane.add(r5CheckBox, 3, 4);
        audiologicalGridPane.add(r6CheckBox, 4, 4);
        audiologicalGridPane.add(r8CheckBox, 1, 6);
        audiologicalGridPane.add(r10CheckBox, 2, 6);
        audiologicalGridPane.add(r12CheckBox, 3, 6);
        
        audiologicalGridPane.add(l25CheckBox, 1, 8);
        audiologicalGridPane.add(l50CheckBox, 2, 8);
        audiologicalGridPane.add(l1CheckBox, 3, 8);
        audiologicalGridPane.add(l2CheckBox, 4, 8);
        audiologicalGridPane.add(l3CheckBox, 1, 10);
        audiologicalGridPane.add(l4CheckBox, 2, 10);
        audiologicalGridPane.add(l5CheckBox, 3, 10);
        audiologicalGridPane.add(l6CheckBox, 4, 10);
        audiologicalGridPane.add(l8CheckBox, 1, 12);
        audiologicalGridPane.add(l10CheckBox, 2, 12);
        audiologicalGridPane.add(l12CheckBox, 3, 12);
        
        
        audiologicalTab.setContent(audiologicalGridPane);
        
        
        //create pharmacology grid
        GridPane pharmacologyGridPane = new GridPane();
        pharmacologyGridPane.setPadding(new Insets(10, 10, 10, 10)); 
        pharmacologyGridPane.setVgap(10); 
        pharmacologyGridPane.setHgap(20);
        
        // create pharmacology tab
        Tab pharmacologyTab = new Tab("Pharmacology");
        Label sequenceNumberLabel = new Label("Visit Sequence #: ");
        
        // add components to grid
//        pharmacologyGridPane.add(patientNameLabel, 0, 0);
//        pharmacologyGridPane.add(thcNumLabel, 1, 0);
//        pharmacologyGridPane.add(sequenceNumberLabel, 2, 0);
        
        
        pharmacologyTab.setContent(pharmacologyGridPane);
        
        // add tabs
        tabPane.getTabs().add(audiologicalTab);
        tabPane.getTabs().add(pharmacologyTab);
  
        // add all the child panes to the root pane
        rootPane.getChildren().addAll(tabPane,audiologicalGridPane);
        
        // create a scene 
        Scene scene = new Scene(rootPane, 600, 500); 

        // set the scene 
        stage.setScene(scene); 
  
        stage.show(); 
    } 
  
    // Main Method 
    public static void main(String args[]) 
    { 
  
        // launch the application 
        launch(args); 
    } 
}
