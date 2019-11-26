package teamproj;

public class Patient {
	private String firstName;
	private String lastName;
	private String thcNumber;
	private Visit visit;
	
	public Patient()
	{
		
	}
	
	public Patient(String firstName, String lastName, String thcNumber, Visit visit) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.thcNumber = thcNumber;
		this.visit = visit;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getThcNumber() {
		return thcNumber;
	}

	public void setThcNumber(String thcNumber) {
		this.thcNumber = thcNumber;
	}

	public Visit getVisit() {
		return visit;
	}

	public void setVisit(Visit visit) {
		this.visit = visit;
	}
}
