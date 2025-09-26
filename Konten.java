package kuis1_pbo_kelompok2;

public class Konten {
    private String idKonten;

    public Konten(String idKonten) {
        this.idKonten = idKonten;
    }

    public String getIdKonten() {
        return idKonten;
    }

    public String getNamaKonten() {
        return "(Tidak diketahui)";
    }

    public void tampilkanInfo() {
        System.out.println("ID Konten: " + idKonten);
    }
}