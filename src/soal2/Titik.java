package soal2;

/**
 * Titik dibuat sebagai subclass Lingkaran dengan jari-jari 0.
 * Kelas ini sengaja dibuat untuk membahas apakah relasi is-a masuk akal.
 */
public class Titik extends Lingkaran {

    /**
     * Membuat titik, yaitu lingkaran dengan jari-jari 0.
     */
    public Titik() {
        super(0);
    }

    /**
     * Mengembalikan luas titik yang selalu 0.0.
     *
     * @return luas titik
     */
    @Override
    public double luas() {
        return 0.0;
    }

    /**
     * Mengembalikan keliling titik yang selalu 0.0.
     *
     * @return keliling titik
     */
    @Override
    public double keliling() {
        return 0.0;
    }
}
