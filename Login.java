package kuis1_pbo_kelompok2;

import java.util.ArrayList;

public class Login {
    public Peserta loginPeserta(ArrayList<Peserta> daftar, String username, String password) {
        for (int i = 0; i < daftar.size(); i++) {
            Peserta pes = daftar.get(i);
            if (pes.getUsername().equals(username) && pes.getPassword().equals(password)) {
                return pes;
            }
        }
        return null;
    }

    public Instruktur loginInstruktur(ArrayList<Instruktur> daftar, String username, String password) {
        for (int i = 0; i < daftar.size(); i++) {
            Instruktur ins = daftar.get(i);
            if (ins.getUsername().equals(username) && ins.getPassword().equals(password)) {
                return ins;
            }
        }
        return null;
    }
}