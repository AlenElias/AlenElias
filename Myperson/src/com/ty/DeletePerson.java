package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePerson {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dname","root","root");
		PreparedStatement preparedStatement =connection.prepareStatement("delete from person where id=?");
		preparedStatement.setInt(1, 101);
		preparedStatement.execute();
		
		
		connection.close();
		System.out.println("Data Deleted");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}