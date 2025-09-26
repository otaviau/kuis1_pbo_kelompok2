package kuis1_pbo_kelompok2;

public class Peserta extends User {
    private String nama;
    private String alamat;

    public Peserta(String username, String password, String nama, String alamat) {
        super(username, password);
        this.nama = nama;
        this.alamat = alamat;
    }

    public void lihatKonten(String jenis) {
        System.out.println(nama + " melihat " + jenis);
    }

    public void pembayaran(String materi) {
        System.out.println(nama + " melakukan pembayaran untuk materi: " + materi);
    }

    public void infoPeserta() {
        System.out.println("Peserta:");
        System.out.println("  Nama: " + nama);
        System.out.println("  Alamat: " + alamat);
        System.out.println("  Username: " + getUsername());
    }
}
