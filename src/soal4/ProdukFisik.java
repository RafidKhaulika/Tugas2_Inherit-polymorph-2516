package soal4;

/**
 * ProdukFisik adalah produk berwujud yang dikirim lewat kurir.
 * Harga akhirnya ditambah ongkos kirim berdasarkan berat.
 */
public class ProdukFisik extends Produk {

    /** Ongkos kirim per kilogram, dalam rupiah. */
    public static final double ONGKOS_KIRIM_PER_KG = 10000;

    private double beratKg;

    /**
     * Membuat produk fisik baru.
     *
     * @param kode kode produk, tidak boleh kosong
     * @param nama nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar produk, tidak boleh negatif
     * @param beratKg berat produk dalam kilogram, tidak boleh negatif
     * @throws IllegalArgumentException jika data tidak valid
     */
    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        if (beratKg < 0) {
            throw new IllegalArgumentException("Berat tidak boleh negatif.");
        }
        this.beratKg = beratKg;
    }

    /**
     * Mengambil berat produk.
     *
     * @return berat dalam kilogram
     */
    public double getBeratKg() {
        return this.beratKg;
    }

    /**
     * Menghitung harga akhir, yaitu harga dasar ditambah ongkos kirim.
     *
     * @return harga akhir dalam rupiah
     */
    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() + this.beratKg * ONGKOS_KIRIM_PER_KG;
    }

    /**
     * Membuat keterangan produk fisik beserta beratnya.
     *
     * @return keterangan, misalnya "fisik 1.5 kg"
     */
    @Override
    public String deskripsi() {
        return "fisik " + this.beratKg + " kg";
    }
}
