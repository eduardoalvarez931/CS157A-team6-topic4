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

	public String getLastName() {
		return lastName;
	}

	public String getThcNumber() {
		return thcNumber;
	}

	public Visit getVisit() {
		return visit;
	}
	
}
