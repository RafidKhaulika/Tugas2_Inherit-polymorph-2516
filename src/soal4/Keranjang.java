package soal4;

import java.util.ArrayList;

/**
 * Keranjang menyimpan daftar produk yang akan dibeli.
 * Keranjang memakai composition: Keranjang punya banyak Produk.
 */
public class Keranjang {

    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    /**
     * Menambahkan produk ke keranjang.
     *
     * @param produk produk yang ditambahkan, tidak boleh null
     * @throws IllegalArgumentException jika produk null
     * @throws IllegalStateException jika kode produk sudah ada di keranjang
     */
    public void tambah(Produk produk) {
        if (produk == null) {
            throw new IllegalArgumentException("Produk tidak boleh null.");
        }
        if (adaKode(produk.getKode())) {
            throw new IllegalStateException("Kode produk " + produk.getKode() + " sudah ada di keranjang.");
        }
        daftarProduk.add(produk);
    }

    /**
     * Memeriksa apakah suatu kode produk sudah ada di keranjang.
     *
     * @param kode kode produk yang dicari
     * @return true jika kode sudah ada, false jika belum
     */
    private boolean adaKode(String kode) {
        for (Produk produk : daftarProduk) {
            if (produk.getKode().equals(kode)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Menghitung total harga akhir semua produk di keranjang.
     * Tiap produk menghitung harganya sendiri (polimorfisme).
     *
     * @return total harga dalam rupiah
     */
    public double hitungTotal() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total = total + produk.hitungHargaAkhir();
        }
        return total;
    }

    /**
     * Mencetak struk berisi satu baris per produk dan total belanja.
     * Tiap produk memberi deskripsi dan harganya sendiri (polimorfisme).
     */
    public void cetakStruk() {
        for (Produk produk : daftarProduk) {
            System.out.printf("%s | %s | %s | Rp%.0f%n",
                    produk.getKode(), produk.getNama(), produk.deskripsi(), produk.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Menghitung dan mencetak jumlah produk fisik, digital, dan langganan.
     * Langganan dicek lebih dulu karena Langganan juga termasuk ProdukDigital.
     */
    public void hitungPerJenis() {
        int jumlahFisik = 0;
        int jumlahDigital = 0;
        int jumlahLangganan = 0;

        for (Produk produk : daftarProduk) {
            if (produk instanceof Langganan) {
                jumlahLangganan++;
            } else if (produk instanceof ProdukDigital) {
                jumlahDigital++;
            } else if (produk instanceof ProdukFisik) {
                jumlahFisik++;
            }
        }

        System.out.println("Fisik: " + jumlahFisik + ", Digital: " + jumlahDigital
                + ", Langganan: " + jumlahLangganan);
    }
}
