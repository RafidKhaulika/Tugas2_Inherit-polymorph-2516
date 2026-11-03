package soal1;

/**
 * Ponsel adalah jenis perangkat yang punya kapasitas penyimpanan dan jumlah kamera.
 * Kelas ini mewarisi data merek, harga, dan garansi dari Perangkat.
 */
public class Ponsel extends Perangkat {

    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Membuat ponsel baru.
     *
     * @param merek merek ponsel, tidak boleh kosong
     * @param harga harga ponsel, tidak boleh negatif
     * @param garansiBulan lama garansi dalam bulan
     * @param kapasitasGb kapasitas penyimpanan dalam gigabyte
     * @param jumlahKamera jumlah kamera pada ponsel
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Membuat keterangan singkat ponsel.
     *
     * @return teks berisi merek, garansi, kapasitas, dan jumlah kamera
     */
    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | " + this.kapasitasGb + " GB | " + this.jumlahKamera + " kamera";
    }
}
