package soal2;

/**
 * Kucing adalah jenis hewan yang bersuara meong dan bisa memanjat.
 */
public class Kucing extends Hewan {

    /**
     * Membuat kucing baru. Constructor Hewan dijalankan lebih dulu lewat super.
     *
     * @param nama nama kucing
     */
    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
     * Mencetak suara kucing, menggantikan suara umum milik Hewan.
     */
    @Override
    public void suara() {
        System.out.println("meong");
    }

    /**
     * Mencetak bahwa kucing sedang memanjat. Method ini hanya dimiliki Kucing.
     */
    public void panjat() {
        System.out.println(nama + " memanjat");
    }
}
