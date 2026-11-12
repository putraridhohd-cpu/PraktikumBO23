

---

### Hasil Output Program

```text
=== SETUP COLLECTIONS MAP ===
=== SETUP DEPENDENCY INVERSION ===

=== PEMROSESAN PESANAN ===
[DB Simpan] Laptop Gaming | Final Bayar: Rp12000000
-> Aksi: Mengirim paket fisik ke alamat tujuan.

[DB Simpan] Lisensi Antivirus | Final Bayar: Rp500000

```

---

### Penjelasan Konsep SOLID & Collections

* **S (Single Responsibility Principle)**: Satu kelas hanya memiliki satu tugas atau satu alasan untuk berubah. Dalam kode, `_9OrderProcessor` tidak memformat struk atau menyimpan data secara langsung; tugasnya sekadar mengoordinasikan delegasi ke kelas lain seperti `DiscountPolicy` dan `Repository`.


* **O (Open/Closed Principle)**: Sistem harus terbuka untuk diperluas, tapi tertutup untuk dimodifikasi. Jika ada diskon baru (misal diskon mahasiswa), kita tidak mengutak-atik kode `_9OrderProcessor` atau menyisipkan `if-else` tambahan. Kita hanya membuat class baru yang mengimplementasikan `_2DiscountPolicy`.


* **L (Liskov Substitution Principle)**: Subclass wajib bisa menggantikan superclass-nya tanpa merusak ekspektasi program. Class `_6DigitalOrder` sengaja **tidak** diimplementasikan dengan antarmuka pengiriman, agar tidak ada *method* `ship()` yang berpura-pura berjalan namun melempar *exception* karena produk digital memang tidak butuh dikirim.


* **I (Interface Segregation Principle)**: Gunakan *interface* yang spesifik dan berukuran kecil. Alih-alih membuat satu *interface* raksasa yang mewajibkan semua jenis pesanan memiliki *method* pengiriman, kita memecahnya menjadi `_1Shippable` yang khusus dipakai pada kelas yang membutuhkannya saja.


* **D (Dependency Inversion Principle)**: Kode level tinggi harus bergantung pada abstraksi (seperti antarmuka `_7Repository`), bukan pada detail implementasi (seperti langsung memakai database SQL). Hal ini diselesaikan dengan menyuntikkan `_8InMemoryRepository` ke `_9OrderProcessor` lewat *constructor*.


* **Collections (ArrayList vs Map)**:
* **ArrayList**: Menggantikan *array* statis tradisional dengan ukuran yang bisa bertambah secara otomatis, cocok untuk daftar data pesanan (`List<_4Order>`).


* **Map (HashMap)**: Menyimpan pasangan kunci-nilai (contoh: `"WHOLESALE"` berpasangan dengan objek diskon grosir), memungkinkan pencarian objek diskon secara langsung tanpa harus melakukan iterasi atau *looping*.