import java.util.Scanner;

public class Mobil {
    public static void main(String[] args) {
        //int a = 1;
        //double b = 1.5;
        //String[] nama = {"Zahra", "Nur", "Laili"};

        String[] merk = {"Toyota", "BMW", "Honda", "Mitsubishi", "Wuling"};
        String[] warna = {"White", "Black", "Blue", "Silver", "Red"};
        String[] kategori = {"Sedan", "SUV", "Sport", "Minivan", "Sedan"};
        int[] harga = {400, 500, 700, 300, 600};

        Scanner in = new Scanner(System.in);

        System.out.println("Jumlah mobil yg dibeli : ");
        int a = in.nextInt();
        int[] counter = new int[a];
        for(int i=0; i<a; i++) {
            System.out.println("No mobil yg akan dibeli :");
            counter[i] = in.nextInt(); 
        }
        int total = 0;
        int jumlah = counter.length;
        int diskon = 0;

        //menghitung diskon
        if(jumlah < 2) {
            diskon = 0;
        } else if (jumlah == 2) {
            diskon = 50;
        } else if (jumlah >= 3) {
            diskon = 100;
        }

        //menghitung total bayar
        for(int i=0; i<counter.length; i++) {
            total += harga[counter[i]] ;
        }
        int bayar = total-diskon;
        System.out.println("Harga total : " + total);
        System.out.println("Diskon : " + diskon);
        System.out.println("Harus Bayar : " + bayar);
    }
}