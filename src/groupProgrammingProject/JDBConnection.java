package groupProgrammingProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;

public class JDBConnection {

	public static void main(String[] args) throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost/sys";
		String user = "root";
		String password = "toshiba";

		Connection myConn = DriverManager.getConnection(dbUrl, user, password);

		Statement myStmt = myConn.createStatement();

		ResultSet myRs = myStmt.executeQuery("select customer_id from customer where customer_id = 'CUS00001';" );

		
		System.out.print(myRs.getString(0));
		
		//java.sql.ResultSetMetaData resultset = myRs.getMetaData();
		
		
		
		//while(myRs.next()){
			//myRs.getString(1);
		//}
		
		
		//String myFirstName = myRs.getString("first_Name");
		
		//System.out.println(myFirstName);
		
		//System.out.println(myRs.toString());
		
		//System.out.println(storedName);

	}

}
