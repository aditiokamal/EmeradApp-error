/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Aditio
 */
public class DBConnection {
    private static Connection koneksi;

    public static Connection configDB()throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/db_emerad";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e) {
            System.out.println("Koneksi Database Gagal." + e.getMessage());
        }
        return koneksi;
    }
}
