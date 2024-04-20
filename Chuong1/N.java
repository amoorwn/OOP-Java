
package n;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class N {
    static int F(int n){
        if(n==0 ||n==1)return 1;
        else return n*F(n-1);
        }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n;
        System.out.print("Nhap n = ");
        n=sn.nextInt();
        System.out.println(n+"! = " + F(n));
    }
    
}
