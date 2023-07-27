package com.zept.practicetool.practicetool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    
    // Retrieve the data from the database and load it into the table in the UI
    public DefaultTableModel retrieveData() {
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT * FROM history"; // Select all records from the table
        try {
            Connection conn = connect();
            PreparedStatement insert = conn.prepareStatement(sql);
            ResultSet resultSet = insert.executeQuery();
            // Set columns for the table model
            model.addColumn("Date");
            model.addColumn("No. of Notes");
            model.addColumn("Average Time");
            // Loop through the results and add each data to the table
            while (resultSet.next()) {
                String date = resultSet.getString("date");
                int noOfNotes = resultSet.getInt("noOfNotes");
                int aveDuration = resultSet.getInt("aveDuration");
                model.addRow(new Object[]{date, noOfNotes,aveDuration});
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Failed to retrieve data from database");
        } finally {
            closeConnection();
        }
        return model;
    }
    
    public void clearHistory() {
        // Show a conformation pop-up window
        int result = JOptionPane.showConfirmDialog(null,"Permanently delete the history?","Confirmation",JOptionPane.YES_NO_OPTION);
        // Execute deletion upon user confirmation
        if (result == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM history";
            try {
                Connection conn = connect();
                PreparedStatement delete = conn.prepareStatement(sql);
                delete.executeUpdate();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            finally {
                closeConnection();
            }
        }
    }
}
