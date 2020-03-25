package com.nadzeya.java.basics;

import java.sql.*;

public class DBManager {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/project?useLegacyDatetimeCode=false&serverTimezone=America/New_York";
    private static final String USER = "root";
    private static final String PASS = "root";

    public void executeCommand(int type, String data) {
            if(type == 1) {
                System.out.println("\n----- Selecting by Style -----");
                String query = "SELECT * FROM dance WHERE Style = \"" + data + "\"";
                getDancers(query);
                System.out.println("----- Select by Style completed -----\n");
            } else {
                if(type == 2) {
                    System.out.println("\n----- Selecting by FirstName -----");
                    String query = "SELECT * FROM dance WHERE FirstName = \"" + data + "\"";
                    getDancers(query);
                    System.out.println("----- Select by FirstName completed -----\n");
                } else {
                    if(type == 3) {
                        System.out.println("\n----- Deleting by ID -----");
                        String query = "DELETE FROM dance WHERE id = " + data;
                        deleteDancers(query);
                        System.out.println("----- Deleting by ID completed -----\n");
                    }
                }
            }
    }

    private void getDancers() {
        getDancers("SELECT * from dance");
    }

    private void getDancers(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASS);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while(rs.next()){
                String Style = rs.getString(2);
                String FirstName = rs.getString(3);
                String LastName = rs.getString(4);
                System.out.println(FirstName + " " + LastName + " dances " + Style);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void deleteDancers(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASS);
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();
            con.close();

            getDancers();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    private void insertDancer(String query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(DATABASE_URL, USER, PASS);
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.execute();
            con.close();

            getDancers();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
