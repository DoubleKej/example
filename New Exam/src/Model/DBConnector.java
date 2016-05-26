package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnector {
	private static Connection conn;
	private static String DBPath="jdbc:mysql://localhost:8889/testDB";
	private static String user = "root";
	private static String password = "root";
	
	public void getConnection(){
			try {
				conn = DriverManager.getConnection(DBPath, user, password);
				System.out.println("Connected!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
	}
	
	//Sellect * From users
	public ResultSet getSelectResults(){
		try{
		stm = conn.createStatement();
		rs = stm.executeQuery("Select * From users");
	} catch(SQLException e){e.printStackTrace();}
	return rs;
	public void insertIntoUsers(String name, String pass){
		String sql = "INSERT INTO users(name, pass) VALUE ('"+name+"','"+pass"')";
	}
	
}
