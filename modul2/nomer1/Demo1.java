package com.raka.modul2.nomer1;

public class Demo1 {
    public static void main(String[] args) {
        nomer1 club1 = new nomer1();
        nomer1 club2 = new nomer1("Persija");
        nomer1 club3 = new nomer1("Persija", 1928);
        nomer1 club4 = new nomer1("Persija", 1928, "Gelora Bung Karno");
        nomer1 club5 = new nomer1("Persija", 1928, "Gelora Bung Karno", 2, "Persija Jakarta adalah sebuah klub sepak bola Liga Utama");

        // Memanggil Method getTeam dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
