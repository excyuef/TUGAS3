
public class Main {
    public static void main(String[] args) {

        // =====================================
        // G. LATIHAN PESERTA DIDIK
        // =====================================

        // 1. Perbedaan tipe data
        // int = bilangan bulat
        // double = bilangan desimal
        // char = satu karakter
        // boolean = true atau false
        // String = kumpulan karakter atau teks

        int umur = 17;
        double nilai = 87.5;
        char kelas = 'A';
        boolean aktif = true;
        String nama = "Rhafi";

        // 2. Lima variabel data siswa
        String namaSiswa = "Rhafi";
        String nis = "123456";
        String kelasSiswa = "XI PPLG";
        double nilaiSiswa = 85.5;
        boolean statusAktif = true;

        // 3. Menghitung luas persegi panjang
        int panjang = 10;
        int lebar = 5;
        int luas = panjang * lebar;

        System.out.println("=== LATIHAN NOMOR 3 ===");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + luas);

        // 4. Perbedaan && dan ||
        // && berarti kedua kondisi harus benar
        // || berarti minimal satu kondisi harus benar
        boolean contohAnd = (80 >= 75) && true;
        boolean contohOr = (80 >= 75) || false;

        // 5. Menentukan status kelulusan
        double nilaiAkhirLatihan = 80;

        System.out.println("\n=== LATIHAN NOMOR 5 ===");
        System.out.println("Nilai akhir: " + nilaiAkhirLatihan);

        if (nilaiAkhirLatihan >= 75) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Belum Lulus");
        }

        // 6. Perbedaan = dan ==
        // = untuk memberikan nilai
        // == untuk membandingkan nilai
        int angka = 80;
        boolean perbandingan = angka == 80;

        // 7. String dibandingkan menggunakan equals()
        // equals() membandingkan isi teks
        // == membandingkan referensi objek
        String teks1 = new String("Java");
        String teks2 = new String("Java");

        System.out.println("\n=== LATIHAN NOMOR 7 ===");
        System.out.println("equals(): " + teks1.equals(teks2));
        System.out.println("==       : " + (teks1 == teks2));

        // 8. Pembagian bilangan
        System.out.println("\n=== LATIHAN NOMOR 8 ===");
        System.out.println("8 / 3 = " + (8 / 3));
        System.out.println("8.0 / 3 = " + (8.0 / 3));

        // 9. Ekspresi boolean kelulusan
        double nilaiUntukBoolean = 80;
        int kehadiranUntukBoolean = 85;

        boolean lulusBoolean =
                nilaiUntukBoolean >= 75
                && kehadiranUntukBoolean >= 80;

        System.out.println("\n=== LATIHAN NOMOR 9 ===");
        System.out.println("Lulus: " + lulusBoolean);

        // 10. Fungsi final
        // final membuat nilai variabel tidak bisa diubah
        final double BATAS_LULUS = 75;


        // =====================================
        // H. EVALUASI PRAKTIK
        // Rekap Nilai Siswa
        // =====================================

        String namaEvaluasi = "Rhafi";
        String nisEvaluasi = "123456";
        String kelasEvaluasi = "XI PPLG";

        double nilaiTugas = 85;
        double nilaiUTS = 80;
        double nilaiUAS = 90;

        double kehadiran = 90;
        double batasKehadiran = 80;

        // Menghitung nilai akhir berdasarkan bobot
        double nilaiAkhir =
                (nilaiTugas * 0.30)
                + (nilaiUTS * 0.30)
                + (nilaiUAS * 0.40);

        // Siswa lulus jika nilai dan kehadiran memenuhi syarat
        boolean lulus =
                nilaiAkhir >= BATAS_LULUS
                && kehadiran >= batasKehadiran;

        // Menampilkan identitas dan nilai siswa
        System.out.println("\n\n================================");
        System.out.println("       REKAP NILAI SISWA");
        System.out.println("================================");
        System.out.println("Nama        : " + namaEvaluasi);
        System.out.println("NIS         : " + nisEvaluasi);
        System.out.println("Kelas       : " + kelasEvaluasi);
        System.out.println("--------------------------------");
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println("Kehadiran   : " + kehadiran + "%");
        System.out.printf("Nilai Akhir : %.2f%n", nilaiAkhir);
        System.out.println("--------------------------------");

        if (lulus) {
            System.out.println("Status      : LULUS");
        } else {
            System.out.println("Status      : BELUM LULUS");
        }

        System.out.println("================================");
    }
}
