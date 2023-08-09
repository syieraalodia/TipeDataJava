import java.util.Scanner;

public class KasirATK{
public static void main(String[] args) {

    double bukuTulis, pensil, penghapus, penggaris;
    bukuTulis=2500;
    pensil=1000;
    penghapus=1500;
    penggaris=1000;

    int jumlahBeli=10;

    Scanner input = new Scanner (System.in);
    System.out.println("Masukkan jumlah Buku Tulis");
    double jumlahBuku= input.nextDouble();
    double total=jumlahBuku*bukuTulis;
    System.out.println("Masukkan jumlah beli pensil: ");
    double jumlahPensil=input.nextDouble();
    total += jumlahPensil*pensil;

    System.out.println("Masukkan Pembayaran: ");
    double bayar=input.nextDouble();
    double diskon=0.05*total;
    double kembali=bayar-(total-diskon);
    System.out.println("Total diskon: "+diskon);
    System.out.println("Total kembalian: "+kembali);
    




    


    
} 
    
}
