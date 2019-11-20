package teamproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import SQL.SQLUtil;

public class SQLProjTable {

	public static String USERNAME = new String("team6");//root
    public static String PASSWORD = new String("topic4");//My@pt102
	public static String DB_URL = new String("jdbc:mysql://localhost:3306/team6db");//"jdbc:mysql://localhost:3306/test"
	public static String JDBC_DRIVER = new String("com.mysql.jdbc.Driver");//"com.mysql.jdbc.Driver"	
	
	public static void main(String[] args)
	{
		
		try {
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

				for (int i=0; i<Tables.Tables.length; ++i)
				{
					int rowsAffected = stmt.executeUpdate(Tables.Tables[i]);
					if (rowsAffected == 1)
						System.out.println("OK");
				}
				
				
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