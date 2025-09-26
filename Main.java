package kuis1_pbo_kelompok2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Peserta> daftarPeserta = new ArrayList<>();
        ArrayList<Instruktur> daftarInstruktur = new ArrayList<>();

        daftarPeserta.add(new Peserta("peserta1", "123", "Budi", "Jakarta"));
        daftarPeserta.add(new Peserta("peserta2", "abc", "Siti", "Bandung"));

        daftarInstruktur.add(new Instruktur("instruktur1", "456", "Pak Andi", "Java"));
        daftarInstruktur.add(new Instruktur("instruktur2", "xyz", "Bu Rina", "Python"));
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Login ===");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Peserta pesertaLogin = login.loginPeserta(daftarPeserta, username, password);
        if (pesertaLogin != null) {
            System.out.println("\nLogin berhasil sebagai Peserta.");
            Menu menu = new Menu();
            menu.menuPeserta(pesertaLogin);
            return;
        }

        Instruktur instrukturLogin = login.loginInstruktur(daftarInstruktur, username, password);
        if (instrukturLogin != null) {
            System.out.println("\nLogin berhasil sebagai Instruktur.");
            Menu menu = new Menu();
            menu.menuInstruktur(instrukturLogin);
            return;
        }

        System.out.println("\nLogin gagal. Username atau password salah.");

    }
}
