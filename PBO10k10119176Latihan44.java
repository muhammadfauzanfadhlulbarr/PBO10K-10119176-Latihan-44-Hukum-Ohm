/**
 * Latihan44
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Hukum OHM
 */
public class PBO10k10119176Latihan44 {
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        
        Baterai baterai2 = new Baterai(3.0f, 12.0f);
        System.out.printf("%nKuat Arus : %.1f ampere%n", baterai2.getKuatArus());
        System.out.printf("Hambatan : %.1f ohm%n", baterai2.getHambatan());
        System.out.printf("Hasil Tegangan : %.1f volt%n", baterai2.hitungTegangan());
    }
}
