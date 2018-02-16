package com.employees.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySQL {

    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3308/employees";
    private String username = "root";
    private String password = "";



    public String getSalary(String last_name) {
        String result = "";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, username, password);
            String query = "SELECT employees.last_name, salaries.salary as ss from employees INNER JOIN salaries " +
                    "ON employees.emp_no=salaries.emp_no where employees.last_name like "'+last_name+'"";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getString("ss");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return result;
    }

}

