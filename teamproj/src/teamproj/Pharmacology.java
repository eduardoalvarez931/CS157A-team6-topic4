package teamproj;

public class Pharmacology {

	private String medicationName;
	private String genericName;
	private String dose;
	private String chemicalName;
	private String applicationInfo;
	private String duration;
	private String actionInfo;
	private String usualDose;
	private String tSide = "Yes";
	private int medNumber;
	
	public Pharmacology(String medicationName, String dose, String usualDosage)
	{
		this.medicationName = medicationName;
		this.dose = dose;
		usualDose = usualDosage;
	}

	public void setMedicationName(String medicationName) {
		this.medicationName = medicationName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public void setChemicalName(String chemicalName) {
		this.chemicalName = chemicalName;
	}

	public void setApplicationInfo(String applicationInfo) {
		this.applicationInfo = applicationInfo;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setActionInfo(String actionInfo) {
		this.actionInfo = actionInfo;
	}

	public void setUsualDose(String usualDose) {
		this.usualDose = usualDose;
	}

	public void settSide(String tSide) {
		this.tSide = tSide;
	}

	public void setMedNumber(int medNumber) {
		this.medNumber = medNumber;
	}
}
