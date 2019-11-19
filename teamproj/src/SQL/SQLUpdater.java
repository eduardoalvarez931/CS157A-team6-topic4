package SQL;

import java.sql.*;
import java.util.StringTokenizer;

public class SQLUpdater
{
	public static String USERNAME = new String("yourname");
    public static String PASSWORD = new String("yourpasswd");
	public static String DB_URL = new String("your_db_url");
	public static String JDBC_DRIVER = new String("your_jdbc_driver");

	public static void
	main(String[] args) throws ClassNotFoundException
	{
		
		// Load the Driver
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName(JDBC_DRIVER);

		try
		{
//		    // Get a connection from the connection factory
//			Connection con = DriverManager.getConnection(
//			DB_URL,
//			  //"jdbc:oracle:thin:@dbaprod1:1521:SHR1_PRD",
//			USERNAME, PASSWORD);
			
			Connection con = 
			DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root", "default$"); 
	
			// Show some database/driver metadata
			SQLUtil.printDriverInfo(con);

			// Create a Prepared Statement object so we can submit DML to the driver
			PreparedStatement pstmt = con.prepareStatement(
			  "update STATE set FLOWER=?, BIRD=? where ABBREVIATION=?");

			// Do all updates in a single transaction
			con.setAutoCommit(false);

			// Submit the statement
			StringTokenizer	tokens = null;
			for (int i=0; i<UpdateRows.length; ++i)
			{
				System.out.print(UpdateRows[i] + "...");
				
				tokens = new StringTokenizer(UpdateRows[i], "|");
	
				pstmt.setString(3,  tokens.nextToken());	// abbreviation
				pstmt.setString(1,  tokens.nextToken());	// flower
				pstmt.setString(2,  tokens.nextToken());	// bird
				
				int rowsAffected = pstmt.executeUpdate();
				if (rowsAffected == 1)
					System.out.println("OK");
			}
			
			// Commit the work
			con.commit();
			con.setAutoCommit(true);

			// Close the statement
			pstmt.close();
		}
		catch (SQLException e)
		{
          	 	SQLUtil.printSQLExceptions(e);		
			try
			{
				System.err.println("Yikes, rolling back!");
				con.rollback();
			}
			catch (SQLException e2)
			{
          		 	SQLUtil.printSQLExceptions(e2);		
          		 }
          	}
          	finally
          	{
			try
			{
				// Close the connection
   	      	 		if (con != null)
          	 			con.close();
			}
			catch (SQLException e2)
			{
          		 	SQLUtil.printSQLExceptions(e2);		
          		 }
          	 }
	}	

	static String[]	UpdateRows = { 
"AK|Forget-me-not|Willow ptarmigan",
"AL|Camelia|Yellowhammer",
"AR|Apple Blossom|Mockingbird",
"AZ|Blossom of the Seguaro cactus|Cactus wren",
"CA|Golden poppy|California valley quail",
"CO|Rocky Mountain columbine|Lark bunting",
"CT|Mountain laurel|American robin",
"DE|Peach blossom|Blue hen chicken",
"FL|Orange blossom|Mockingbird",
"GA|Cherokee rose|Brown thrasher",
"HI|Hibiscus|Hawaiian goose",
"IA|Wild rose|Eastern goldfinch",
"ID|Syringa|Mountain bluebird",
"IL|Native violet|Cardinal",
"IN|Peony|Cardinal",
"KS|Native sunflower|Western meadowlark",
"KY|Goldenrod|Cardinal",
"LA|Magnolia|Eastern brown pelican",
"MA|Mayflower|Chickadee",
"MD|Black-eyed susan|Baltimore oriole",
"ME|White pine cone and tassel|Chickadee",
"MI|Apple blossom|Robin",
"MN|Pink and white lady's-slipper|Common loon",
"MO|Hawthorn|Bluebird ",
"MS|Magnolia|Mockingbird",
"MT|Bitterroot|Western meadowlark",
"NC|Dogwood|Cardinal",
"ND|Wild prairie rose|Western meadowlark",
"NE|Goldenrod|Western meadowlark",
"NH|Purple lilac|Purple finch",
"NJ|Purple violet|Eastern goldfinch",
"NM|Yucca|Roadrunner",
"NV|Sagebrush|Mountain bluebird",
"NY|Rose|Bluebird",
"OH|Scarlet carnation|Cardinal",
"OK|Mistletoe|Scissortailed flycatcher",
"OR|Oregon grape|Western meadowlark",
"PA|Mountain laurel|Ruffed grouse",
"RI|Violet|Rhode island red",
"SC|Carolina jessamine|Carolina wren",
"SD|Pasque flower|Ringnecked pheasant",
"TN|Iris|Mockingbird",
"TX|Bluebonnet|Mockingbird",
"UT|Sego lily|Seagull",
"VA|Dogwood|Cardinal",
"VT|Red clover|Hermit thrush",
"WA|Western rhododendron|Willow goldfinch",
"WI|Wood violet|Robin",
"WV|Big rhododendron|Cardinal",
"WY|Indian paintbrush|Meadowlark",
	};
}

