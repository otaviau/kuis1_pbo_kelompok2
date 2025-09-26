package kuis1_pbo_kelompok2;

public class Instruktur extends User {
    private String nama;
    private String keahlian;

    public Instruktur(String username, String password, String nama, String keahlian) {
        super(username, password);
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public void tambahKonten(String konten) {
        System.out.println(nama + " menambahkan konten: " + konten);
    }

    public void tambahMateri(String materi) {
        System.out.println(nama + " menambahkan materi: " + materi);
    }

    public void lihatKonten() {
        System.out.println(nama + " melihat daftar konten");
    }

    public void lihatMateri() {
        System.out.println(nama + " melihat daftar materi");
    }

    public void infoInstruktur() {
        System.out.println("Instruktur:");
        System.out.println("  Nama: " + nama);
        System.out.println("  Keahlian: " + keahlian);
        System.out.println("  Username: " + getUsername());
    }
}
