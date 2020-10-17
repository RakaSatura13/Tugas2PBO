package com.raka.modul2.binatang;

public class Burung extends Binatang {


    public String nama;
    public String terbang;

    // method getName
    public void getNama(){
        System.out.println("Nama Binatang\t\t: " + nama);
    }
    // Method terbang
    public void terbang(){
        System.out.println("Tingkah Laku\t\t: " + terbang);
    }
}
