package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dname","root","root");
		PreparedStatement preparedStatement =connection.prepareStatement("update person set name=? where id=?");
		preparedStatement.setString(1, "abhijith");
		preparedStatement.setInt(2, 102);
		preparedStatement.execute();
		connection.close();
		System.out.println("Data saved");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
