# Shafa Rizqi Nur Wahidah - 2409116041

## Abstraction

<img width="698" height="606" alt="image" src="https://github.com/user-attachments/assets/03803852-3a0b-4f7f-83b5-bee05ec52a2c" />

Kode ini berada di package model pada class WahanaBase. Class ini dibuat sebagai abstract class untuk menjadi kerangka dasar semua wahana. Di dalamnya terdapat atribut nama, lokasi, dan harga, serta sebuah method abstract bernama deskripsi(). Method ini tidak memiliki isi sehingga setiap class turunan wajib menuliskan ulang isinya. Abstraction ini berguna agar semua jenis wahana memiliki aturan umum yang sama, yaitu harus bisa menampilkan deskripsi masing-masing sesuai kategorinya.

## Polymorphism

<img width="862" height="812" alt="image" src="https://github.com/user-attachments/assets/d5709985-f1b1-4b8d-9efd-a954a20d963e" />

<img width="766" height="516" alt="image" src="https://github.com/user-attachments/assets/02788e26-d94a-44d5-abfc-96f0c9945d02" />

Kode ini ada di package service pada class WahanaService. Di sini terdapat dua method tambahWahana() yang memiliki nama sama tetapi parameternya berbeda. Satu method menerima objek Wahana secara langsung, sedangkan method lainnya menerima tiga parameter yaitu nama, lokasi, dan harga untuk membuat objek baru. Inilah contoh polymorphism dalam bentuk overloading, karena satu nama method dapat digunakan dengan cara berbeda. Fungsinya adalah memberi fleksibilitas agar pengguna bisa menambah data wahana dengan dua pilihan cara.

<img width="1062" height="417" alt="image" src="https://github.com/user-attachments/assets/c475c56e-787b-4700-b312-92f17a0c4767" />

<img width="1082" height="402" alt="image" src="https://github.com/user-attachments/assets/bb020228-2d3b-4f20-bd13-fd0440a345e8" />

Kedua kode ini berada di package model, yaitu pada class WahanaAir dan WahanaDarat. Keduanya melakukan method overriding, yaitu menuliskan ulang method dari parent class. Method deskripsi() yang berasal dari WahanaBase diisi ulang agar lebih spesifik sesuai jenis wahana. Selain itu, method toString() juga di-override agar menambahkan label [Wahana Air] atau [Wahana Darat] ketika data ditampilkan. Overriding ini berguna supaya hasil keluaran program menjadi lebih jelas, karena user langsung tahu jenis wahananya dari output yang ditampilkan.
