package soal4;

/**
 * Langganan adalah produk digital yang dibayar per bulan.
 * Harganya dikali durasi, dan ada diskon untuk langganan yang lama.
 * Langganan tidak memakai diskon digital biasa.
 */
public class Langganan extends ProdukDigital {

    /** Diskon langganan panjang, yaitu 20 persen dari total harga. */
    public static final double DISKON_LANGGANAN = 0.20;

    /** Durasi minimal (dalam bulan) agar langganan mendapat diskon. */
    public static final int BATAS_BULAN_DISKON = 12;

    private int durasiBulan;

    /**
     * Membuat langganan baru.
     *
     * @param kode kode produk, tidak boleh kosong
     * @param nama nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar per bulan, tidak boleh negatif
     * @param ukuranMb ukuran berkas dalam megabyte, tidak boleh negatif
     * @param durasiBulan lama langganan dalam bulan, harus lebih dari 0
     * @throws IllegalArgumentException jika data tidak valid
     */
    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        if (durasiBulan <= 0) {
            throw new IllegalArgumentException("Durasi langganan harus lebih dari 0 bulan.");
        }
        this.durasiBulan = durasiBulan;
    }

    /**
     * Mengambil durasi langganan.
     *
     * @return durasi dalam bulan
     */
    public int getDurasiBulan() {
        return this.durasiBulan;
    }

    /**
     * Menghitung harga akhir, yaitu harga dasar dikali durasi.
     * Jika durasi minimal 12 bulan, total harga dipotong diskon langganan.
     *
     * @return harga akhir dalam rupiah
     */
    @Override
    public double hitungHargaAkhir() {
        double total = getHargaDasar() * this.durasiBulan;
        if (this.durasiBulan >= BATAS_BULAN_DISKON) {
            total = total - total * DISKON_LANGGANAN;
        }
        return total;
    }

    /**
     * Membuat keterangan langganan beserta durasinya.
     *
     * @return keterangan, misalnya "langganan 12 bulan"
     */
    @Override
    public String deskripsi() {
        return "langganan " + this.durasiBulan + " bulan";
    }
}
