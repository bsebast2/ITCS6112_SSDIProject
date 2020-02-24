package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.employee.Model.FetchEmployeeModel;
/**
 * Servlet implementation class FetchDataServlet
 */
@WebServlet("/FetchDataServlet")
public class FetchDataServlet extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			
			ArrayList<FetchEmployeeModel> list = new ArrayList<>();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "root");
			Statement stmt = con.createStatement();
			String sql;
			sql = "SELECT * FROM EMPLOYEES";
			ResultSet rs = stmt.executeQuery(sql);
			
			PrintWriter out = response.getWriter();
			response.setContentType("application/json");
			
			while(rs.next()) {
				FetchEmployeeModel fetch = new FetchEmployeeModel();
				fetch.setId(rs.getInt("id"));
				fetch.setFrist_name(rs.getString("first_name"));
				fetch.setLast_name(rs.getString("last_name"));
				fetch.setEmail_address(rs.getString("email_address"));			
				
				list.add(fetch);
				}
			
			request.setAttribute("list", list);
			
			//System.out.println(list);
			
			request.getRequestDispatcher("ShowEmployee.jsp").forward(request, response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
