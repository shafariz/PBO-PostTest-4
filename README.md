# Shafa Rizqi Nur Wahidah - 2409116041

## Abstraction

<img width="677" height="602" alt="image" src="https://github.com/user-attachments/assets/1f9b5a54-df92-427e-955c-dea370e7c4ff" />

Kode ini berada di package model pada class WahanaBase. Class ini dibuat sebagai abstract class untuk menjadi kerangka dasar semua wahana. Di dalamnya terdapat atribut nama, lokasi, dan harga, serta sebuah method abstract bernama deskripsi(). Method ini tidak memiliki isi sehingga setiap class turunan wajib menuliskan ulang isinya. Abstraction ini berguna agar semua jenis wahana memiliki aturan umum yang sama, yaitu harus bisa menampilkan deskripsi masing-masing sesuai kategorinya.

## Polymorphism

<img width="870" height="583" alt="image" src="https://github.com/user-attachments/assets/c5bde228-f6be-4981-9a1b-ef4191bb184c" />

Kode ini ada di package service pada class WahanaService. Di sini terdapat dua method tambahWahana() yang memiliki nama sama tetapi parameternya berbeda. Satu method menerima objek Wahana secara langsung, sedangkan method lainnya menerima tiga parameter yaitu nama, lokasi, dan harga untuk membuat objek baru. Inilah contoh polymorphism dalam bentuk overloading, karena satu nama method dapat digunakan dengan cara berbeda. Fungsinya adalah memberi fleksibilitas agar pengguna bisa menambah data wahana dengan dua pilihan cara.

<img width="1075" height="398" alt="image" src="https://github.com/user-attachments/assets/46e0898c-9434-4e1f-b1ca-7b0708bf36b1" />

<img width="1082" height="400" alt="image" src="https://github.com/user-attachments/assets/9458d377-f15a-406e-9aa3-955593710a87" />

Kedua kode ini berada di package model, yaitu pada class WahanaAir dan WahanaDarat. Keduanya melakukan method overriding, yaitu menuliskan ulang method dari parent class. Method deskripsi() yang berasal dari WahanaBase diisi ulang agar lebih spesifik sesuai jenis wahana. Selain itu, method toString() juga di-override agar menambahkan label [Wahana Air] atau [Wahana Darat] ketika data ditampilkan. Overriding ini berguna supaya hasil keluaran program menjadi lebih jelas, karena user langsung tahu jenis wahananya dari output yang ditampilkan.
