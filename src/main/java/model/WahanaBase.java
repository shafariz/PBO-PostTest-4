/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class WahanaBase {
    protected String nama;
    protected String lokasi;
    protected int harga;

    public WahanaBase(String nama, String lokasi, int harga) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.harga = harga;
    }

    // Abstract method → wajib diisi di subclass
    public abstract String deskripsi();

    // Getter & Setter
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    public int getHarga() { return harga; }
    public void setHarga(int harga) { this.harga = harga; }
}

