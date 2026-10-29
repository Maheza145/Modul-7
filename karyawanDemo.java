public class karyawanDemo {
    public static void main(String[] args) {
        karyawan k1 = new karyawan ();
        k1.setNama("Egga");
        k1.setGaji(10000);
        k1.setUsia(21);

        System.out.println("\nNama : "+ k1.getNama());
        System.out.println("Gaji : " + k1.getGaji());
        System.out.println("Usia : " + k1.getUsia());
    }
}
