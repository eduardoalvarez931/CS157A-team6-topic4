package teamproj;

import java.sql.*;

public class SQLRunner 
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
		          // Get a connection from the connection factory
			Connection con = DriverManager.getConnection(
			DB_URL,
			  //"jdbc:oracle:thin:@dbaprod1:1521:SHR1_PRD",
			USERNAME, PASSWORD);
	
			// Show some database/driver metadata
			SQLUtil.printDriverInfo(con);

			// Create a Statement object so we can submit SQL statements to the driver
			Statement stmt = con.createStatement();

			// Submit a query, creating a ResultSet object
			ResultSet rs = stmt.executeQuery(args[0]);

			// Display all columns and rows from the result set
			SQLUtil.displayResultSet(rs);

			// Close the result set
			rs.close();

			// Close the statement
			stmt.close();

			// Close the connection
			con.close();
		}
		catch (SQLException e)
		{
          	 	SQLUtil.printSQLExceptions(e);		
          	 }
	}	
}
