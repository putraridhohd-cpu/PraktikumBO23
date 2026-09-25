 # Soal Studi Kasus: Class DompetDigital
Buatlah dua buah file Java dengan ketentuan berikut:

Spesifikasi DompetDigital.java:

Atribut (Private):

namaPemilik (String)

nomorHP (String)

saldo (double)

Konstruktor:

Menerima parameter namaPemilik, nomorHP, dan saldoAwal.

Jika saldoAwal kurang dari 0, set saldo menjadi 0.

Method (Public):

Getter untuk namaPemilik, nomorHP, dan saldo.

Jangan buatkan Setter untuk saldo (saldo hanya boleh diubah dari method transaksi).

topUp(double nominal): Saldo bertambah jika nominal lebih dari 0. Jika nominal 0 atau minus, tampilkan pesan error.

bayar(double nominal): Saldo berkurang jika nominal valid dan saldo mencukupi. Jika saldo tidak cukup, batalkan transaksi dan tampilkan pesan error.