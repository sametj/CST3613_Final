package James.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBSupport {
	public static Connection establishConnection() throws SQLException{
		Connection connect = null;
		Properties connectProp = new Properties();
		connectProp.put("dbms","mysql");
		connectProp.put("user", "root");
		connectProp.put("password","root");
		connectProp.put("useSSL", "false");
		
		String P1 = "jdbc:";
		String P2 = "mysql";
		String P3 = "://";
		String P4 = "localhost:";
		int Port = 3306;
		String P5 = "/";
		String connectString = P1 + P2 + P3 + P4 + Port + P5;
		connect = DriverManager.getConnection(connectString,connectProp);
		System.out.println("CONNECT");
		return connect;		
	}
}
