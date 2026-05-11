# E-4BSENSI (Sistem Absensi Akademik)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)
![FlatLaf](https://img.shields.io/badge/UI-FlatLaf-blue?style=for-the-badge)

**E-4BSENSI** adalah aplikasi desktop berbasis Java Swing yang dirancang untuk mengelola data absensi siswa secara efisien. Dengan antarmuka modern yang ditenagai oleh **FlatLaf**, aplikasi ini memberikan pengalaman pengguna yang bersih dan intuitif bagi guru atau administrator sekolah.

## 🚀 Fitur Utama

-   **Dashboard Statistik:** Menampilkan ringkasan total siswa, jumlah absensi minggu ini, dan rata-rata persentase kehadiran secara real-time.
-   **Manajemen Data Siswa (CRUD):** Tambah, lihat, edit, dan hapus data siswa dengan mudah.
-   **Input Absensi Cepat:** Pencatatan kehadiran berdasarkan kelas dan pertemuan tertentu menggunakan antarmuka tabel yang dinamis.
-   **Rekapitulasi Kehadiran:** Melihat dan mengelola riwayat absensi siswa secara mendetail.
-   **Sistem Login Aman:** Memastikan hanya pengguna terotorisasi yang dapat mengakses data.
-   **Antarmuka Modern:** Menggunakan *FlatLaf Light Theme* untuk tampilan yang profesional dan nyaman di mata.

## 🛠️ Teknologi yang Digunakan

-   **Bahasa Pemrograman:** Java (JDK 17+)
-   **Framework UI:** Java Swing dengan **FlatLaf** Look and Feel.
-   **Database:** MySQL (sebagai penyimpanan data terpusat).
-   **Library Tambahan:**
    -   `MySQL Connector/J` (Konektor Database)
    -   `FlatLaf` (Tema Modern)
    -   `AbsoluteLayout` (Layout Management)

## 📋 Prasyarat Sistem

Sebelum menjalankan aplikasi, pastikan Anda telah menginstal:
-   **Java Development Kit (JDK) 17** atau versi terbaru.
-   **XAMPP** (atau server MySQL lokal lainnya).
-   **IDE NetBeans** (Disarankan versi terbaru).

## ⚙️ Cara Instalasi & Penggunaan

### 1. Persiapan Database
1.  Buka **phpMyAdmin** atau tool database favorit Anda.
2.  Buat database baru dengan nama `absensi_kelas`.
3.  Import file database **`absensi_kelas.sql`** yang tersedia di direktori root project ini ke dalam database tersebut.

### 2. Konfigurasi Koneksi
Pastikan pengaturan koneksi di file `src/E_4BSEN/koneksi.java` sesuai dengan environment MySQL Anda:
```java
String url = "jdbc:mysql://localhost:3306/absensi_kelas";
String user = "root";
String password = "";
```

### 3. Menjalankan Aplikasi
1.  Buka project di **NetBeans**.
2.  Tambahkan library yang diperlukan ke dalam folder `Libraries` (FlatLaf dan MySQL Connector).
3.  Jalankan file `Main.java` di paket `E_4BSEN`.

## 📂 Struktur Project

```text
Absensi/
├── absensi_kelas.sql       # File Database MySQL
├── src/
│   └── E_4BSEN/            # Source code utama
│       ├── Main.java       # Titik masuk aplikasi (setup tema)
│       ├── Login.java      # Form Login
│       ├── Dashboard_guru.java # Dashboard Utama
│       ├── Data_siswa.java # Manajemen Data Siswa
│       └── koneksi.java    # Konfigurasi Database
├── lib/                    # Library external (.jar)
└── nbproject/              # Konfigurasi NetBeans
```

## ✒️ Kontributor
-   **Aqbil DKK, dan Gemini AI** - Pengembang Utama

---
*Dibuat dengan ❤️ untuk kemudahan pengelolaan data akademik.*
