import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,vki;
        Scanner oku=new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz (metre): ");
        boy=oku.nextDouble();

        System.out.print("\nKilonuzu Giriniz (kg): ");
        kilo=oku.nextDouble();

        vki=kilo/Math.pow(boy,2);
        System.out.println("VKİ: "+vki);


    }
}