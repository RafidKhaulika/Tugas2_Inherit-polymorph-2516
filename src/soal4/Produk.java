package soal4;

/**
 * Produk adalah kelas induk untuk semua barang yang dijual di toko digital.
 * Kelas ini menyimpan kode, nama, dan harga dasar, serta memastikan
 * data yang masuk sudah valid.
 */
public class Produk {

    private String kode;
    private String nama;
    private double hargaDasar;

    /**
     * Membuat produk baru.
     *
     * @param kode kode produk, tidak boleh kosong
     * @param nama nama produk, tidak boleh kosong
     * @param hargaDasar harga dasar produk, tidak boleh negatif
     * @throws IllegalArgumentException jika kode kosong, nama kosong, atau harga dasar negatif
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (kode == null || kode.trim().isEmpty()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong.");
        }
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong.");
        }
        if (hargaDasar < 0) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif.");
        }
        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengambil kode produk.
     *
     * @return kode produk
     */
    public String getKode() {
        return this.kode;
    }

    /**
     * Mengambil nama produk.
     *
     * @return nama produk
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Mengambil harga dasar produk.
     *
     * @return harga dasar dalam rupiah
     */
    public double getHargaDasar() {
        return this.hargaDasar;
    }

    /**
     * Menghitung harga akhir produk. Untuk produk umum, harga akhir
     * sama dengan harga dasar. Subclass menggantinya sesuai aturan masing-masing.
     *
     * @return harga akhir dalam rupiah
     */
    public double hitungHargaAkhir() {
        return this.hargaDasar;
    }

    /**
     * Membuat keterangan jenis produk. Subclass menggantinya.
     *
     * @return keterangan produk
     */
    public String deskripsi() {
        return "produk umum";
    }
}
