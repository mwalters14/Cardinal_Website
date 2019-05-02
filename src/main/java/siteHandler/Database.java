package siteHandler;


import java.sql.*;

public class Database {
    public static Connection connect() {
        String url = "jdbc:sqlite:C:\\Java\\Student_Management_System\\src\\sample\\users1.db";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            System.out.println(e.getMessage());
        }
        return conn;
    }

    static Connection conn = connect();
    static Statement stmt;
    static ResultSet results;

    public static void closeConnections() {
        try {
            if(results != null) {
                results.close();
                //System.out.println("ResultSet closed successfully.");
            }

            if (stmt != null) {
                stmt.close();
                //System.out.println("Statement closed successfully.");
            }

            if (conn != null) {
                conn.close();
                //System.out.println("Database connection closed successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing connection");
            System.out.println(e.getMessage());
        }
    }

    public static void createTable(String createTable) {
        try {
            stmt = conn.createStatement();
            if (stmt.execute(createTable)) {
                System.out.println("Table created successfully.");
                System.out.println("");
            }
        } catch (SQLException e) {
            System.err.println("Error creating table.");
            System.err.println(e.getMessage());
        }
    }

    public static void insertData(String insertData) {
        try {
            stmt = conn.createStatement();
            stmt.execute(insertData);
            System.out.println("Data inserted successfully.");
            System.out.println("");
        } catch (SQLException e) {
            System.err.println("Error inserting data into the database.");
            System.err.println(e.getMessage());
        }
    }

    public static void deleteData(String dataToDelete, String name) {
        try {
            stmt = conn.createStatement();
            stmt.execute(dataToDelete);
            System.out.println("Deleted student successfully.");
            System.out.println("");
        } catch (SQLException e) {
            System.out.println("Error removing data from database.");
            System.out.println(e.getMessage());
        }

    }

    public static ResultSet resultSet_Data(String query) {
        stmt = null;
        results = null;

        try {
            stmt = conn.createStatement();
            stmt.execute(query);
            results = stmt.getResultSet();
        } catch (SQLException e) {
            System.err.println("Error querying database.");
            System.err.println(e.getMessage());
        }
        return results;
    }
}