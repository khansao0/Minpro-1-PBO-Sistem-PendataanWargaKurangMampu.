/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendataanwarga;

import java.util.ArrayList;

/**
 *
 * @author qonitah
 */

public class DataPusatWarga {
    // atribut
    private String idData;
    private String tanggalPendataan;
    private boolean statusValidasi;
    
    // array list nya
    private ArrayList<Warga> daftarWargaKurangMampu;
    
    // constructor
    public DataPusatWarga(String idData, String tanggalPendataan, boolean statusValidasi) {
        this.idData = idData;
        this.tanggalPendataan = tanggalPendataan;
        this.statusValidasi = statusValidasi;
        this.daftarWargaKurangMampu = new ArrayList<>();
    }
    
    // Method tambah data (create)
    public void tambahWarga(Warga warga) {
        this.daftarWargaKurangMampu.add(warga);
        System.out.println("Yeyy Data Berhasil ditambahkan");
    }
    
    // Method tampil data (read)
    public void tampilkanSemuaWarga() {
        if (this.daftarWargaKurangMampu.isEmpty()) {
            System.out.println("Belum ada data warga.");
        } else {
            System.out.println("------------------------------------------");
            for (int i = 0; i < daftarWargaKurangMampu.size(); i++) {
                Warga w = daftarWargaKurangMampu.get(i);
                System.out.println((i + 1) + ". NIK             : " + w.getNik());
                System.out.println("   Nama            : " + w.getNama());
                System.out.println("   Alamat          : " + w.getAlamat());
                System.out.println("   Jml Tanggungan  : " + w.getJumlahTanggungan());
                System.out.println("------------------------------------------");
            }
        }    
    }
    
    // Method untuk Mengubah Data (Update)
    public boolean ubahWarga(int index, String namaBaru, String alamatBaru, int tanggunganBaru) {
        if (index >= 0 && index < daftarWargaKurangMampu.size()) {
            Warga w = daftarWargaKurangMampu.get(index);
            w.setNama(namaBaru);
            w.setAlamat(alamatBaru);
            w.setJumlahTanggungan(tanggunganBaru);
            return true;
        }
        return false;
    }

    // Method untuk Menghapus Data (Delete)
    public boolean hapusWarga(int index) {
        if (index >= 0 && index < daftarWargaKurangMampu.size()) {
            daftarWargaKurangMampu.remove(index);
            return true;
        }
        return false;
    }

    public int jumlahData() {
        return daftarWargaKurangMampu.size();
    }

    // getter dan setter
    public String getIdData() { return idData; }
    public String getTanggalPendataan() { return tanggalPendataan; }
    public boolean getStatusValidasi() { return statusValidasi; } // Perbaikan tipe data getter menyesuaikan atribut boolean
}