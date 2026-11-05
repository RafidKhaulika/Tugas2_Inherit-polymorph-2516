package soal4;

/**
 * Kelas untuk menguji mini project toko digital pada Soal 4.
 */
public class TesSoal4 {

    /**
     * Mengisi keranjang dengan tiga produk, mencetak struk dan jumlah per jenis,
     * lalu mencoba menambahkan produk dengan kode yang sama.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Keranjang keranjang = new Keranjang();
        keranjang.tambah(new ProdukFisik("F01", "Keyboard Mekanik", 500000, 1.5));
        keranjang.tambah(new ProdukDigital("D01", "Komik", 100000, 20));
        keranjang.tambah(new Langganan("L01", "Kelas Online", 150000, 20, 12));
        keranjang.cetakStruk();
        keranjang.hitungPerJenis();

        try {
            keranjang.tambah(new ProdukFisik("F01", "Mouse", 100000, 0.2));
        } catch (IllegalStateException e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }
}
