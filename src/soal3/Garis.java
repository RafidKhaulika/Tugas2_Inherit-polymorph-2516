package soal3;

/**
 * Garis dibentuk dari dua objek Titik, yaitu titik awal dan titik akhir.
 * Hubungan ini disebut composition (has-a): Garis punya Titik.
 */
public class Garis {

    private Titik awal;
    private Titik akhir;

    /**
     * Membuat garis dari dua titik.
     *
     * @param awal titik awal, tidak boleh null
     * @param akhir titik akhir, tidak boleh null
     * @throws IllegalArgumentException jika salah satu titik null
     */
    public Garis(Titik awal, Titik akhir) {
        if (awal == null || akhir == null) {
            throw new IllegalArgumentException("Titik awal dan titik akhir tidak boleh null.");
        }
        this.awal = awal;
        this.akhir = akhir;
    }

    /**
     * Membuat garis dari koordinat kedua titik. Constructor ini
     * meneruskan pekerjaannya ke constructor yang memakai dua Titik.
     *
     * @param x1 koordinat x titik awal
     * @param y1 koordinat y titik awal
     * @param x2 koordinat x titik akhir
     * @param y2 koordinat y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2));
    }

    /**
     * Mengambil titik awal.
     *
     * @return titik awal garis
     */
    public Titik getAwal() {
        return this.awal;
    }

    /**
     * Mengubah titik awal.
     *
     * @param awal titik awal yang baru, tidak boleh null
     * @throws IllegalArgumentException jika titik null
     */
    public void setAwal(Titik awal) {
        if (awal == null) {
            throw new IllegalArgumentException("Titik awal tidak boleh null.");
        }
        this.awal = awal;
    }

    /**
     * Mengambil titik akhir.
     *
     * @return titik akhir garis
     */
    public Titik getAkhir() {
        return this.akhir;
    }

    /**
     * Mengubah titik akhir.
     *
     * @param akhir titik akhir yang baru, tidak boleh null
     * @throws IllegalArgumentException jika titik null
     */
    public void setAkhir(Titik akhir) {
        if (akhir == null) {
            throw new IllegalArgumentException("Titik akhir tidak boleh null.");
        }
        this.akhir = akhir;
    }

    /**
     * Menghitung panjang garis dengan memakai jarakKe() milik Titik.
     *
     * @return panjang garis
     */
    public double getPanjang() {
        return this.awal.jarakKe(this.akhir);
    }

    /**
     * Membuat teks garis dengan format (x1, y1) - (x2, y2).
     *
     * @return teks garis
     */
    @Override
    public String toString() {
        return this.awal.toString() + " - " + this.akhir.toString();
    }
}
