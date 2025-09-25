
public class KontenArtikel extends Konten {
    private String jenisKonten;
    private String namaKonten;

    public KontenArtikel(String idKonten, String jenisKonten, String namaKonten) {
        super(idKonten);
        this.jenisKonten = jenisKonten;
        this.namaKonten = namaKonten;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Konten: " + jenisKonten);
        System.out.println("Judul Artikel: " + namaKonten);
    }
}

