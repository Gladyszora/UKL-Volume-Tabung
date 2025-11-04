import java.util.Scanner;

public class UKLVolumeTabung {
    /**
     * * @param radius jari - jari alas tabung (r).
     * @param tinggi tinggi tabung (t).
     * @return volime tabung (v).
     */

     public static double hitungVolumeTabung(double radius, double tinggi) {
     double pi = Math.PI;

     double volume = pi * Math.pow(radius, 2) * tinggi;
     return volume;
     }

     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        System.out.print("Masukkan jari-jari alas tabung (r): ");
        double r = input.nextDouble();
        
        System.out.print("Masukkan tinggi tabung (t): ");
        double t = input.nextDouble();
        
        input.close();
        
        double hasilVolume = hitungVolumeTabung(r, t);

        System.out.println("\n-------------------------------------------");
        System.out.printf("Jari-jari (r) = %.2f\n", r);
        System.out.printf("Tinggi (t)    = %.2f\n", t);
        System.out.printf("Volume Tabung = %.3f satuan kubik\n", hasilVolume);
        System.out.println("-------------------------------------------");
    }
}
     
    
    

