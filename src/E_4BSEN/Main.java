/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_4BSEN;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String args[]) {
    try {
        // Mengaktifkan tema Light (Putih Bersih)
        com.formdev.flatlaf.FlatLightLaf.setup();
        
        // Kalau mau tema Dark (Gelap), pakai ini:
        // com.formdev.flatlaf.FlatDarkLaf.setup();
    } catch (Exception ex) {
        System.err.println("Gagal mengaktifkFlatLafan FlatLaf");
    }

    // Jalankan frame kamu di sini
    java.awt.EventQueue.invokeLater(() -> {
        new Login().setVisible(true);
    });
}
}
