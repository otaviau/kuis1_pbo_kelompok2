package kuis1_pbo_kelompok2;

import java.util.ArrayList;

public class Instruktur extends User {
    private String nama;
    private String keahlian;
    private ArrayList<Konten> daftarKonten = new ArrayList<>();

    public Instruktur(String username, String password, String nama, String keahlian) {
        super(username, password);
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public void tambahKonten(Konten konten, ArrayList<Konten> semuaKonten) {
        daftarKonten.add(konten);
        semuaKonten.add(konten);
        System.out.println(nama + " menambahkan konten: " + konten.getNamaKonten());
    }

    public void lihatKonten() {
        System.out.println("\nKonten yang ditambahkan oleh " + nama + ":");

        if (daftarKonten.isEmpty()) {
            System.out.println("Belum ada konten yang ditambahkan.");
        } else {
            for (Konten k : daftarKonten) {
                k.tampilkanInfo();
                System.out.println("------");
            }
        }

    }

    public void infoInstruktur() {
        System.out.println("\nInstruktur:");
        System.out.println("  Nama    : " + nama);
        System.out.println("  Keahlian: " + keahlian);
        System.out.println("  Username: " + getUsername());
    }
}
