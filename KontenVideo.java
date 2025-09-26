package kuis1_pbo_kelompok2;

public class KontenVideo extends Konten {
    private String jenisKonten;
    private String namaKonten;

    public KontenVideo(String idKonten, String jenisKonten, String namaKonten) {
        super(idKonten);
        this.jenisKonten = jenisKonten;
        this.namaKonten = namaKonten;
    }

    public String getNamaKonten() {
        return namaKonten;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Konten: " + jenisKonten);
        System.out.println("Nama Video: " + namaKonten);
    }
}