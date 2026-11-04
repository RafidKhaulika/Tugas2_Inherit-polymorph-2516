package soal3;

/**
 * Titik menyimpan koordinat x dan y pada bidang dan bisa menghitung
 * jaraknya ke titik lain.
 */
public class Titik {

    private double x;
    private double y;

    /**
     * Membuat titik di posisi (0, 0).
     */
    public Titik() {
        this(0.0, 0.0);
    }

    /**
     * Membuat titik di posisi tertentu.
     *
     * @param x koordinat x
     * @param y koordinat y
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengambil koordinat x.
     *
     * @return koordinat x
     */
    public double getX() {
        return this.x;
    }

    /**
     * Mengubah koordinat x.
     *
     * @param x koordinat x yang baru
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Mengambil koordinat y.
     *
     * @return koordinat y
     */
    public double getY() {
        return this.y;
    }

    /**
     * Mengubah koordinat y.
     *
     * @param y koordinat y yang baru
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak dari titik ini ke titik lain.
     *
     * @param lain titik tujuan, tidak boleh null
     * @return jarak antara kedua titik
     * @throws IllegalArgumentException jika titik tujuan null
     */
    public double jarakKe(Titik lain) {
        if (lain == null) {
            throw new IllegalArgumentException("Titik tujuan tidak boleh null.");
        }
        double selisihX = this.x - lain.x;
        double selisihY = this.y - lain.y;
        return Math.sqrt(selisihX * selisihX + selisihY * selisihY);
    }

    /**
     * Membuat teks titik dengan format (x, y).
     *
     * @return teks koordinat titik
     */
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
