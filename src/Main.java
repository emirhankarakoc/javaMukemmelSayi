import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi,toplam=0;
        System.out.println("Lutfen test etmek istediginiz degeri giriniz." );
        sayi = scanner.nextInt();
        for (int i =1;i<sayi;i++){
            if (sayi%i==0) toplam+=i;
        }
        if(sayi==toplam){
            System.out.println("Mukemmel");
        }
else System.out.println("Mukemmel degil");

    }
}