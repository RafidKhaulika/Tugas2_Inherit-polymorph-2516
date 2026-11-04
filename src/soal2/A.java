package soal2;

/**
 * Kelas A dipakai untuk menunjukkan apa yang terjadi kalau constructor
 * memanggil method yang bisa di-override oleh subclass.
 */
public class A {

    /**
     * Membuat objek A lalu memanggil init(). Pemanggilan ini sengaja dibuat
     * untuk percobaan, dan tidak dianjurkan dilakukan pada program sungguhan.
     */
    public A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Mencetak keterangan inisialisasi milik A.
     */
    public void init() {
        System.out.println("init A");
    }
}
