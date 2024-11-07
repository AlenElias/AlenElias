package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetEmp {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dname","root","root");
		PreparedStatement preparedStatement =connection.prepareStatement("select * from person ");
		ResultSet resultset=preparedStatement.executeQuery();
		while(resultset.next()) {
			System.out.println("person id is:"+resultset.getInt(1));
			System.out.println("person name is:"+resultset.getString(2));
			System.out.println("person age is:"+resultset.getInt(3));
			System.out.println("person gender is:"+resultset.getString(4));
			System.out.println("person phno is"+resultset.getLong(5));
			System.out.println("______________________________");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
