public class Pembelian {
    protected String nomorFaktur;
    protected String namaPelanggan;
    protected String namaBarang;
    protected double hargaBarang;
    protected int jumlahBeli;

    public Pembelian(String nomorFaktur, String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBeli){
        this.nomorFaktur = nomorFaktur;
        this.namaPelanggan = namaPelanggan;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }

    public void tampilkanInfo(){
        System.out.println("Nomor Faktur: "+ nomorFaktur);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
    }
}
