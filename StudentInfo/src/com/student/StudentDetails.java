package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class StudentDetails {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3308/studentdb";
		String dbusername = "root";
		String dbpassword = "";
		
	    int Student_Id = 106;
	    
	    		try {
		Connection conn = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);
		
		String sql = "DELETE FROM students WHERE Student_Id=?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, Student_Id);
		
		int rows = statement.executeUpdate();
		
		if(rows > 0) {
			System.out.println("The student information has been deleted");
		}
	
		conn.close();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
}
