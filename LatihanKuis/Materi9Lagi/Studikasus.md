Agar alurnya mudah diikuti, bayangkan kita sedang membangun ekosistem dari **pondasi dasar** (kerangka umum dan aturan kontrak), lalu membuat **wujud bendanya**, membuat **alat pendukungnya**, hingga akhirnya mengujinya di **ruang utama**.

Berikut penjelasan detail untuk masing-masing dari ke-8 file secara berurutan:

---

### 1. `Kendaraan.java` (Abstract Class — Pondasi Utama)

File ini adalah **cetakan dasar** atau **induk** bagi semua jenis kendaraan.

* **Analogi**: Bayangkan sebuah **formulir pendaftaran**. Bagian atas formulir sudah tercetak rapi dan sama untuk semua orang (seperti kolom Merk), tetapi ada satu kotak kosong yang wajib diisi sendiri oleh masing-masing pendaftar (cara menyalakan mesin).


* **Detail Isi Kode**:
* `public abstract class Kendaraan`: Kata kunci `abstract` membuat *class* ini hanya berupa konsep umum. Kamu **tidak bisa** membuat objek langsung dari sini (`new Kendaraan()` akan langsung *error*), karena di dunia nyata tidak ada benda bernama "Kendaraan" tanpa jenis yang jelas.


* `protected String merk;` dan *Constructor* `Kendaraan(String merk)`: Sama seperti *class* biasa, *abstract class* tetap boleh punya atribut dan *constructor* untuk menyimpan data merk kendaraan.


* `public void tampilkanMerk()`: Ini adalah **method konkret** (method biasa yang punya isi `{ }`). Karena cara menampilkan merk untuk semua kendaraan itu sama saja, kodenya cukup ditulis sekali di sini dan otomatis diwariskan ke semua *class* anaknya.


* `public abstract void nyalakanMesin();`: Ini adalah **abstract method** (hanya judul tanpa isi `{ }`, diakhiri titik koma `;`). Kenapa dikosongkan? Karena setiap kendaraan punya cara menyalakan mesin yang berbeda. Aturan ini memaksa setiap *class* anak untuk mengisi sendiri cara kerjanya.





---

### 2. `BisaDiCharge.java` (Interface 1 — Kontrak Kemampuan Mengisi Daya)

File ini bukan *class* dan bukan induk keluarga, melainkan **sertifikat kemampuan** atau **kontrak** (hubungan *"bisa"* / *can-do*).

* **Analogi**: Bayangkan **standar lubang colokan USB**. Pabrik charger tidak peduli bendanya apa—mau HP, tablet, atau kipas angin mini—selama benda itu punya lubang USB yang sesuai standar, benda itu bisa di-charge.


* **Detail Isi Kode**:
* `public interface BisaDiCharge`: Mendefinisikan kontrak kemampuan. Sama seperti *abstract class*, *interface* juga tidak bisa di-`new`.


* `int TEGANGAN_STANDAR = 220;`: Di dalam *interface*, variabel apa pun otomatis menjadi **konstanta** (`public static final`), artinya nilainya mutlak 220 dan tidak bisa diubah-ubah oleh siapa pun.


* `void isiDaya();`: Semua *method* di dalam *interface* otomatis bersifat `public abstract`. Artinya, siapa pun yang menandatangani kontrak `BisaDiCharge` **wajib** memiliki tombol/fungsi `isiDaya()`.





---

### 3. `BisaTerhubungGPS.java` (Interface 2 — Kontrak Kemampuan Pelacakan)

File ini adalah kontrak kemampuan kedua yang berdiri sendiri.

* **Analogi**: Anggap saja ini adalah **stiker fitur "GPS Ready"**. Fitur ini dipisah dari `BisaDiCharge` karena tidak semua benda yang bisa di-charge punya GPS (contohnya *powerbank*), dan tidak semua benda yang punya GPS bisa di-charge pakai colokan listrik (contohnya *mobil bensin*).
* **Detail Isi Kode**:
* Hanya berisi satu aturan kontrak: `void lacakLokasi();`. Setiap *class* yang memakai *interface* ini wajib menuliskan bagaimana cara melacak lokasinya.



---

### 4. `MobilBensin.java` (Class Konkret — Anak Kendaraan + 1 Interface)

Ini adalah wujud benda nyata pertama yang sudah lengkap dan siap dibuat objeknya (`new MobilBensin(...)`).

* **Detail Isi Kode**:
* `extends Kendaraan implements BisaTerhubungGPS`: Baris ini punya dua arti. Pertama, `MobilBensin` **adalah** (`extends`) turunan dari `Kendaraan`. Kedua, `MobilBensin` **bisa** (`implements`) menggunakan fitur `BisaTerhubungGPS`. Ia sengaja tidak memakai `BisaDiCharge` karena mobil ini pakai bensin, bukan listrik.


* `super(merk);`: Karena `MobilBensin` adalah anak dari `Kendaraan`, ia memanggil *constructor* milik induknya (`Kendaraan`) untuk menitipkan penyimpanan nama merk.


* `@Override public void nyalakanMesin()`: Ini adalah pemenuhan janji kepada induknya (`Kendaraan`). Jika bagian ini lupa ditulis, program akan *error* saat di-*compile*.


