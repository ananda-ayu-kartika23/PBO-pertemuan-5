# Tugas Pertemuan 5  

## 📌 Deskripsi Penerapan Exception  
Project ini memiliki `Class PenerapanException` sebagai implementasi **custom exception handling** untuk mencontohkan bagaimana Java menangani error khusus.  
Contoh kasus yang digunakan adalah saat melakukan transaksi dengan kondisi **saldo tidak mencukupi**, maka sistem akan melempar exception khusus agar lebih mudah ditangani.  

## 📌 Deskripsi GUI Database  
Selain itu, project ini juga mencakup aplikasi **Java Swing CRUD sederhana** untuk manajemen data **Mata Kuliah**.  
Aplikasi ini menggunakan database **PostgreSQL** dan memungkinkan pengguna untuk:  

- Menambah data baru (Insert)  
- Mengubah data lama (Update)  
- Menghapus data (Delete)  
- Melihat seluruh data dalam bentuk tabel (JTable)  

Antarmuka dibuat menggunakan **Java Swing**, sedangkan koneksi database menggunakan **JDBC**.  

## ✨ Fitur Utama  
- Menampilkan data mata kuliah di tabel (JTable).  
- Menambah data baru (Insert).  
- Memilih baris di tabel untuk otomatis mengisi form.  
- Memperbarui data dengan kondisi `WHERE` sesuai data lama.  
- Menghapus data (Delete).  
- Validasi sederhana agar semua field wajib diisi.  
- Kosongkan form otomatis setelah tindakan (Simpan / Update).  

## 🗂️ Struktur Project  
- **Class GUI** → Mengatur tampilan form, tabel, dan tombol aksi (Simpan, Update, Hapus, Bersih).  
- **Koneksi Database (JDBC)** → Menangani koneksi ke PostgreSQL.  
- **Query SQL** menggunakan `Statement` / `PreparedStatement` (SELECT, INSERT, UPDATE, DELETE).  
- **Custom Exception (PenerapanException)** → Menangani error khusus (contoh: saldo tidak cukup).  

## ⚙️ Prasyarat  
- Java (versi minimal yang mendukung `var`, jika digunakan).  
- PostgreSQL terinstal & berjalan.  
- Tabel database **mata_kuliah** dengan kolom:  
  - `kode`  
  - `nama`  
  - `matkul_semester` (Integer)  
  - `dosen_pengajar`  
- Driver PostgreSQL (JDBC) ditambahkan ke **classpath / library project**.  
