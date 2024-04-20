
package songuyento;
import java.util.Scanner;
public class Songuyento {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n;
        System.out.print("Nhap n = ");
        n=sn.nextInt();
        boolean SNT=true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    SNT = false;
                    break;
                }
        }
        if(SNT==false || n<=1)
                System.out.println(n+" khong la so nguyen to");
        else
                System.out.println(n+" la so nguyen to");
    }
}
