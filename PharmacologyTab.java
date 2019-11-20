package jdbcTutorial;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.control.*; 
import javafx.geometry.Insets; 

public class PharmacologyTab extends Tab {
	private GridPane pharmacologyGridPane;
	
	public PharmacologyTab(String s) {
		super(s);
		
		//create pharmacology grid
		GridPane pharmacologyGridPane = new GridPane();
        pharmacologyGridPane.setPadding(new Insets(10, 10, 10, 10)); 
        pharmacologyGridPane.setVgap(10); 
        pharmacologyGridPane.setHgap(20);
        
        //create labels
        Label patientNameLabel = new Label("Patient name: ");
        Label thcNumLabel = new Label("THC #: ");
        Label sequenceNumberLabel = new Label("Visit Sequence #: ");
        
        
        // add components to grid
        pharmacologyGridPane.add(patientNameLabel, 0, 0);
        pharmacologyGridPane.add(thcNumLabel, 1, 0);
        pharmacologyGridPane.add(sequenceNumberLabel, 2, 0);
        
        this.setContent(pharmacologyGridPane);
        
	}
	
	public GridPane getPharmacologyGridPane() {
		return pharmacologyGridPane;
	}

}
