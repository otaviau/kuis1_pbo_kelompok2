package kuis1_pbo_kelompok2;

public class Main {
    public static void main(String[] args) {

        Peserta peserta1 = new Peserta("peserta01", "1234", "Marsya", "Malang");
        peserta1.infoPeserta();
        peserta1.lihatKonten("Video");
        peserta1.lihatKonten("Artikel");
        peserta1.lihatKonten("Kuis");
        peserta1.pembayaran("Materi Java OOP");

        System.out.println("===================================");

        Instruktur instruktur1 = new Instruktur("instruktur01", "abcd", "Pak Roy", "Pemrograman");
        instruktur1.infoInstruktur();
        instruktur1.tambahKonten("Video Polymorphism");
        instruktur1.tambahMateri("Jobsheet 4.4 - Inheritance");
        instruktur1.lihatKonten();
        instruktur1.lihatMateri();
    }
}
