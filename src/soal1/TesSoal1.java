package soal1;

/**
 * Kelas untuk menguji hierarki perangkat pada Soal 1.
 */
public class TesSoal1 {

    /**
     * Membuat tiga perangkat lalu mencetak keterangan, pajak, dan harga promonya.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Laptop l = new Laptop("Lenovo ThinkPad", 8000000, 24, 16, 14.0);
        Ponsel p = new Ponsel("Samsung Galaxy", 7000000, 12, 128, 3);
        LaptopGaming g = new LaptopGaming("Victus", 16000000, 12, 32, 15.6, "RTX 4060");

        System.out.println(l.infoSingkat());
        System.out.println(p.infoSingkat());
        System.out.println(g.infoSingkat());
        System.out.printf("Pajak laptop: Rp%.0f%n", l.hitungPajak());
        System.out.printf("Promo laptop 10 persen: Rp%.0f%n", l.hitungHargaPromo(10));
    }
}
