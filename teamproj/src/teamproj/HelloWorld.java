package teamproj;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.control.*; 
import javafx.geometry.Insets; 
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Modality;
  
public class HelloWorld extends Application { 
  
    // launch the application 
    public void start(Stage stage) 
    { 
        // set title for the stage 
        stage.setTitle("Team 6 Project Topic 4"); 
  
        // add a stack pane to add multiple panes to the same scene
        StackPane rootPane = new StackPane();
        StackPane pharmacologyPane = new StackPane();
        
        // create a tabpane 
        TabPane tabPane = new TabPane(); 
  
        // create AUDIOLOGICAL grid
        GridPane audiologicalGridPane = new GridPane();
        audiologicalGridPane.setPadding(new Insets(10, 10, 10, 10)); 
        audiologicalGridPane.setVgap(10); 
        audiologicalGridPane.setHgap(20); 
        
        // create audiological tab
        Tab audiologicalTab = new Tab("Audiological");
        Label patientNameLabel1 = new Label("Patient name: ");
        Label thcNumLabel1 = new Label("THC #: ");
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
        audiologicalGridPane.add(patientNameLabel1, 0, 0);
        audiologicalGridPane.add(thcNumLabel1, 1, 0);
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
        
        
        
        // create PHARMACOLOGY grid
        GridPane pharmacologyGridPane = new GridPane();
        pharmacologyGridPane.setPadding(new Insets(10, 10, 10, 10)); 
        pharmacologyGridPane.setVgap(10); 
        pharmacologyGridPane.setHgap(20);
        
        // create button grid pane for add and edit medication buttons
        GridPane buttonGridPane = new GridPane();
        buttonGridPane.setPadding(new Insets(40, 10, 10, 10)); 
        buttonGridPane.setVgap(10); 
        buttonGridPane.setHgap(20);
        
        // create pharmacology tab
        Tab pharmacologyTab = new Tab("Pharmacology");
        Label patientNameLabel2 = new Label("Patient name: ");
        Label thcNumLabel2 = new Label("THC #: ");
        Label sequenceNumberLabel = new Label("Visit Sequence #: ");
        Button addMedicationButton = new Button("Add Medication");
        Button editMedicationButton = new Button("Edit Medication");
        
        // create medication table
        TableView medicationTable = new TableView();
        TableColumn medNumCol = new TableColumn("Med #");
        TableColumn medicationCol = new TableColumn("Medication");
        TableColumn genericCol = new TableColumn("Generic");
        TableColumn doseCol = new TableColumn("Dose");
        TableColumn durationCol = new TableColumn("Duration");
        TableColumn catChemCol = new TableColumn("Cat Chem");
        TableColumn actionCol = new TableColumn("Action");
        TableColumn applicationCol = new TableColumn("Application");
        TableColumn usualCol = new TableColumn("Usual");
        TableColumn tSideCol = new TableColumn("T side");
        
        medicationTable.getColumns().addAll(medNumCol, medicationCol, genericCol, doseCol, 
        		durationCol, catChemCol, actionCol, applicationCol, usualCol, tSideCol);
        
        // add components to grid
        pharmacologyGridPane.add(patientNameLabel2, 0, 0);
        pharmacologyGridPane.add(thcNumLabel2, 0, 1);
        pharmacologyGridPane.add(sequenceNumberLabel, 0, 2);
        buttonGridPane.add(addMedicationButton, 0, 5);
        buttonGridPane.add(editMedicationButton, 1, 5);
        pharmacologyGridPane.add(medicationTable, 0, 7);
        
        // add medication window
        addMedicationButton.setOnAction(new EventHandler<ActionEvent>() {
	    	 
			@Override
			public void handle(ActionEvent event) {
				StackPane addMedicationStackPane = new StackPane();
				
				GridPane addMedicationGridPane = new GridPane();
				addMedicationGridPane.setPadding(new Insets(10, 10, 10, 10));
				addMedicationGridPane.setVgap(10);
				addMedicationGridPane.setHgap(20);

				Label medicationNameLabel = new Label("Medication Name: ");
				Label genericLabel = new Label("Generic: ");
				Label doseLabel = new Label("Dose: ");
				Label durationLabel = new Label("Duration: ");
				Label catChemLabel = new Label("Category Chemical: ");
				Label actionLabel = new Label("Action: ");
				Label applicationLabel = new Label("Application: ");
				Label usualLabel = new Label("Usual: ");
				Label tSideLabel = new Label("T side: ");
				
				TextField medicationNameTextField = new TextField();
				TextField genericTextField = new TextField();
				TextField doseTextField = new TextField();
				TextField durationTextField = new TextField();
				TextField catChemTextField = new TextField();
				TextField actionTextField = new TextField();
				TextField applicationTextField = new TextField();
				TextField usualTextField = new TextField();
				TextField tSideTextField = new TextField();

				Button genericButton = new Button("Add Generic");
				Button diseaseButton = new Button("Add Disease");
				Button chemicalButton = new Button("Add Chemical");
				Button save = new Button("Save");
				Button cancel = new Button("Cancel");
				
				// add labels to pane
				addMedicationGridPane.add(medicationNameLabel, 0, 0);
				addMedicationGridPane.add(genericLabel, 0, 1);
				addMedicationGridPane.add(doseLabel, 0, 2);
				addMedicationGridPane.add(durationLabel, 0, 3);
				addMedicationGridPane.add(catChemLabel, 0, 4);
				addMedicationGridPane.add(actionLabel, 0, 5);
				addMedicationGridPane.add(applicationLabel, 0, 6);
				addMedicationGridPane.add(usualLabel, 0, 7);
				addMedicationGridPane.add(tSideLabel, 0, 8);
				
				// add text fields to pane
				addMedicationGridPane.add(medicationNameTextField, 1, 0);
				addMedicationGridPane.add(genericTextField, 1, 1);
				addMedicationGridPane.add(doseTextField, 1, 2);
				addMedicationGridPane.add(durationTextField, 1, 3);
				addMedicationGridPane.add(catChemTextField, 1, 4);
				addMedicationGridPane.add(actionTextField, 1, 5);
				addMedicationGridPane.add(applicationTextField, 1, 6);
				addMedicationGridPane.add(usualTextField, 1, 7);
				addMedicationGridPane.add(tSideTextField, 1, 8);
				
				// add buttons to pane
				addMedicationGridPane.add(genericButton, 2, 0);
				addMedicationGridPane.add(diseaseButton, 2, 1);
				addMedicationGridPane.add(chemicalButton, 2, 2);
				addMedicationGridPane.add(save, 2, 3);
				addMedicationGridPane.add(cancel, 2, 4);
				
				addMedicationStackPane.getChildren().addAll(addMedicationGridPane);

				Scene secondScene = new Scene(addMedicationStackPane, 500, 400);

				// New window (Stage)
				Stage newWindow = new Stage();
				newWindow.setTitle("Add Medication");
				newWindow.setScene(secondScene);

				// Specifies the modality for new window.
				newWindow.initModality(Modality.WINDOW_MODAL);

				// Specifies the owner Window (parent) for new window
				newWindow.initOwner(stage);

				// Set position of second window, related to primary window.
				newWindow.setX(stage.getX() + 200);
				newWindow.setY(stage.getY() + 100);

				newWindow.show();
	        }
         });
        
  
        
     // create pharmacology root pane
        pharmacologyPane.getChildren().addAll(pharmacologyGridPane,buttonGridPane);
        pharmacologyTab.setContent(pharmacologyPane);
        
        // add tabs
        tabPane.getTabs().add(audiologicalTab);
        tabPane.getTabs().add(pharmacologyTab);
  
        // add all the child panes to the root pane
        rootPane.getChildren().addAll(tabPane,audiologicalGridPane);
        
        // create a scene 
        Scene scene = new Scene(rootPane, 850, 600); 

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
