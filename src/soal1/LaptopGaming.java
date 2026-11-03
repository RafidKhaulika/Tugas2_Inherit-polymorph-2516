package soal1;

/**
 * Laptop gaming adalah laptop yang punya kartu grafis khusus.
 * Laptop gaming mendapat garansi tambahan dibanding laptop biasa.
 */
public class LaptopGaming extends Laptop {

    /** Tambahan garansi untuk laptop gaming, dalam bulan. */
    public static final int GARANSI_TAMBAHAN_BULAN = 6;

    private String kartuGrafis;

    /**
     * Membuat laptop gaming baru. Garansi yang diberikan adalah garansi
     * awal ditambah garansi tambahan khusus laptop gaming.
     *
     * @param merek merek laptop, tidak boleh kosong
     * @param harga harga laptop, tidak boleh negatif
     * @param garansiBulan garansi awal dalam bulan, sebelum ditambah garansi tambahan
     * @param ramGb ukuran RAM dalam gigabyte
     * @param ukuranLayarInci ukuran layar dalam inci
     * @param kartuGrafis nama kartu grafis
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb,
                        double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + GARANSI_TAMBAHAN_BULAN, ramGb, ukuranLayarInci);
        this.kartuGrafis = kartuGrafis;
    }

    /**
     * Membuat keterangan singkat laptop gaming.
     *
     * @return teks keterangan laptop ditambah nama kartu grafis
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + this.kartuGrafis;
    }
}
