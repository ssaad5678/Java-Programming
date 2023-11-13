import java.sql.*;  
public class Myjdbc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:XE","kalyani","kalyani");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
