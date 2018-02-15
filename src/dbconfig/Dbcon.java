package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//step 1:import all the required packages
public class Dbcon 
{
	private static Connection con;
//step 2:declare all the credentials
	private final static String USER="system";
	private final static String PASSWORD="123A";
	private final static String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private final static String DRIVERNAME="oracle.jdbc.driver.OracleDriver";
	
//step 3:load the driver
static
{
	try 
	{
		Class.forName(DRIVERNAME);
	} 
	catch (ClassNotFoundException e) 
	{
		e.printStackTrace();
	}
	
}

//step 4:write a user define function to get connection
public static Connection getCon(){
	
	try 
	{
		con=DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("connected");
	} 
	catch (SQLException e) 
	{
		e.printStackTrace();
	}
	
	return con;
}


}
