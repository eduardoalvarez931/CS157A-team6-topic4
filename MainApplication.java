package teamproj;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class MainApplication extends Application {
	private Scene scene1Visit, scene2MainApp;	// Scenes for the app
	private AudiologicalTab audiologicalTab;	// Tabs for the app
	private PharmacologyTab pharmacologyTab;

	// launch the application
	public void start(Stage stage) {

		// set title for the main stage
		stage.setTitle("Team 6 Project Topic 4");

		// Start at Visit Scene: This scene is implemented by another team. For our
		// team, it is a place to start
		Label label1 = new Label("  Visit Screen"); // label to note that this is the Visit screen
		Button btn1 = new Button("Go To Team 6 Project Topic 4");// button that takes user to out main application
		btn1.setOnAction(e -> stage.setScene(scene2MainApp)); // button action listener.
		VBox layout1 = new VBox(20); // layout for label and button
		layout1.getChildren().addAll(label1, btn1); // add label and button to the layout
		scene1Visit = new Scene(layout1, 850, 700); // add layout to scence1Visit

		// add a scroll pane to add multiple panes to the same scene.
		ScrollPane rootPane = new ScrollPane();

		// create a tab pane. I will contain the main 2 tabs: 
		// Audiological and pharmacology tabs.
		TabPane tabPane = new TabPane();
		// initialize audiological and pharmacology tabs
		audiologicalTab = new AudiologicalTab("Audiological");
		pharmacologyTab = new PharmacologyTab("Pharmacology");
		// add tabs to tab pane
		tabPane.getTabs().add(audiologicalTab);
		tabPane.getTabs().add(pharmacologyTab);

		// set the content of the root pain to include tab pane
		rootPane.setContent(tabPane);
		// create a scene for the Main App.
		scene2MainApp = new Scene(rootPane, 850, 700);

		// set the scene1Visit. to the stage. App will start in this scene
		stage.setScene(scene1Visit);
		stage.show();

		// pass stage instance to the phamacology tab so that it can use the stage
		// instance
		pharmacologyTab.passStage(stage);
		
		// back button action listener. User returns to the Visit scene
		audiologicalTab.back.setOnAction(e -> stage.setScene(scene1Visit));

	}

	// Main Method
	public static void main(String args[]) {

		// launch the application
		launch(args);

	}

}
