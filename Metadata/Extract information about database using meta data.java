package jdbcpack;
import java.sql.*;  
public class Myjdbc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:XE","kalyani","kalyani");  
			DatabaseMetaData dbmd=con.getMetaData();  
			String table[]={"VIEW"};  
			ResultSet rs=dbmd.getTables(null,null,null,table);  
			while(rs.next()){  
			System.out.println(rs.getString(3));  
			}  
			con.close();
		}
		catch(Exception e)
		{
System.out.println("Exception"+e);			
		}
	}
}
