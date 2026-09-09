# Minpro-1-PBO-SistemPendataanWargaKurangMampu <br>

# Judul : Sistem Pendataan Warga Kurang Mampu

---

## 1. Deskripsi Singkat Program
Pada program ini saya membuat sistem sederhana berbasis teks di terminal untuk membantu proses pendataan warga yang berhak nerima bantuan sosial. Di dalam program ini juga bisa menambah data warga, menampilkan daftar warga yang udah di input, mengubah data kalau ada yang salah, dan menghapus data dari daftar. dan program ini lebih berfokus pada pendataan warga kurang mampu dan penyaluran bantuan sosial dari pemerintah.

---

## 2. Penjelasan Class & Atribut
Pada project ini, strukturnya dibagi ke beberapa class, yaitu:

* **Warga**
  * nik
  * nama
  * alamat
  * jumlahTanggungan
  
* **KriteriaKemiskinan**
  * idKriteria
  * jenisPekerjaan
  * pendapatanBulanan
  * statusRumah

* **DataPusatWarga**
  * idData
  * tanggalPendataan
  * statusValidasi
  * daftarWargaKurangMampu (ArrayList)

* **Main** (Entry point)

---

## 3. Penjelasan Alur Program
Pada saat program dijalankan, nanti nya akan menampilkan menu utama di terminal dengan 5 pilihan: 
 <img width="1000"  alt="WhatsApp Image 2026-09-08 at 8 42 51 PM" src="https://github.com/user-attachments/assets/8332fc27-1ef3-418d-906e-c0ac76bf7eaf" />


1. **Tambah Data Warga (Create):** Kita bisa memasukkan NIK, nama, alamat, sama jumlah tanggungan. Nanti datanya akan tersimpan otomatis ke sistem. 
<img width="500" alt="WhatsApp Image 2026-09-08 at 8 44 31 PM" src="https://github.com/user-attachments/assets/42581ce8-41b5-4b3c-9e16-1650f075b52b" />

2. **Tampilkan Data Warga (Read):** Dipakai buat mengecek dan menampilkan semua daftar warga yang udah pernah di input sebelumnya. Jadi kalau datanya masih kosong, bakal ada pemberitahuan atau output "Belum ada data warga". 
<img width="500" alt="WhatsApp Image 2026-09-08 at 8 44 54 PM" src="https://github.com/user-attachments/assets/476806b4-d7e9-4151-b49a-ab600782c011" />

3. **Ubah Data Warga (Update):** Kalau ada kesalahan input, kita bisa mengubah data berdasarkan nomor urut data yang mau diganti. Contoh mau ganti nama di data01, itu harus masukkan nomor data mana yang ingin diubah. 
<img width="500" alt="WhatsApp Image 2026-09-08 at 8 46 12 PM" src="https://github.com/user-attachments/assets/92ba216a-df24-4d31-ad2a-5afbf61caf35" />

4. **Hapus Data Warga (Delete):** Buat menghapus data warga dari list kalau memang sudah tidak diperlukan lagi, cukup ketik nomor data yang mau dihapus. 
<img width="500" alt="WhatsApp Image 2026-09-08 at 8 47 16 PM" src="https://github.com/user-attachments/assets/6f5a7eee-b37c-4004-a1c0-1aba34e8fb79" />
<img width="500" alt="WhatsApp Image 2026-09-08 at 8 47 33 PM" src="https://github.com/user-attachments/assets/6ac06171-9047-4ae4-99fd-cad13a1ac46a" />

6. **Keluar:** menutup program, nanti ada output "Terima kasih telah menggunakan program ini" 
<img width="500" alt="WhatsApp Image 2026-09-08 at 8 47 50 PM" src="https://github.com/user-attachments/assets/20b77484-5460-4b87-b1af-a401f34a987c" />

---

## 4. Tambahan
Atribut data, kriteria, proses penyimpanan pakai ArrayList, sama tampilan menu dipisah ke class masing-masing supaya kodenya bersih dan gampang dibaca. 
pada program ini saya menggunakan ArrayList hanya di class DataPusatWarga, karena itu pusatnya untuk mengubah, mengelola, dan tugasnya memang untuk menampung list warga dan dipegang sama satu class khusus pengelola data, jadi class entitasnya (Warga) tetap bersih dan fokus mengelola atribut individunya saja. 
