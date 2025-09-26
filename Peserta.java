package kuis1_pbo_kelompok2;

import java.util.ArrayList;

public class Peserta extends User {
    private String nama;
    private String alamat;
    private ArrayList<ListKelas> kelasDipilih = new ArrayList<>();

    public Peserta(String username, String password, String nama, String alamat) {
        super(username, password);
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahKelas(ListKelas kelas) {
        kelasDipilih.add(kelas);
        System.out.println("Kelas \"" + kelas.getNamaKelas() + "\" telah ditambahkan ke daftar.");
    }

    public void bayarKelas() {
        if (kelasDipilih.isEmpty()) {
            System.out.println("Belum ada kelas yang dipilih.");
            return;
        }
        int total = 0;
        System.out.println("\nDaftar kelas yang akan dibayar:");
        for (ListKelas k : kelasDipilih) {
            k.tampilkanInfo();
            total += k.getHarga();
        }
        System.out.println("\nTotal yang harus dibayar: Rp" + total);
        System.out.println("\nPembayaran berhasil. Terima kasih!");
        kelasDipilih.clear();
    }

    public void lihatKonten(String jenis) {
        System.out.println(nama + " melihat " + jenis);
    }

    public void pilihKonten(String konten) {
        System.out.println(nama + " memilih konten: " + konten);
    }

    public void infoPeserta() {
        System.out.println("Peserta:");
        System.out.println(" Nama: " + nama);
        System.out.println(" Alamat: " + alamat);
        System.out.println(" Username: " + getUsername());
    }
}