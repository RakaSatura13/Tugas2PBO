package com.raka.modul2.nomer1;

public class nomer1 {
    String nama;
    int tahunberdiri;
    String stadion;
    int juaraligadomestik;
    String deskripsi;

    // constructor 1 tanpa parameter
public nomer1 (){

}
// constructor 2 berisi 1 parameter
    public nomer1(String nama) {
        this.nama = nama;
    }
    // constructor 3 berisi 2 parameter
    public nomer1(String nama, int tahunberdiri) {
        this.nama = nama;
        this.tahunberdiri = tahunberdiri;
    }
    // constructor 4 berisi 3 parameter
    public nomer1(String nama, int tahunberdiri, String stadion) {
        this.nama = nama;
        this.tahunberdiri = tahunberdiri;
        this.stadion = stadion;
    }

    // constructor 5 berisi 5 parameter
    public nomer1(String nama, int tahunberdiri, String stadion, int juaraligadomestik, String deskripsi) {
        this.nama = nama;
        this.tahunberdiri = tahunberdiri;
        this.stadion = stadion;
        this.juaraligadomestik = juaraligadomestik;
        this.deskripsi = deskripsi;

    }
    // method getTeam
    public void getTeam(){
        System.out.println("Nama Club\t\t: " + nama);
        System.out.println("Tahun berdiri\t: " + tahunberdiri);
        System.out.println("Nama Stadion\t: " + stadion);
        System.out.println("Juara liga domestik \t\t: " + juaraligadomestik);
        System.out.println("Deskripsi Club\t: " + deskripsi);

    }

}
