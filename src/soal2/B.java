package soal2;

/**
 * Kelas B adalah subclass dari A yang punya atribut nilai
 * dan menggantikan method init().
 */
public class B extends A {

    private int nilai = 5;

    /**
     * Membuat objek B. Constructor A dijalankan lebih dulu lewat super.
     */
    public B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
     * Mencetak keterangan inisialisasi milik B beserta nilainya.
     */
    @Override
    public void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}
