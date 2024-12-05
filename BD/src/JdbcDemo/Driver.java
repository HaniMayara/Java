package JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Driver {
	public static void main(String[] args) {
		try {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root", "hBM876,?YXb]z)%4T") ;
			Statement myState = myConn.createStatement();
			ResultSet rs = myState.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getInt("ID")+","+rs.getString("Email")+","+rs.getString("First_Name")+","+rs.getString("Last_Name"));
			}
			myConn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
