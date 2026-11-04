package soal2;

/**
 * Hewan adalah kelas induk yang menyimpan nama hewan.
 * Kelas ini dipakai untuk mempelajari urutan constructor,
 * method overriding, dan polimorfisme.
 */
public class Hewan {

    protected String nama;

    /**
     * Membuat hewan baru lalu mencetak pesan bahwa hewan sudah dibuat.
     *
     * @param nama nama hewan
     */
    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    /**
     * Mencetak suara umum hewan. Subclass boleh menggantinya.
     */
    public void suara() {
        System.out.println("...");
    }

    /**
     * Mencetak bahwa hewan sedang makan, lalu memanggil suara hewan.
     */
    public void makan() {
        System.out.println(nama + " makan");
        suara();
    }
}
