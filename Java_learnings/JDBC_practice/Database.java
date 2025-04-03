package JDBC_practice;

import java.sql.*;

public class Database {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/MyDB";
        String username = "root";
        String password = "M1nohar@4231";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
            stmt = conn.createStatement();
            try {

                int count = stmt.executeUpdate("INSERT INTO Employees (id, empName, department) VALUES (21, 'manohar', 'IT')");
                System.out.println(count + " row affected");
            }catch (SQLException e) {
                e.printStackTrace();
            }
            try {
               rs = stmt.executeQuery("SELECT * FROM Employees");
               ResultSetMetaData rsmd = rs.getMetaData();
               int columnsNumber = rsmd.getColumnCount();
               while (rs.next()) {
                   for(int i=1;i<= columnsNumber;i++) {
                       if(i>1) System.out.println(", ");
                       String columnValue = rs.getString(i);
                       System.out.println(columnValue + " " + rsmd.getColumnName(i));
                   }
               }
            }catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                int count = stmt.executeUpdate("DELETE FROM Employees WHERE id = 21");
                System.out.println(count + " rows affected");
            }catch (SQLException e) {
                e.printStackTrace();
            }

        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
                if (conn != null) {
                    try{
                        conn.close();
                    }catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (rs != null) {
                    try {
                        rs.close();
                    }catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

    }

}
