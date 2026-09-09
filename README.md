# Minpro-1-PBO-Sistem-PendataanWargaKurangMampu <br>

# Judul : Sistem Pendataan Warga Kurang Mampu

---

## 1. Deskripsi Singkat Program
Pada program ini saya membuat sistem sederhana berbasis teks di terminal untuk membantu proses pendataan warga yang berhak nerima bantuan sosial. Di dalam program ini juga bisa menambah data warga, menampilkan daftar warga yang udah di-input, mengubah data kalau ada yang salah, dan menghapus data dari daftar.

---

## 2. Penjelasan Class & Atribut
Pada project ini, strukturnya dibagi ke beberapa class, yaitu:

* **Warga**
  * nik
  * nama
  * alamat
  * jumlahTanggungan <br>
  Penjelasan Class : Pada Class ini berguna untuk menyimpan informasi data diri warga.
  

* **KriteriaKemiskinan**
  * idKriteria
  * jenisPekerjaan
  * pendapatanBulanan
  * statusRumah

* **`DataPusatWarga`** (Pusat pengolahan data dan penyimpanan sementara)
  * `idData`
  * `tanggalPendataan`
  * `statusValidasi`
  * `daftarWargaKurangMampu` (ArrayList buat nampung list objek warga)

* **`Main`** (Entry point / kelas utama yang ngejalanin menu interaktif di terminal)

---

## 3. Penjelasan Alur Program
Waktu program dijalanin, bakal muncul menu utama di terminal dengan 5 pilihan:

1. **Tambah Data Warga (Create):** Kita bisa masuki NIK, nama, alamat, sama jumlah tanggungan. Nanti datanya kesimpen otomatis ke sistem.
2. **Tampilkan Data Warga (Read):** Dipakai buat ngecek dan nampilin semua daftar warga yang udah pernah di-input sebelumnya. Kalau datanya masih kosong, bakal ada pemberitahuan "Belum ada data warga".
3. **Ubah Data Warga (Update):** Kalau ada kesalahan input, kita bisa ngubah data berdasarkan nomor urut data yang mau diperbarui (misal ganti nama, alamat, atau jumlah tanggungan).
4. **Hapus Data Warga (Delete):** Buat mbuang data warga dari list kalau emang udah nggak diperlukan lagi, cukup ketik nomor data yang mau dihapus.
5. **Keluar:** Buat ngeberhentiin atau menutup program.

---

## 4. Penjelasan Penerapan Nilai Tambah
Sebagai tambahan biar project-nya makin mantap, ada beberapa poin yang diterapin:
* **Pemisahan Logika (Modularitas):** Atribut data, aturan kriteria, proses penyimpanan pakai ArrayList, sama tampilan menu (`Main`) dipisah ke class masing-masing supaya kodenya bersih dan gampang dibaca.
* **Validasi Sederhana:** Program dicek dulu kondisi datanya (misalnya ngecek apakah list kosong atau nggak) sebelum ngelakuin proses *read*, *update*, atau *delete* supaya nggak gampang *error* pas lagi dijalanin.
