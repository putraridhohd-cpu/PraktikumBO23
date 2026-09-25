Soal: Sistem Akademik KPRS (Kartu Rencana Studi)
Buatlah sistem pengisian KPRS sederhana dengan ketentuan:Class MataKuliah: Atribut kode (String) dan nama (String).   
Class Printer: Memiliki method cetak(String teks) (Digunakan untuk relasi USES-A).   
Class Mahasiswa:Atribut: nim (String), nama (String), listMK (Array MataKuliah[]), dan jumlahMK (int untuk mencatat jumlah MK yang sudah diambil).  
 Konstruktor: Menerima nim, nama, dan kapasitasKRS (ukuran maksimal array listMK).
 Method tambahMataKuliah(MataKuliah mk): Menambahkan MK ke array dengan relasi Aggregation. 
 Wajib validasi: pastikan mk tidak null dan array belum penuh.   
 Method tampilkanKRS(): Menampilkan data mahasiswa dan seluruh MK yang diambil. Sertakan null check.   
 Method cetakKRS(Printer p): Relasi USES-A. Menggunakan objek Printer yang diterima sebagai parameter untuk mencetak ringkasan KRS.   