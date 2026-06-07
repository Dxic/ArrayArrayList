// Nama : Dicky Nugraha Febriano
// NPM  : 2410010146

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek",
            "Komputasi Paralel dan Terdistribusi",
            "Kecerdasan Buatan"
        };

        System.out.println("=== Daftar Mata Kuliah ===");
        for (String matkul : mataKuliah) {
            System.out.println("- " + matkul);
        }

        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Dicky Nugraha Febriano", "2410010146", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Andi Saputra", "2410010147", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso", "2410010148", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Lestari", "2410010149", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Doni Pratama", "2410010150", 65));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        System.out.println();
        System.out.println("Menambahkan satu mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Eka Putri", "2410010151", 78));

        System.out.println("Jumlah data terbaru : " + kelas.jumlahMahasiswa());

        System.out.println();
        kelas.tampilkanSemua();
    }
}
