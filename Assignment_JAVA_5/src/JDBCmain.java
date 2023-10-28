
import java.sql.*;
import java.util.Scanner;

class JdbcManager{
	//Create Connection
	static Connection createConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdatabase","root","1234");
		return con;
	}
	//Select all from employee table
	static void selectAll(Connection con) throws SQLException {
		Statement st = con.createStatement();
		String q = "Select * from employee";
		ResultSet rs = st.executeQuery(q);
		while(rs.next()) {
			System.out.println(rs.getString(1)+" " + rs.getString(2)+" " + rs.getString(3));
		}
		rs.close();	
	}
	
	//Select with Condition
	static void selectWithCondition(Connection con) throws SQLException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Employee no to be displayed");
		String eno = s.next();
		
		String q = "select * from employee where employeeId = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		
		pmt.setString(1, eno);
		
		ResultSet rs = pmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1)+" " + rs.getString(2)+" " + rs.getString(3));
		}
		s.close();
		rs.close();
	}
	
	//Update Employee 
	static void update(Connection con) throws SQLException {
		String q = "update employee set employeeType = ? where employeeId = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the empId : ");
		String eno = s.next();
		System.out.println("Enter employee type : ");
		String desg = s.next();
		
		pmt.setString(1, desg);
		pmt.setString(2, eno);
		
		int nor = pmt.executeUpdate();
		System.out.println("No of records updated : " + nor);
	}
	
	//Insert employee
	
	static void insert(Connection con) throws SQLException {
		String q = "Insert into employee(employeeId, employeeName, employeeType, pincode) values(?, ? , ?, ?)";
		PreparedStatement pmt = con.prepareStatement(q);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the empId : ");
		String eno = s.next();
		
		System.out.println("Enter the empName : ");
		String ename = s.next();
	
		System.out.println("Enter employee type : ");
		String desg = s.next();
		
		System.out.println("Enter the pincode : ");
		String pincode = s.next();
		
		pmt.setString(1, eno);
		pmt.setString(2, ename);
		pmt.setString(3, desg);
		pmt.setString(4, pincode);
		
		pmt.execute();
	}
	
	
	//delete employee
	static void delete(Connection con) throws SQLException {
		String q = "delete from employee where employeeId = ?";
		PreparedStatement pmt = con.prepareStatement(q);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the empId : ");
		String eno = s.next();
		
		pmt.setString(1, eno);
		int nor = pmt.executeUpdate();
		System.out.println("No of records deleted : " + nor);
		
	}
	
}

public class JDBCmain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = JdbcManager.createConnection();
		int enter = 1;
		while(enter == 1) {
			Scanner s = new Scanner(System.in);
			System.out.println("Choose a option  :-   1 : Select all , 2 : Select a particular emp, 3 : Update, 4 : Delete, 5 : Insert, 6 : exit");
			int token = s.nextInt();
			switch(token) {
				case 1 :JdbcManager.selectAll(con);
				break;
				
				case 2 : JdbcManager.selectWithCondition(con);
				break;
				
				case 3 : JdbcManager.update(con);
				break;
				
				case 4 : JdbcManager.delete(con);
				break;
				
				case 5 : JdbcManager.insert(con);
				break;
				
				case 6 : enter = 0;
				break;
				
				default : System.out.println("Enter a valid option");
			}
		}
		con.close();
		
		
		
		

	}

	
}
