/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class WahanaAir extends Wahana {
    public WahanaAir(String nama, String lokasi, int harga) {
        super(nama, lokasi, harga);
    }

    @Override
    public String deskripsi() {
        return "Ini adalah wahana air bernama " + nama + " di " + lokasi + " dengan harga Rp" + harga;
    }

    @Override
    public String toString() {
        return "[Wahana Air] " + super.toString();
    }
}
