import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy,kilo;

        System.out.print("Boyunuzu Giriniz (m) : ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz (kg) : ");
        kilo = input.nextDouble();

        System.out.println("Vucut Kitle Endeksiniz = " + kilo/(boy*boy));


    }
}
