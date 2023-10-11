/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    String nama;
    int npm;
    String kelas;
    
    void membaca(){
        System.out.println(nama + " sedang membaca");
    }
    void nyontek(){
        System.out.println(nama + " sedang menyontek");
    }
    void modifikasi(){
        System.out.println("Perkenalkan nama saya " + nama + " dengan npm " + npm + ", saya kelas " + kelas);
    }
}
