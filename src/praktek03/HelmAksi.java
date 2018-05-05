package praktek03;

public class HelmAksi {
    public static void main(String[] args) {
        Helm h1= new Helm();
        h1.merk = "kyt";
        h1.warna = "hitam";
        h1.harga = 200;
        h1.beli = 2;
        
        h1.cetakInfo();
        System.out.println("jumlah Helm = "+h1.hitungjumlah());
        h1.cetakjumlah();
        
        Helm r2 = new Helm();
        r2.cetakInfo();
        
        Helm r3 = new Helm(150,3);
        r3.cetakInfo();
    }
 
}
