import java.sql.*;
import java.util.Scanner;


public class CallableStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = JdbcManager.createConnection();
		
		
		java.sql.CallableStatement cmt =  con.prepareCall("{call totalPrice(?)}");
		
		Scanner s = new Scanner(System.in);
		String ordno = s.next();
		
		cmt.setString(1, ordno);
		
		
		cmt.execute();
		
		cmt.close();
		con.close();

	}

}
