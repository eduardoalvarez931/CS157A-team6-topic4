package jdbcTutorial;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene; 
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.control.*; 
import javafx.geometry.Insets; 

public class PharmacologyTab extends Tab {
	private GridPane pharmacologyGridPane;
	private Stage stage;
	
	public PharmacologyTab(String s) {
		super(s);
		
		
		StackPane pharmacologyPane = new StackPane();
		
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
        
        // create labels and btns
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
        
        pharmacologyPane.getChildren().addAll(pharmacologyGridPane,buttonGridPane);
        this.setContent(pharmacologyPane);
        
	}
	
	public GridPane getPharmacologyGridPane() {
		return pharmacologyGridPane;
	}

	public void passStage(Stage stage) {
		this.stage = stage;
		
	}

}
