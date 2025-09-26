package kuis1_pbo_kelompok2;

public class ListKelas {
    private String namaKelas;
    private int harga;

    public ListKelas(String namaKelas, int harga) {
        this.namaKelas = namaKelas;
        this.harga = harga;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public int getHarga() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println("- " + namaKelas + " | Harga: Rp" + harga);
    }
}
