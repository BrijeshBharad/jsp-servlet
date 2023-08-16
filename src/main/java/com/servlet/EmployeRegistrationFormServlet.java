package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.Employee;
import com.dao.DaoClass;

@WebServlet("/EmployeeRegistration")
public class EmployeRegistrationFormServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String userName = request.getParameter("user_name");
		String userPassword = request.getParameter("user_password");
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		String firstAddress = request.getParameter("first_address");
		String secondAddress = request.getParameter("second_address2");
		String contactNo = request.getParameter("contact_no");

		Employee employee = new Employee();
		employee.setFirst_name(firstName);
		employee.setLast_name(lastName);
		employee.setUser_name(userName);
		employee.setUser_password(userPassword);
		employee.setGender(gender);
		employee.setFirst_address(firstAddress);
		employee.setSecond_address2(secondAddress);
		employee.setContact_no(contactNo);
		DaoClass.saveData(employee);
	}

}