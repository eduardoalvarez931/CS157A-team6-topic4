package jdbcTutorial;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.control.*; 
import javafx.geometry.Insets; 

public class AudiologicalTab extends Tab {
	private GridPane audiologicalGridPane;
	
	public AudiologicalTab(String s) {
		super(s);
		
		// create audiological grid
        GridPane audiologicalGridPane = new GridPane();
        audiologicalGridPane.setPadding(new Insets(10, 10, 10, 10)); 
        audiologicalGridPane.setVgap(10); 
        audiologicalGridPane.setHgap(20); 
		
        // Upper Panel: inactive fields
		Label patientNameLabel = new Label(		"Patient name:     ");
        Label thcNumLabel = new Label(			"THC #:            ");
        Label sequenceNumberLabel = new Label(	"Visit Sequence #: ");
        Label visitsDate = new Label(			"Visit's date:     ");
        
        
        // Main Panel: active fields
        
        Label pureToneAudiogramLabel = new Label("Puretone Audiogram Tests: ");
        Label tinnitusLabel = new Label("Tinnitus Tests: ");
        
     // right ear
        Label rightEarLabel = new Label("Right Ear:");
        CheckBox r25CheckBox = new CheckBox("R25");
        CheckBox r50CheckBox = new CheckBox("R50");
        CheckBox r1CheckBox = new CheckBox("R1");
        CheckBox r2CheckBox = new CheckBox("R2");
        CheckBox r3CheckBox = new CheckBox("R3");
        CheckBox r4CheckBox = new CheckBox("R4");
        CheckBox r6CheckBox = new CheckBox("R6");
        CheckBox r8CheckBox = new CheckBox("R8");
        CheckBox r10CheckBox = new CheckBox("R10");
        CheckBox r12CheckBox = new CheckBox("R12");
        
        // left ear
        Label leftEarLabel = new Label("Left Ear:");
        CheckBox l25CheckBox = new CheckBox("L25");
        CheckBox l50CheckBox = new CheckBox("L50");
        CheckBox l1CheckBox = new CheckBox("L1");
        CheckBox l2CheckBox = new CheckBox("L2");
        CheckBox l3CheckBox = new CheckBox("L3");
        CheckBox l4CheckBox = new CheckBox("L4");
        CheckBox l6CheckBox = new CheckBox("L6");
        CheckBox l8CheckBox = new CheckBox("L8");
        CheckBox l10CheckBox = new CheckBox("L10");
        CheckBox l12CheckBox = new CheckBox("L12");
        
        // add components to grid
        audiologicalGridPane.add(patientNameLabel, 0, 0);
        audiologicalGridPane.add(thcNumLabel, 1, 0);
        audiologicalGridPane.add(pureToneAudiogramLabel, 0, 2);
        audiologicalGridPane.add(tinnitusLabel, 0, 13);
        
        audiologicalGridPane.add(rightEarLabel, 2, 2);
        audiologicalGridPane.add(r25CheckBox, 2, 3);
        audiologicalGridPane.add(r50CheckBox, 2, 4);
        audiologicalGridPane.add(r1CheckBox, 2, 5);
        audiologicalGridPane.add(r2CheckBox, 2, 6);
        audiologicalGridPane.add(r3CheckBox, 2, 7);
        audiologicalGridPane.add(r4CheckBox, 2, 8);
        audiologicalGridPane.add(r6CheckBox, 2, 9);
        audiologicalGridPane.add(r8CheckBox, 2, 10);
        audiologicalGridPane.add(r10CheckBox, 2, 11);
        audiologicalGridPane.add(r12CheckBox, 2, 12);
        
        audiologicalGridPane.add(leftEarLabel, 1, 2);
        audiologicalGridPane.add(l25CheckBox, 1, 3);
        audiologicalGridPane.add(l50CheckBox, 1, 4);
        audiologicalGridPane.add(l1CheckBox, 1, 5);
        audiologicalGridPane.add(l2CheckBox, 1, 6);
        audiologicalGridPane.add(l3CheckBox, 1, 7);
        audiologicalGridPane.add(l4CheckBox, 1, 8);
        audiologicalGridPane.add(l6CheckBox, 1, 9);
        audiologicalGridPane.add(l8CheckBox, 1, 10);
        audiologicalGridPane.add(l10CheckBox, 1, 11);
        audiologicalGridPane.add(l12CheckBox, 1, 12);
        
        //Right ear tinnitus test section        
        Label pitchMatch = new Label("Tinnitus Pitch Match:");
        audiologicalGridPane.add(pitchMatch, 0, 14);
        Label tpr = new Label("TP Right Ear:");
        TextField tprTextField = new TextField("Hz");
        audiologicalGridPane.add(tpr, 3, 14);
        audiologicalGridPane.add(tprTextField, 4, 14);
        
      //left ear tinnitus test section
        Label tpl = new Label("TP Left Ear:");
        TextField tplTextField = new TextField("Hz");
        audiologicalGridPane.add(tpl, 1, 14);
        audiologicalGridPane.add(tplTextField, 2, 14);
        
        //Match type section
        Label matchTypeLabel = new Label("Tinnitus Match Type:");
        CheckBox ptRBox = new CheckBox("PT");
        CheckBox nbRBox = new CheckBox("NB");
        CheckBox nbnRBox = new CheckBox("NBN");
        CheckBox wnRBox = new CheckBox("WN");
        
        CheckBox ptLBox = new CheckBox("PT");
        CheckBox nbLBox = new CheckBox("NB");
        CheckBox nbnLBox = new CheckBox("NBN");
        CheckBox wnLBox = new CheckBox("WN");

        audiologicalGridPane.add(matchTypeLabel, 0, 15);
//        audiologicalGridPane.add(leftEarLabel, 1, 15);
//        audiologicalGridPane.add(rightEarLabel, 2, 15);
        
        //left ear options
        audiologicalGridPane.add(ptLBox, 1, 16);
        audiologicalGridPane.add(nbLBox, 1, 17);
        audiologicalGridPane.add(nbnLBox, 1, 18);
        audiologicalGridPane.add(wnLBox, 1, 19);
        
        //right ear options
        audiologicalGridPane.add(ptRBox, 2, 16);
        audiologicalGridPane.add(nbRBox, 2, 17);
        audiologicalGridPane.add(nbnRBox, 2, 18);
        audiologicalGridPane.add(wnRBox, 2, 19);

        Label loudnessMatch = new Label("Tinnitus loudness match:");
        audiologicalGridPane.add(loudnessMatch, 0, 20);

        Label tlr = new Label("T LR:");
        TextField tlrTextField = new TextField("in dB");
        audiologicalGridPane.add(tlr, 3, 20);
        audiologicalGridPane.add(tlrTextField, 4, 20);
        
        Label tll = new Label("T LL:");
        TextField tllTextField = new TextField("in dB");
        audiologicalGridPane.add(tll, 1, 20);
        audiologicalGridPane.add(tllTextField, 2, 20);
        
        Label thresHearing = new Label("Threshold of Hearing:");
        audiologicalGridPane.add(thresHearing, 0, 21);
        
        Label thrLabel = new Label();
        Label tlrsLabel =new Label();
        Label trlsLabel = new Label();
        Label thlLabel = new Label();
        Label tlsLabel = new Label();
        
        TextField thr = new TextField();
        TextField trls = new TextField();
        TextField thl = new TextField();
        TextField tls = new TextField();
        audiologicalGridPane.add(thrLabel, 3,21);
        audiologicalGridPane.add(thlLabel, 1, 21);
        //audiologicalGridPane.add(child, columnIndex, rowIndex);
        audiologicalGridPane.add(trlsLabel, 3, 22);
        
        //WNR and WNL test section
        Label wnrLabel = new Label("WNR:"); 
        TextField wnr = new TextField();
        
        Label wnllabel = new Label("WNL:");
        TextField wnl = new TextField();
        
        //minimal masking level test section
        Label minMaskLvl = new Label("Minimal Masking Level:");
        
        Label mrrLabel = new Label("MRR");
        TextField mrrTextField = new TextField();
        
        Label mrbLabel = new Label("MRB");
        TextField mrbTextField = new TextField();
        
        Label mbrLabel = new Label("MBR");
        TextField mbrTextField = new TextField();
        
        Label mrlLabel = new Label("MRL");
        TextField mrlTextField = new TextField();
        
        Label mlbLabel = new Label("MLB");
        TextField mlbTextField = new TextField();
        
        Label mblLabel = new Label("MBL");
        TextField mbl = new TextField();
        
        //sd test section
        Label rsdLabel = new Label("R SD");
        TextField rsdTextField = new TextField();
        
        Label lsdLabel = new Label("L SD");
        TextField lsdTextField = new TextField();
        
        
        //pure tone Loudness discomfort level test section
        
        // right ear loudness buttons
        CheckBox lr50CheckBox = new CheckBox("LR50");
        CheckBox lr1CheckBox = new CheckBox("LR1");
        CheckBox lr2CheckBox = new CheckBox("LR2");
        CheckBox lr3CheckBox = new CheckBox("LR3");
        CheckBox lr4CheckBox = new CheckBox("LR4");
        CheckBox lr6CheckBox = new CheckBox("LR6");
        CheckBox lr8CheckBox = new CheckBox("LR8");
        CheckBox lr12CheckBox = new CheckBox("LR12");
        
        //TP left and right ear
        CheckBox lrtp = new CheckBox("LRTP");
        CheckBox lltp = new CheckBox("LLTP");
        
        CheckBox ll50CheckBox = new CheckBox("LL50");
        CheckBox ll1CheckBox = new CheckBox("LL1");
        CheckBox ll2CheckBox = new CheckBox("LL2");
        CheckBox ll3CheckBox = new CheckBox("LL3");
        CheckBox ll4CheckBox = new CheckBox("LL4");
        CheckBox ll6CheckBox = new CheckBox("LL6");
        CheckBox ll8CheckBox = new CheckBox("LL8");
        CheckBox ll12CheckBox = new CheckBox("LL12");
        
        TextArea commentSection = new TextArea();

        
        
        this.setContent(audiologicalGridPane);
	}
	
	public GridPane getAudiologicalGridPane() {
		return this.audiologicalGridPane; 
	}

}
