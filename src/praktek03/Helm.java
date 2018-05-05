
package praktek03;
public class Helm {
    String merk;
    String warna;
    double harga;
    double beli;

    public Helm() {
        harga= 300;
        beli= 2;
        
        
    }

    public Helm(double harga, double beli) {
        this.harga = harga;
        this.beli = beli;
    }
    
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
