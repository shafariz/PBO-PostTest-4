/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Wahana extends WahanaBase {
    public Wahana(String nama, String lokasi, int harga) {
        super(nama, lokasi, harga);
    }

    @Override
    public String deskripsi() {
        return "Wahana umum bernama " + nama + " di " + lokasi + " dengan harga Rp" + harga;
    }

    @Override
    public String toString() {
        return nama + " - " + lokasi + " - Rp" + harga;
    }
}
