package kuis1_pbo_kelompok2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void menuPeserta(Peserta peserta, ArrayList<Konten> semuaKonten) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        // Daftar kelas tersedia
        ArrayList<ListKelas> semuaKelas = new ArrayList<>();
        semuaKelas.add(new ListKelas("Pemrograman Java", 150000));
        semuaKelas.add(new ListKelas("Database SQL", 120000));
        semuaKelas.add(new ListKelas("Web Development", 180000));

        do {
            System.out.println("\n=== Menu Peserta ===");
            System.out.println("1. Lihat Konten");
            System.out.println("2. Pilih Konten");
            System.out.println("3. Lihat Info Peserta");
            System.out.println("4. Lihat dan Pilih Kelas");
            System.out.println("5. Bayar Kelas");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.println("\nDaftar Konten Tersedia:");
                if (semuaKonten.isEmpty()) {
                    System.out.println("Belum ada konten yang tersedia.");
                } else {
                    for (Konten k : semuaKonten) {
                        k.tampilkanInfo();
                        System.out.println("------");
                    }
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan nama konten: ");
                String konten = scanner.nextLine();
                peserta.pilihKonten(konten);
            } else if (pilihan == 3) {
                peserta.infoPeserta();
            } else if (pilihan == 4) {
                System.out.println("\nDaftar Kelas yang Tersedia:");
                for (int i = 0; i < semuaKelas.size(); i++) {
                    System.out.print((i + 1) + ". ");
                    semuaKelas.get(i).tampilkanInfo();
                }
                System.out.print("Pilih nomor kelas yang ingin diambil (0 untuk batal): ");
                int pilihKelas = scanner.nextInt();
                scanner.nextLine();
                if (pilihKelas > 0 && pilihKelas <= semuaKelas.size()) {
                    peserta.tambahKelas(semuaKelas.get(pilihKelas - 1));
                } else if (pilihKelas != 0) {
                    System.out.println("Pilihan tidak valid.");
                }
            } else if (pilihan == 5) {
                peserta.bayarKelas();
            } else if (pilihan == 0) {
                System.out.println("Logout...");
            } else {
                System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }

    public void menuInstruktur(Instruktur instruktur, ArrayList<Konten> semuaKonten) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Instruktur ===");
            System.out.println("1. Tambah Konten Artikel");
            System.out.println("2. Tambah Konten Video");
            System.out.println("3. Tambah Konten Kuis");
            System.out.println("4. Lihat Konten");
            System.out.println("5. Lihat Info Instruktur");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("ID Konten: ");
                String id = scanner.nextLine();
                System.out.print("Judul Artikel: ");
                String nama = scanner.nextLine();
                KontenArtikel artikel = new KontenArtikel(id, "Artikel", nama);
                instruktur.tambahKonten(artikel, semuaKonten);
            } else if (pilihan == 2) {
                System.out.print("ID Konten: ");
                String id = scanner.nextLine();
                System.out.print("Nama Video: ");
                String nama = scanner.nextLine();
                KontenVideo video = new KontenVideo(id, "Video", nama);
                instruktur.tambahKonten(video, semuaKonten);
            } else if (pilihan == 3) {
                System.out.print("ID Konten: ");
                String id = scanner.nextLine();
                System.out.print("Nama Kuis: ");
                String nama = scanner.nextLine();
                KontenKuis kuis = new KontenKuis(id, "Kuis", nama);
                instruktur.tambahKonten(kuis, semuaKonten);
            } else if (pilihan == 4) {
                instruktur.lihatKonten();
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