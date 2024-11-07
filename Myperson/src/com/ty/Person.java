package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Person {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the person id");
	int id=scanner.nextInt();
	System.out.println("Enter the person name");
	String name=scanner.next();
	System.out.println("Enter the person age");
	int age=scanner.nextInt();
	System.out.println("Enter the person gender");
	String gender=scanner.next();
	System.out.println("Enter the person mobile no");
	long phno=scanner.nextLong();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dname","root","root");
		PreparedStatement preparedStatement =connection.prepareStatement("insert into person values (?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setInt(3, age);
		preparedStatement.setString(4, gender);
		preparedStatement.setLong(5, phno);
		preparedStatement.execute();
		connection.close();
		System.out.println("Data Saved");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