* `@Override public void lacakLokasi()`: Ini adalah pemenuhan janji kepada kontrak `BisaTerhubungGPS`. Perhatikan kata kunci `public` di depannya—ini **wajib** ditulis karena aturan semua *method* dari *interface* harus `public`.





---

### 5. `SepedaListrik.java` (Class Konkret — Anak Kendaraan + Multiple Interface)

Wujud benda nyata kedua yang lebih canggih karena menggabungkan pewarisan induk sekaligus **banyak kemampuan** (*multiple interface*).

* **Detail Isi Kode**:
* `extends Kendaraan implements BisaDiCharge, BisaTerhubungGPS`: Perhatikan urutannya! Di Java, `extends` harus ditulis **lebih dulu** (dan maksimal hanya boleh 1 induk), baru diikuti `implements` yang boleh mengambil banyak *interface* sekaligus dengan dipisah tanda koma.


* `nyalakanMesin()`: Mengisi aturan wajib dari induk `Kendaraan` (versi sepeda listrik: menekan tombol *power*).
* `isiDaya()`: Mengisi aturan wajib dari kontrak pertama (`BisaDiCharge`). Di dalamnya, ia langsung memanggil `TEGANGAN_STANDAR` (220V) yang otomatis diwarisi dari *interface* `BisaDiCharge`.
* `lacakLokasi()`: Mengisi aturan wajib dari kontrak kedua (`BisaTerhubungGPS`).



---

### 6. `Powerbank.java` (Class Konkret — Beda Induk tapi Punya Interface Sama)

File ini dibuat khusus untuk membuktikan mengapa *interface* itu sangat berguna.

* **Analogi**: `Powerbank` adalah aksesoris gadget, **bukan** kendaraan. Sangat tidak masuk akal jika `Powerbank` dipaksa menjadi anak dari `Kendaraan` (`extends Kendaraan`), karena *powerbank* tidak punya mesin yang bisa dinyalakan.


* **Detail Isi Kode**:
* `public class Powerbank implements BisaDiCharge`: Tanpa perlu `extends Kendaraan`, `Powerbank` tetap bisa mengambil kontrak `BisaDiCharge` secara mandiri.


* `private int kapasitas;`: Memiliki atributnya sendiri (mAh) yang tidak ada hubungannya dengan kendaraan.
* `@Override public void isiDaya()`: Mengisi aturan kontrak `BisaDiCharge` sesuai cara kerja *powerbank*.



---

### 7. `StasiunCharging.java` (Class Layanan — Pengguna Kontrak Interface)

File ini berperan sebagai mesin pengisi daya umum (SPKLU / colokan listrik).

* **Analogi**: Stopkontak di dinding rumahmu. Stopkontak tidak perlu tahu apakah yang dicolokkan itu sepeda listrik atau *powerbank*; yang penting colokannya cocok.


* **Detail Isi Kode**:
* `public void mulaiCharging(BisaDiCharge perangkat)`: Perhatikan tipe data parameternya adalah **interface `BisaDiCharge**`, bukan `SepedaListrik` dan bukan `Powerbank`.


* Berkat cara penulisan ini, method `mulaiCharging` bersifat fleksibel: objek dari *class* mana pun boleh masuk ke sini asalkan *class* tersebut meng-`implements BisaDiCharge`. Ketika `perangkat.isiDaya()` dipanggil, Java otomatis menjalankan proses *charging* milik benda yang sedang dicolokkan.





---

### 8. `Main.java` (Program Utama — Tempat Uji Coba)

File ini adalah panggung utama tempat semua *class* di atas dihidupkan menjadi objek nyata dan dijalankan.

* **Detail Isi Kode**:
* **Pembuatan Objek**: Kita membuat objek nyata dari `MobilBensin`, `SepedaListrik`, dan `Powerbank` menggunakan kata kunci `new`. (Di sini juga diberikan komentar pengingat bahwa `new Kendaraan()` dan `new BisaDiCharge()` dilarang keras karena keduanya bersifat abstrak).


* **Demo 1 (Polimorfisme Array `Kendaraan[]`)**: `mobil` dan `sepeda` bisa dimasukkan ke dalam satu array bertipe `Kendaraan[]` karena keduanya adalah anak dari `Kendaraan`. Saat di-*looping* dengan `k.nyalakanMesin()`, Java pintar membedakan mana suara mesin mobil bensin dan mana sepeda listrik sesuai wujud aslinya.


* **Demo 2 (Multiple Interface)**: Memperlihatkan bahwa `sepeda` bisa menjalankan fitur `lacakLokasi()` dari *interface* GPS, selain fitur *charging*.
* **Demo 3 (Interface Lintas Keluarga)**: Objek `stasiun` dari `StasiunCharging` dipanggil dua kali: pertama untuk mengecas `sepeda` (keluarga `Kendaraan`), dan kedua untuk mengecas `pb` (`Powerbank`, bukan keluarga `Kendaraan`). Keduanya berhasil diterima oleh method yang sama karena sama-sama terikat kontrak `BisaDiCharge`.





Jika sudah mulai terbayang alur antar *class*-nya, mau coba kita bahas latihan soal dari slide terakhir PDF-mu atau mencoba menggambar rancangan diagram UML-nya dalam bentuk teks?