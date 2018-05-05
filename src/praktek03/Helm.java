
package praktek03;
public class Helm {
    String merk;
    String warna;
    double harga;
    double beli;
    void cetakInfo(){
        System.out.println("=====================");
        System.out.println("merk : "+merk);
        System.out.println("warna : "+warna);
        System.out.println("harga : "+harga);
        System.out.println("=====================");
    }
    double hitungjumlah(){
        double jumlah;
        jumlah=harga*beli;
        return jumlah;
    }
    
    void cetakjumlah(){
        System.out.println("jumlahnya adalah: "+hitungjumlah());
    }
}
