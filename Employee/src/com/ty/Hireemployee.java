package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Hireemployee {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mystudent", "root", "root");
		Statement statement=connection.createStatement();
		statement.execute("insert into employee values(101,'anandhu'");
		connection.close();
		System.out.println("Data Saved");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
