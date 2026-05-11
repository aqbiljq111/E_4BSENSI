/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package E_4BSEN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        
        try {
            
            if (koneksi == null || koneksi.isClosed()) {
           
                String url = "jdbc:mysql://localhost:3306/absensi_kelas";
                String user = "root";
                String password = "";

                // Driver MySQL modern (tidak perlu registerDriver manual)
                Class.forName("com.mysql.cj.jdbc.Driver");

                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil!");
            }
        
        } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }

        return koneksi;
    }

    public static void main(String[] args) {
        getKoneksi();
    }
}
