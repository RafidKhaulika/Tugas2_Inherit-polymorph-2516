package soal4;

/**
 * ProdukDigital adalah produk yang dikirim lewat unduhan, tanpa ongkos kirim.
 * Produk digital mendapat diskon digital dari harga dasarnya.
 */
public class ProdukDigital extends Produk {

    /** Diskon produk digital, yaitu 10 persen dari harga dasar. */
    public static final double DISKON_DIGITAL = 0.10;

    private double ukuranMb;

    /**
     * Membuat produk digital baru.
     *
     * @param kode kode produk, tidak boleh kosong
     * @param nama nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar produk, tidak boleh negatif
     * @param ukuranMb ukuran berkas dalam megabyte, tidak boleh negatif
     * @throws IllegalArgumentException jika data tidak valid
     */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        if (ukuranMb < 0) {
            throw new IllegalArgumentException("Ukuran berkas tidak boleh negatif.");
        }
        this.ukuranMb = ukuranMb;
    }

    /**
     * Mengambil ukuran berkas produk.
     *
     * @return ukuran dalam megabyte
     */
    public double getUkuranMb() {
        return this.ukuranMb;
    }

    /**
     * Menghitung harga akhir, yaitu harga dasar dikurangi diskon digital.
     *
     * @return harga akhir dalam rupiah
     */
    @Override
    public double hitungHargaAkhir() {
        double potongan = getHargaDasar() * DISKON_DIGITAL;
        return getHargaDasar() - potongan;
    }

    /**
     * Membuat keterangan produk digital beserta ukurannya.
     *
     * @return keterangan, misalnya "digital 20.0 MB"
     */
    @Override
    public String deskripsi() {
        return "digital " + this.ukuranMb + " MB";
    }
}
