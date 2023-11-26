// Kelas turunan yang mengimplementasikan interface TotalBayar
public class PembelianBarang extends Pembelian implements TotalBayar {
  
    public PembelianBarang(String nomorFaktur, String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBeli){
        super(nomorFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBeli);
    }

    // Implementasi metode dari interface TotalBayar
    @Override
    public double hitungTotalBayar(){
        return hargaBarang * jumlahBeli; 
    }

    // Override metode tampilkanInfo untuk menampilkan total bayar
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Total Bayar: " + hitungTotalBayar());
    }
}
