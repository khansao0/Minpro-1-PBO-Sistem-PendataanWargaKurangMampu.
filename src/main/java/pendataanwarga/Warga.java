/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pendataanwarga;

/**
 *
 * @author qonitah
 */

public class Warga {
    // Atribut
    private String nik;
    private String nama;
    private String alamat;
    private int jumlahTanggungan;

    // Constructor
    public Warga(String nik, String nama, String alamat, int jumlahTanggungan) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        setJumlahTanggungan(jumlahTanggungan);
    }

    // getter dan setter
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    public void setJumlahTanggungan(int jumlahTanggungan) {
        if (jumlahTanggungan >= 0) {
            this.jumlahTanggungan = jumlahTanggungan;
        } else {
            System.out.println("Jumlah tanggungan tidak boleh negatif! Diset ke 0.");
            this.jumlahTanggungan = 0;
        }
    }
}