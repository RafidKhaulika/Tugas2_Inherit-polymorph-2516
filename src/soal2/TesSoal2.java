package soal2;

/**
 * Kelas untuk mencoba Soal 2, yaitu analisis output, error, dan polimorfisme.
 */
public class TesSoal2 {

    /**
     * Menjalankan percobaan Bagian A, Bagian B, dan Bagian C secara berurutan.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        jalankanBagianA();
        System.out.println();
        jalankanBagianB();
        System.out.println();
        jalankanBagianC();
    }

    /**
     * Bagian A: upcasting, downcasting, dan ClassCastException pada Hewan dan
     * Kucing.
     */
    private static void jalankanBagianA() {
        System.out.println(" Bagian A: Hewan dan Kucing ");

        Hewan h = new Kucing("Aren Gentong");
        h.makan();
        h.suara();
        // h.panjat(); // error kompilasi, tipe statis Hewan tidak punya method panjat()

        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");
        try {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        // Perbaikan memakai instanceof, tipe variabel h2 tidak diubah
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("h2 bukan Kucing, jadi tidak bisa memanjat.");
        }
    }

    /**
     * Bagian B: urutan constructor ketika constructor memanggil method yang
     * di-override.
     */
    private static void jalankanBagianB() {
        System.out.println(" Bagian B: Urutan Constructor ");
        new B();
    }

    /**
     * Bagian C: polimorfisme pada Lingkaran dan Titik.
     */
    private static void jalankanBagianC() {
        System.out.println(" Bagian C: Lingkaran dan Titik ");
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();
        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}
