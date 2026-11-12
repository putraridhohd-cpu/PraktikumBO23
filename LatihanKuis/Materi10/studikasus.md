
---

### Penjelasan Lengkap Tiap File & Konsepnya

**Polimorfisme** berasal dari kata *Poly* (banyak) dan *Morphe* (bentuk). Artinya, satu antarmuka atau variabel induk yang sama bisa memiliki **banyak bentuk perilaku** tergantung objek asli yang sedang dipegangnya. Berikut urutan alur program dari file 1 sampai 7:

1. **`_1BisaDibayar.java` (Interface sebagai Pemersatu Lintas Keluarga)**
* Di perusahaan, pengeluaran uang bukan hanya untuk gaji karyawan, tapi juga untuk bayar tagihan WiFi/listrik.


* `Interface` ini bertindak sebagai label umum: *"Apa pun bendanya, selama punya label `_1BisaDibayar`, berarti punya method `hitungNominalBayar()`"*.




2. **`_2Pegawai.java` (Superclass / Induk)**
* Merupakan induk dasar bagi karyawan (`nama` dan `gajiPokok`).
* Ia mengimplementasikan `hitungNominalBayar()` yang hanya mengembalikan `gajiPokok`, sebagai dasar yang nantinya dimodifikasi oleh anak-anaknya.


3. **`_3Manajer.java` & 4. `_4Programmer.java` (Subclass & Dynamic Polymorphism)**
* Keduanya mewarisi (`extends`) `_2Pegawai`, tetapi melakukan **Method Overriding** pada `hitungNominalBayar()` dengan rumus berbeda: Manajer ditambah `tunjangan`, sedangkan Programmer ditambah `bonusLembur`.


* Selain itu, masing-masing punya aksi khusus yang tidak dimiliki induknya (`pimpinRapat()` dan `ngodingFitur()`).


4. **`_5TagihanInternet.java` (Objek Beda Hierarki)**
* Class ini berdiri sendiri tanpa `extends _2Pegawai`, tetapi ikut menandatangani kontrak `implements _1BisaDibayar`. Ini membuktikan kekuatan polimorfisme interface: menyatukan objek yang tidak punya hubungan keluarga sama sekali.




5. **`_6KasirKeuangan.java` (Otak Pemroses Polimorfisme)**
Di dalam file ini terjadi 4 konsep penting dari modul:
* **Static Polymorphism (Method Overloading)**: Terdapat dua method bernama `cetakInfo`. Java membedakannya lewat parameter yang dimasukkan (1 parameter `String` vs 2 parameter `String, int`) saat kode di-*compile*.


* **Polymorphic Arguments**: Method `prosesPembayaran(_1BisaDibayar item)` cukup ditulis **satu kali**, namun bisa menerima objek Manajer, Programmer, maupun Tagihan Internet tanpa perlu membuat tiga method terpisah.


* **Operator `instanceof**`: Karena parameter `item` masih berbentuk umum (`_1BisaDibayar`), kita memakai `instanceof` untuk mengecek wujud asli objek tersebut saat program berjalan (`true` atau `false`).


* **Downcasting**: Untuk memanggil method khusus seperti `pimpinRapat()`, kita harus mengubah tipe variabel `item` kembali menjadi `_3Manajer` menggunakan kurung `(_3Manajer) item` (atau cara modern Java 16+ langsung menulis `if (item instanceof _4Programmer p)`). Tanpa `instanceof` terlebih dahulu, salah melakukan *downcasting* akan membuat program *crash* dengan error `ClassCastException`.




6. **`_7MainPolimorfisme.java` (Uji Coba VMI & Heterogeneous Collection)**
* **Virtual Method Invocation (VMI)**: Saat variabel induk `_2Pegawai peg = new _3Manajer(...)` dipanggil `peg.hitungNominalBayar()`, Java secara cerdas menjalankan milik `_3Manajer` (bukan `_2Pegawai`) karena Java melihat wujud objek aslinya di memori saat *runtime*.


* **Heterogeneous Collection**: Biasanya array di Java hanya bisa diisi satu tipe data yang sama. Namun dengan membuat array bertipe interface `_1BisaDibayar[]`, kita bisa mencampur objek Manajer, Programmer, dan Tagihan Internet di dalam **satu array** lalu menghitung total pengeluaran kantor hanya dalam satu *looping* singkat.





Apakah penjelasan tiap file dan konsep *upcasting/downcasting*-nya sudah cukup jelas, atau ada bagian yang ingin dibedah lebih dalam lagi?