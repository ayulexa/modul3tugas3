package Tugas2;

import java.util.Scanner;

public class HitungLuasLingkaran {
    /**
     * Fungsi ini menerima jari-jari lingkaran dan mengembalikan luas lingkaran.
     *
     * @param jariJari Jari-jari lingkaran.
     * @return Luas lingkaran.
     */
    public static double hitungLuasLingkaran(double jariJari) {
        double luas = 3.14 * jariJari * jariJari;
        return luas;
    }

    /**
     * Metode utama yang meminta input dari pengguna dan menampilkan luas lingkaran.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double luas = hitungLuasLingkaran(jariJari);
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + luas);
    }
}
