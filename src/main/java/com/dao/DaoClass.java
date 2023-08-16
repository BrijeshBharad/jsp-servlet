package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Employee;

public class DaoClass {

	public static int saveData(Employee employee) {
		int result = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Drivers not found");
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedata", "root","root");
			String insert = "INSERT INTO employee_registration_details(first_name, last_name, user_name, user_password, gender, first_address, second_address, contact_No) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setString(1, employee.getFirst_name());
			preparedStatement.setString(2, employee.getLast_name());
			preparedStatement.setString(3, employee.getUser_name());
			preparedStatement.setString(4, employee.getUser_password());
			preparedStatement.setBoolean(5, employee.isGender());
			preparedStatement.setString(6, employee.getFirst_address());
			preparedStatement.setString(7, employee.getSecond_address2());
			preparedStatement.setString(8, employee.getContact_no());
			result = preparedStatement.executeUpdate();
			if (result > 0) {
				System.out.println("Success");
			} else {
				System.out.println("Error");
			}
		} catch (SQLException e) {
			System.out.println("Database not found");
		}
		return result;
	}

}
