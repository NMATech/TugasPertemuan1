/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class MahasiswaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nama = "Nadindra Maulana Aziz";
        mhs.npm = 22139;
        mhs.kelas = "3C - Informatika";
        
        mhs.membaca();
        mhs.nyontek();
        mhs.modifikasi();
    }
    
}
