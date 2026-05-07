## detail tugas

membuat simulasi sistem bank sederhana:
- ada satu akun tabungan (BankAccount)
- dua teller (thread) yg melayani setor dan tarik tunai secara bersamaan

instruksi:
- buat class BankAccount dengan
    - atribute balance
    - method deposite(amount) dan withdraw(amount)
- buat 2 thread teller dengan
    - thread A melakukan 100 kali setor Rp 1000
    - thread B melakukan 100 kali tarik Rp 1000 (hanya jika cukup saldo)
- semua operasi harus syncronized
- setelah selesai, tampilkan saldo akhir

contoh output:<br>
```
Saldo awal: 100000
thread A setor Rp 1000
thread B tarik Rp 1000
...
saldo akhir: 100000