package kuis1_pbo_kelompok2;

public class KontenKuis extends Konten {
    private String jenisKonten;
    private String namaKonten;

    public KontenKuis(String idKonten, String jenisKonten, String namaKonten) {
        super(idKonten);
        this.jenisKonten = jenisKonten;
        this.namaKonten = namaKonten;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Konten: " + jenisKonten);
        System.out.println("Nama Kuis: " + namaKonten);
    }
}

