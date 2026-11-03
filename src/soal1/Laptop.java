package soal1;

/**
 * Laptop adalah jenis perangkat yang punya RAM dan ukuran layar.
 * Kelas ini mewarisi data merek, harga, dan garansi dari Perangkat.
 */
public class Laptop extends Perangkat {

    /** Nilai seratus persen, dipakai untuk menghitung diskon. */
    public static final double PERSEN_PENUH = 100.0;

    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Membuat laptop baru.
     *
     * @param merek merek laptop, tidak boleh kosong
     * @param harga harga laptop, tidak boleh negatif
     * @param garansiBulan lama garansi dalam bulan
     * @param ramGb ukuran RAM dalam gigabyte
     * @param ukuranLayarInci ukuran layar dalam inci
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga laptop setelah dipotong diskon.
     *
     * @param diskonPersen besar diskon dalam persen, antara 0 sampai 100
     * @return harga setelah diskon dalam rupiah
     * @throws IllegalArgumentException jika diskon kurang dari 0 atau lebih dari 100
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < 0 || diskonPersen > PERSEN_PENUH) {
            throw new IllegalArgumentException("Diskon harus antara 0 sampai 100 persen.");
        }
        double potongan = this.harga * diskonPersen / PERSEN_PENUH;
        return this.harga - potongan;
    }

    /**
     * Membuat keterangan singkat laptop.
     *
     * @return teks berisi merek, garansi, RAM, dan ukuran layar
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | RAM " + this.ramGb + " GB | layar " + this.ukuranLayarInci + " inci";
    }
}