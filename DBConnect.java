package teamproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import SQL.SQLUtil;

public class DBConnect {

	public static String USERNAME = new String("team6");//root
    public static String PASSWORD = new String("topic4");//My@pt102
	public static String DB_URL = new String("jdbc:mysql://localhost:3306/team6db");//"jdbc:mysql://localhost:3306/test"
	public static String JDBC_DRIVER = new String("com.mysql.jdbc.Driver");//"com.mysql.jdbc.Driver"	
	private static Connection conn;
	
	public static Connection connect() throws SQLException
	{	
		try {
			Class.forName(JDBC_DRIVER).newInstance();
			//"jdbc:oracle:thin:@dbaprod1:1521:SHR1_PRD"
			}
			catch(Exception e)
			{
				System.out.println(e.getLocalizedMessage());
			}
		conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		return conn;
	}	
	
}
