package com.zept.practicetool.practicetool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Allen James Laxamana
 */
public class Connect {

    // Connection string
    static String url = "jdbc:sqlite:C:/Users/Allen James Laxamana/Documents/NetBeansProjects/PracticeTool/db/practicetool.db";
    static Connection con = null;
    // Connect to te database
    public static void connect() {
        try {
            con = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    // Create a new table if there is none
    public static void createNewTable() {
        String sql = "CREATE TABLE IF NOT EXISTS history (\n"
            + "id integer PRIMARY KEY,\n" 
            + "date text NOT NULL,\n"
            + "itemNo integer,\n"
            + "duration real\n"
            + ");";
        try {
            con = DriverManager.getConnection(url);
            Statement insert = con.createStatement();
            insert.execute(sql);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
