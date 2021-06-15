package database;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		Statement stmt= con.createStatement();
		ResultSet rs= stmt.executeQuery("Select * from eproduct");
		
		while (rs.next()) {
			System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
		}
		
		//stmt.executeUpdate("insert into eproduct(name, price, date_added) values ('headfones',500,now())");
		//stmt.executeUpdate("delete from eproduct where name='Desktop'");
		//stmt.executeUpdate("update eproduct set price=20000 where name='Laptop'");
		//stmt.executeQuery("Select * from eproduct");
		
		//stmt.executeUpdate("drop database db1");
        CallableStatement stmt1 = con.prepareCall("{call add_product(?, ?)}"); 
        stmt1.setString(1, "IPhone");                                   
        BigDecimal obj = new BigDecimal(1900.50);  // bigdecimal object needs to be created                                  
        stmt1.setBigDecimal(2, obj);                 
        stmt1.executeUpdate();
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// we can give custom messages
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
