import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       try {
        System.out.print("Masukkan Nomor Faktur: ");
        String nomorFaktur = scanner.nextLine();

        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan Harga Barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukkan Jumlah Beli: ");
        int jumlahBeli = scanner.nextInt();

        // Membuat objek dari kelas PembelianBarang
        PembelianBarang pembelian = new PembelianBarang(nomorFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBeli);

        // Menampilkan informasi pembelian
        pembelian.tampilkanInfo();
       } catch (Exception e){
        System.out.println("Terjadi kesalahan: " + e.getMessage());
       } finally {
        scanner.close();
       }
    }
}
