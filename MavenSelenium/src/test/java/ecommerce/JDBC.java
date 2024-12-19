package ecommerce;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class JDBC {
@Test
public void data() throws ClassNotFoundException {
	String dburl="jdbc:mysql://localhost:3306/advSelenium";    //specify path
	Class.forName("com.mysql.cj.jdbc.Driver"); // connector file path to db
	try {
		DriverManager.getConnection(dburl,"root","root");
		System.out.println("connection established");
	} catch (SQLException e) {
		System.out.println("connection failed");
		e.printStackTrace();
	}
}
}
