/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Wahana;
import java.util.ArrayList;

public class WahanaService {
    private ArrayList<Wahana> daftarWahana = new ArrayList<>();

    // Constructor dengan data awal
    public WahanaService() {
        daftarWahana.add(new Wahana("Haunted Coaster", "Zona A", 50000));
        daftarWahana.add(new Wahana("Merry-Go-Round", "Zona B", 30000));
        daftarWahana.add(new Wahana("Funny Boats", "Zona C", 40000));
    }

    // Overloading → 2 versi tambahWahana
    public void tambahWahana(Wahana wahanaBaru) {
        daftarWahana.add(wahanaBaru);
        System.out.println("Yeay! Wahana berhasil ditambahkan (pakai objek).");
    }

    public void tambahWahana(String nama, String lokasi, int harga) {
        daftarWahana.add(new Wahana(nama, lokasi, harga));
        System.out.println("Yeay! Wahana berhasil ditambahkan (pakai parameter).");
    }

    public void lihatWahana() {
        if (daftarWahana.isEmpty()) {
            System.out.println("Wah, belum ada wahana yang tersedia nih.");
        } else {
            System.out.println("\nDaftar Wahana:");
            for (int i = 0; i < daftarWahana.size(); i++) {
                System.out.println((i+1) + ". " + daftarWahana.get(i));
            }
        }
    }

    public void ubahWahana(int index, Wahana wahanaBaru) {
        if (index >= 0 && index < daftarWahana.size()) {
            daftarWahana.set(index, wahanaBaru);
            System.out.println("Yeay! Data wahana berhasil diubah.");
        } else {
            System.out.println("Nomor yang kamu masukkan tidak valid.");
        }
    }

    public void hapusWahana(int index) {
        if (index >= 0 && index < daftarWahana.size()) {
            daftarWahana.remove(index);
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor yang kamu masukkan tidak valid.");
        }
    }

    public int getJumlah() {
        return daftarWahana.size();
    }
}
