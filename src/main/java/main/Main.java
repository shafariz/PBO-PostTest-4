/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import model.*;
import service.WahanaService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WahanaService service = new WahanaService();
        int pilihan;

        do {
            System.out.println("\n=== Halooo! Selamat datang di Taman Hiburan ===");
            System.out.println("1. Tambah Wahana");
            System.out.println("2. Lihat Wahana");
            System.out.println("3. Ubah Wahana");
            System.out.println("4. Hapus Wahana");
            System.out.println("5. Keluar");
            System.out.print("Silahkan pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Jenis Wahana: 1. Air  2. Darat  3. Umum");
                    int jenis = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama wahana: ");
                    String nama = sc.nextLine();
                    System.out.print("Lokasi wahana: ");
                    String lokasi = sc.nextLine();
                    System.out.print("Harga tiket: ");
                    int harga = sc.nextInt();
                    sc.nextLine();

                    if (jenis == 1) {
                        service.tambahWahana(new WahanaAir(nama, lokasi, harga));
                    } else if (jenis == 2) {
                        service.tambahWahana(new WahanaDarat(nama, lokasi, harga));
                    } else {
                        service.tambahWahana(new Wahana(nama, lokasi, harga));
                    }
                    break;

                case 2:
                    service.lihatWahana();
                    break;

                case 3:
                    service.lihatWahana();
                    if (service.getJumlah() > 0) {
                        System.out.print("Nomor wahana yang mau diubah: ");
                        int ubah = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama baru: ");
                        String namaBaru = sc.nextLine();
                        System.out.print("Lokasi baru: ");
                        String lokasiBaru = sc.nextLine();
                        System.out.print("Harga baru: ");
                        int hargaBaru = sc.nextInt();
                        sc.nextLine();
                        service.ubahWahana(ubah-1, new Wahana(namaBaru, lokasiBaru, hargaBaru));
                    }
                    break;

                case 4:
                    service.lihatWahana();
                    if (service.getJumlah() > 0) {
                        System.out.print("Nomor wahana yang mau dihapus: ");
                        int hapus = sc.nextInt();
                        sc.nextLine();
                        service.hapusWahana(hapus-1);
                    }
                    break;

                case 5:
                    System.out.println("Babayyy, terimakasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak ada.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}

