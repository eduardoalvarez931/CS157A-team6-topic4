package teamproj;

public class Visit {
	private int visitID;
	private int thcNumber;
	//used to create Date format
	private int day;
	private int month;
	private int year;
	private int hour;
	private int minute;
	
	public Visit(int id){visitID = id;}
	
	public void setDate(int day, int month, int year, int hour, int minute)
	{
		this.day = day;
		this.month = month;
		this.year = year;
		this.hour = hour;
		this.minute = minute;
	}

	public int getVisitID() {return visitID;}

	public int getDay() {return day;}

	public int getMonth() {return month;}

	public int getYear() {return year;}

	public int getHour() {return hour;}

	public int getMinute() {return minute;}
}
