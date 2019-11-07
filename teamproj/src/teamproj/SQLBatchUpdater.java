package teamproj;

import java.sql.*;

public class SQLBatchUpdater
{
	public static String USERNAME = new String("yourname");
	public static String PASSWORD = new String("yourpasswd");
	public static String DB_URL = new String("your_db_url");
	public static String JDBC_DRIVER = new String("your_jdbc_driver");

	public static void
	main(String[] args) throws ClassNotFoundException
	{
		Connection con = null;
		
		// Load the Oracle Driver
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName(JDBC_DRIVER);

		try
		{
		          // Get a connection from the connection factory
			con = DriverManager.getConnection(
			DB_URL,
			 // "jdbc:oracle:thin:@dbaprod1:1521:SHR1_PRD",
USERNAME, PASSWORD);
	
			// Show some database/driver metadata
			SQLUtil.printDriverInfo(con);

			// Create a Prepared Statement object so we can submit DML to the driver
			Statement stmt = con.createStatement();

			// Do all updates in a single transaction
			con.setAutoCommit(false);

			// Submit the statement
			for (int i=0; i<UpdateRows.length; ++i)
			{
				System.out.println(UpdateRows[i] + "...");
				stmt.addBatch(UpdateRows[i]);
			}
			
			System.out.println();

			int[]	rc = stmt.executeBatch();
			int	rowsAffected = 0;
			for (int i=0; i<rc.length; ++i)
				rowsAffected+=rc[i];

			// Commit the work
			con.commit();
			con.setAutoCommit(true);

			System.out.println("OK -- " + rowsAffected + " rows affected");

			// Close the statement
			stmt.close();
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
"update STATE set ENTERED_UNION='1959-01-03' where ABBREVIATION='AK'",
"update STATE set ENTERED_UNION='1819-12-14' where ABBREVIATION='AL'",
"update STATE set ENTERED_UNION='1836-06-15' where ABBREVIATION='AR'",
"update STATE set ENTERED_UNION='1912-12-14' where ABBREVIATION='AZ'",
"update STATE set ENTERED_UNION='1850-09-09' where ABBREVIATION='CA'",
"update STATE set ENTERED_UNION='1876-08-01' where ABBREVIATION='CO'",
"update STATE set ENTERED_UNION='1788-01-09' where ABBREVIATION='CT'",
"update STATE set ENTERED_UNION='1787-12-07' where ABBREVIATION='DE'",
"update STATE set ENTERED_UNION='1845-03-03' where ABBREVIATION='FL'",
"update STATE set ENTERED_UNION='1788-01-02' where ABBREVIATION='GA'",
"update STATE set ENTERED_UNION='1959-08-21' where ABBREVIATION='HI'",
"update STATE set ENTERED_UNION='1846-12-28' where ABBREVIATION='IA'",
"update STATE set ENTERED_UNION='1890-07-03' where ABBREVIATION='ID'",
"update STATE set ENTERED_UNION='1818-12-03' where ABBREVIATION='IL'",
"update STATE set ENTERED_UNION='1816-12-11' where ABBREVIATION='IN'",
"update STATE set ENTERED_UNION='1861-01-29' where ABBREVIATION='KS'",
"update STATE set ENTERED_UNION='1792-06-01' where ABBREVIATION='KY'",
"update STATE set ENTERED_UNION='1812-04-30' where ABBREVIATION='LA'",
"update STATE set ENTERED_UNION='1788-02-06' where ABBREVIATION='MA'",
"update STATE set ENTERED_UNION='1788-04-28' where ABBREVIATION='MD'",
"update STATE set ENTERED_UNION='1820-03-15' where ABBREVIATION='ME'",
"update STATE set ENTERED_UNION='1837-01-26' where ABBREVIATION='MI'",
"update STATE set ENTERED_UNION='1858-05-11' where ABBREVIATION='MN'",
"update STATE set ENTERED_UNION='1821-08-10' where ABBREVIATION='MO'",
"update STATE set ENTERED_UNION='1817-12-10' where ABBREVIATION='MS'",
"update STATE set ENTERED_UNION='1889-11-08' where ABBREVIATION='MT'",
"update STATE set ENTERED_UNION='1789-11-21' where ABBREVIATION='NC'",
"update STATE set ENTERED_UNION='1889-11-02' where ABBREVIATION='ND'",
"update STATE set ENTERED_UNION='1867-03-01' where ABBREVIATION='NE'",
"update STATE set ENTERED_UNION='1788-06-21' where ABBREVIATION='NH'",
"update STATE set ENTERED_UNION='1787-12-18' where ABBREVIATION='NJ'",
"update STATE set ENTERED_UNION='1912-01-06' where ABBREVIATION='NM'",
"update STATE set ENTERED_UNION='1864-10-31' where ABBREVIATION='NV'",
"update STATE set ENTERED_UNION='1788-06-26' where ABBREVIATION='NY'",
"update STATE set ENTERED_UNION='1883-03-01' where ABBREVIATION='OH'",
"update STATE set ENTERED_UNION='1907-11-16' where ABBREVIATION='OK'",
"update STATE set ENTERED_UNION='1859-02-14' where ABBREVIATION='OR'",
"update STATE set ENTERED_UNION='1787-12-12' where ABBREVIATION='PA'",
"update STATE set ENTERED_UNION='1790-06-29' where ABBREVIATION='RI'",
"update STATE set ENTERED_UNION='1788-05-23' where ABBREVIATION='SC'",
"update STATE set ENTERED_UNION='1889-11-02' where ABBREVIATION='SD'",
"update STATE set ENTERED_UNION='1796-06-01' where ABBREVIATION='TN'",
"update STATE set ENTERED_UNION='1845-12-29' where ABBREVIATION='TX'",
"update STATE set ENTERED_UNION='1896-01-04' where ABBREVIATION='UT'",
"update STATE set ENTERED_UNION='1788-06-25' where ABBREVIATION='VA'",
"update STATE set ENTERED_UNION='1791-03-04' where ABBREVIATION='VT'",
"update STATE set ENTERED_UNION='1889-11-11' where ABBREVIATION='WA'",
"update STATE set ENTERED_UNION='1848-05-29' where ABBREVIATION='WI'",
"update STATE set ENTERED_UNION='1863-06-20' where ABBREVIATION='WV'",
"update STATE set ENTERED_UNION='1890-07-10' where ABBREVIATION='WY'"
	};
}

