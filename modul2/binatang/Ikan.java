package com.raka.modul2.binatang;

public class Ikan extends Binatang{

    // Inisiasi variabel
    public String nama;
    public String berenang;

    // Method getName untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    // Method terbang untuk mencetak kebiasaan hewan Ikan
    public void berenang(){
        System.out.println("Tingkah Laku\t: " + berenang);
    }
}
