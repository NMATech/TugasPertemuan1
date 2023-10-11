/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Nilai {
        long NIM;
        String Nama;
        double NilaiAbsen;
        double NilaiTugas;
        double NilaiUTS;
        double NilaiUAS;
    
    double Nilai(){
        double NAbsen = NilaiAbsen * 0.1;
        double NTugas = NilaiTugas * 0.2;
        double NUts = NilaiUTS * 0.3;
        double NUas = NilaiUAS * 0.4;
        
        double hasil = NAbsen + NTugas + NUts + NUas;
        return hasil;
    }
    
    void CetakNilai(){
        System.out.println("NIM                 : " + this.NIM);
        System.out.println("Nama                : " + this.Nama);
        System.out.println("Nilai Absen[10%]    : " + this.NilaiAbsen);
        System.out.println("Nilai Tugas[20%]    : " + this.NilaiTugas);
        System.out.println("Nilai UTS[30%]      : " + this.NilaiUTS);
        System.out.println("Nilai UAS[40%]      : " + this.NilaiUAS);
        System.out.println("Nilai Akhir       : " + Nilai());
    }
}
