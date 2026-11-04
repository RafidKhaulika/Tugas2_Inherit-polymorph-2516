package soal2;

/**
 * Lingkaran menyimpan jari-jari dan bisa menghitung luas serta keliling.
 */
public class Lingkaran {

    protected double jariJari;

    /**
     * Membuat lingkaran baru.
     *
     * @param jariJari jari-jari lingkaran, tidak boleh negatif
     * @throws IllegalArgumentException jika jari-jari negatif
     */
    public Lingkaran(double jariJari) {
        if (jariJari < 0) {
            throw new IllegalArgumentException("Jari-jari tidak boleh negatif.");
        }
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     *
     * @return luas lingkaran
     */
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     *
     * @return keliling lingkaran
     */
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}
