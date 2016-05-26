package Model;


public class Main {
	public static void main(String[] args){
		DBConnector dbc = new DBConnector();
		dbc.getConnection();
		ResultSet rs = dbc.getSelectResults();
		while (rs.next()){
			String name = rs.getString(1);
			String pass = rs.getString(2);
			System.out.println("name:" + name + "pass:" + pass);
			
		}
		dbc.insertIntoUsers("NgocTrinh", ""123123);
	}
}
