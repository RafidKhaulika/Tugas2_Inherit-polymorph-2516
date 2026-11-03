package soal1;

/**
 * Kelas induk untuk semua perangkat elektronik yang dijual di toko.
 * Kelas ini menyimpan merek, harga, dan lama garansi perangkat,
 * serta memastikan data yang masuk sudah valid.
 */
public class Perangkat {

    /** Tarif pajak perangkat, yaitu 10 persen dari harga. */
    public static final double TARIF_PAJAK = 0.10;

    private String merek;
    protected double harga;
    private int garansiBulan;

    /**
     * Membuat perangkat baru.
     *
     * @param merek merek perangkat, tidak boleh kosong
     * @param harga harga perangkat, tidak boleh negatif
     * @param garansiBulan lama garansi dalam bulan
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong.");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    /**
     * Mengambil merek perangkat.
     *
     * @return merek perangkat
     */
    public String getMerek() {
        return this.merek;
    }

    /**
     * Mengambil lama garansi perangkat.
     *
     * @return lama garansi dalam bulan
     */
    public int getGaransiBulan() {
        return this.garansiBulan;
    }

    /**
     * Menghitung pajak perangkat berdasarkan tarif pajak.
     *
     * @return besar pajak dalam rupiah
     */
    public double hitungPajak() {
        return this.harga * TARIF_PAJAK;
    }

    /**
     * Membuat keterangan singkat tentang perangkat.
     *
     * @return teks berisi merek dan lama garansi
     */
    public String infoSingkat() {
        return this.merek + " | garansi " + this.garansiBulan + " bulan";
    }
}