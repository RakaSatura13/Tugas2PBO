package com.raka.modul2.binatang;

public class DemoBinatang {
    public static void main(String[] args) {

// objek burung
        Burung burung = new Burung();
        burung.nama = "Burung Elang";
        burung.makan = "Ular";
        burung.tidur = "Burung Elang tidur pada malam hari";
        burung.terbang = "Burung Elang Terbang Menggunakan Sayap";


        System.out.println("==== BURUNG =====");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "lele";
        ikan.makan = "Ikan lele makan pelet";
        ikan.tidur = "Ikan lele tidur pada malam hari";
        ikan.berenang = "Ikan lele berenang menggunakan sirip";

        System.out.println();

        // Memanggil Method
        System.out.println("==== IKAN ====");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Anggora";
        kucing.makan = "Kucing Anggora Makan - makanan kucing";
        kucing.tidur = "Kucing Anggora Tidur Pada Malam Hari";
        kucing.meong = "Kucing Angora Meong Saat Musim Kawin";

        // Memanggil Method
        System.out.println("==== KUCING ====");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }
}