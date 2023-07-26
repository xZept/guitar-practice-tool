package com.zept.practicetool.practicetool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Allen James Laxamana
 */
public class Database extends Connect {
    public Database() {
        super(); // Call the constructor of the parent class
        createNewTable(); // Create a database if there is none
    }
    // Insert the records to database
    public void insertToDB(String date, int noOfNotes, int aveDuration) {
        String sql = "INSERT INTO history(date,noOfNotes,aveDuration) VALUES(?,?,?)";
        try {
            Connection conn = connect();
            PreparedStatement insert = conn.prepareStatement(sql);
            insert.setString(1,date);
            insert.setInt(2, noOfNotes);
            insert.setInt(3, aveDuration);
            insert.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConnection();
        }
    }
}
