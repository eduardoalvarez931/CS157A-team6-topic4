package teamproj;

import java.util.ArrayList;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.control.*; 
import javafx.geometry.Insets; 

public class AudiologicalTab extends Tab {
	private GridPane audiologicalGridPane;
	private LeftEar left;
	private RightEar right;
	
	public AudiologicalTab(String s) {
		super(s);		
		left = new LeftEar();
		right = new RightEar();

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
        
        audiologicalGridPane.add(rightEarLabel, 3, 2);
        audiologicalGridPane.add(r25CheckBox, 3, 3);
        audiologicalGridPane.add(r50CheckBox, 3, 4);
        audiologicalGridPane.add(r1CheckBox, 3, 5);
        audiologicalGridPane.add(r2CheckBox, 3, 6);
        audiologicalGridPane.add(r3CheckBox, 3, 7);
        audiologicalGridPane.add(r4CheckBox, 3, 8);
        audiologicalGridPane.add(r6CheckBox, 3, 9);
        audiologicalGridPane.add(r8CheckBox, 3, 10);
        audiologicalGridPane.add(r10CheckBox, 3, 11);
        audiologicalGridPane.add(r12CheckBox, 3, 12);
        
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
        TextField tprTextField = new TextField();
        tprTextField.setPromptText("Enter in Hz");
        audiologicalGridPane.add(tpr, 3, 14);
        audiologicalGridPane.add(tprTextField, 4, 14);
        
      //left ear tinnitus test section
        Label tpl = new Label("TP Left Ear:");
        TextField tplTextField = new TextField();
        tplTextField.setPromptText("Enter in Hz");
        audiologicalGridPane.add(tpl, 1, 14);
        audiologicalGridPane.add(tplTextField, 2, 14);
        
        //Match type section
        Label matchTypeLabel = new Label("Tinnitus Match Type:");
        audiologicalGridPane.add(matchTypeLabel, 0, 15);
        
        final ComboBox matchTypeLeftOptions = new ComboBox();
        matchTypeLeftOptions.getItems().addAll(" ", "PT", "NB", "NBN", "WN");
        audiologicalGridPane.add(matchTypeLeftOptions, 1, 15);

        final ComboBox matchTypeRightOptions = new ComboBox();
        matchTypeRightOptions.getItems().addAll(" ", "PT", "NB", "NBN", "WN");
        audiologicalGridPane.add(matchTypeRightOptions, 3, 15);

        Label loudnessMatch = new Label("Tinnitus loudness match:");
        audiologicalGridPane.add(loudnessMatch, 0, 20);

        Label tlr = new Label("T LR:");
        TextField tlrTextField = new TextField();
        tlrTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(tlr, 3, 21);
        audiologicalGridPane.add(tlrTextField, 4, 21);
        
        Label tll = new Label("T LL:");
        TextField tllTextField = new TextField();
        tllTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(tll, 1, 21);
        audiologicalGridPane.add(tllTextField, 2, 21);
        
        Label thresHearing = new Label("Threshold of Hearing:");
        audiologicalGridPane.add(thresHearing, 0, 22);
        
        //right ear
        Label thrLabel = new Label("Th R:");
        audiologicalGridPane.add(thrLabel, 3, 23);
        TextField thr = new TextField();
        thr.setPromptText("Enter in dB");
        audiologicalGridPane.add(thr, 4, 23);
        
        Label tlrsLabel =new Label("T RLs:");
        audiologicalGridPane.add(tlrsLabel, 3, 24);
        TextField tlrs = new TextField();
        tlrs.setPromptText("Enter in dB");
        audiologicalGridPane.add(tlrs, 4, 24);
        
        //left ear
        Label thlLabel = new Label("Th L:");
        audiologicalGridPane.add(thlLabel, 1, 23);
        
        Label tlsLabel = new Label("T Ls:");
        audiologicalGridPane.add(tlsLabel, 1, 24);
         
        //left ear
        TextField thl = new TextField();
        thl.setPromptText("Enter in dB");
        audiologicalGridPane.add(thl, 2, 23);
        TextField tls = new TextField();
        tls.setPromptText("Enter in dB");
        audiologicalGridPane.add(tls, 2, 24);

        //WNR and WNL test section
        Label wnrLabel = new Label("WNR:"); 
        TextField wnr = new TextField();
        wnr.setPromptText("Enter in dB");
        audiologicalGridPane.add(wnrLabel, 3, 25);
        audiologicalGridPane.add(wnr, 4, 25);
        
        
        Label wnllabel = new Label("WNL:");
        TextField wnl = new TextField();
        wnl.setPromptText("Enter in dB");
        audiologicalGridPane.add(wnllabel, 1, 25);
        audiologicalGridPane.add(wnl, 2, 25);
        
        //minimal masking level test section
        Label minMaskLvl = new Label("Minimal Masking Level:");
        audiologicalGridPane.add(minMaskLvl, 0, 26);
        
        Label mrrLabel = new Label("MRR:");
        TextField mrrTextField = new TextField();
        mrrTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(mrrLabel, 3, 27);
        audiologicalGridPane.add(mrrTextField, 4, 27);
        
        Label mrbLabel = new Label("MRB:");
        TextField mrbTextField = new TextField();
        mrbTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(mrbLabel, 3, 28);
        audiologicalGridPane.add(mrbTextField, 4, 28);
        
        Label mbrLabel = new Label("MBR:");
        TextField mbrTextField = new TextField();
        mbrTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(mbrLabel, 3, 29);
        audiologicalGridPane.add(mbrTextField, 4, 29);
        
        Label mrlLabel = new Label("MRL:");
        TextField mrlTextField = new TextField();
        mrlTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(mrlLabel, 1, 27);
        audiologicalGridPane.add(mrlTextField, 2, 27);
        
        Label mlbLabel = new Label("MLB:");
        TextField mlbTextField = new TextField();
        mlbTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(mlbLabel, 1, 28);
        audiologicalGridPane.add(mlbTextField, 2, 28);
        
        Label mblLabel = new Label("MBL:");
        TextField mblTextField = new TextField();
        mblTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(mblLabel, 1, 29);
        audiologicalGridPane.add(mblTextField, 2, 29);
        
        //sd test section
        Label rsdLabel = new Label("R SD:");
        TextField rsdTextField = new TextField();
        rsdTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(rsdLabel, 3, 30);
        audiologicalGridPane.add(rsdTextField, 4, 30);
        
        Label lsdLabel = new Label("L SD:");
        TextField lsdTextField = new TextField();
        lsdTextField.setPromptText("Enter in dB");
        audiologicalGridPane.add(lsdLabel, 1, 30);
        audiologicalGridPane.add(lsdTextField, 2, 30);
        
        
        //pure tone Loudness discomfort level test section
        Label loudnessDiscomfort = new Label("Pure Tone Loudness Discomfort Level:");
        audiologicalGridPane.add(loudnessDiscomfort, 0, 31);
        
        // right ear loudness buttons
        CheckBox lr50CheckBox = new CheckBox("LR50");
        CheckBox lr1CheckBox = new CheckBox("LR1");
        CheckBox lr2CheckBox = new CheckBox("LR2");
        CheckBox lr3CheckBox = new CheckBox("LR3");
        CheckBox lr4CheckBox = new CheckBox("LR4");
        CheckBox lr6CheckBox = new CheckBox("LR6");
        CheckBox lr8CheckBox = new CheckBox("LR8");
        CheckBox lr12CheckBox = new CheckBox("LR12");
        audiologicalGridPane.add(lr50CheckBox, 3, 32);
        audiologicalGridPane.add(lr1CheckBox, 3, 33);
        audiologicalGridPane.add(lr2CheckBox, 3, 34);
        audiologicalGridPane.add(lr3CheckBox, 3, 35);
        audiologicalGridPane.add(lr4CheckBox, 3, 36);
        audiologicalGridPane.add(lr6CheckBox, 3, 37);
        audiologicalGridPane.add(lr8CheckBox, 3, 38);
        audiologicalGridPane.add(lr12CheckBox, 3, 39);
        
        //TP left and right ear
        CheckBox lrtp = new CheckBox("LRTP");
        audiologicalGridPane.add(lrtp, 3, 40);
        CheckBox lltp = new CheckBox("LLTP");
        audiologicalGridPane.add(lltp, 1, 40);
        
        CheckBox ll50CheckBox = new CheckBox("LL50");
        CheckBox ll1CheckBox = new CheckBox("LL1");
        CheckBox ll2CheckBox = new CheckBox("LL2");
        CheckBox ll3CheckBox = new CheckBox("LL3");
        CheckBox ll4CheckBox = new CheckBox("LL4");
        CheckBox ll6CheckBox = new CheckBox("LL6");
        CheckBox ll8CheckBox = new CheckBox("LL8");
        CheckBox ll12CheckBox = new CheckBox("LL12");
        audiologicalGridPane.add(ll50CheckBox, 1, 32);
        audiologicalGridPane.add(ll1CheckBox, 1, 33);
        audiologicalGridPane.add(ll2CheckBox, 1, 34);
        audiologicalGridPane.add(ll3CheckBox, 1, 35);
        audiologicalGridPane.add(ll4CheckBox, 1, 36);
        audiologicalGridPane.add(ll6CheckBox, 1, 37);
        audiologicalGridPane.add(ll8CheckBox, 1, 38);
        audiologicalGridPane.add(ll12CheckBox, 1, 39);
        
        Label comment = new Label("Additional Comments:");
        audiologicalGridPane.add(comment, 0, 41);
        TextArea commentSection = new TextArea();
        commentSection.setMaxWidth(200);
        commentSection.setMaxHeight(100);
        audiologicalGridPane.add(commentSection, 0, 42);

        Button saveButton = new Button("Save");
        saveButton.setOnAction((event)->
        {
        	left.setF25(l25CheckBox.isSelected());
        	left.setF50(l50CheckBox.isSelected());
        	left.setF1(l25CheckBox.isSelected());
        	left.setF2(l50CheckBox.isSelected());
        	left.setF3(l25CheckBox.isSelected());
        	left.setF4(l50CheckBox.isSelected());
        	left.setF6(l25CheckBox.isSelected());
        	left.setF8(l50CheckBox.isSelected());
        	left.setF10(l25CheckBox.isSelected());
        	left.setF12(l50CheckBox.isSelected());
        	
        	left.setL50(ll50CheckBox.isSelected());
        	left.setL1(ll1CheckBox.isSelected());
        	left.setL2(ll2CheckBox.isSelected());
        	left.setL3(ll3CheckBox.isSelected());
        	left.setL4(ll4CheckBox.isSelected());
        	left.setL6(ll6CheckBox.isSelected());
        	left.setL8(ll8CheckBox.isSelected());
        	left.setL12(ll12CheckBox.isSelected());
        	left.setLtp(lltp.isSelected());
        	
        	left.setThresHearing(Integer.parseInt(tllTextField.getText()));
        	left.setTinLoudMatch(Integer.parseInt(thl.getText()));
        	left.setThresHearTLs(Integer.parseInt(tls.getText()));
        	left.setWN(Integer.parseInt(wnl.getText()));
        	
        	left.setMr(Integer.parseInt(mrlTextField.getText()));
        	left.setM_b(Integer.parseInt(mlbTextField.getText()));
        	left.setMb_(Integer.parseInt(mblTextField.getText()));
        	left.setSd(Integer.parseInt(lsdTextField.getText()));
        	
        	right.setF25(l25CheckBox.isSelected());
        	right.setF50(l50CheckBox.isSelected());
        	right.setF1(l25CheckBox.isSelected());
        	right.setF2(l50CheckBox.isSelected());
        	right.setF3(l25CheckBox.isSelected());
        	right.setF4(l50CheckBox.isSelected());
        	right.setF6(l25CheckBox.isSelected());
        	right.setF8(l50CheckBox.isSelected());
        	right.setF10(l25CheckBox.isSelected());
        	right.setF12(l50CheckBox.isSelected());
        	
        	right.setL50(lr50CheckBox.isSelected());
        	right.setL1(lr1CheckBox.isSelected());
        	right.setL2(lr2CheckBox.isSelected());
        	right.setL3(lr3CheckBox.isSelected());
        	right.setL4(lr4CheckBox.isSelected());
        	right.setL6(lr6CheckBox.isSelected());
        	right.setL8(lr8CheckBox.isSelected());
        	right.setL12(lr12CheckBox.isSelected());
        	right.setLtp(lrtp.isSelected());
        	
        	right.setThresHearing(Integer.parseInt(tlrTextField.getText()));
        	right.setTinLoudMatch(Integer.parseInt(thrLabel.getText()));
        	right.setThresHearTLs(Integer.parseInt(tlrs.getText()));
        	right.setWN(Integer.parseInt(wnr.getText()));
        	
        	right.setMr(Integer.parseInt(mrrTextField.getText()));
        	right.setM_b(Integer.parseInt(mrbTextField.getText()));
        	right.setMb_(Integer.parseInt(mbrTextField.getText()));
        	right.setSd(Integer.parseInt(rsdTextField.getText()));
        });
        
        Button cancel = new Button("Cancel");
        audiologicalGridPane.add(saveButton, 2, 43);
        audiologicalGridPane.add(cancel, 3, 43);
        
        this.setContent(audiologicalGridPane);
	}
	
	public GridPane getAudiologicalGridPane() {
		return this.audiologicalGridPane; 
	}

}
