package kuis1_pbo_kelompok2;

import java.util.Scanner;

public class Menu {

    public void menuPeserta(Peserta peserta) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Peserta ===");
            System.out.println("1. Lihat Konten");
            System.out.println("2. Pembayaran Materi");
            System.out.println("3. Lihat Info Peserta");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan jenis konten: ");
                String jenis = scanner.nextLine();
                peserta.lihatKonten(jenis);
            } else if (pilihan == 2) {
                System.out.print("Masukkan nama materi: ");
                String materi = scanner.nextLine();
                peserta.pembayaran(materi);
            } else if (pilihan == 3) {
                peserta.infoPeserta();
            } else if (pilihan == 0) {
                System.out.println("Logout...");
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }

    public void menuInstruktur(Instruktur instruktur) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Instruktur ===");
            System.out.println("1. Tambah Konten");
            System.out.println("2. Tambah Materi");
            System.out.println("3. Lihat Konten");
            System.out.println("4. Lihat Materi");
            System.out.println("5. Lihat Info Instruktur");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama konten: ");
                String konten = scanner.nextLine();
                instruktur.tambahKonten(konten);
            } else if (pilihan == 2) {
                System.out.print("Masukkan nama materi: ");
                String materi = scanner.nextLine();
                instruktur.tambahMateri(materi);
            } else if (pilihan == 3) {
                instruktur.lihatKonten();
            } else if (pilihan == 4) {
                instruktur.lihatMateri();
            } else if (pilihan == 5) {
                instruktur.infoInstruktur();
            } else if (pilihan == 0) {
                System.out.println("Logout...");
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}
