package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }

        double total = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            total += mahasiswa.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }

    public void tampilkanSemua() {
        System.out.println("=== Data Mahasiswa ===");

        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mahasiswa = daftarMahasiswa.get(i);
            System.out.println((i + 1) + ". " + mahasiswa.info());
        }
    }
}
