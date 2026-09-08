/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import pendataanwarga.DataPusatWarga;
import pendataanwarga.Warga;

/**
 *
 * @author qonitah
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        DataPusatWarga pusatData = new DataPusatWarga("data01", "08 September 2026", true);
        
        int pilihan = 0;

        // Perulangan
        do {
            System.out.println("--------------------------------------------");
            System.out.println("  PENDATAAN WARGA KURANG MAMPU");
            System.out.println("--------------------------------------------");
            System.out.println("1. Tambah Data Warga (Create)");
            System.out.println("2. Tampilkan Data Warga (Read)");
            System.out.println("3. Ubah Data Warga (Update)");
            System.out.println("4. Hapus Data Warga (Delete)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            // Validasi
            if (input.hasNextInt()) {
                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.println("\n--- TAMBAH DATA WARGA ---");
                        System.out.print("Masukkan NIK            : ");
                        String nik = input.nextLine();
                        System.out.print("Masukkan Nama           : ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan Alamat         : ");
                        String alamat = input.nextLine();
                        
                        int tanggungan = -1;
                        // Perulangan
                        while (tanggungan < 0) {
                            System.out.print("Masukkan Jumlah Tanggungan: ");
                            if (input.hasNextInt()) {
                                tanggungan = input.nextInt();
                                input.nextLine();
                                if (tanggungan < 0) {
                                    System.out.println("Jumlah tanggungan tidak boleh minus!");
                                }
                            } else {
                                System.out.println("Harap masukkan angka yang valid!");
                                input.next();
                            }
                        }

                        Warga wargaBaru = new Warga(nik, nama, alamat, tanggungan);
                        pusatData.tambahWarga(wargaBaru);
                        break;

                    case 2:
                        pusatData.tampilkanSemuaWarga();
                        break;

                    case 3:
                        pusatData.tampilkanSemuaWarga();
                        if (pusatData.jumlahData() > 0) {
                            System.out.print("Masukkan nomor data yang ingin diubah: ");
                            if (input.hasNextInt()) {
                                int idxUpdate = input.nextInt() - 1;
                                input.nextLine();

                                System.out.print("Nama Baru: ");
                                String namaBaru = input.nextLine();
                                System.out.print("Alamat Baru: ");
                                String alamatBaru = input.nextLine();
                                System.out.print("Jumlah Tanggungan Baru: ");
                                int tanggunganBaru = input.nextInt();
                                input.nextLine();

                                boolean sukses = pusatData.ubahWarga(idxUpdate, namaBaru, alamatBaru, tanggunganBaru);
                                if (sukses) {
                                    System.out.println("Data warga berhasil diperbarui!");
                                } else {
                                    System.out.println("Nomor data tidak valid.");
                                }
                            } else {
                                System.out.println("Input tidak valid!");
                                input.next();
                            }
                        }
                        break;

                    case 4:
                        pusatData.tampilkanSemuaWarga();
                        if (pusatData.jumlahData() > 0) {
                            System.out.print("Masukkan nomor data yang ingin dihapus: ");
                            if (input.hasNextInt()) {
                                int idxHapus = input.nextInt() - 1;
                                input.nextLine();

                                boolean suksesHapus = pusatData.hapusWarga(idxHapus);
                                if (suksesHapus) {
                                    System.out.println("Data warga berhasil dihapus!");
                                } else {
                                    System.out.println("Nomor data tidak valid.");
                                }
                            } else {
                                System.out.println("Input tidak valid!");
                                input.next();
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Terima kasih telah menggunakan program ini!");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid! Masukkan angka 1 sampai 5.");
                }
            } else {
                System.out.println("Input harus berupa angka!");
                input.next();
            }

        } while (pilihan != 5);

        input.close();
    }
}