import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int n,r,pay = 1,payda = 1;
        System.out.print("Birinci sayiyi giriniz (n): ");
        n =input.nextInt();
        System.out.print("Ikinci sayiyi Giriniz (r): ");
        r=input.nextInt();

        if (n>=r){
            pay=n;
            for (int i = 1 ; i < r;i++){
                pay*=(n-i);
            }
            for (int i = 1 ; i <= r;i++){
                payda*=i;
            }
            System.out.print(pay/payda);
        }
        else {
            System.out.print("n > r Olmalidir..");
        }





    }
}