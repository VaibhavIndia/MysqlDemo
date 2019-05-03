package structure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionCreation 
{
	public static void main(String[] args) throws SQLException 
	{
		// TODO Auto-generated method stub.
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/test2", "root", "");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM `data` where id = 1");
		while (rs.next())	
		{
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getString("gender"));
			System.out.println(rs.getString("carid"));
		}
		
	}

}
