import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner klavye=new Scanner(System.in);
        System.out.print("n değerini girin: ");
        int n= klavye.nextInt();
        double sonuc=0.0;
        for (double i = 1; i <=n ; i++) {
            sonuc+=(1/i);
        }

        //1.dongu: i=1; sonuc=0 +(1/1)=1;
        //2.dongu: i=2; sonuc=1 +(1/2)=1.5;



        System.out.println("Sonuç: " +sonuc);
    }
}